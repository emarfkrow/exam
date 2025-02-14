package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3Rireki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 履歴削除
 *
 * @author emarfkrow
 */
public class Tb3RirekiDeleteAction extends BaseAction {

    /** 履歴削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object rirekiMotoId = postJson.get("rirekiMotoId");
        if (rirekiMotoId == null) {
            rirekiMotoId = postJson.get("Tb3Rireki.rirekiMotoId");
        }
        if (rirekiMotoId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object rirekiBn = postJson.get("rirekiBn");
        if (rirekiBn == null) {
            rirekiBn = postJson.get("Tb3Rireki.rirekiBn");
        }
        if (rirekiBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb3Rireki e = FormValidator.toBean(Tb3Rireki.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
