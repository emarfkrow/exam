package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb5Tenseisaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先一覧承認
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiSPermitAction extends BaseAction {

    /** 転生先一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb5TenseisakiGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb5Tenseisaki e = FormValidator.toBean(Tb5Tenseisaki.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object tenseisakiId = e.getTenseisakiId();
            if (tenseisakiId == null) {
                throw new OptLockError("error.cant.permit");
            }

            java.util.List<com.example.entity.Tb5TenseisakiDet> tb5TenseisakiDets = e.referTb5TenseisakiDets();
            if (tb5TenseisakiDets != null) {
                for (com.example.entity.Tb5TenseisakiDet tb5TenseisakiDet : tb5TenseisakiDets) {

                    tb5TenseisakiDet.setStatusKb(1);
                    if (tb5TenseisakiDet.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.permit");
                    }
                }
            }

            Tb5Tenseisaki f = Tb5Tenseisaki.get(tenseisakiId);
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
