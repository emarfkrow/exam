package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuYokushiMoto1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約抑止元１承認
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiMoto1PermitAction extends BaseAction {

    /** 集約抑止元１承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuYokushiMoto1Id = postJson.get("shuyakuYokushiMoto1Id");
        if (shuyakuYokushiMoto1Id == null) {
            shuyakuYokushiMoto1Id = postJson.get("Tb6ShuyakuYokushiMoto1.shuyakuYokushiMoto1Id");
        }
        if (shuyakuYokushiMoto1Id == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb6ShuyakuYokushiMoto1 e = FormValidator.toBean(Tb6ShuyakuYokushiMoto1.class.getName(), postJson);

        Tb6ShuyakuYokushiMoto1 f = Tb6ShuyakuYokushiMoto1.get(e.getShuyakuYokushiMoto1Id());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
