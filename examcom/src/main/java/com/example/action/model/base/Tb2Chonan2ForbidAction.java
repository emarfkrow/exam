package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Chonan2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 長男２否認
 *
 * @author emarfkrow
 */
public class Tb2Chonan2ForbidAction extends BaseAction {

    /** 長男２否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object chonanId = postJson.get("chonanId");
        if (chonanId == null) {
            chonanId = postJson.get("Tb2Chonan2.chonanId");
        }
        if (chonanId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb2Chonan2 e = FormValidator.toBean(Tb2Chonan2.class.getName(), postJson);

        Tb2Chonan2 f = Tb2Chonan2.get(e.getChonanId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
