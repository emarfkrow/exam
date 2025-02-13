package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Koji3;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 孤児３照会
 *
 * @author emarfkrow
 */
public class Tb2Koji3GetAction extends BaseAction {

    /** 孤児３照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kojiId = postJson.get("kojiId");
        if (kojiId == null) {
            kojiId = postJson.get("Tb2Koji3.kojiId");
        }
        if (kojiId == null) {
            return map;
        }

        Tb2Koji3 tb2Koji3 = Tb2Koji3.get(kojiId);
        tb2Koji3.referTb2Koji2();
        map.put("Tb2Koji3", tb2Koji3);
        return map;
    }

}
