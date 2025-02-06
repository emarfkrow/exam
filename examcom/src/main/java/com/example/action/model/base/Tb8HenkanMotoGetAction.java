package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8HenkanMoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 変換元照会
 *
 * @author emarfkrow
 */
public class Tb8HenkanMotoGetAction extends BaseAction {

    /** 変換元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object henkanMotoId = postJson.get("henkanMotoId");
        if (henkanMotoId == null) {
            henkanMotoId = postJson.get("Tb8HenkanMoto.henkanMotoId");
        }
        if (henkanMotoId == null) {
            return map;
        }

        Tb8HenkanMoto tb8HenkanMoto = Tb8HenkanMoto.get(henkanMotoId);
        map.put("Tb8HenkanMoto", tb8HenkanMoto);
        return map;
    }

}
