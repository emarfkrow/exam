package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Idbn;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * ID-BNマスタ削除
 *
 * @author emarfkrow
 */
public class Mb4IdbnDeleteAction extends BaseAction {

    /** ID-BNマスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object refId = postJson.get("refId");
        if (refId == null) {
            refId = postJson.get("Mb4Idbn.refId");
        }
        if (refId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object refBn = postJson.get("refBn");
        if (refBn == null) {
            refBn = postJson.get("Mb4Idbn.refBn");
        }
        if (refBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Mb4Idbn e = FormValidator.toBean(Mb4Idbn.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
