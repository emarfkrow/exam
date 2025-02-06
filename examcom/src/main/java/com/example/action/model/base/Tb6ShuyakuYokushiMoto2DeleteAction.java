package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuYokushiMoto2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約抑止元２削除
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiMoto2DeleteAction extends BaseAction {

    /** 集約抑止元２削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuYokushiMoto2Id = postJson.get("shuyakuYokushiMoto2Id");
        if (shuyakuYokushiMoto2Id == null) {
            shuyakuYokushiMoto2Id = postJson.get("Tb6ShuyakuYokushiMoto2.shuyakuYokushiMoto2Id");
        }
        if (shuyakuYokushiMoto2Id == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6ShuyakuYokushiMoto2 e = FormValidator.toBean(Tb6ShuyakuYokushiMoto2.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
