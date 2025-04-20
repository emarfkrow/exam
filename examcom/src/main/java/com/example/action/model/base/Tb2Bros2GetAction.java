package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Bros2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 兄弟２照会
 *
 * @author emarfkrow
 */
public class Tb2Bros2GetAction extends BaseAction {

    /** 兄弟２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object brosId = postJson.get("brosId");
        if (brosId == null) {
            brosId = postJson.get("Tb2Bros2.brosId");
        }
        if (brosId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb2Bros2 tb2Bros2 = Tb2Bros2.get(brosId);
            tb2Bros2.referTb2Bros();
            tb2Bros2.referTb2Bros3();
            map.put("Tb2Bros2", tb2Bros2);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
