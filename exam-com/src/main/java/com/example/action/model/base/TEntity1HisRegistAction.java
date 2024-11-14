package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity1His;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * エンティティ１履歴登録
 *
 * @author emarfkrow
 */
public class TEntity1HisRegistAction extends BaseAction {

    /** エンティティ１履歴登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        TEntity1His e = FormValidator.toBean(TEntity1His.class.getName(), postJson);

        // 主キーが不足していたらINSERT
        boolean isNew = false;
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getSosenId())) {
            isNew = true;
        }
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getOyaBn())) {
            isNew = true;
        }
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getEntityBn())) {
            isNew = true;
        }
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getHistoryBn())) {
            isNew = true;
        }
        // 楽観ロック値がなくてもINSERT
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getUpdateDt())) {
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
