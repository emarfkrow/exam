package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Shison;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 子孫照会
 *
 * @author emarfkrow
 */
public class Tb1ShisonGetAction extends BaseAction {

    /** 子孫照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Shison.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Shison.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Shison.entityBn");
        }
        if (entityBn == null) {
            return map;
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Shison.koBn");
        }
        if (koBn == null) {
            return map;
        }
        com.example.entity.Tb1Ko tb1Ko = com.example.entity.Tb1Ko.get(sosenId, oyaBn, entityBn, koBn);
        map.put("Tb1Ko", tb1Ko);

        Object shisonBn = postJson.get("shisonBn");
        if (shisonBn == null) {
            shisonBn = postJson.get("Tb1Shison.shisonBn");
        }
        if (shisonBn == null) {
            return map;
        }

        Tb1Shison tb1Shison = Tb1Shison.get(sosenId, oyaBn, entityBn, koBn, shisonBn);
        map.put("Tb1Shison", tb1Shison);
        return map;
    }

}
