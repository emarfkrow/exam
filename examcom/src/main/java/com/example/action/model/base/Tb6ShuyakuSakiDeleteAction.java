package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約先削除
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuSakiDeleteAction extends BaseAction {

    /** 集約先削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuSakiId = postJson.get("shuyakuSakiId");
        if (shuyakuSakiId == null) {
            shuyakuSakiId = postJson.get("Tb6ShuyakuSaki.shuyakuSakiId");
        }
        if (shuyakuSakiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6ShuyakuSaki e = FormValidator.toBean(Tb6ShuyakuSaki.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
