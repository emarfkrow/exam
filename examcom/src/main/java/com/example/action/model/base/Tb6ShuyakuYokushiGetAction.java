package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuYokushi;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約抑止照会
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiGetAction extends BaseAction {

    /** 集約抑止照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakuYokushiId = postJson.get("shuyakuYokushiId");
        if (shuyakuYokushiId == null) {
            shuyakuYokushiId = postJson.get("Tb6ShuyakuYokushi.shuyakuYokushiId");
        }
        if (shuyakuYokushiId == null) {
            return map;
        }

        Tb6ShuyakuYokushi tb6ShuyakuYokushi = Tb6ShuyakuYokushi.get(shuyakuYokushiId);
        map.put("Tb6ShuyakuYokushi", tb6ShuyakuYokushi);
        return map;
    }

}
