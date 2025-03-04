package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7ShuyakuMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約元削除
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuMotoDeleteAction extends BaseAction {

    /** 集約元削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuMotoId = postJson.get("shuyakuMotoId");
        if (shuyakuMotoId == null) {
            shuyakuMotoId = postJson.get("Tb7ShuyakuMoto.shuyakuMotoId");
        }
        if (shuyakuMotoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb7ShuyakuMoto e = FormValidator.toBean(Tb7ShuyakuMoto.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
