package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Cdsansho;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * CD参照マスタ照会
 *
 * @author emarfkrow
 */
public class Mb4CdsanshoGetAction extends BaseAction {

    /** CD参照マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object cdsanshoCd = postJson.get("cdsanshoCd");
        if (cdsanshoCd == null) {
            cdsanshoCd = postJson.get("Mb4Cdsansho.cdsanshoCd");
        }
        if (cdsanshoCd == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Mb4Cdsansho mb4Cdsansho = Mb4Cdsansho.get(cdsanshoCd);
        map.put("Mb4Cdsansho", mb4Cdsansho);
        return map;
    }

}
