package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Shuyakuyokushisaki2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約抑止先２承認
 *
 * @author emarfkrow
 */
public class Tb5Shuyakuyokushisaki2PermitAction extends BaseAction {

    /** 集約抑止先２承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuyokushisaki2Id = postJson.get("shuyakuyokushisaki2Id");
        if (shuyakuyokushisaki2Id == null) {
            shuyakuyokushisaki2Id = postJson.get("Tb5Shuyakuyokushisaki2.shuyakuyokushisaki2Id");
        }
        if (shuyakuyokushisaki2Id == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb5Shuyakuyokushisaki2 e = FormValidator.toBean(Tb5Shuyakuyokushisaki2.class.getName(), postJson);

        Tb5Shuyakuyokushisaki2 f = Tb5Shuyakuyokushisaki2.get(e.getShuyakuyokushisaki2Id());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
