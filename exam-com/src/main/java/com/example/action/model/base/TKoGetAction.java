package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TKo;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 子照会
 *
 * @author emarfkrow
 */
public class TKoGetAction extends BaseAction {

    /** 子照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TKo.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TKo.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TKo.entityBn");
        }
        if (entityBn == null) {
            return map;
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("TKo.koBn");
        }
        if (koBn == null) {
            return map;
        }

        TKo tKo = TKo.get(sosenId, oyaBn, entityBn, koBn);
        tKo.referTShisons();
        map.put("TKo", tKo);
        return map;
    }

}
