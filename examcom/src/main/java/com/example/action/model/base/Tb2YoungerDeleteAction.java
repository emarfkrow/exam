package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Younger;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 弟削除
 *
 * @author emarfkrow
 */
public class Tb2YoungerDeleteAction extends BaseAction {

    /** 弟削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kyodaiId = postJson.get("kyodaiId");
        if (kyodaiId == null) {
            kyodaiId = postJson.get("Tb2Younger.kyodaiId");
        }
        if (kyodaiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb2Younger e = FormValidator.toBean(Tb2Younger.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
