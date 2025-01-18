package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb1Tensei;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生一覧承認
 *
 * @author emarfkrow
 */
public class Tb1TenseiSForbidAction extends BaseAction {

    /** 転生一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb1TenseiGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb1Tensei e = FormValidator.toBean(Tb1Tensei.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object tenseiId = e.getTenseiId();
            if (tenseiId == null) {
                throw new OptLockError("error.cant.forbid");
            }

            java.util.List<com.example.entity.Tb1TenseiDet> tb1TenseiDets = e.referTb1TenseiDets();
            if (tb1TenseiDets != null) {
                for (com.example.entity.Tb1TenseiDet tb1TenseiDet : tb1TenseiDets) {

                    tb1TenseiDet.setStatusKb(-1);
                    if (tb1TenseiDet.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.forbid");
                    }
                }
            }

            Tb1Tensei f = Tb1Tensei.get(tenseiId);
            f.setStatusKb(-1);
            if (f.update(now, execId) != 1) {
                throw new OptLockError("error.cant.forbid");
            }
            ++count;
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
