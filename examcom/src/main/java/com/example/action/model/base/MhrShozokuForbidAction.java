package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MhrShozoku;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 所属マスタ否認
 *
 * @author emarfkrow
 */
public class MhrShozokuForbidAction extends BaseAction {

    /** 所属マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MhrShozoku.bushoId");
        }
        if (bushoId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MhrShozoku.shokuiId");
        }
        if (shokuiId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object userId = postJson.get("userId");
        if (userId == null) {
            userId = postJson.get("MhrShozoku.userId");
        }
        if (userId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("MhrShozoku.tekiyoBi");
        }
        if (tekiyoBi == null) {
            throw new OptLockError("error.cant.forbid");
        }

        MhrShozoku e = FormValidator.toBean(MhrShozoku.class.getName(), postJson);

        MhrShozoku f = MhrShozoku.get(e.getBushoId(), e.getShokuiId(), e.getUserId(), e.getTekiyoBi());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
