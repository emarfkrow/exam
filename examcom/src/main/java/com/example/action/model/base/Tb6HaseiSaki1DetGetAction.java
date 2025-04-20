package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki1Det;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 派生先１明細照会
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki1DetGetAction extends BaseAction {

    /** 派生先１明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object haseiSaki1Id = postJson.get("haseiSaki1Id");
        if (haseiSaki1Id == null) {
            haseiSaki1Id = postJson.get("Tb6HaseiSaki1Det.haseiSaki1Id");
        }
        if (haseiSaki1Id == null) {
            isAllKey = false;
        }

        Object haseiSaki1Bn = postJson.get("haseiSaki1Bn");
        if (haseiSaki1Bn == null) {
            haseiSaki1Bn = postJson.get("Tb6HaseiSaki1Det.haseiSaki1Bn");
        }
        if (haseiSaki1Bn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb6HaseiSaki1 tb6HaseiSaki1 = com.example.entity.Tb6HaseiSaki1.get(haseiSaki1Id);
        map.put("Tb6HaseiSaki1", tb6HaseiSaki1);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6HaseiSaki1Det tb6HaseiSaki1Det = Tb6HaseiSaki1Det.get(haseiSaki1Id, haseiSaki1Bn);
            map.put("Tb6HaseiSaki1Det", tb6HaseiSaki1Det);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
