package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki2Det;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

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

        Object haseiTo2Id = postJson.get("haseiTo2Id");
        if (haseiTo2Id == null) {
            haseiTo2Id = postJson.get("Tb6HaseiSaki2Det.haseiTo2Id");
        }
        if (haseiTo2Id == null) {
            isAllKey = false;
        }

        Object haseiTo2Bn = postJson.get("haseiTo2Bn");
        if (haseiTo2Bn == null) {
            haseiTo2Bn = postJson.get("Tb6HaseiSaki2Det.haseiTo2Bn");
        }
        if (haseiTo2Bn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb6HaseiTo2 tb6HaseiTo2 = com.example.entity.Tb6HaseiTo2.get(haseiTo2Id);
        map.put("Tb6HaseiTo2", tb6HaseiTo2);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb6HaseiSaki2Det tb6HaseiSaki2Det = Tb6HaseiSaki2Det.get(haseiTo2Id, haseiTo2Bn);
            map.put("Tb6HaseiSaki2Det", tb6HaseiSaki2Det);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
