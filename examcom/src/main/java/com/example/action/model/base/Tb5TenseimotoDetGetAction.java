package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseimotoDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生元明細照会
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoDetGetAction extends BaseAction {

    /** 転生元明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseimotoId = postJson.get("tenseimotoId");
        if (tenseimotoId == null) {
            tenseimotoId = postJson.get("Tb5TenseimotoDet.tenseimotoId");
        }
        if (tenseimotoId == null) {
            return map;
        }
        com.example.entity.Tb5Tenseimoto tb5Tenseimoto = com.example.entity.Tb5Tenseimoto.get(tenseimotoId);
        map.put("Tb5Tenseimoto", tb5Tenseimoto);

        Object tenseimotoBn = postJson.get("tenseimotoBn");
        if (tenseimotoBn == null) {
            tenseimotoBn = postJson.get("Tb5TenseimotoDet.tenseimotoBn");
        }
        if (tenseimotoBn == null) {
            return map;
        }

        Tb5TenseimotoDet tb5TenseimotoDet = Tb5TenseimotoDet.get(tenseimotoId, tenseimotoBn);
        map.put("Tb5TenseimotoDet", tb5TenseimotoDet);
        return map;
    }

}
