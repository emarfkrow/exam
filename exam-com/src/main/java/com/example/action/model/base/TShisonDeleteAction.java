package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TShison;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子孫削除
 *
 * @author emarfkrow
 */
public class TShisonDeleteAction extends BaseAction {

    /** 子孫削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TShison.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TShison.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TShison.entityBn");
        }
        if (entityBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("TShison.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shisonBn = postJson.get("shisonBn");
        if (shisonBn == null) {
            shisonBn = postJson.get("TShison.shisonBn");
        }
        if (shisonBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        TShison e = FormValidator.toBean(TShison.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
