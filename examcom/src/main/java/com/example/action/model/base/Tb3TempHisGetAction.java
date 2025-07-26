package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3TempHis;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 履歴照会
 *
 * @author emarfkrow
 */
public class Tb3TempHisGetAction extends BaseAction {

    /** 履歴照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tempId = postJson.get("tempId");
        if (tempId == null) {
            tempId = postJson.get("Tb3TempHis.tempId");
        }
        if (tempId == null) {
            isAllKey = false;
        }

        Object rirekiBn = postJson.get("rirekiBn");
        if (rirekiBn == null) {
            rirekiBn = postJson.get("Tb3TempHis.rirekiBn");
        }
        if (rirekiBn == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb3TempHis tb3TempHis = Tb3TempHis.get(tempId, rirekiBn);
            map.put("Tb3TempHis", tb3TempHis);
        } catch (NoDataError e) {
            if (postJson.get("IsSilent") == null || !postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
