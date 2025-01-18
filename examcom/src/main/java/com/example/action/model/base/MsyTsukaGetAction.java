package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyTsuka;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 通貨マスタ照会
 *
 * @author emarfkrow
 */
public class MsyTsukaGetAction extends BaseAction {

    /** 通貨マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tsukaKb = postJson.get("tsukaKb");
        if (tsukaKb == null) {
            tsukaKb = postJson.get("MsyTsuka.tsukaKb");
        }
        if (tsukaKb == null) {
            return map;
        }
        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("MsyTsuka.tekiyoBi");
        }
        if (tekiyoBi == null) {
            return map;
        }

        MsyTsuka msyTsuka = MsyTsuka.get(tsukaKb, tekiyoBi);
        map.put("MsyTsuka", msyTsuka);
        return map;
    }

}
