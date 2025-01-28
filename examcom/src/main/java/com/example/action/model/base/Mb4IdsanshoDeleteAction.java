package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Idsansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * ID参照マスタ削除
 *
 * @author emarfkrow
 */
public class Mb4IdsanshoDeleteAction extends BaseAction {

    /** ID参照マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object idsanshoId = postJson.get("idsanshoId");
        if (idsanshoId == null) {
            idsanshoId = postJson.get("Mb4Idsansho.idsanshoId");
        }
        if (idsanshoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Mb4Idsansho e = FormValidator.toBean(Mb4Idsansho.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
