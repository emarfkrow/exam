package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Oya;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 親否認
 *
 * @author emarfkrow
 */
public class Tb1OyaForbidAction extends BaseAction {

    /** 親否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1Oya.oyaId");
        }
        if (oyaId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb1Oya e = FormValidator.toBean(Tb1Oya.class.getName(), postJson);

        java.util.List<com.example.entity.Tb1Ko> tb1Kos = e.referTb1Kos();
        if (tb1Kos != null) {
            for (com.example.entity.Tb1Ko tb1Ko : tb1Kos) {

                // child:Tb1Mago, parents:2

                tb1Ko.setStatusKb(-1);
                if (tb1Ko.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        java.util.List<com.example.entity.Tb1Ko2> tb1Ko2s = e.referTb1Ko2s();
        if (tb1Ko2s != null) {
            for (com.example.entity.Tb1Ko2 tb1Ko2 : tb1Ko2s) {

                tb1Ko2.setStatusKb(-1);
                if (tb1Ko2.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        Tb1Oya f = Tb1Oya.get(e.getOyaId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
