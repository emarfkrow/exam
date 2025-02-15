package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Bros2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 兄弟２照会
 *
 * @author emarfkrow
 */
public class Tb2Bros2GetAction extends BaseAction {

    /** 兄弟２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object brosId = postJson.get("brosId");
        if (brosId == null) {
            brosId = postJson.get("Tb2Bros2.brosId");
        }
        if (brosId == null) {
            return map;
        }

        Tb2Bros2 tb2Bros2 = Tb2Bros2.get(brosId);
        tb2Bros2.referTb2Bros();
        tb2Bros2.referTb2Bros3();
        map.put("Tb2Bros2", tb2Bros2);
        return map;
    }

}
