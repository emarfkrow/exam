package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8Fukugo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 複合照会
 *
 * @author emarfkrow
 */
public class Tb8FukugoGetAction extends BaseAction {

    /** 複合照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object sanshoId = postJson.get("sanshoId");
        if (sanshoId == null) {
            sanshoId = postJson.get("Tb8Fukugo.sanshoId");
        }
        if (sanshoId == null) {
            isAllKey = false;
        }

        Object seiyakuId = postJson.get("seiyakuId");
        if (seiyakuId == null) {
            seiyakuId = postJson.get("Tb8Fukugo.seiyakuId");
        }
        if (seiyakuId == null) {
            isAllKey = false;
        }

        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("Tb8Fukugo.tekiyoBi");
        }
        if (tekiyoBi == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb8Fukugo tb8Fukugo = Tb8Fukugo.get(sanshoId, seiyakuId, tekiyoBi);
            map.put("Tb8Fukugo", tb8Fukugo);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
