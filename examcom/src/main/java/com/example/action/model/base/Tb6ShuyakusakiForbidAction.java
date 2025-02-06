package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約先否認
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuSakiForbidAction extends BaseAction {

    /** 集約先否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuSakiId = postJson.get("shuyakuSakiId");
        if (shuyakuSakiId == null) {
            shuyakuSakiId = postJson.get("Tb6ShuyakuSaki.shuyakuSakiId");
        }
        if (shuyakuSakiId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb6ShuyakuSaki e = FormValidator.toBean(Tb6ShuyakuSaki.class.getName(), postJson);

        Tb6ShuyakuSaki f = Tb6ShuyakuSaki.get(e.getShuyakuSakiId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
