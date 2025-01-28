package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Shuyakusaki;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約先照会
 *
 * @author emarfkrow
 */
public class Tb6ShuyakusakiGetAction extends BaseAction {

    /** 集約先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakusakiId = postJson.get("shuyakusakiId");
        if (shuyakusakiId == null) {
            shuyakusakiId = postJson.get("Tb6Shuyakusaki.shuyakusakiId");
        }
        if (shuyakusakiId == null) {
            return map;
        }

        Tb6Shuyakusaki tb6Shuyakusaki = Tb6Shuyakusaki.get(shuyakusakiId);
        map.put("Tb6Shuyakusaki", tb6Shuyakusaki);
        return map;
    }

}
