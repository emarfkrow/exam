package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TShison;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 子孫照会
 *
 * @author emarfkrow
 */
public class TShisonGetAction extends BaseAction {

    /** 子孫照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TShison.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TShison.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TShison.entityBn");
        }
        if (entityBn == null) {
            return map;
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("TShison.koBn");
        }
        if (koBn == null) {
            return map;
        }
        Object shisonBn = postJson.get("shisonBn");
        if (shisonBn == null) {
            shisonBn = postJson.get("TShison.shisonBn");
        }
        if (shisonBn == null) {
            return map;
        }

        TShison tShison = TShison.get(sosenId, oyaBn, entityBn, koBn, shisonBn);
        map.put("TShison", tShison);
        return map;
    }

}
