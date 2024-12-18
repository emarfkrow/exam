package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb1Sansho2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照２マスタ照会
 *
 * @author emarfkrow
 */
public class Mb1Sansho2GetAction extends BaseAction {

    /** 参照２マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sansho2Cd = postJson.get("sansho2Cd");
        if (sansho2Cd == null) {
            sansho2Cd = postJson.get("Mb1Sansho2.sansho2Cd");
        }
        if (sansho2Cd == null) {
            return map;
        }

        Mb1Sansho2 mb1Sansho2 = Mb1Sansho2.get(sansho2Cd);
        map.put("Mb1Sansho2", mb1Sansho2);
        return map;
    }

}
