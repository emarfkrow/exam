package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Mattei2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 末弟２否認
 *
 * @author emarfkrow
 */
public class Tb2Mattei2ForbidAction extends BaseAction {

    /** 末弟２否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object matteiId = postJson.get("matteiId");
        if (matteiId == null) {
            matteiId = postJson.get("Tb2Mattei2.matteiId");
        }
        if (matteiId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb2Mattei2 e = FormValidator.toBean(Tb2Mattei2.class.getName(), postJson);

        Tb2Mattei2 f = Tb2Mattei2.get(e.getMatteiId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
