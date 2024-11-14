package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MKbnValue;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 区分値マスタ照会
 *
 * @author emarfkrow
 */
public class MKbnValueGetAction extends BaseAction {

    /** 区分値マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kbnNm = postJson.get("kbnNm");
        if (kbnNm == null) {
            kbnNm = postJson.get("MKbnValue.kbnNm");
        }
        if (kbnNm == null) {
            return map;
        }
        Object kbnKb = postJson.get("kbnKb");
        if (kbnKb == null) {
            kbnKb = postJson.get("MKbnValue.kbnKb");
        }
        if (kbnKb == null) {
            return map;
        }

        MKbnValue mKbnValue = MKbnValue.get(kbnNm, kbnKb);
        map.put("MKbnValue", mKbnValue);
        return map;
    }

}
