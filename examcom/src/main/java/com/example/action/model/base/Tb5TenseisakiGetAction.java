package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseisaki;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生先照会
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiGetAction extends BaseAction {

    /** 転生先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseisakiId = postJson.get("tenseisakiId");
        if (tenseisakiId == null) {
            tenseisakiId = postJson.get("Tb5Tenseisaki.tenseisakiId");
        }
        if (tenseisakiId == null) {

            //転生先になる場合は転生元から情報をコピー
            Object tenseimotoId = postJson.get("tenseimotoId");
            if (tenseimotoId == null) {
                tenseimotoId = postJson.get("Tb5Tenseisaki.tenseimotoId");
            }
            if (tenseimotoId == null) {
                return map;
            }

            com.example.entity.Tb5Tenseimoto tb5Tenseimoto = com.example.entity.Tb5Tenseimoto.get(tenseimotoId);
            Tb5Tenseisaki tb5Tenseisaki = new Tb5Tenseisaki();
            tb5Tenseisaki.setTenseimotoId(tb5Tenseimoto.getTenseimotoId());

            tb5Tenseimoto.referTb5TenseimotoDets();
            tb5Tenseisaki.setTb5TenseisakiDets(new java.util.ArrayList<com.example.entity.Tb5TenseisakiDet>());
            for (com.example.entity.Tb5TenseimotoDet tb5TenseimotoDet : tb5Tenseimoto.referTb5TenseimotoDets()) {
                com.example.entity.Tb5TenseisakiDet tb5TenseisakiDet = new com.example.entity.Tb5TenseisakiDet();
                tb5TenseisakiDet.setId(tb5TenseimotoDet.getId());
                tb5Tenseisaki.getTb5TenseisakiDets().add(tb5TenseisakiDet);
            }

            map.put("Tb5Tenseisaki", tb5Tenseisaki);
            return map;
        }

        Tb5Tenseisaki tb5Tenseisaki = Tb5Tenseisaki.get(tenseisakiId);
        tb5Tenseisaki.referTb5TenseisakiDets();
        map.put("Tb5Tenseisaki", tb5Tenseisaki);
        return map;
    }

}
