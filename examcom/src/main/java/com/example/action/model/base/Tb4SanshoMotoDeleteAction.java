package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4SanshoMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照元削除
 *
 * @author emarfkrow
 */
public class Tb4SanshoMotoDeleteAction extends BaseAction {

    /** 参照元削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object refId = postJson.get("refId");
        if (refId == null) {
            refId = postJson.get("Tb4SanshoMoto.refId");
        }
        if (refId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb4SanshoMoto e = FormValidator.toBean(Tb4SanshoMoto.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
