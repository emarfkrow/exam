package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2NoPk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 主キーなし照会
 *
 * @author emarfkrow
 */
public class Tb2NoPkGetAction extends BaseAction {

    /** 主キーなし照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        Tb2NoPk tb2NoPk = Tb2NoPk.get();
        map.put("Tb2NoPk", tb2NoPk);
        return map;
    }

}
