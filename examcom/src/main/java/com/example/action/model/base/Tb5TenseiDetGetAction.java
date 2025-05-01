package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 転生明細照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiDetGetAction extends BaseAction {

    /** 転生明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tenseiId = postJson.get("tenseiId");
        if (tenseiId == null) {
            tenseiId = postJson.get("Tb5TenseiDet.tenseiId");
        }
        if (tenseiId == null) {
            isAllKey = false;
        }

        Object tenseiBn = postJson.get("tenseiBn");
        if (tenseiBn == null) {
            tenseiBn = postJson.get("Tb5TenseiDet.tenseiBn");
        }
        if (tenseiBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb5Tensei tb5Tensei = com.example.entity.Tb5Tensei.get(tenseiId);
        map.put("Tb5Tensei", tb5Tensei);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb5TenseiDet tb5TenseiDet = Tb5TenseiDet.get(tenseiId, tenseiBn);
            map.put("Tb5TenseiDet", tb5TenseiDet);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
