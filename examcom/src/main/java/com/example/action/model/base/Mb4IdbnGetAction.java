package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Idbn;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * ID-BNマスタ照会
 *
 * @author emarfkrow
 */
public class Mb4IdbnGetAction extends BaseAction {

    /** ID-BNマスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object refId = postJson.get("refId");
        if (refId == null) {
            refId = postJson.get("Mb4Idbn.refId");
        }
        if (refId == null) {
            isAllKey = false;
        }

        Object refBn = postJson.get("refBn");
        if (refBn == null) {
            refBn = postJson.get("Mb4Idbn.refBn");
        }
        if (refBn == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Mb4Idbn mb4Idbn = Mb4Idbn.get(refId, refBn);
            map.put("Mb4Idbn", mb4Idbn);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
