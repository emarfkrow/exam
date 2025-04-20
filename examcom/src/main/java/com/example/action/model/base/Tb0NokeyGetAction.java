package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb0Nokey;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 主キーなし照会
 *
 * @author emarfkrow
 */
public class Tb0NokeyGetAction extends BaseAction {

    /** 主キーなし照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object colA = postJson.get("colA");
        if (colA == null) {
            colA = postJson.get("Tb0Nokey.colA");
        }
        if (colA == null) {
            isAllKey = false;
        }

        Object colB = postJson.get("colB");
        if (colB == null) {
            colB = postJson.get("Tb0Nokey.colB");
        }
        if (colB == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb0Nokey tb0Nokey = Tb0Nokey.get(colA, colB);
            map.put("Tb0Nokey", tb0Nokey);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
