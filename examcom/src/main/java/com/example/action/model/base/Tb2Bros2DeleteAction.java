package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Bros2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 兄弟２削除
 *
 * @author emarfkrow
 */
public class Tb2Bros2DeleteAction extends BaseAction {

    /** 兄弟２削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object brosId = postJson.get("brosId");
        if (brosId == null) {
            brosId = postJson.get("Tb2Bros2.brosId");
        }
        if (brosId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb2Bros2 e = FormValidator.toBean(Tb2Bros2.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
