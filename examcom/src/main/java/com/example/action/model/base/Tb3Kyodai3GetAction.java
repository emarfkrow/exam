package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3Kyodai3;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 兄弟３照会
 *
 * @author emarfkrow
 */
public class Tb3Kyodai3GetAction extends BaseAction {

    /** 兄弟３照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb3Kyodai3.oyaId");
        }
        if (oyaId == null) {
            return map;
        }
        com.example.entity.Tb1Oya tb1Oya = com.example.entity.Tb1Oya.get(oyaId);
        map.put("Tb1Oya", tb1Oya);

        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb3Kyodai3.koBn");
        }
        if (koBn == null) {
            return map;
        }

        Tb3Kyodai3 tb3Kyodai3 = Tb3Kyodai3.get(oyaId, koBn);
        tb3Kyodai3.referTb1Ko();
        tb3Kyodai3.referTb3Kyodai2();
        tb3Kyodai3.referTb3Kyodai4();
        tb3Kyodai3.referTb3Kyodai5();
        tb3Kyodai3.referTb1Magos();
        map.put("Tb3Kyodai3", tb3Kyodai3);
        return map;
    }

}
