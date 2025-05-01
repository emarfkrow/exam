package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Cdsansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

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

        Object cdrefCd = postJson.get("cdrefCd");
        if (cdrefCd == null) {
            cdrefCd = postJson.get("Mb4Cdsansho.cdrefCd");
        }
        if (cdrefCd == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Mb4Cdsansho mb4Cdsansho = Mb4Cdsansho.get(cdrefCd);
            map.put("Mb4Cdsansho", mb4Cdsansho);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
