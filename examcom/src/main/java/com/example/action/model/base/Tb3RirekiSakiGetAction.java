package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3RirekiSaki;

import jp.co.golorp.emarf.action.BaseAction;

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

        // 主キーが不足していたら終了
        Object rirekiMotoId = postJson.get("rirekiMotoId");
        if (rirekiMotoId == null) {
            rirekiMotoId = postJson.get("Tb3RirekiSaki.rirekiMotoId");
        }
        if (rirekiMotoId == null) {
            return map;
        }
        Object rirekiBn = postJson.get("rirekiBn");
        if (rirekiBn == null) {
            rirekiBn = postJson.get("Tb3RirekiSaki.rirekiBn");
        }
        if (rirekiBn == null) {
            return map;
        }

        Tb3RirekiSaki tb3RirekiSaki = Tb3RirekiSaki.get(rirekiMotoId, rirekiBn);
        map.put("Tb3RirekiSaki", tb3RirekiSaki);
        return map;
    }

}
