package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Satogo3;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 里子３照会
 *
 * @author emarfkrow
 */
public class Tb2Satogo3GetAction extends BaseAction {

    /** 里子３照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object satogoId = postJson.get("satogoId");
        if (satogoId == null) {
            satogoId = postJson.get("Tb2Satogo3.satogoId");
        }
        if (satogoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb2Satogo3 tb2Satogo3 = Tb2Satogo3.get(satogoId);
            tb2Satogo3.referTb2Satogo2();
            map.put("Tb2Satogo3", tb2Satogo3);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
