package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7ShuyakuMoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約元照会
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuMotoGetAction extends BaseAction {

    /** 集約元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object shuyakuMotoId = postJson.get("shuyakuMotoId");
        if (shuyakuMotoId == null) {
            shuyakuMotoId = postJson.get("Tb7ShuyakuMoto.shuyakuMotoId");
        }
        if (shuyakuMotoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb7ShuyakuMoto tb7ShuyakuMoto = Tb7ShuyakuMoto.get(shuyakuMotoId);
        map.put("Tb7ShuyakuMoto", tb7ShuyakuMoto);
        return map;
    }

}
