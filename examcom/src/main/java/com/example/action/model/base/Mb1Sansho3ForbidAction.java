package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb1Sansho3;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照３マスタ否認
 *
 * @author emarfkrow
 */
public class Mb1Sansho3ForbidAction extends BaseAction {

    /** 参照３マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sansho3No = postJson.get("sansho3No");
        if (sansho3No == null) {
            sansho3No = postJson.get("Mb1Sansho3.sansho3No");
        }
        if (sansho3No == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Mb1Sansho3 e = FormValidator.toBean(Mb1Sansho3.class.getName(), postJson);

        Mb1Sansho3 f = Mb1Sansho3.get(e.getSansho3No());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
