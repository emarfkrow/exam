package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Derive1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 派生１照会
 *
 * @author emarfkrow
 */
public class Tb6Derive1GetAction extends BaseAction {

    /** 派生１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object derive1Id = postJson.get("derive1Id");
        if (derive1Id == null) {
            derive1Id = postJson.get("Tb6Derive1.derive1Id");
        }
        if (derive1Id == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6Derive1 tb6Derive1 = Tb6Derive1.get(derive1Id);
            tb6Derive1.referTb6Derive1Dets();
            map.put("Tb6Derive1", tb6Derive1);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
