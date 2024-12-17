package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Entity1His;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ１履歴照会
 *
 * @author emarfkrow
 */
public class Tb1Entity1HisGetAction extends BaseAction {

    /** エンティティ１履歴照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Entity1His.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Entity1His.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Entity1His.entityBn");
        }
        if (entityBn == null) {
            return map;
        }
        Object historyBn = postJson.get("historyBn");
        if (historyBn == null) {
            historyBn = postJson.get("Tb1Entity1His.historyBn");
        }
        if (historyBn == null) {
            return map;
        }

        Tb1Entity1His tb1Entity1His = Tb1Entity1His.get(sosenId, oyaBn, entityBn, historyBn);
        map.put("Tb1Entity1His", tb1Entity1His);
        return map;
    }

}
