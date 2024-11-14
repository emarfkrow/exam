package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * エンティティ削除
 *
 * @author emarfkrow
 */
public class TEntityDeleteAction extends BaseAction {

    /** エンティティ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object entityId = postJson.get("entityId");
        if (entityId == null) {
            entityId = postJson.get("TEntity.entityId");
        }
        if (entityId == null) {
            throw new OptLockError("error.cant.delete");
        }

        TEntity e = FormValidator.toBean(TEntity.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
