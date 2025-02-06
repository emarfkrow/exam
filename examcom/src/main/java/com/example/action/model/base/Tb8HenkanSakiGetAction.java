package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8HenkanSaki;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 変換先照会
 *
 * @author emarfkrow
 */
public class Tb8HenkanSakiGetAction extends BaseAction {

    /** 変換先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object henkanSakiId = postJson.get("henkanSakiId");
        if (henkanSakiId == null) {
            henkanSakiId = postJson.get("Tb8HenkanSaki.henkanSakiId");
        }
        if (henkanSakiId == null) {
            return map;
        }

        Tb8HenkanSaki tb8HenkanSaki = Tb8HenkanSaki.get(henkanSakiId);
        map.put("Tb8HenkanSaki", tb8HenkanSaki);
        return map;
    }

}
