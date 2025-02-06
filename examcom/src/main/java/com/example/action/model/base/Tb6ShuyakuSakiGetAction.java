package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuSaki;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 集約先照会
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuSakiGetAction extends BaseAction {

    /** 集約先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shuyakuSakiId = postJson.get("shuyakuSakiId");
        if (shuyakuSakiId == null) {
            shuyakuSakiId = postJson.get("Tb6ShuyakuSaki.shuyakuSakiId");
        }
        if (shuyakuSakiId == null) {
            return map;
        }

        Tb6ShuyakuSaki tb6ShuyakuSaki = Tb6ShuyakuSaki.get(shuyakuSakiId);
        map.put("Tb6ShuyakuSaki", tb6ShuyakuSaki);
        return map;
    }

}
