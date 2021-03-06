package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MSansho2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照２マスタ照会
 *
 * @author emarfkrow
 */
public class MSansho2GetAction extends BaseAction {

    /** 参照２マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sansho2Cd = postJson.get("sansho2Cd");
        if (sansho2Cd == null) {
            sansho2Cd = postJson.get("MSansho2.sansho2Cd");
        }
        if (sansho2Cd == null) {
            return map;
        }

        MSansho2 mSansho2 = MSansho2.get(sansho2Cd);
        map.put("MSansho2", mSansho2);
        return map;
    }

}
