package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3Temp;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 当初照会
 *
 * @author emarfkrow
 */
public class Tb3TempGetAction extends BaseAction {

    /** 当初照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tempId = postJson.get("tempId");
        if (tempId == null) {
            tempId = postJson.get("Tb3Temp.tempId");
        }
        if (tempId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb3Temp tb3Temp = Tb3Temp.get(tempId);
            map.put("Tb3Temp", tb3Temp);
        } catch (NoDataError e) {
            if (postJson.get("IsSilent") == null || !postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
