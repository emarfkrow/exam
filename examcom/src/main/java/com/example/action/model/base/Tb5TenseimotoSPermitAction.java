package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb5Tenseimoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生元一覧承認
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoSPermitAction extends BaseAction {

    /** 転生元一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb5TenseimotoGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb5Tenseimoto e = FormValidator.toBean(Tb5Tenseimoto.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object tenseimotoId = e.getTenseimotoId();
            if (tenseimotoId == null) {
                throw new OptLockError("error.cant.permit");
            }

            java.util.List<com.example.entity.Tb5TenseimotoDet> tb5TenseimotoDets = e.referTb5TenseimotoDets();
            if (tb5TenseimotoDets != null) {
                for (com.example.entity.Tb5TenseimotoDet tb5TenseimotoDet : tb5TenseimotoDets) {

                    tb5TenseimotoDet.setStatusKb(1);
                    if (tb5TenseimotoDet.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.permit");
                    }
                }
            }

            Tb5Tenseimoto f = Tb5Tenseimoto.get(tenseimotoId);
            f.setStatusKb(1);
            if (f.update(now, execId) != 1) {
                throw new OptLockError("error.cant.permit");
            }
            ++count;
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
