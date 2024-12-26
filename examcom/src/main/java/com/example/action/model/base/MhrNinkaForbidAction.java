package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MhrNinka;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 認可マスタ否認
 *
 * @author emarfkrow
 */
public class MhrNinkaForbidAction extends BaseAction {

    /** 認可マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MhrNinka.bushoId");
        }
        if (bushoId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MhrNinka.shokuiId");
        }
        if (shokuiId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object kinoNm = postJson.get("kinoNm");
        if (kinoNm == null) {
            kinoNm = postJson.get("MhrNinka.kinoNm");
        }
        if (kinoNm == null) {
            throw new OptLockError("error.cant.forbid");
        }

        MhrNinka e = FormValidator.toBean(MhrNinka.class.getName(), postJson);

        MhrNinka f = MhrNinka.get(e.getBushoId(), e.getShokuiId(), e.getKinoNm());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
