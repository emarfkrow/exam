package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Oya;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 親照会
 *
 * @author emarfkrow
 */
public class Tb1OyaGetAction extends BaseAction {

    /** 親照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Oya.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        com.example.entity.Tb1Sosen tb1Sosen = com.example.entity.Tb1Sosen.get(sosenId);
        map.put("Tb1Sosen", tb1Sosen);

        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Oya.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }

        Tb1Oya tb1Oya = Tb1Oya.get(sosenId, oyaBn);
        tb1Oya.referTb1Entity1s();
        tb1Oya.referTb1Entity2s();
        tb1Oya.referTb1Entity3s();
        tb1Oya.referTb1Entity4s();
        tb1Oya.referTb1Entity5s();
        map.put("Tb1Oya", tb1Oya);
        return map;
    }

}
