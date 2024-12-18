package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MhrShozoku;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 所属マスタ照会
 *
 * @author emarfkrow
 */
public class MhrShozokuGetAction extends BaseAction {

    /** 所属マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MhrShozoku.bushoId");
        }
        if (bushoId == null) {
            return map;
        }
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MhrShozoku.shokuiId");
        }
        if (shokuiId == null) {
            return map;
        }
        Object userId = postJson.get("userId");
        if (userId == null) {
            userId = postJson.get("MhrShozoku.userId");
        }
        if (userId == null) {
            return map;
        }
        Object kaishiBi = postJson.get("kaishiBi");
        if (kaishiBi == null) {
            kaishiBi = postJson.get("MhrShozoku.kaishiBi");
        }
        if (kaishiBi == null) {
            return map;
        }

        MhrShozoku mhrShozoku = MhrShozoku.get(bushoId, shokuiId, userId, kaishiBi);
        map.put("MhrShozoku", mhrShozoku);
        return map;
    }

}
