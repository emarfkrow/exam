package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiMoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生元照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiMotoGetAction extends BaseAction {

    /** 転生元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tenseiMotoId = postJson.get("tenseiMotoId");
        if (tenseiMotoId == null) {
            tenseiMotoId = postJson.get("Tb5TenseiMoto.tenseiMotoId");
        }
        if (tenseiMotoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb5TenseiMoto tb5TenseiMoto = Tb5TenseiMoto.get(tenseiMotoId);
        tb5TenseiMoto.referTb5TenseiMotoDets();
        map.put("Tb5TenseiMoto", tb5TenseiMoto);
        return map;
    }

}
