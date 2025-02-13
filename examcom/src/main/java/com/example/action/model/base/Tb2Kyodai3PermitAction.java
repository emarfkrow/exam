package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Kyodai3;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 兄弟３承認
 *
 * @author emarfkrow
 */
public class Tb2Kyodai3PermitAction extends BaseAction {

    /** 兄弟３承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kyodaiId = postJson.get("kyodaiId");
        if (kyodaiId == null) {
            kyodaiId = postJson.get("Tb2Kyodai3.kyodaiId");
        }
        if (kyodaiId == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb2Kyodai3 e = FormValidator.toBean(Tb2Kyodai3.class.getName(), postJson);

        Tb2Kyodai3 f = Tb2Kyodai3.get(e.getKyodaiId());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
