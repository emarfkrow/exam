package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseisakiDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生先明細照会
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiDetGetAction extends BaseAction {

    /** 転生先明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseisakiId = postJson.get("tenseisakiId");
        if (tenseisakiId == null) {
            tenseisakiId = postJson.get("Tb5TenseisakiDet.tenseisakiId");
        }
        if (tenseisakiId == null) {
            return map;
        }
        com.example.entity.Tb5Tenseisaki tb5Tenseisaki = com.example.entity.Tb5Tenseisaki.get(tenseisakiId);
        map.put("Tb5Tenseisaki", tb5Tenseisaki);

        Object tenseisakiBn = postJson.get("tenseisakiBn");
        if (tenseisakiBn == null) {
            tenseisakiBn = postJson.get("Tb5TenseisakiDet.tenseisakiBn");
        }
        if (tenseisakiBn == null) {
            return map;
        }

        Tb5TenseisakiDet tb5TenseisakiDet = Tb5TenseisakiDet.get(tenseisakiId, tenseisakiBn);
        map.put("Tb5TenseisakiDet", tb5TenseisakiDet);
        return map;
    }

}
