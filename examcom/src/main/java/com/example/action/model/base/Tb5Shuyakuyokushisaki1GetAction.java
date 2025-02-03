package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Shuyakuyokushisaki1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約抑止先１照会
 *
 * @author emarfkrow
 */
public class Tb5Shuyakuyokushisaki1GetAction extends BaseAction {

    /** 集約抑止先１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakuyokushisaki1Id = postJson.get("shuyakuyokushisaki1Id");
        if (shuyakuyokushisaki1Id == null) {
            shuyakuyokushisaki1Id = postJson.get("Tb5Shuyakuyokushisaki1.shuyakuyokushisaki1Id");
        }
        if (shuyakuyokushisaki1Id == null) {
            return map;
        }

        Tb5Shuyakuyokushisaki1 tb5Shuyakuyokushisaki1 = Tb5Shuyakuyokushisaki1.get(shuyakuyokushisaki1Id);
        map.put("Tb5Shuyakuyokushisaki1", tb5Shuyakuyokushisaki1);
        return map;
    }

}
