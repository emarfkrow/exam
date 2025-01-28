package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb0Nokey;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 主キーなし削除
 *
 * @author emarfkrow
 */
public class Tb0NokeyDeleteAction extends BaseAction {

    /** 主キーなし削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object colA = postJson.get("colA");
        if (colA == null) {
            colA = postJson.get("Tb0Nokey.colA");
        }
        if (colA == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object colB = postJson.get("colB");
        if (colB == null) {
            colB = postJson.get("Tb0Nokey.colB");
        }
        if (colB == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb0Nokey e = FormValidator.toBean(Tb0Nokey.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
