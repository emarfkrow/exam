package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki2Det;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 派生先２明細照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki2DetGetAction extends BaseAction {

    /** 派生先２明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiSaki2Id = postJson.get("haseiSaki2Id");
        if (haseiSaki2Id == null) {
            haseiSaki2Id = postJson.get("Tb6HaseiSaki2Det.haseiSaki2Id");
        }
        if (haseiSaki2Id == null) {
            isAllKey = false;
        }

        Object haseiSaki2Bn = postJson.get("haseiSaki2Bn");
        if (haseiSaki2Bn == null) {
            haseiSaki2Bn = postJson.get("Tb6HaseiSaki2Det.haseiSaki2Bn");
        }
        if (haseiSaki2Bn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb6HaseiSaki2 tb6HaseiSaki2 = com.example.entity.Tb6HaseiSaki2.get(haseiSaki2Id);
        map.put("Tb6HaseiSaki2", tb6HaseiSaki2);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb6HaseiSaki2Det tb6HaseiSaki2Det = Tb6HaseiSaki2Det.get(haseiSaki2Id, haseiSaki2Bn);
        map.put("Tb6HaseiSaki2Det", tb6HaseiSaki2Det);
        return map;
    }

}
