package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Bros;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 兄弟照会
 *
 * @author emarfkrow
 */
public class Tb2BrosGetAction extends BaseAction {

    /** 兄弟照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object brosId = postJson.get("brosId");
        if (brosId == null) {
            brosId = postJson.get("Tb2Bros.brosId");
        }
        if (brosId == null) {
            return map;
        }

        Tb2Bros tb2Bros = Tb2Bros.get(brosId);
        tb2Bros.referTb2Bros2();
        tb2Bros.referTb2Bros3();
        map.put("Tb2Bros", tb2Bros);
        return map;
    }

}
