package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MstKbnVal;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 区分値マスタ照会
 *
 * @author emarfkrow
 */
public class MstKbnValGetAction extends BaseAction {

    /** 区分値マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kbnNm = postJson.get("kbnNm");
        if (kbnNm == null) {
            kbnNm = postJson.get("MstKbnVal.kbnNm");
        }
        if (kbnNm == null) {
            return map;
        }
        Object kbnVal = postJson.get("kbnVal");
        if (kbnVal == null) {
            kbnVal = postJson.get("MstKbnVal.kbnVal");
        }
        if (kbnVal == null) {
            return map;
        }

        MstKbnVal mstKbnVal = MstKbnVal.get(kbnNm, kbnVal);
        map.put("MstKbnVal", mstKbnVal);
        return map;
    }

}
