package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Shuyakuyokushisaki2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約抑止先２照会
 *
 * @author emarfkrow
 */
public class Tb6Shuyakuyokushisaki2GetAction extends BaseAction {

    /** 集約抑止先２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakuyokushisaki2Id = postJson.get("shuyakuyokushisaki2Id");
        if (shuyakuyokushisaki2Id == null) {
            shuyakuyokushisaki2Id = postJson.get("Tb6Shuyakuyokushisaki2.shuyakuyokushisaki2Id");
        }
        if (shuyakuyokushisaki2Id == null) {
            return map;
        }

        Tb6Shuyakuyokushisaki2 tb6Shuyakuyokushisaki2 = Tb6Shuyakuyokushisaki2.get(shuyakuyokushisaki2Id);
        map.put("Tb6Shuyakuyokushisaki2", tb6Shuyakuyokushisaki2);
        return map;
    }

}
