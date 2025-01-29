package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb7Sansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照マスタ否認
 *
 * @author emarfkrow
 */
public class Mb7SanshoForbidAction extends BaseAction {

    /** 参照マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sanshoId = postJson.get("sanshoId");
        if (sanshoId == null) {
            sanshoId = postJson.get("Mb7Sansho.sanshoId");
        }
        if (sanshoId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Mb7Sansho e = FormValidator.toBean(Mb7Sansho.class.getName(), postJson);

        Mb7Sansho f = Mb7Sansho.get(e.getSanshoId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
