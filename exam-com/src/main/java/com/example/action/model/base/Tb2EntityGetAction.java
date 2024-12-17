package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Entity;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ照会
 *
 * @author emarfkrow
 */
public class Tb2EntityGetAction extends BaseAction {

    /** エンティティ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object entityId = postJson.get("entityId");
        if (entityId == null) {
            entityId = postJson.get("Tb2Entity.entityId");
        }
        if (entityId == null) {
            return map;
        }

        Tb2Entity tb2Entity = Tb2Entity.get(entityId);
        map.put("Tb2Entity", tb2Entity);
        return map;
    }

}
