package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiYokushiSaki2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生抑止先２否認
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiSaki2ForbidAction extends BaseAction {

    /** 転生抑止先２否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiYokushiSaki2Id = postJson.get("tenseiYokushiSaki2Id");
        if (tenseiYokushiSaki2Id == null) {
            tenseiYokushiSaki2Id = postJson.get("Tb5TenseiYokushiSaki2.tenseiYokushiSaki2Id");
        }
        if (tenseiYokushiSaki2Id == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5TenseiYokushiSaki2 e = FormValidator.toBean(Tb5TenseiYokushiSaki2.class.getName(), postJson);

        Tb5TenseiYokushiSaki2 f = Tb5TenseiYokushiSaki2.get(e.getTenseiYokushiSaki2Id());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
