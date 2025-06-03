package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8Combo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 複合照会
 *
 * @author emarfkrow
 */
public class Tb8ComboGetAction extends BaseAction {

    /** 複合照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object referId = postJson.get("referId");
        if (referId == null) {
            referId = postJson.get("Tb8Combo.referId");
        }
        if (referId == null) {
            isAllKey = false;
        }

        Object stintId = postJson.get("stintId");
        if (stintId == null) {
            stintId = postJson.get("Tb8Combo.stintId");
        }
        if (stintId == null) {
            isAllKey = false;
        }

        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("Tb8Combo.tekiyoBi");
        }
        if (tekiyoBi == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb8Combo tb8Combo = Tb8Combo.get(referId, stintId, tekiyoBi);
            map.put("Tb8Combo", tb8Combo);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
