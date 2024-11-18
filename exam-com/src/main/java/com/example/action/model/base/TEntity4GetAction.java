package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity4;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ４照会
 *
 * @author emarfkrow
 */
public class TEntity4GetAction extends BaseAction {

    /** エンティティ４照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TEntity4.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TEntity4.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TEntity4.entityBn");
        }
        if (entityBn == null) {
            return map;
        }

        TEntity4 tEntity4 = TEntity4.get(sosenId, oyaBn, entityBn);
        map.put("TEntity4", tEntity4);
        return map;
    }

}
