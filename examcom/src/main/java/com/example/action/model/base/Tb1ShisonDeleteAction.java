package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Shison;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子孫削除
 *
 * @author emarfkrow
 */
public class Tb1ShisonDeleteAction extends BaseAction {

    /** 子孫削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Shison.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Shison.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Shison.entityBn");
        }
        if (entityBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Shison.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shisonBn = postJson.get("shisonBn");
        if (shisonBn == null) {
            shisonBn = postJson.get("Tb1Shison.shisonBn");
        }
        if (shisonBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb1Shison e = FormValidator.toBean(Tb1Shison.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
