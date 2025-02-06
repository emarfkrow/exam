package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuYokushiMoto1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約抑止元１照会
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiMoto1GetAction extends BaseAction {

    /** 集約抑止元１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakuYokushiMoto1Id = postJson.get("shuyakuYokushiMoto1Id");
        if (shuyakuYokushiMoto1Id == null) {
            shuyakuYokushiMoto1Id = postJson.get("Tb6ShuyakuYokushiMoto1.shuyakuYokushiMoto1Id");
        }
        if (shuyakuYokushiMoto1Id == null) {
            return map;
        }

        Tb6ShuyakuYokushiMoto1 tb6ShuyakuYokushiMoto1 = Tb6ShuyakuYokushiMoto1.get(shuyakuYokushiMoto1Id);
        map.put("Tb6ShuyakuYokushiMoto1", tb6ShuyakuYokushiMoto1);
        return map;
    }

}
