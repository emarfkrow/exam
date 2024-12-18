package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb1Sansho3;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照３マスタ照会
 *
 * @author emarfkrow
 */
public class Mb1Sansho3GetAction extends BaseAction {

    /** 参照３マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sansho3No = postJson.get("sansho3No");
        if (sansho3No == null) {
            sansho3No = postJson.get("Mb1Sansho3.sansho3No");
        }
        if (sansho3No == null) {
            return map;
        }

        Mb1Sansho3 mb1Sansho3 = Mb1Sansho3.get(sansho3No);
        map.put("Mb1Sansho3", mb1Sansho3);
        return map;
    }

}
