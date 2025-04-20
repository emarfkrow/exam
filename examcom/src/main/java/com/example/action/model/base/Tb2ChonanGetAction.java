package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Chonan;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 長男照会
 *
 * @author emarfkrow
 */
public class Tb2ChonanGetAction extends BaseAction {

    /** 長男照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object chonanId = postJson.get("chonanId");
        if (chonanId == null) {
            chonanId = postJson.get("Tb2Chonan.chonanId");
        }
        if (chonanId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb2Chonan tb2Chonan = Tb2Chonan.get(chonanId);
            tb2Chonan.referTb2Chonan2();
            tb2Chonan.referTb2Chonan3();
            map.put("Tb2Chonan", tb2Chonan);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
