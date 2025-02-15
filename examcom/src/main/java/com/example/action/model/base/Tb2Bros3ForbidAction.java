package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Bros3;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 兄弟３否認
 *
 * @author emarfkrow
 */
public class Tb2Bros3ForbidAction extends BaseAction {

    /** 兄弟３否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object brosId = postJson.get("brosId");
        if (brosId == null) {
            brosId = postJson.get("Tb2Bros3.brosId");
        }
        if (brosId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb2Bros3 e = FormValidator.toBean(Tb2Bros3.class.getName(), postJson);

        Tb2Bros3 f = Tb2Bros3.get(e.getBrosId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
