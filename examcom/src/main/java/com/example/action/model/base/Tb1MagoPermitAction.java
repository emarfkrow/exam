package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Mago;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 孫承認
 *
 * @author emarfkrow
 */
public class Tb1MagoPermitAction extends BaseAction {

    /** 孫承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1Mago.oyaId");
        }
        if (oyaId == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Mago.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object magoBn = postJson.get("magoBn");
        if (magoBn == null) {
            magoBn = postJson.get("Tb1Mago.magoBn");
        }
        if (magoBn == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb1Mago e = FormValidator.toBean(Tb1Mago.class.getName(), postJson);

        Tb1Mago f = Tb1Mago.get(e.getOyaId(), e.getKoBn(), e.getMagoBn());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
