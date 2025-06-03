package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1KoDinks;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 子なし照会
 *
 * @author emarfkrow
 */
public class Tb1KoDinksGetAction extends BaseAction {

    /** 子なし照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1KoDinks.oyaId");
        }
        if (oyaId == null) {
            isAllKey = false;
        }

        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1KoDinks.koBn");
        }
        if (koBn == null) {
            isAllKey = false;
        }

        // 親モデルの取得
        com.example.entity.Tb1Oya tb1Oya = com.example.entity.Tb1Oya.get(oyaId);
        map.put("Tb1Oya", tb1Oya);

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb1KoDinks tb1KoDinks = Tb1KoDinks.get(oyaId, koBn);
            tb1KoDinks.referTb1Ko();
            tb1KoDinks.referTb1KoOrphans();
            map.put("Tb1KoDinks", tb1KoDinks);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
