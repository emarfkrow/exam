package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Vb9Etsuran;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * VIEW照会
 *
 * @author emarfkrow
 */
public class Vb9EtsuranGetAction extends BaseAction {

    /** VIEW照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        Vb9Etsuran vb9Etsuran = Vb9Etsuran.get();
        map.put("Vb9Etsuran", vb9Etsuran);
        return map;
    }

}
