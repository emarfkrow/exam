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
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TEntity.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TEntity.oyaSn");
        }
        if (oyaSn == null) {
            return map;
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TEntity.entitySn");
        }
        if (entitySn == null) {
            return map;
        }

        TEntity tEntity = TEntity.get(sosenId, oyaSn, entitySn);
        tEntity.referTEntity2();
        tEntity.referTKos();
        tEntity.referTTenpuFiles();
        map.put("TEntity", tEntity);
        return map;
    }

}
