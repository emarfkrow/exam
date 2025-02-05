package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Shuyakumoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約元照会
 *
 * @author emarfkrow
 */
public class Tb6ShuyakumotoGetAction extends BaseAction {

    /** 集約元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakumotoId = postJson.get("shuyakumotoId");
        if (shuyakumotoId == null) {
            shuyakumotoId = postJson.get("Tb6Shuyakumoto.shuyakumotoId");
        }
        if (shuyakumotoId == null) {

            //転生先になる場合は転生元から情報をコピー
            Object shuyakusakiId = postJson.get("shuyakusakiId");
            if (shuyakusakiId == null) {
                shuyakusakiId = postJson.get("Tb6Shuyakumoto.shuyakusakiId");
            }
            if (shuyakusakiId == null) {
                return map;
            }

            com.example.entity.Tb6Shuyakusaki tb6Shuyakusaki = com.example.entity.Tb6Shuyakusaki.get(shuyakusakiId);
            Tb6Shuyakumoto tb6Shuyakumoto = new Tb6Shuyakumoto();
            tb6Shuyakumoto.setShuyakusakiId(tb6Shuyakusaki.getShuyakusakiId());

            map.put("Tb6Shuyakumoto", tb6Shuyakumoto);
            return map;
        }

        Tb6Shuyakumoto tb6Shuyakumoto = Tb6Shuyakumoto.get(shuyakumotoId);
        map.put("Tb6Shuyakumoto", tb6Shuyakumoto);
        return map;
    }

}
