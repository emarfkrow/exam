package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Tensei;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生照会
 *
 * @author emarfkrow
 */
public class Tb1TenseiGetAction extends BaseAction {

    /** 転生照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiId = postJson.get("tenseiId");
        if (tenseiId == null) {
            tenseiId = postJson.get("Tb1Tensei.tenseiId");
        }
        if (tenseiId == null) {
            return map;
        }

        Tb1Tensei tb1Tensei = Tb1Tensei.get(tenseiId);
        map.put("Tb1Tensei", tb1Tensei);
        return map;
    }

}
