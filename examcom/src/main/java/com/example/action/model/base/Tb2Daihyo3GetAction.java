package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Daihyo3;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 代表３照会
 *
 * @author emarfkrow
 */
public class Tb2Daihyo3GetAction extends BaseAction {

    /** 代表３照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object daihyoId = postJson.get("daihyoId");
        if (daihyoId == null) {
            daihyoId = postJson.get("Tb2Daihyo3.daihyoId");
        }
        if (daihyoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb2Daihyo3 tb2Daihyo3 = Tb2Daihyo3.get(daihyoId);
        tb2Daihyo3.referTb2Daihyo();
        tb2Daihyo3.referTb2Daihyo2();
        map.put("Tb2Daihyo3", tb2Daihyo3);
        return map;
    }

}
