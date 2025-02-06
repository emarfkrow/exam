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
 * 参照元否認
 *
 * @author emarfkrow
 */
public class Tb4SanshoMotoForbidAction extends BaseAction {

    /** 参照元否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sanshoMotoId = postJson.get("sanshoMotoId");
        if (sanshoMotoId == null) {
            sanshoMotoId = postJson.get("Tb4SanshoMoto.sanshoMotoId");
        }
        if (sanshoMotoId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb4SanshoMoto e = FormValidator.toBean(Tb4SanshoMoto.class.getName(), postJson);

        Tb4SanshoMoto f = Tb4SanshoMoto.get(e.getSanshoMotoId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
