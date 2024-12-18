package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb1Sansho1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照１マスタ照会
 *
 * @author emarfkrow
 */
public class Mb1Sansho1GetAction extends BaseAction {

    /** 参照１マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sansho1Id = postJson.get("sansho1Id");
        if (sansho1Id == null) {
            sansho1Id = postJson.get("Mb1Sansho1.sansho1Id");
        }
        if (sansho1Id == null) {
            return map;
        }

        Mb1Sansho1 mb1Sansho1 = Mb1Sansho1.get(sansho1Id);
        map.put("Mb1Sansho1", mb1Sansho1);
        return map;
    }

}
