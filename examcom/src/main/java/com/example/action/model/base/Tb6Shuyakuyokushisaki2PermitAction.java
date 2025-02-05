package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Shuyakuyokushisaki2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約抑止先２承認
 *
 * @author emarfkrow
 */
public class Tb6Shuyakuyokushisaki2PermitAction extends BaseAction {

    /** 集約抑止先２承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuyokushisaki2Id = postJson.get("shuyakuyokushisaki2Id");
        if (shuyakuyokushisaki2Id == null) {
            shuyakuyokushisaki2Id = postJson.get("Tb6Shuyakuyokushisaki2.shuyakuyokushisaki2Id");
        }
        if (shuyakuyokushisaki2Id == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb6Shuyakuyokushisaki2 e = FormValidator.toBean(Tb6Shuyakuyokushisaki2.class.getName(), postJson);

        Tb6Shuyakuyokushisaki2 f = Tb6Shuyakuyokushisaki2.get(e.getShuyakuyokushisaki2Id());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
