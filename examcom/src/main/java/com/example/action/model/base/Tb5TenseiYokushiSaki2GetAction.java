package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiYokushiSaki2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生抑止先２照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiSaki2GetAction extends BaseAction {

    /** 転生抑止先２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiYokushiSaki2Id = postJson.get("tenseiYokushiSaki2Id");
        if (tenseiYokushiSaki2Id == null) {
            tenseiYokushiSaki2Id = postJson.get("Tb5TenseiYokushiSaki2.tenseiYokushiSaki2Id");
        }
        if (tenseiYokushiSaki2Id == null) {
            return map;
        }

        Tb5TenseiYokushiSaki2 tb5TenseiYokushiSaki2 = Tb5TenseiYokushiSaki2.get(tenseiYokushiSaki2Id);
        map.put("Tb5TenseiYokushiSaki2", tb5TenseiYokushiSaki2);
        return map;
    }

}
