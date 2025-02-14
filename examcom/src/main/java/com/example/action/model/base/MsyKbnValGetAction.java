package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyKbnVal;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 区分値マスタ照会
 *
 * @author emarfkrow
 */
public class MsyKbnValGetAction extends BaseAction {

    /** 区分値マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kbnNm = postJson.get("kbnNm");
        if (kbnNm == null) {
            kbnNm = postJson.get("MsyKbnVal.kbnNm");
        }
        if (kbnNm == null) {
            return map;
        }
        // 親モデルの取得
        com.example.entity.MsyKbn msyKbn = com.example.entity.MsyKbn.get(kbnNm);
        map.put("MsyKbn", msyKbn);
        Object kbnVal = postJson.get("kbnVal");
        if (kbnVal == null) {
            kbnVal = postJson.get("MsyKbnVal.kbnVal");
        }
        if (kbnVal == null) {
            return map;
        }

        MsyKbnVal msyKbnVal = MsyKbnVal.get(kbnNm, kbnVal);
        map.put("MsyKbnVal", msyKbnVal);
        return map;
    }

}
