package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TNoPk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 主キーなし照会
 *
 * @author emarfkrow
 */
public class TNoPkGetAction extends BaseAction {

    /** 主キーなし照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        TNoPk tNoPk = TNoPk.get();
        map.put("TNoPk", tNoPk);
        return map;
    }

}
