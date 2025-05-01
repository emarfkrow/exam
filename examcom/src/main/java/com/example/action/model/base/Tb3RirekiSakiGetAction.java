package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3RirekiSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 履歴先照会
 *
 * @author emarfkrow
 */
public class Tb3RirekiSakiGetAction extends BaseAction {

    /** 履歴先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object rirekiId = postJson.get("rirekiId");
        if (rirekiId == null) {
            rirekiId = postJson.get("Tb3RirekiSaki.rirekiId");
        }
        if (rirekiId == null) {
            isAllKey = false;
        }

        Object rirekiBn = postJson.get("rirekiBn");
        if (rirekiBn == null) {
            rirekiBn = postJson.get("Tb3RirekiSaki.rirekiBn");
        }
        if (rirekiBn == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb3RirekiSaki tb3RirekiSaki = Tb3RirekiSaki.get(rirekiId, rirekiBn);
            map.put("Tb3RirekiSaki", tb3RirekiSaki);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
