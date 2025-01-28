package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseimoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生元照会
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoGetAction extends BaseAction {

    /** 転生元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseimotoId = postJson.get("tenseimotoId");
        if (tenseimotoId == null) {
            tenseimotoId = postJson.get("Tb5Tenseimoto.tenseimotoId");
        }
        if (tenseimotoId == null) {
            return map;
        }

        Tb5Tenseimoto tb5Tenseimoto = Tb5Tenseimoto.get(tenseimotoId);
        tb5Tenseimoto.referTb5TenseimotoDets();
        map.put("Tb5Tenseimoto", tb5Tenseimoto);
        return map;
    }

}
