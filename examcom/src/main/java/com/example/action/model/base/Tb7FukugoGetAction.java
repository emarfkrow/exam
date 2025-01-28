package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7Fukugo;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 複合照会
 *
 * @author emarfkrow
 */
public class Tb7FukugoGetAction extends BaseAction {

    /** 複合照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sansho1Id = postJson.get("sansho1Id");
        if (sansho1Id == null) {
            sansho1Id = postJson.get("Tb7Fukugo.sansho1Id");
        }
        if (sansho1Id == null) {
            return map;
        }
        Object sansho2Id = postJson.get("sansho2Id");
        if (sansho2Id == null) {
            sansho2Id = postJson.get("Tb7Fukugo.sansho2Id");
        }
        if (sansho2Id == null) {
            return map;
        }
        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("Tb7Fukugo.tekiyoBi");
        }
        if (tekiyoBi == null) {
            return map;
        }

        Tb7Fukugo tb7Fukugo = Tb7Fukugo.get(sansho1Id, sansho2Id, tekiyoBi);
        map.put("Tb7Fukugo", tb7Fukugo);
        return map;
    }

}
