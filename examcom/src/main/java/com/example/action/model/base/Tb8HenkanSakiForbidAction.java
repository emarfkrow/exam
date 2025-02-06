package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8HenkanSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 変換先否認
 *
 * @author emarfkrow
 */
public class Tb8HenkanSakiForbidAction extends BaseAction {

    /** 変換先否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object henkanSakiId = postJson.get("henkanSakiId");
        if (henkanSakiId == null) {
            henkanSakiId = postJson.get("Tb8HenkanSaki.henkanSakiId");
        }
        if (henkanSakiId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb8HenkanSaki e = FormValidator.toBean(Tb8HenkanSaki.class.getName(), postJson);

        Tb8HenkanSaki f = Tb8HenkanSaki.get(e.getHenkanSakiId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
