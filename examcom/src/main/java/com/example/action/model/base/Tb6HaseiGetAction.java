package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Hasei;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 派生照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiGetAction extends BaseAction {

    /** 派生照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiId = postJson.get("haseiId");
        if (haseiId == null) {
            haseiId = postJson.get("Tb6Hasei.haseiId");
        }
        if (haseiId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6Hasei tb6Hasei = Tb6Hasei.get(haseiId);
            tb6Hasei.referTb6HaseiDets();
            map.put("Tb6Hasei", tb6Hasei);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
