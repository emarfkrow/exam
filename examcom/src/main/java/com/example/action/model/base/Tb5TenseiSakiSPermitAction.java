package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb5TenseiSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先一覧承認
 *
 * @author emarfkrow
 */
public class Tb5TenseiSakiSPermitAction extends BaseAction {

    /** 転生先一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb5TenseiSakiGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb5TenseiSaki e = FormValidator.toBean(Tb5TenseiSaki.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object tenseiSakiId = e.getTenseiSakiId();
            if (tenseiSakiId == null) {
                throw new OptLockError("error.cant.permit");
            }

            java.util.List<com.example.entity.Tb5TenseiSakiDet> tb5TenseiSakiDets = e.referTb5TenseiSakiDets();
            if (tb5TenseiSakiDets != null) {
                for (com.example.entity.Tb5TenseiSakiDet tb5TenseiSakiDet : tb5TenseiSakiDets) {

                    tb5TenseiSakiDet.setStatusKb(1);
                    if (tb5TenseiSakiDet.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.permit");
                    }
                }
            }

            Tb5TenseiSaki f = Tb5TenseiSaki.get(tenseiSakiId);
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
