package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb8Sansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 参照マスタ照会
 *
 * @author emarfkrow
 */
public class Mb8SanshoGetAction extends BaseAction {

    /** 参照マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object sanshoId = postJson.get("sanshoId");
        if (sanshoId == null) {
            sanshoId = postJson.get("Mb8Sansho.sanshoId");
        }
        if (sanshoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Mb8Sansho mb8Sansho = Mb8Sansho.get(sanshoId);
            map.put("Mb8Sansho", mb8Sansho);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
