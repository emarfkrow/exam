package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb8Stint;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 制約マスタ削除
 *
 * @author emarfkrow
 */
public class Mb8StintDeleteAction extends BaseAction {

    /** 制約マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object stintId = postJson.get("stintId");
        if (stintId == null) {
            stintId = postJson.get("Mb8Stint.stintId");
        }
        if (stintId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Mb8Stint e = FormValidator.toBean(Mb8Stint.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
