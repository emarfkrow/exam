package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiSakiDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生先明細照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiSakiDetGetAction extends BaseAction {

    /** 転生先明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tenseiSakiId = postJson.get("tenseiSakiId");
        if (tenseiSakiId == null) {
            tenseiSakiId = postJson.get("Tb5TenseiSakiDet.tenseiSakiId");
        }
        if (tenseiSakiId == null) {
            isAllKey = false;
        }

        Object tenseiSakiBn = postJson.get("tenseiSakiBn");
        if (tenseiSakiBn == null) {
            tenseiSakiBn = postJson.get("Tb5TenseiSakiDet.tenseiSakiBn");
        }
        if (tenseiSakiBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb5TenseiSaki tb5TenseiSaki = com.example.entity.Tb5TenseiSaki.get(tenseiSakiId);
        map.put("Tb5TenseiSaki", tb5TenseiSaki);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb5TenseiSakiDet tb5TenseiSakiDet = Tb5TenseiSakiDet.get(tenseiSakiId, tenseiSakiBn);
        map.put("Tb5TenseiSakiDet", tb5TenseiSakiDet);
        return map;
    }

}
