package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3Rireki;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 履歴元照会
 *
 * @author emarfkrow
 */
public class Tb3RirekiGetAction extends BaseAction {

    /** 履歴元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object rirekiMotoId = postJson.get("rirekiMotoId");
        if (rirekiMotoId == null) {
            rirekiMotoId = postJson.get("Tb3Rireki.rirekiMotoId");
        }
        if (rirekiMotoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb3Rireki tb3Rireki = Tb3Rireki.get(rirekiMotoId);
        map.put("Tb3Rireki", tb3Rireki);
        return map;
    }

}
