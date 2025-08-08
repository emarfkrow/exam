package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8Reborn2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 転生２照会
 *
 * @author emarfkrow
 */
public class Tb8Reborn2GetAction extends BaseAction {

    /** 転生２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object reborn2Id = postJson.get("reborn2Id");
        if (reborn2Id == null) {
            reborn2Id = postJson.get("Tb8Reborn2.reborn2Id");
        }
        if (reborn2Id == null) {

            // 転生先になる場合は転生元から情報をコピー
            Object unit4Id = postJson.get("unit4Id");
            if (unit4Id == null) {
                unit4Id = postJson.get("Tb8Reborn2.unit4Id");
            }
            if (unit4Id == null) {
                return map;
            }

            com.example.entity.Tb8Unit4 tb8Unit4 = com.example.entity.Tb8Unit4.get(unit4Id);
            Tb8Reborn2 tb8Reborn2 = new Tb8Reborn2();
            tb8Reborn2.setUnit4Id(tb8Unit4.getUnit4Id());

            map.put("Tb8Reborn2", tb8Reborn2);
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb8Reborn2 tb8Reborn2 = Tb8Reborn2.get(reborn2Id);
            map.put("Tb8Reborn2", tb8Reborn2);
        } catch (NoDataError e) {
            if (postJson.get("IsSilent") == null || !postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
