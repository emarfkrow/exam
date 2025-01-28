package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1KoRireki;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 履歴照会
 *
 * @author emarfkrow
 */
public class Tb1KoRirekiGetAction extends BaseAction {

    /** 履歴照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1KoRireki.oyaId");
        }
        if (oyaId == null) {
            return map;
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1KoRireki.koBn");
        }
        if (koBn == null) {
            return map;
        }
        Object rirekiBn = postJson.get("rirekiBn");
        if (rirekiBn == null) {
            rirekiBn = postJson.get("Tb1KoRireki.rirekiBn");
        }
        if (rirekiBn == null) {
            return map;
        }

        Tb1KoRireki tb1KoRireki = Tb1KoRireki.get(oyaId, koBn, rirekiBn);
        map.put("Tb1KoRireki", tb1KoRireki);
        return map;
    }

}
