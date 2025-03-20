package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiMotoDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 派生元明細照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiMotoDetGetAction extends BaseAction {

    /** 派生元明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiMotoId = postJson.get("haseiMotoId");
        if (haseiMotoId == null) {
            haseiMotoId = postJson.get("Tb6HaseiMotoDet.haseiMotoId");
        }
        if (haseiMotoId == null) {
            isAllKey = false;
        }

        Object haseiMotoBn = postJson.get("haseiMotoBn");
        if (haseiMotoBn == null) {
            haseiMotoBn = postJson.get("Tb6HaseiMotoDet.haseiMotoBn");
        }
        if (haseiMotoBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb6HaseiMoto tb6HaseiMoto = com.example.entity.Tb6HaseiMoto.get(haseiMotoId);
        map.put("Tb6HaseiMoto", tb6HaseiMoto);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb6HaseiMotoDet tb6HaseiMotoDet = Tb6HaseiMotoDet.get(haseiMotoId, haseiMotoBn);
        map.put("Tb6HaseiMotoDet", tb6HaseiMotoDet);
        return map;
    }

}
