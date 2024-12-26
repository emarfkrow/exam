package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Itoko;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 従妹否認
 *
 * @author emarfkrow
 */
public class Tb1ItokoForbidAction extends BaseAction {

    /** 従妹否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object itokoId = postJson.get("itokoId");
        if (itokoId == null) {
            itokoId = postJson.get("Tb1Itoko.itokoId");
        }
        if (itokoId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb1Itoko e = FormValidator.toBean(Tb1Itoko.class.getName(), postJson);

        Tb1Itoko f = Tb1Itoko.get(e.getItokoId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}