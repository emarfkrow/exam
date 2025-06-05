package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4No;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * NOマスタ照会
 *
 * @author emarfkrow
 */
public class Tb4NoGetAction extends BaseAction {

    /** NOマスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object norefNo = postJson.get("norefNo");
        if (norefNo == null) {
            norefNo = postJson.get("Tb4No.norefNo");
        }
        if (norefNo == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb4No tb4No = Tb4No.get(norefNo);
            map.put("Tb4No", tb4No);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
