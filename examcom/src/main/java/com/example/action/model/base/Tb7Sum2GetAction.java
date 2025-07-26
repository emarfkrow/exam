package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7Sum2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 集約抑止照会
 *
 * @author emarfkrow
 */
public class Tb7Sum2GetAction extends BaseAction {

    /** 集約抑止照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object sum2Id = postJson.get("sum2Id");
        if (sum2Id == null) {
            sum2Id = postJson.get("Tb7Sum2.sum2Id");
        }
        if (sum2Id == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb7Sum2 tb7Sum2 = Tb7Sum2.get(sum2Id);
            map.put("Tb7Sum2", tb7Sum2);
        } catch (NoDataError e) {
            if (postJson.get("IsSilent") == null || !postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
