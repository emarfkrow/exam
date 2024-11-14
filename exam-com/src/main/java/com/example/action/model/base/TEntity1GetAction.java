package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ１照会
 *
 * @author emarfkrow
 */
public class TEntity1GetAction extends BaseAction {

    /** エンティティ１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TEntity1.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TEntity1.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TEntity1.entityBn");
        }
        if (entityBn == null) {
            return map;
        }

        TEntity1 tEntity1 = TEntity1.get(sosenId, oyaBn, entityBn);
        tEntity1.referTEntity3();
        tEntity1.referTEntity4();
        tEntity1.referTEntity5();
        tEntity1.referTKos();
        tEntity1.referTTenpuFiles();
        map.put("TEntity1", tEntity1);
        return map;
    }

}
