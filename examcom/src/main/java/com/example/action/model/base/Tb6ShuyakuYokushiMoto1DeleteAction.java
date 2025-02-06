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
 * 集約抑止元１削除
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiMoto1DeleteAction extends BaseAction {

    /** 集約抑止元１削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuYokushiMoto1Id = postJson.get("shuyakuYokushiMoto1Id");
        if (shuyakuYokushiMoto1Id == null) {
            shuyakuYokushiMoto1Id = postJson.get("Tb6ShuyakuYokushiMoto1.shuyakuYokushiMoto1Id");
        }
        if (shuyakuYokushiMoto1Id == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6ShuyakuYokushiMoto1 e = FormValidator.toBean(Tb6ShuyakuYokushiMoto1.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
