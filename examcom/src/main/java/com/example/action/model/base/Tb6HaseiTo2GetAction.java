package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiTo2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 派生先２照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiTo2GetAction extends BaseAction {

    /** 派生先２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiTo2Id = postJson.get("haseiTo2Id");
        if (haseiTo2Id == null) {
            haseiTo2Id = postJson.get("Tb6HaseiTo2.haseiTo2Id");
        }
        if (haseiTo2Id == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6HaseiTo2 tb6HaseiTo2 = Tb6HaseiTo2.get(haseiTo2Id);
            tb6HaseiTo2.referTb6HaseiSaki2Dets();
            map.put("Tb6HaseiTo2", tb6HaseiTo2);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
