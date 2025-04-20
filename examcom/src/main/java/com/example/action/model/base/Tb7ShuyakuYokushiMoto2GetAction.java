package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7ShuyakuYokushiMoto2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 集約抑止元２照会
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuYokushiMoto2GetAction extends BaseAction {

    /** 集約抑止元２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object shuyakuYokushiMoto2Id = postJson.get("shuyakuYokushiMoto2Id");
        if (shuyakuYokushiMoto2Id == null) {
            shuyakuYokushiMoto2Id = postJson.get("Tb7ShuyakuYokushiMoto2.shuyakuYokushiMoto2Id");
        }
        if (shuyakuYokushiMoto2Id == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb7ShuyakuYokushiMoto2 tb7ShuyakuYokushiMoto2 = Tb7ShuyakuYokushiMoto2.get(shuyakuYokushiMoto2Id);
            map.put("Tb7ShuyakuYokushiMoto2", tb7ShuyakuYokushiMoto2);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
