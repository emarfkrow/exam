package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Ko3;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 子３照会
 *
 * @author emarfkrow
 */
public class Tb1Ko3GetAction extends BaseAction {

    /** 子３照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1Ko3.oyaId");
        }
        if (oyaId == null) {
            isAllKey = false;
        }

        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Ko3.koBn");
        }
        if (koBn == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb1Ko3 tb1Ko3 = Tb1Ko3.get(oyaId, koBn);
        tb1Ko3.referTb1Ko();
        tb1Ko3.referTb1Ko2();
        tb1Ko3.referTb1Magos();
        map.put("Tb1Ko3", tb1Ko3);
        return map;
    }

}
