package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb1Oya;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 親一覧承認
 *
 * @author emarfkrow
 */
public class Tb1OyaSPermitAction extends BaseAction {

    /** 親一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb1OyaGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb1Oya e = FormValidator.toBean(Tb1Oya.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object oyaId = e.getOyaId();
            if (oyaId == null) {
                throw new OptLockError("error.cant.permit");
            }

            java.util.List<com.example.entity.Tb1Ko> tb1Kos = e.referTb1Kos();
            if (tb1Kos != null) {
                for (com.example.entity.Tb1Ko tb1Ko : tb1Kos) {

                    // child:Tb1Mago, parents:2

                    tb1Ko.setStatusKb(1);
                    if (tb1Ko.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.permit");
                    }
                }
            }

            java.util.List<com.example.entity.Tb1Ko2> tb1Ko2s = e.referTb1Ko2s();
            if (tb1Ko2s != null) {
                for (com.example.entity.Tb1Ko2 tb1Ko2 : tb1Ko2s) {

                    tb1Ko2.setStatusKb(1);
                    if (tb1Ko2.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.permit");
                    }
                }
            }

            Tb1Oya f = Tb1Oya.get(oyaId);
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
