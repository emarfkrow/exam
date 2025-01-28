package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4Sanshomoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照元照会
 *
 * @author emarfkrow
 */
public class Tb4SanshomotoGetAction extends BaseAction {

    /** 参照元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sanshomotoId = postJson.get("sanshomotoId");
        if (sanshomotoId == null) {
            sanshomotoId = postJson.get("Tb4Sanshomoto.sanshomotoId");
        }
        if (sanshomotoId == null) {
            return map;
        }

        Tb4Sanshomoto tb4Sanshomoto = Tb4Sanshomoto.get(sanshomotoId);
        map.put("Tb4Sanshomoto", tb4Sanshomoto);
        return map;
    }

}
