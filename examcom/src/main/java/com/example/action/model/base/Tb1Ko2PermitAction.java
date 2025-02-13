package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Ko2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子２承認
 *
 * @author emarfkrow
 */
public class Tb1Ko2PermitAction extends BaseAction {

    /** 子２承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1Ko2.oyaId");
        }
        if (oyaId == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Ko2.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb1Ko2 e = FormValidator.toBean(Tb1Ko2.class.getName(), postJson);

        Tb1Ko2 f = Tb1Ko2.get(e.getOyaId(), e.getKoBn());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
