package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tensei;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 転生照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiGetAction extends BaseAction {

    /** 転生照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tenseiId = postJson.get("tenseiId");
        if (tenseiId == null) {
            tenseiId = postJson.get("Tb5Tensei.tenseiId");
        }
        if (tenseiId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb5Tensei tb5Tensei = Tb5Tensei.get(tenseiId);
            tb5Tensei.referTb5TenseiDets();
            map.put("Tb5Tensei", tb5Tensei);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
