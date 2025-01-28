package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3Kyodai2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 兄弟２照会
 *
 * @author emarfkrow
 */
public class Tb3Kyodai2GetAction extends BaseAction {

    /** 兄弟２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb3Kyodai2.oyaId");
        }
        if (oyaId == null) {
            return map;
        }
        com.example.entity.Tb1Oya tb1Oya = com.example.entity.Tb1Oya.get(oyaId);
        map.put("Tb1Oya", tb1Oya);

        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb3Kyodai2.koBn");
        }
        if (koBn == null) {
            return map;
        }

        Tb3Kyodai2 tb3Kyodai2 = Tb3Kyodai2.get(oyaId, koBn);
        tb3Kyodai2.referTb1Ko();
        tb3Kyodai2.referTb3Kyodai3();
        tb3Kyodai2.referTb3Kyodai4();
        tb3Kyodai2.referTb3Kyodai5();
        tb3Kyodai2.referTb1Magos();
        map.put("Tb3Kyodai2", tb3Kyodai2);
        return map;
    }

}
