package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Daihyo2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 代表２否認
 *
 * @author emarfkrow
 */
public class Tb2Daihyo2ForbidAction extends BaseAction {

    /** 代表２否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object daihyoId = postJson.get("daihyoId");
        if (daihyoId == null) {
            daihyoId = postJson.get("Tb2Daihyo2.daihyoId");
        }
        if (daihyoId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb2Daihyo2 e = FormValidator.toBean(Tb2Daihyo2.class.getName(), postJson);

        Tb2Daihyo2 f = Tb2Daihyo2.get(e.getDaihyoId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
