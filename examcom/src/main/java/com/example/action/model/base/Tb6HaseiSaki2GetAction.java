package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 派生先２照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki2GetAction extends BaseAction {

    /** 派生先２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object haseiSaki2Id = postJson.get("haseiSaki2Id");
        if (haseiSaki2Id == null) {
            haseiSaki2Id = postJson.get("Tb6HaseiSaki2.haseiSaki2Id");
        }
        if (haseiSaki2Id == null) {
            return map;
        }

        Tb6HaseiSaki2 tb6HaseiSaki2 = Tb6HaseiSaki2.get(haseiSaki2Id);
        tb6HaseiSaki2.referTb6HaseiSaki2Dets();
        map.put("Tb6HaseiSaki2", tb6HaseiSaki2);
        return map;
    }

}
