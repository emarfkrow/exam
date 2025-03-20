package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Chonan2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 長男２照会
 *
 * @author emarfkrow
 */
public class Tb2Chonan2GetAction extends BaseAction {

    /** 長男２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object chonanId = postJson.get("chonanId");
        if (chonanId == null) {
            chonanId = postJson.get("Tb2Chonan2.chonanId");
        }
        if (chonanId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb2Chonan2 tb2Chonan2 = Tb2Chonan2.get(chonanId);
        map.put("Tb2Chonan2", tb2Chonan2);
        return map;
    }

}
