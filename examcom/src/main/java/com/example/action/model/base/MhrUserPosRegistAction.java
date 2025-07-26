package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MhrUserPos;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 所属マスタ登録
 *
 * @author emarfkrow
 */
public class MhrUserPosRegistAction extends BaseAction {

    /** 所属マスタ登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        MhrUserPos e = FormValidator.toBean(MhrUserPos.class.getName(), postJson);

        // 主キーが不足していたらINSERT
        boolean isNew = false;
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(e.getBushoId())) {
            isNew = true;
        }
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(e.getShokuiId())) {
            isNew = true;
        }
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(e.getUserId())) {
            isNew = true;
        }
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(e.getTekiyoBi())) {
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
