package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MhrUser;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * ユーザマスタ否認
 *
 * @author emarfkrow
 */
public class MhrUserForbidAction extends BaseAction {

    /** ユーザマスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object userId = postJson.get("userId");
        if (userId == null) {
            userId = postJson.get("MhrUser.userId");
        }
        if (userId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        MhrUser e = FormValidator.toBean(MhrUser.class.getName(), postJson);

        MhrUser f = MhrUser.get(e.getUserId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
