package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiTo1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 派生先１照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiTo1GetAction extends BaseAction {

    /** 派生先１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiTo1Id = postJson.get("haseiTo1Id");
        if (haseiTo1Id == null) {
            haseiTo1Id = postJson.get("Tb6HaseiTo1.haseiTo1Id");
        }
        if (haseiTo1Id == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6HaseiTo1 tb6HaseiTo1 = Tb6HaseiTo1.get(haseiTo1Id);
            tb6HaseiTo1.referTb6HaseiTo1Dets();
            map.put("Tb6HaseiTo1", tb6HaseiTo1);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
