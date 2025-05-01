package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiToDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 転生先明細照会
 *
 * @author emarfkrow
 */
public class Tb5TenseiToDetGetAction extends BaseAction {

    /** 転生先明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object tenseiToId = postJson.get("tenseiToId");
        if (tenseiToId == null) {
            tenseiToId = postJson.get("Tb5TenseiToDet.tenseiToId");
        }
        if (tenseiToId == null) {
            isAllKey = false;
        }

        Object tenseiToBn = postJson.get("tenseiToBn");
        if (tenseiToBn == null) {
            tenseiToBn = postJson.get("Tb5TenseiToDet.tenseiToBn");
        }
        if (tenseiToBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb5TenseiTo tb5TenseiTo = com.example.entity.Tb5TenseiTo.get(tenseiToId);
        map.put("Tb5TenseiTo", tb5TenseiTo);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb5TenseiToDet tb5TenseiToDet = Tb5TenseiToDet.get(tenseiToId, tenseiToBn);
            map.put("Tb5TenseiToDet", tb5TenseiToDet);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
