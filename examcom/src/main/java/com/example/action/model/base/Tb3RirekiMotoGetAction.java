package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3RirekiMoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 履歴元照会
 *
 * @author emarfkrow
 */
public class Tb3RirekiMotoGetAction extends BaseAction {

    /** 履歴元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object rirekiMotoId = postJson.get("rirekiMotoId");
        if (rirekiMotoId == null) {
            rirekiMotoId = postJson.get("Tb3RirekiMoto.rirekiMotoId");
        }
        if (rirekiMotoId == null) {
            return map;
        }

        Tb3RirekiMoto tb3RirekiMoto = Tb3RirekiMoto.get(rirekiMotoId);
        tb3RirekiMoto.referTb3Rirekis();
        map.put("Tb3RirekiMoto", tb3RirekiMoto);
        return map;
    }

}
