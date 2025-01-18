package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Itoko;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 従妹照会
 *
 * @author emarfkrow
 */
public class Tb1ItokoGetAction extends BaseAction {

    /** 従妹照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object itokoId = postJson.get("itokoId");
        if (itokoId == null) {
            itokoId = postJson.get("Tb1Itoko.itokoId");
        }
        if (itokoId == null) {

            //転生先になる場合は転生元から情報をコピー
            Object sosenId = postJson.get("sosenId");
            if (sosenId == null) {
                sosenId = postJson.get("Tb1Itoko.sosenId");
            }
            if (sosenId == null) {
                return map;
            }
            Object oyaBn = postJson.get("oyaBn");
            if (oyaBn == null) {
                oyaBn = postJson.get("Tb1Itoko.oyaBn");
            }
            if (oyaBn == null) {
                return map;
            }
            Object entityBn = postJson.get("entityBn");
            if (entityBn == null) {
                entityBn = postJson.get("Tb1Itoko.entityBn");
            }
            if (entityBn == null) {
                return map;
            }

            com.example.entity.Tb1Entity1 tb1Entity1 = com.example.entity.Tb1Entity1.get(sosenId, oyaBn, entityBn);
            Tb1Itoko tb1Itoko = new Tb1Itoko();
            tb1Itoko.setSosenId(tb1Entity1.getSosenId());
            tb1Itoko.setOyaBn(tb1Entity1.getOyaBn());
            tb1Itoko.setEntityBn(tb1Entity1.getEntityBn());

            return map;
        }

        Tb1Itoko tb1Itoko = Tb1Itoko.get(itokoId);
        map.put("Tb1Itoko", tb1Itoko);
        return map;
    }

}
