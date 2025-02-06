package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuYokushiMoto2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約抑止元２照会
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiMoto2GetAction extends BaseAction {

    /** 集約抑止元２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakuYokushiMoto2Id = postJson.get("shuyakuYokushiMoto2Id");
        if (shuyakuYokushiMoto2Id == null) {
            shuyakuYokushiMoto2Id = postJson.get("Tb6ShuyakuYokushiMoto2.shuyakuYokushiMoto2Id");
        }
        if (shuyakuYokushiMoto2Id == null) {
            return map;
        }

        Tb6ShuyakuYokushiMoto2 tb6ShuyakuYokushiMoto2 = Tb6ShuyakuYokushiMoto2.get(shuyakuYokushiMoto2Id);
        map.put("Tb6ShuyakuYokushiMoto2", tb6ShuyakuYokushiMoto2);
        return map;
    }

}
