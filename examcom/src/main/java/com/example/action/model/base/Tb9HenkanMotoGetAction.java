package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb9HenkanMoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 変換元照会
 *
 * @author emarfkrow
 */
public class Tb9HenkanMotoGetAction extends BaseAction {

    /** 変換元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object henkanMotoId = postJson.get("henkanMotoId");
        if (henkanMotoId == null) {
            henkanMotoId = postJson.get("Tb9HenkanMoto.henkanMotoId");
        }
        if (henkanMotoId == null) {
            return map;
        }

        Tb9HenkanMoto tb9HenkanMoto = Tb9HenkanMoto.get(henkanMotoId);
        map.put("Tb9HenkanMoto", tb9HenkanMoto);
        return map;
    }

}
