package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1TenseiDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生明細照会
 *
 * @author emarfkrow
 */
public class Tb1TenseiDetGetAction extends BaseAction {

    /** 転生明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiId = postJson.get("tenseiId");
        if (tenseiId == null) {
            tenseiId = postJson.get("Tb1TenseiDet.tenseiId");
        }
        if (tenseiId == null) {
            return map;
        }
        com.example.entity.Tb1Tensei tb1Tensei = com.example.entity.Tb1Tensei.get(tenseiId);
        map.put("Tb1Tensei", tb1Tensei);

        Object tenseiBn = postJson.get("tenseiBn");
        if (tenseiBn == null) {
            tenseiBn = postJson.get("Tb1TenseiDet.tenseiBn");
        }
        if (tenseiBn == null) {
            return map;
        }

        Tb1TenseiDet tb1TenseiDet = Tb1TenseiDet.get(tenseiId, tenseiBn);
        map.put("Tb1TenseiDet", tb1TenseiDet);
        return map;
    }

}
