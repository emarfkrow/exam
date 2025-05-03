package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Idbn;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * IDBN参照マスタ照会
 *
 * @author emarfkrow
 */
public class Mb4IdbnGetAction extends BaseAction {

    /** IDBN参照マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object idrefId = postJson.get("idrefId");
        if (idrefId == null) {
            idrefId = postJson.get("Mb4Idbn.idrefId");
        }
        if (idrefId == null) {
            isAllKey = false;
        }

        Object idbnBn = postJson.get("idbnBn");
        if (idbnBn == null) {
            idbnBn = postJson.get("Mb4Idbn.idbnBn");
        }
        if (idbnBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Mb4Idsansho mb4Idsansho = com.example.entity.Mb4Idsansho.get(idrefId);
        map.put("Mb4Idsansho", mb4Idsansho);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Mb4Idbn mb4Idbn = Mb4Idbn.get(idrefId, idbnBn);
            map.put("Mb4Idbn", mb4Idbn);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
