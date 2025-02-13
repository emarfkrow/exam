package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Chonan3;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 長男３照会
 *
 * @author emarfkrow
 */
public class Tb2Chonan3GetAction extends BaseAction {

    /** 長男３照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object chonanId = postJson.get("chonanId");
        if (chonanId == null) {
            chonanId = postJson.get("Tb2Chonan3.chonanId");
        }
        if (chonanId == null) {
            return map;
        }

        Tb2Chonan3 tb2Chonan3 = Tb2Chonan3.get(chonanId);
        map.put("Tb2Chonan3", tb2Chonan3);
        return map;
    }

}
