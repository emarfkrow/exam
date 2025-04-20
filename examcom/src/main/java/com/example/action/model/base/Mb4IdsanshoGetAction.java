package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Idsansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * ID参照マスタ照会
 *
 * @author emarfkrow
 */
public class Mb4IdsanshoGetAction extends BaseAction {

    /** ID参照マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object idsanshoId = postJson.get("idsanshoId");
        if (idsanshoId == null) {
            idsanshoId = postJson.get("Mb4Idsansho.idsanshoId");
        }
        if (idsanshoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Mb4Idsansho mb4Idsansho = Mb4Idsansho.get(idsanshoId);
            map.put("Mb4Idsansho", mb4Idsansho);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
