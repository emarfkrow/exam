package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki2Det;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生先２明細削除
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki2DetDeleteAction extends BaseAction {

    /** 派生先２明細削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object haseiTo2Id = postJson.get("haseiTo2Id");
        if (haseiTo2Id == null) {
            haseiTo2Id = postJson.get("Tb6HaseiSaki2Det.haseiTo2Id");
        }
        if (haseiTo2Id == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object haseiTo2Bn = postJson.get("haseiTo2Bn");
        if (haseiTo2Bn == null) {
            haseiTo2Bn = postJson.get("Tb6HaseiSaki2Det.haseiTo2Bn");
        }
        if (haseiTo2Bn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6HaseiSaki2Det e = FormValidator.toBean(Tb6HaseiSaki2Det.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
