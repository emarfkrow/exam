package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseiyokushi;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生抑止照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiyokushiGetAction extends BaseAction {

    /** 転生抑止照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiyokushiId = postJson.get("tenseiyokushiId");
        if (tenseiyokushiId == null) {
            tenseiyokushiId = postJson.get("Tb5Tenseiyokushi.tenseiyokushiId");
        }
        if (tenseiyokushiId == null) {
            return map;
        }

        Tb5Tenseiyokushi tb5Tenseiyokushi = Tb5Tenseiyokushi.get(tenseiyokushiId);
        map.put("Tb5Tenseiyokushi", tb5Tenseiyokushi);
        return map;
    }

}
