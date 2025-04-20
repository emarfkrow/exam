package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb9HenkanSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 変換先照会
 *
 * @author emarfkrow
 */
public class Tb9HenkanSakiGetAction extends BaseAction {

    /** 変換先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object henkanSakiId = postJson.get("henkanSakiId");
        if (henkanSakiId == null) {
            henkanSakiId = postJson.get("Tb9HenkanSaki.henkanSakiId");
        }
        if (henkanSakiId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb9HenkanSaki tb9HenkanSaki = Tb9HenkanSaki.get(henkanSakiId);
            map.put("Tb9HenkanSaki", tb9HenkanSaki);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
