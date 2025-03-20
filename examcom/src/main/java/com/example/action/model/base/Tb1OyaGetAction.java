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

        // 主キーのチェック
        boolean isAllKey = true;

        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1Oya.oyaId");
        }
        if (oyaId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb1Oya tb1Oya = Tb1Oya.get(oyaId);
        tb1Oya.referTb1Kos();
        tb1Oya.referTb1Ko2s();
        map.put("Tb1Oya", tb1Oya);
        return map;
    }

}
