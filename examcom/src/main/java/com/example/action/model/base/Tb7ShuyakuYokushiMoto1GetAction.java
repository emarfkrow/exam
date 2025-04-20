package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7ShuyakuYokushiMoto1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 集約抑止元１照会
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuYokushiMoto1GetAction extends BaseAction {

    /** 集約抑止元１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object shuyakuYokushiMoto1Id = postJson.get("shuyakuYokushiMoto1Id");
        if (shuyakuYokushiMoto1Id == null) {
            shuyakuYokushiMoto1Id = postJson.get("Tb7ShuyakuYokushiMoto1.shuyakuYokushiMoto1Id");
        }
        if (shuyakuYokushiMoto1Id == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb7ShuyakuYokushiMoto1 tb7ShuyakuYokushiMoto1 = Tb7ShuyakuYokushiMoto1.get(shuyakuYokushiMoto1Id);
            map.put("Tb7ShuyakuYokushiMoto1", tb7ShuyakuYokushiMoto1);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
