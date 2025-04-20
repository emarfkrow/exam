package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 転生先照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiSakiGetAction extends BaseAction {

    /** 転生先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tenseiSakiId = postJson.get("tenseiSakiId");
        if (tenseiSakiId == null) {
            tenseiSakiId = postJson.get("Tb5TenseiSaki.tenseiSakiId");
        }
        if (tenseiSakiId == null) {

            //転生先になる場合は転生元から情報をコピー
            Object tenseiMotoId = postJson.get("tenseiMotoId");
            if (tenseiMotoId == null) {
                tenseiMotoId = postJson.get("Tb5TenseiSaki.tenseiMotoId");
            }
            if (tenseiMotoId == null) {
                return map;
            }

            com.example.entity.Tb5TenseiMoto tb5TenseiMoto = com.example.entity.Tb5TenseiMoto.get(tenseiMotoId);
            Tb5TenseiSaki tb5TenseiSaki = new Tb5TenseiSaki();
            tb5TenseiSaki.setTenseiMotoId(tb5TenseiMoto.getTenseiMotoId());

            tb5TenseiMoto.referTb5TenseiMotoDets();
            tb5TenseiSaki.setTb5TenseiSakiDets(new java.util.ArrayList<com.example.entity.Tb5TenseiSakiDet>());
            for (com.example.entity.Tb5TenseiMotoDet tb5TenseiMotoDet : tb5TenseiMoto.referTb5TenseiMotoDets()) {
                com.example.entity.Tb5TenseiSakiDet tb5TenseiSakiDet = new com.example.entity.Tb5TenseiSakiDet();
                tb5TenseiSakiDet.setId(tb5TenseiMotoDet.getId());
                tb5TenseiSaki.getTb5TenseiSakiDets().add(tb5TenseiSakiDet);
            }

            map.put("Tb5TenseiSaki", tb5TenseiSaki);
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb5TenseiSaki tb5TenseiSaki = Tb5TenseiSaki.get(tenseiSakiId);
            tb5TenseiSaki.referTb5TenseiSakiDets();
            map.put("Tb5TenseiSaki", tb5TenseiSaki);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
