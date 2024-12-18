package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Itoko;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 従妹照会
 *
 * @author emarfkrow
 */
public class Tb1ItokoGetAction extends BaseAction {

    /** 従妹照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object itokoId = postJson.get("itokoId");
        if (itokoId == null) {
            itokoId = postJson.get("Tb1Itoko.itokoId");
        }
        if (itokoId == null) {
            return map;
        }

        Tb1Itoko tb1Itoko = Tb1Itoko.get(itokoId);
        map.put("Tb1Itoko", tb1Itoko);
        return map;
    }

}
