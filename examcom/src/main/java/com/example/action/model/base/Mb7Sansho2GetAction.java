package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb7Sansho2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照２マスタ照会
 *
 * @author emarfkrow
 */
public class Mb7Sansho2GetAction extends BaseAction {

    /** 参照２マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sansho2Id = postJson.get("sansho2Id");
        if (sansho2Id == null) {
            sansho2Id = postJson.get("Mb7Sansho2.sansho2Id");
        }
        if (sansho2Id == null) {
            return map;
        }

        Mb7Sansho2 mb7Sansho2 = Mb7Sansho2.get(sansho2Id);
        map.put("Mb7Sansho2", mb7Sansho2);
        return map;
    }

}
