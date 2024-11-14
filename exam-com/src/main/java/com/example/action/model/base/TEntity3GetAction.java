package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity3;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ３照会
 *
 * @author emarfkrow
 */
public class TEntity3GetAction extends BaseAction {

    /** エンティティ３照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TEntity3.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TEntity3.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TEntity3.entityBn");
        }
        if (entityBn == null) {
            return map;
        }

        TEntity3 tEntity3 = TEntity3.get(sosenId, oyaBn, entityBn);
        tEntity3.referTKos();
        tEntity3.referTTenpuFiles();
        map.put("TEntity3", tEntity3);
        return map;
    }

}
