package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Youngest;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 末弟照会
 *
 * @author emarfkrow
 */
public class Tb2YoungestGetAction extends BaseAction {

    /** 末弟照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object kyodaiId = postJson.get("kyodaiId");
        if (kyodaiId == null) {
            kyodaiId = postJson.get("Tb2Youngest.kyodaiId");
        }
        if (kyodaiId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb2Youngest tb2Youngest = Tb2Youngest.get(kyodaiId);
            map.put("Tb2Youngest", tb2Youngest);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
