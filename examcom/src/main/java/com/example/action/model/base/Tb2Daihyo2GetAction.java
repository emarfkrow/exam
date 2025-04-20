package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Daihyo2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 代表２照会
 *
 * @author emarfkrow
 */
public class Tb2Daihyo2GetAction extends BaseAction {

    /** 代表２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object daihyoId = postJson.get("daihyoId");
        if (daihyoId == null) {
            daihyoId = postJson.get("Tb2Daihyo2.daihyoId");
        }
        if (daihyoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb2Daihyo2 tb2Daihyo2 = Tb2Daihyo2.get(daihyoId);
            tb2Daihyo2.referTb2Daihyo();
            tb2Daihyo2.referTb2Daihyo3();
            map.put("Tb2Daihyo2", tb2Daihyo2);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
