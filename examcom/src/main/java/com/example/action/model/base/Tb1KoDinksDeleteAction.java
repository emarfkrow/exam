package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1KoDinks;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子なし削除
 *
 * @author emarfkrow
 */
public class Tb1KoDinksDeleteAction extends BaseAction {

    /** 子なし削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1KoDinks.oyaId");
        }
        if (oyaId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1KoDinks.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb1KoDinks e = FormValidator.toBean(Tb1KoDinks.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
