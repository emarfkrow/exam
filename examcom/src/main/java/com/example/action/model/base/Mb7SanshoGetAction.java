package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb7Sansho;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照マスタ照会
 *
 * @author emarfkrow
 */
public class Mb7SanshoGetAction extends BaseAction {

    /** 参照マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sanshoId = postJson.get("sanshoId");
        if (sanshoId == null) {
            sanshoId = postJson.get("Mb7Sansho.sanshoId");
        }
        if (sanshoId == null) {
            return map;
        }

        Mb7Sansho mb7Sansho = Mb7Sansho.get(sanshoId);
        map.put("Mb7Sansho", mb7Sansho);
        return map;
    }

}
