package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Entity1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ１照会
 *
 * @author emarfkrow
 */
public class Tb1Entity1GetAction extends BaseAction {

    /** エンティティ１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Entity1.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Entity1.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Entity1.entityBn");
        }
        if (entityBn == null) {
            return map;
        }

        Tb1Entity1 tb1Entity1 = Tb1Entity1.get(sosenId, oyaBn, entityBn);
        tb1Entity1.referTb1Entity2();
        tb1Entity1.referTb1Entity3();
        tb1Entity1.referTb1Entity4();
        tb1Entity1.referTb1Entity5();
        tb1Entity1.referTb1Kos();
        tb1Entity1.referTb1TenpuFiles();
        map.put("Tb1Entity1", tb1Entity1);
        return map;
    }

}
