package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4Idbn;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * ID-BNマスタ削除
 *
 * @author emarfkrow
 */
public class Tb4IdbnDeleteAction extends BaseAction {

    /** ID-BNマスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object idrefId = postJson.get("idrefId");
        if (idrefId == null) {
            idrefId = postJson.get("Tb4Idbn.idrefId");
        }
        if (idrefId == null) {
            throw new OptLockError("error.cant.delete", "ID-BNマスタ");
        }
        Object idbnBn = postJson.get("idbnBn");
        if (idbnBn == null) {
            idbnBn = postJson.get("Tb4Idbn.idbnBn");
        }
        if (idbnBn == null) {
            throw new OptLockError("error.cant.delete", "ID-BNマスタ");
        }

        Tb4Idbn e = FormValidator.toBean(Tb4Idbn.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete", "ID-BNマスタ");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
