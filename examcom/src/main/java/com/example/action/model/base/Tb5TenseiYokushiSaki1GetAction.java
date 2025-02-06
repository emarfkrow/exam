package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiYokushiSaki1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生抑止先１照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiSaki1GetAction extends BaseAction {

    /** 転生抑止先１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiYokushiSaki1Id = postJson.get("tenseiYokushiSaki1Id");
        if (tenseiYokushiSaki1Id == null) {
            tenseiYokushiSaki1Id = postJson.get("Tb5TenseiYokushiSaki1.tenseiYokushiSaki1Id");
        }
        if (tenseiYokushiSaki1Id == null) {
            return map;
        }

        Tb5TenseiYokushiSaki1 tb5TenseiYokushiSaki1 = Tb5TenseiYokushiSaki1.get(tenseiYokushiSaki1Id);
        map.put("Tb5TenseiYokushiSaki1", tb5TenseiYokushiSaki1);
        return map;
    }

}
