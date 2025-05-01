package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiTo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 転生先照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiToGetAction extends BaseAction {

    /** 転生先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tenseiToId = postJson.get("tenseiToId");
        if (tenseiToId == null) {
            tenseiToId = postJson.get("Tb5TenseiTo.tenseiToId");
        }
        if (tenseiToId == null) {

            //転生先になる場合は転生元から情報をコピー
            Object tenseiId = postJson.get("tenseiId");
            if (tenseiId == null) {
                tenseiId = postJson.get("Tb5TenseiTo.tenseiId");
            }
            if (tenseiId == null) {
                return map;
            }

            com.example.entity.Tb5Tensei tb5Tensei = com.example.entity.Tb5Tensei.get(tenseiId);
            Tb5TenseiTo tb5TenseiTo = new Tb5TenseiTo();
            tb5TenseiTo.setTenseiId(tb5Tensei.getTenseiId());
            tb5TenseiTo.setTenseiInfo(tb5Tensei.getTenseiInfo());

            tb5Tensei.referTb5TenseiDets();
            tb5TenseiTo.setTb5TenseiToDets(new java.util.ArrayList<com.example.entity.Tb5TenseiToDet>());
            for (com.example.entity.Tb5TenseiDet tb5TenseiDet : tb5Tensei.referTb5TenseiDets()) {
                com.example.entity.Tb5TenseiToDet tb5TenseiToDet = new com.example.entity.Tb5TenseiToDet();
                tb5TenseiToDet.setId(tb5TenseiDet.getId());
                tb5TenseiToDet.setTenseiDetInfo(tb5TenseiDet.getTenseiDetInfo());
                tb5TenseiTo.getTb5TenseiToDets().add(tb5TenseiToDet);
            }

            map.put("Tb5TenseiTo", tb5TenseiTo);
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb5TenseiTo tb5TenseiTo = Tb5TenseiTo.get(tenseiToId);
            tb5TenseiTo.referTb5TenseiToDets();
            map.put("Tb5TenseiTo", tb5TenseiTo);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
