package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuMoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約元照会
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuMotoGetAction extends BaseAction {

    /** 集約元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakuMotoId = postJson.get("shuyakuMotoId");
        if (shuyakuMotoId == null) {
            shuyakuMotoId = postJson.get("Tb6ShuyakuMoto.shuyakuMotoId");
        }
        if (shuyakuMotoId == null) {

            //転生先になる場合は転生元から情報をコピー
            Object shuyakuSakiId = postJson.get("shuyakuSakiId");
            if (shuyakuSakiId == null) {
                shuyakuSakiId = postJson.get("Tb6ShuyakuMoto.shuyakuSakiId");
            }
            if (shuyakuSakiId == null) {
                return map;
            }

            com.example.entity.Tb6ShuyakuSaki tb6ShuyakuSaki = com.example.entity.Tb6ShuyakuSaki.get(shuyakuSakiId);
            Tb6ShuyakuMoto tb6ShuyakuMoto = new Tb6ShuyakuMoto();
            tb6ShuyakuMoto.setShuyakuSakiId(tb6ShuyakuSaki.getShuyakuSakiId());

            map.put("Tb6ShuyakuMoto", tb6ShuyakuMoto);
            return map;
        }

        Tb6ShuyakuMoto tb6ShuyakuMoto = Tb6ShuyakuMoto.get(shuyakuMotoId);
        map.put("Tb6ShuyakuMoto", tb6ShuyakuMoto);
        return map;
    }

}
