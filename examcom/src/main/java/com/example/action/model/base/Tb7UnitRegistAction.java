package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7Unit;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 単位登録
 *
 * @author emarfkrow
 */
public class Tb7UnitRegistAction extends BaseAction {

    /** 単位登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        Tb7Unit e = FormValidator.toBean(Tb7Unit.class.getName(), postJson);

        // 主キーが不足していたらINSERT
        boolean isNew = false;
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(e.getUnitId())) {
            isNew = true;
        }
        // 楽観ロック値がなくてもINSERT
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(e.getUpdateTs())) {
            isNew = true;
        }

        if (isNew) {

            if (e.insert(now, execId) != 1) {
                throw new OptLockError("error.cant.insert");
            }

            map.put("INFO", Messages.get("info.insert"));

        } else {

            if (e.update(now, execId) == 1) {
                map.put("INFO", Messages.get("info.update"));
            } else if (e.insert(now, execId) == 1) {
                map.put("INFO", Messages.get("info.insert"));
            } else {
                throw new OptLockError("error.cant.update");
            }
        }

        return map;
    }

}
