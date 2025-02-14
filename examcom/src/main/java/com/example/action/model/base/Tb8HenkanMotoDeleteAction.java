package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb8HenkanMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 変換元削除
 *
 * @author emarfkrow
 */
public class Tb8HenkanMotoDeleteAction extends BaseAction {

    /** 変換元削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object henkanMotoId = postJson.get("henkanMotoId");
        if (henkanMotoId == null) {
            henkanMotoId = postJson.get("Tb8HenkanMoto.henkanMotoId");
        }
        if (henkanMotoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb8HenkanMoto e = FormValidator.toBean(Tb8HenkanMoto.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
