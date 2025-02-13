package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Koji;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 孤児否認
 *
 * @author emarfkrow
 */
public class Tb2KojiForbidAction extends BaseAction {

    /** 孤児否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kojiId = postJson.get("kojiId");
        if (kojiId == null) {
            kojiId = postJson.get("Tb2Koji.kojiId");
        }
        if (kojiId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb2Koji e = FormValidator.toBean(Tb2Koji.class.getName(), postJson);

        Tb2Koji f = Tb2Koji.get(e.getKojiId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
