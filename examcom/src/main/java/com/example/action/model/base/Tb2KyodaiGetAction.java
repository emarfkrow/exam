package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Kyodai;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 兄弟照会
 *
 * @author emarfkrow
 */
public class Tb2KyodaiGetAction extends BaseAction {

    /** 兄弟照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kyodaiId = postJson.get("kyodaiId");
        if (kyodaiId == null) {
            kyodaiId = postJson.get("Tb2Kyodai.kyodaiId");
        }
        if (kyodaiId == null) {
            return map;
        }

        Tb2Kyodai tb2Kyodai = Tb2Kyodai.get(kyodaiId);
        tb2Kyodai.referTb2Kyodai2();
        tb2Kyodai.referTb2Kyodai3();
        map.put("Tb2Kyodai", tb2Kyodai);
        return map;
    }

}
