package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7Fukugo;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 複合照会
 *
 * @author emarfkrow
 */
public class Tb7FukugoGetAction extends BaseAction {

    /** 複合照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sanshoId = postJson.get("sanshoId");
        if (sanshoId == null) {
            sanshoId = postJson.get("Tb7Fukugo.sanshoId");
        }
        if (sanshoId == null) {
            return map;
        }
        Object seiyakuId = postJson.get("seiyakuId");
        if (seiyakuId == null) {
            seiyakuId = postJson.get("Tb7Fukugo.seiyakuId");
        }
        if (seiyakuId == null) {
            return map;
        }
        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("Tb7Fukugo.tekiyoBi");
        }
        if (tekiyoBi == null) {
            return map;
        }

        Tb7Fukugo tb7Fukugo = Tb7Fukugo.get(sanshoId, seiyakuId, tekiyoBi);
        map.put("Tb7Fukugo", tb7Fukugo);
        return map;
    }

}
