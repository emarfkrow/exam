package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7Choice;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 択一削除
 *
 * @author emarfkrow
 */
public class Tb7ChoiceDeleteAction extends BaseAction {

    /** 択一削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object choiceId = postJson.get("choiceId");
        if (choiceId == null) {
            choiceId = postJson.get("Tb7Choice.choiceId");
        }
        if (choiceId == null) {
            throw new OptLockError("error.cant.delete", "択一");
        }

        Tb7Choice e = FormValidator.toBean(Tb7Choice.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete", "択一");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
