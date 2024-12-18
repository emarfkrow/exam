package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MhrShokui;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 職位マスタ照会
 *
 * @author emarfkrow
 */
public class MhrShokuiGetAction extends BaseAction {

    /** 職位マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MhrShokui.shokuiId");
        }
        if (shokuiId == null) {
            return map;
        }

        MhrShokui mhrShokui = MhrShokui.get(shokuiId);
        map.put("MhrShokui", mhrShokui);
        return map;
    }

}
