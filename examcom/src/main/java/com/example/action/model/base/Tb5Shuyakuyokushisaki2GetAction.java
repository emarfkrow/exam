package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Shuyakuyokushisaki2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約抑止先２照会
 *
 * @author emarfkrow
 */
public class Tb5Shuyakuyokushisaki2GetAction extends BaseAction {

    /** 集約抑止先２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakuyokushisaki2Id = postJson.get("shuyakuyokushisaki2Id");
        if (shuyakuyokushisaki2Id == null) {
            shuyakuyokushisaki2Id = postJson.get("Tb5Shuyakuyokushisaki2.shuyakuyokushisaki2Id");
        }
        if (shuyakuyokushisaki2Id == null) {
            return map;
        }

        Tb5Shuyakuyokushisaki2 tb5Shuyakuyokushisaki2 = Tb5Shuyakuyokushisaki2.get(shuyakuyokushisaki2Id);
        map.put("Tb5Shuyakuyokushisaki2", tb5Shuyakuyokushisaki2);
        return map;
    }

}
