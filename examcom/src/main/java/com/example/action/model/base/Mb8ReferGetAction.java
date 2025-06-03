package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb8Refer;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 参照マスタ照会
 *
 * @author emarfkrow
 */
public class Mb8ReferGetAction extends BaseAction {

    /** 参照マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object referId = postJson.get("referId");
        if (referId == null) {
            referId = postJson.get("Mb8Refer.referId");
        }
        if (referId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Mb8Refer mb8Refer = Mb8Refer.get(referId);
            map.put("Mb8Refer", mb8Refer);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
