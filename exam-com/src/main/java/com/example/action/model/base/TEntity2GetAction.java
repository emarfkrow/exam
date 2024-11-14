package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ２照会
 *
 * @author emarfkrow
 */
public class TEntity2GetAction extends BaseAction {

    /** エンティティ２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TEntity2.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TEntity2.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TEntity2.entityBn");
        }
        if (entityBn == null) {
            return map;
        }

        TEntity2 tEntity2 = TEntity2.get(sosenId, oyaBn, entityBn);
        tEntity2.referTEntity1();
        tEntity2.referTEntity3();
        tEntity2.referTEntity4();
        tEntity2.referTEntity5();
        tEntity2.referTKos();
        tEntity2.referTTenpuFiles();
        map.put("TEntity2", tEntity2);
        return map;
    }

}
