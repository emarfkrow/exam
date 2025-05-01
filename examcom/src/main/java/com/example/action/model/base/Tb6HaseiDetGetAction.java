package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 派生明細照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiDetGetAction extends BaseAction {

    /** 派生明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiId = postJson.get("haseiId");
        if (haseiId == null) {
            haseiId = postJson.get("Tb6HaseiDet.haseiId");
        }
        if (haseiId == null) {
            isAllKey = false;
        }

        Object haseiBn = postJson.get("haseiBn");
        if (haseiBn == null) {
            haseiBn = postJson.get("Tb6HaseiDet.haseiBn");
        }
        if (haseiBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb6Hasei tb6Hasei = com.example.entity.Tb6Hasei.get(haseiId);
        map.put("Tb6Hasei", tb6Hasei);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6HaseiDet tb6HaseiDet = Tb6HaseiDet.get(haseiId, haseiBn);
            map.put("Tb6HaseiDet", tb6HaseiDet);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
