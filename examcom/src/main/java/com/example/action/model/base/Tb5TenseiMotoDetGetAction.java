package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiMotoDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生元明細照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiMotoDetGetAction extends BaseAction {

    /** 転生元明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiMotoId = postJson.get("tenseiMotoId");
        if (tenseiMotoId == null) {
            tenseiMotoId = postJson.get("Tb5TenseiMotoDet.tenseiMotoId");
        }
        if (tenseiMotoId == null) {
            return map;
        }
        // 親モデルの取得
        com.example.entity.Tb5TenseiMoto tb5TenseiMoto = com.example.entity.Tb5TenseiMoto.get(tenseiMotoId);
        map.put("Tb5TenseiMoto", tb5TenseiMoto);
        Object tenseiMotoBn = postJson.get("tenseiMotoBn");
        if (tenseiMotoBn == null) {
            tenseiMotoBn = postJson.get("Tb5TenseiMotoDet.tenseiMotoBn");
        }
        if (tenseiMotoBn == null) {
            return map;
        }

        Tb5TenseiMotoDet tb5TenseiMotoDet = Tb5TenseiMotoDet.get(tenseiMotoId, tenseiMotoBn);
        map.put("Tb5TenseiMotoDet", tb5TenseiMotoDet);
        return map;
    }

}
