package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8Combo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 複合削除
 *
 * @author emarfkrow
 */
public class Tb8ComboDeleteAction extends BaseAction {

    /** 複合削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object referId = postJson.get("referId");
        if (referId == null) {
            referId = postJson.get("Tb8Combo.referId");
        }
        if (referId == null) {
            throw new OptLockError("error.cant.delete", "複合");
        }
        Object stintId = postJson.get("stintId");
        if (stintId == null) {
            stintId = postJson.get("Tb8Combo.stintId");
        }
        if (stintId == null) {
            throw new OptLockError("error.cant.delete", "複合");
        }
        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("Tb8Combo.tekiyoBi");
        }
        if (tekiyoBi == null) {
            throw new OptLockError("error.cant.delete", "複合");
        }

        Tb8Combo e = FormValidator.toBean(Tb8Combo.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete", "複合");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
