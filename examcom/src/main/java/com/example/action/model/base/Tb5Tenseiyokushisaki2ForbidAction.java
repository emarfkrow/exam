package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseiyokushisaki2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生抑止先２否認
 *
 * @author emarfkrow
 */
public class Tb5Tenseiyokushisaki2ForbidAction extends BaseAction {

    /** 転生抑止先２否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiyokushisaki2Id = postJson.get("tenseiyokushisaki2Id");
        if (tenseiyokushisaki2Id == null) {
            tenseiyokushisaki2Id = postJson.get("Tb5Tenseiyokushisaki2.tenseiyokushisaki2Id");
        }
        if (tenseiyokushisaki2Id == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5Tenseiyokushisaki2 e = FormValidator.toBean(Tb5Tenseiyokushisaki2.class.getName(), postJson);

        Tb5Tenseiyokushisaki2 f = Tb5Tenseiyokushisaki2.get(e.getTenseiyokushisaki2Id());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
