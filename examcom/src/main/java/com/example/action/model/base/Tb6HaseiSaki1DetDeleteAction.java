package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki1Det;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生先１明細削除
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki1DetDeleteAction extends BaseAction {

    /** 派生先１明細削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object haseiSaki1Id = postJson.get("haseiSaki1Id");
        if (haseiSaki1Id == null) {
            haseiSaki1Id = postJson.get("Tb6HaseiSaki1Det.haseiSaki1Id");
        }
        if (haseiSaki1Id == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object haseiSaki1Bn = postJson.get("haseiSaki1Bn");
        if (haseiSaki1Bn == null) {
            haseiSaki1Bn = postJson.get("Tb6HaseiSaki1Det.haseiSaki1Bn");
        }
        if (haseiSaki1Bn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6HaseiSaki1Det e = FormValidator.toBean(Tb6HaseiSaki1Det.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
