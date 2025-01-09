package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Entity5;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ５照会
 *
 * @author emarfkrow
 */
public class Tb1Entity5GetAction extends BaseAction {

    /** エンティティ５照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Entity5.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Entity5.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        com.example.entity.Tb1Oya tb1Oya = com.example.entity.Tb1Oya.get(sosenId, oyaBn);
        map.put("Tb1Oya", tb1Oya);

        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Entity5.entityBn");
        }
        if (entityBn == null) {
            return map;
        }

        Tb1Entity5 tb1Entity5 = Tb1Entity5.get(sosenId, oyaBn, entityBn);
        tb1Entity5.referTb1Entity1();
        tb1Entity5.referTb1Entity2();
        tb1Entity5.referTb1Entity3();
        tb1Entity5.referTb1Entity4();
        tb1Entity5.referTb1Kos();
        tb1Entity5.referTb1TenpuFiles();
        map.put("Tb1Entity5", tb1Entity5);
        return map;
    }

}
