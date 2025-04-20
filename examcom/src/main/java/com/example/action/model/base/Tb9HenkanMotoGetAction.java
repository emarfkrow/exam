package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb9HenkanMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

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

        // 主キーのチェック
        boolean isAllKey = true;

        Object henkanMotoId = postJson.get("henkanMotoId");
        if (henkanMotoId == null) {
            henkanMotoId = postJson.get("Tb9HenkanMoto.henkanMotoId");
        }
        if (henkanMotoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb9HenkanMoto tb9HenkanMoto = Tb9HenkanMoto.get(henkanMotoId);
            map.put("Tb9HenkanMoto", tb9HenkanMoto);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
