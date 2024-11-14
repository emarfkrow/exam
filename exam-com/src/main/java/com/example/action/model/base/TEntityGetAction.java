package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ照会
 *
 * @author emarfkrow
 */
public class TEntityGetAction extends BaseAction {

    /** エンティティ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object entityId = postJson.get("entityId");
        if (entityId == null) {
            entityId = postJson.get("TEntity.entityId");
        }
        if (entityId == null) {
            return map;
        }

        TEntity tEntity = TEntity.get(entityId);
        map.put("TEntity", tEntity);
        return map;
    }

}
