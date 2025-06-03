package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7Unit;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 単位照会
 *
 * @author emarfkrow
 */
public class Tb7UnitGetAction extends BaseAction {

    /** 単位照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object unitId = postJson.get("unitId");
        if (unitId == null) {
            unitId = postJson.get("Tb7Unit.unitId");
        }
        if (unitId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb7Unit tb7Unit = Tb7Unit.get(unitId);
            map.put("Tb7Unit", tb7Unit);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
