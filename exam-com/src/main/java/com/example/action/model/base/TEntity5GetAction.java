package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity5;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ５照会
 *
 * @author emarfkrow
 */
public class TEntity5GetAction extends BaseAction {

    /** エンティティ５照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TEntity5.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TEntity5.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TEntity5.entityBn");
        }
        if (entityBn == null) {
            return map;
        }

        TEntity5 tEntity5 = TEntity5.get(sosenId, oyaBn, entityBn);
        tEntity5.referTEntity1();
        tEntity5.referTEntity3();
        tEntity5.referTEntity4();
        tEntity5.referTKos();
        tEntity5.referTTenpuFiles();
        map.put("TEntity5", tEntity5);
        return map;
    }

}
