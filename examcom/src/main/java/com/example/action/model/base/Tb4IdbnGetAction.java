package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4Idbn;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * ID-BNマスタ照会
 *
 * @author emarfkrow
 */
public class Tb4IdbnGetAction extends BaseAction {

    /** ID-BNマスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object idrefId = postJson.get("idrefId");
        if (idrefId == null) {
            idrefId = postJson.get("Tb4Idbn.idrefId");
        }
        if (idrefId == null) {
            isAllKey = false;
        }

        Object idbnBn = postJson.get("idbnBn");
        if (idbnBn == null) {
            idbnBn = postJson.get("Tb4Idbn.idbnBn");
        }
        if (idbnBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb4Id tb4Id = com.example.entity.Tb4Id.get(idrefId);
        map.put("Tb4Id", tb4Id);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb4Idbn tb4Idbn = Tb4Idbn.get(idrefId, idbnBn);
            map.put("Tb4Idbn", tb4Idbn);
        } catch (NoDataError e) {
            if (postJson.get("IsSilent") == null || !postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
