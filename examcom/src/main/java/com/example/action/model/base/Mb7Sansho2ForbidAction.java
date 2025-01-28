package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb7Sansho2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照２マスタ否認
 *
 * @author emarfkrow
 */
public class Mb7Sansho2ForbidAction extends BaseAction {

    /** 参照２マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sansho2Id = postJson.get("sansho2Id");
        if (sansho2Id == null) {
            sansho2Id = postJson.get("Mb7Sansho2.sansho2Id");
        }
        if (sansho2Id == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Mb7Sansho2 e = FormValidator.toBean(Mb7Sansho2.class.getName(), postJson);

        Mb7Sansho2 f = Mb7Sansho2.get(e.getSansho2Id());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
