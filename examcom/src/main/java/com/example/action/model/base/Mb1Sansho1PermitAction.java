package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb1Sansho1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照１マスタ承認
 *
 * @author emarfkrow
 */
public class Mb1Sansho1PermitAction extends BaseAction {

    /** 参照１マスタ承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sansho1Id = postJson.get("sansho1Id");
        if (sansho1Id == null) {
            sansho1Id = postJson.get("Mb1Sansho1.sansho1Id");
        }
        if (sansho1Id == null) {
            throw new OptLockError("error.cant.permit");
        }

        Mb1Sansho1 e = FormValidator.toBean(Mb1Sansho1.class.getName(), postJson);

        Mb1Sansho1 f = Mb1Sansho1.get(e.getSansho1Id());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
