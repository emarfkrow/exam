package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyTax;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 税マスタ照会
 *
 * @author emarfkrow
 */
public class MsyTaxGetAction extends BaseAction {

    /** 税マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object taxKb = postJson.get("taxKb");
        if (taxKb == null) {
            taxKb = postJson.get("MsyTax.taxKb");
        }
        if (taxKb == null) {
            return map;
        }
        Object kaishiBi = postJson.get("kaishiBi");
        if (kaishiBi == null) {
            kaishiBi = postJson.get("MsyTax.kaishiBi");
        }
        if (kaishiBi == null) {
            return map;
        }

        MsyTax msyTax = MsyTax.get(taxKb, kaishiBi);
        map.put("MsyTax", msyTax);
        return map;
    }

}
