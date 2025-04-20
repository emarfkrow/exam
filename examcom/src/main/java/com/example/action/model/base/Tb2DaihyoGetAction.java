package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Daihyo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 代表照会
 *
 * @author emarfkrow
 */
public class Tb2DaihyoGetAction extends BaseAction {

    /** 代表照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object daihyoId = postJson.get("daihyoId");
        if (daihyoId == null) {
            daihyoId = postJson.get("Tb2Daihyo.daihyoId");
        }
        if (daihyoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb2Daihyo tb2Daihyo = Tb2Daihyo.get(daihyoId);
            tb2Daihyo.referTb2Daihyo2();
            tb2Daihyo.referTb2Daihyo3();
            map.put("Tb2Daihyo", tb2Daihyo);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
