package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Bros3;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 兄弟３照会
 *
 * @author emarfkrow
 */
public class Tb2Bros3GetAction extends BaseAction {

    /** 兄弟３照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object brosId = postJson.get("brosId");
        if (brosId == null) {
            brosId = postJson.get("Tb2Bros3.brosId");
        }
        if (brosId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb2Bros3 tb2Bros3 = Tb2Bros3.get(brosId);
        tb2Bros3.referTb2Bros();
        tb2Bros3.referTb2Bros2();
        map.put("Tb2Bros3", tb2Bros3);
        return map;
    }

}
