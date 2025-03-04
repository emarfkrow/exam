package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiMoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 派生元照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiMotoGetAction extends BaseAction {

    /** 派生元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object haseiMotoId = postJson.get("haseiMotoId");
        if (haseiMotoId == null) {
            haseiMotoId = postJson.get("Tb6HaseiMoto.haseiMotoId");
        }
        if (haseiMotoId == null) {
            return map;
        }

        Tb6HaseiMoto tb6HaseiMoto = Tb6HaseiMoto.get(haseiMotoId);
        tb6HaseiMoto.referTb6HaseiMotoDets();
        map.put("Tb6HaseiMoto", tb6HaseiMoto);
        return map;
    }

}
