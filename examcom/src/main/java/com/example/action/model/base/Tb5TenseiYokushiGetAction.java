package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiYokushi;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生抑止照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiGetAction extends BaseAction {

    /** 転生抑止照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiYokushiId = postJson.get("tenseiYokushiId");
        if (tenseiYokushiId == null) {
            tenseiYokushiId = postJson.get("Tb5TenseiYokushi.tenseiYokushiId");
        }
        if (tenseiYokushiId == null) {
            return map;
        }

        Tb5TenseiYokushi tb5TenseiYokushi = Tb5TenseiYokushi.get(tenseiYokushiId);
        map.put("Tb5TenseiYokushi", tb5TenseiYokushi);
        return map;
    }

}
