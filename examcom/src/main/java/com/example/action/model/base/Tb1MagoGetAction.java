package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Mago;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 孫照会
 *
 * @author emarfkrow
 */
public class Tb1MagoGetAction extends BaseAction {

    /** 孫照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1Mago.oyaId");
        }
        if (oyaId == null) {
            return map;
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Mago.koBn");
        }
        if (koBn == null) {
            return map;
        }
        // 親モデルの取得
        com.example.entity.Tb1Ko tb1Ko = com.example.entity.Tb1Ko.get(oyaId, koBn);
        map.put("Tb1Ko", tb1Ko);
        com.example.entity.Tb1Ko3 tb1Ko3 = com.example.entity.Tb1Ko3.get(oyaId, koBn);
        map.put("Tb1Ko3", tb1Ko3);
        Object magoBn = postJson.get("magoBn");
        if (magoBn == null) {
            magoBn = postJson.get("Tb1Mago.magoBn");
        }
        if (magoBn == null) {
            return map;
        }

        Tb1Mago tb1Mago = Tb1Mago.get(oyaId, koBn, magoBn);
        map.put("Tb1Mago", tb1Mago);
        return map;
    }

}
