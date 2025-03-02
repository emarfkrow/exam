package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyKadobi;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 稼働日マスタ照会
 *
 * @author emarfkrow
 */
public class MsyKadobiGetAction extends BaseAction {

    /** 稼働日マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kadoBi = postJson.get("kadoBi");
        if (kadoBi == null) {
            kadoBi = postJson.get("MsyKadobi.kadoBi");
        }
        if (kadoBi == null) {
            return map;
        }
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MsyKadobi.bushoId");
        }
        if (bushoId == null) {
            return map;
        }

        MsyKadobi msyKadobi = MsyKadobi.get(kadoBi, bushoId);
        map.put("MsyKadobi", msyKadobi);
        return map;
    }

}
