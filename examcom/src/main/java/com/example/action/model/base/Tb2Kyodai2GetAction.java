package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Kyodai2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 兄弟２照会
 *
 * @author emarfkrow
 */
public class Tb2Kyodai2GetAction extends BaseAction {

    /** 兄弟２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kyodaiId = postJson.get("kyodaiId");
        if (kyodaiId == null) {
            kyodaiId = postJson.get("Tb2Kyodai2.kyodaiId");
        }
        if (kyodaiId == null) {
            return map;
        }

        Tb2Kyodai2 tb2Kyodai2 = Tb2Kyodai2.get(kyodaiId);
        tb2Kyodai2.referTb2Kyodai();
        tb2Kyodai2.referTb2Kyodai3();
        map.put("Tb2Kyodai2", tb2Kyodai2);
        return map;
    }

}
