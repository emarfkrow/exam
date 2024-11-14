package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MKino;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 機能マスタ照会
 *
 * @author emarfkrow
 */
public class MKinoGetAction extends BaseAction {

    /** 機能マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kinoNm = postJson.get("kinoNm");
        if (kinoNm == null) {
            kinoNm = postJson.get("MKino.kinoNm");
        }
        if (kinoNm == null) {
            return map;
        }

        MKino mKino = MKino.get(kinoNm);
        map.put("MKino", mKino);
        return map;
    }

}
