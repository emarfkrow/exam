package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7Choice;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 選抜照会
 *
 * @author emarfkrow
 */
public class Tb7ChoiceGetAction extends BaseAction {

    /** 選抜照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object choiceId = postJson.get("choiceId");
        if (choiceId == null) {
            choiceId = postJson.get("Tb7Choice.choiceId");
        }
        if (choiceId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb7Choice tb7Choice = Tb7Choice.get(choiceId);
            map.put("Tb7Choice", tb7Choice);
        } catch (NoDataError e) {
            if (postJson.get("IsSilent") == null || !postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
