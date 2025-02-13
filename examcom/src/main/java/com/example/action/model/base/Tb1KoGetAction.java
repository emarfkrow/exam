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
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1Ko.oyaId");
        }
        if (oyaId == null) {
            return map;
        }
        com.example.entity.Tb1Oya tb1Oya = com.example.entity.Tb1Oya.get(oyaId);
        map.put("Tb1Oya", tb1Oya);

        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Ko.koBn");
        }
        if (koBn == null) {
            return map;
        }

        Tb1Ko tb1Ko = Tb1Ko.get(oyaId, koBn);
        tb1Ko.referTb1Ko2();
        tb1Ko.referTb1Ko3();
        tb1Ko.referTb1Magos();
        map.put("Tb1Ko", tb1Ko);
        return map;
    }

}
