package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TOya;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 親照会
 *
 * @author emarfkrow
 */
public class TOyaGetAction extends BaseAction {

    /** 親照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TOya.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TOya.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }

        TOya tOya = TOya.get(sosenId, oyaBn);
        tOya.referTEntity1s();
        tOya.referTEntity2s();
        tOya.referTEntity3s();
        tOya.referTEntity4s();
        map.put("TOya", tOya);
        return map;
    }

}
