package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Koji;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 孤児照会
 *
 * @author emarfkrow
 */
public class Tb2KojiGetAction extends BaseAction {

    /** 孤児照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kojiId = postJson.get("kojiId");
        if (kojiId == null) {
            kojiId = postJson.get("Tb2Koji.kojiId");
        }
        if (kojiId == null) {
            return map;
        }

        Tb2Koji tb2Koji = Tb2Koji.get(kojiId);
        tb2Koji.referTb2Koji2();
        tb2Koji.referTb2Koji3();
        map.put("Tb2Koji", tb2Koji);
        return map;
    }

}
