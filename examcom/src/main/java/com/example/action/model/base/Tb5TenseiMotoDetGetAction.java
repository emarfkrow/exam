package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiMotoDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

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

        // 主キーのチェック
        boolean isAllKey = true;

        Object tenseiMotoId = postJson.get("tenseiMotoId");
        if (tenseiMotoId == null) {
            tenseiMotoId = postJson.get("Tb5TenseiMotoDet.tenseiMotoId");
        }
        if (tenseiMotoId == null) {
            isAllKey = false;
        }

        Object tenseiMotoBn = postJson.get("tenseiMotoBn");
        if (tenseiMotoBn == null) {
            tenseiMotoBn = postJson.get("Tb5TenseiMotoDet.tenseiMotoBn");
        }
        if (tenseiMotoBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb5TenseiMoto tb5TenseiMoto = com.example.entity.Tb5TenseiMoto.get(tenseiMotoId);
        map.put("Tb5TenseiMoto", tb5TenseiMoto);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb5TenseiMotoDet tb5TenseiMotoDet = Tb5TenseiMotoDet.get(tenseiMotoId, tenseiMotoBn);
            map.put("Tb5TenseiMotoDet", tb5TenseiMotoDet);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
