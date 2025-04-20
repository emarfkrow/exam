package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 派生先１照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki1GetAction extends BaseAction {

    /** 派生先１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiSaki1Id = postJson.get("haseiSaki1Id");
        if (haseiSaki1Id == null) {
            haseiSaki1Id = postJson.get("Tb6HaseiSaki1.haseiSaki1Id");
        }
        if (haseiSaki1Id == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6HaseiSaki1 tb6HaseiSaki1 = Tb6HaseiSaki1.get(haseiSaki1Id);
            tb6HaseiSaki1.referTb6HaseiSaki1Dets();
            map.put("Tb6HaseiSaki1", tb6HaseiSaki1);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
