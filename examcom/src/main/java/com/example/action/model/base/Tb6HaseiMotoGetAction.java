package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

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

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiMotoId = postJson.get("haseiMotoId");
        if (haseiMotoId == null) {
            haseiMotoId = postJson.get("Tb6HaseiMoto.haseiMotoId");
        }
        if (haseiMotoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6HaseiMoto tb6HaseiMoto = Tb6HaseiMoto.get(haseiMotoId);
            tb6HaseiMoto.referTb6HaseiMotoDets();
            map.put("Tb6HaseiMoto", tb6HaseiMoto);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
