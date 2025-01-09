package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Ko;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 子照会
 *
 * @author emarfkrow
 */
public class Tb1KoGetAction extends BaseAction {

    /** 子照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Ko.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Ko.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Ko.entityBn");
        }
        if (entityBn == null) {
            return map;
        }
        com.example.entity.Tb1Entity1 tb1Entity1 = com.example.entity.Tb1Entity1.get(sosenId, oyaBn, entityBn);
        map.put("Tb1Entity1", tb1Entity1);

        com.example.entity.Tb1Entity2 tb1Entity2 = com.example.entity.Tb1Entity2.get(sosenId, oyaBn, entityBn);
        map.put("Tb1Entity2", tb1Entity2);

        com.example.entity.Tb1Entity3 tb1Entity3 = com.example.entity.Tb1Entity3.get(sosenId, oyaBn, entityBn);
        map.put("Tb1Entity3", tb1Entity3);

        com.example.entity.Tb1Entity4 tb1Entity4 = com.example.entity.Tb1Entity4.get(sosenId, oyaBn, entityBn);
        map.put("Tb1Entity4", tb1Entity4);

        com.example.entity.Tb1Entity5 tb1Entity5 = com.example.entity.Tb1Entity5.get(sosenId, oyaBn, entityBn);
        map.put("Tb1Entity5", tb1Entity5);

        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Ko.koBn");
        }
        if (koBn == null) {
            return map;
        }

        Tb1Ko tb1Ko = Tb1Ko.get(sosenId, oyaBn, entityBn, koBn);
        tb1Ko.referTb1Shisons();
        map.put("Tb1Ko", tb1Ko);
        return map;
    }

}
