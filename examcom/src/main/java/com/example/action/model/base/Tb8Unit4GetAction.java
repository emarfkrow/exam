package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8Unit4;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 単位４照会
 *
 * @author emarfkrow
 */
public class Tb8Unit4GetAction extends BaseAction {

    /** 単位４照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object unit4Id = postJson.get("unit4Id");
        if (unit4Id == null) {
            unit4Id = postJson.get("Tb8Unit4.unit4Id");
        }
        if (unit4Id == null) {

            // 派生先になる場合は派生元から情報をコピー
            Object sum3Id0 = postJson.get("sum3Id");
            if (sum3Id0 == null) {
                sum3Id0 = postJson.get("Tb8Unit4.sum3Id");
            }
            if (sum3Id0 == null) {
                return map;
            }

            com.example.entity.Tb8Sum3 tb8Sum3 = com.example.entity.Tb8Sum3.get(sum3Id0);
            Tb8Unit4 tb8Unit4 = new Tb8Unit4();
            tb8Unit4.setSum3Id(tb8Sum3.getSum3Id());

            map.put("Tb8Unit4", tb8Unit4);
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb8Unit4 tb8Unit4 = Tb8Unit4.get(unit4Id);
            // 転生先
            tb8Unit4.referTb8Reborn2s();
            map.put("Tb8Unit4", tb8Unit4);
        } catch (NoDataError e) {
            if (postJson.get("IsSilent") == null || !postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
