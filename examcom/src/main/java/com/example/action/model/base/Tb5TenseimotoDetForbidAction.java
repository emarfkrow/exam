package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseimotoDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生元明細否認
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoDetForbidAction extends BaseAction {

    /** 転生元明細否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseimotoId = postJson.get("tenseimotoId");
        if (tenseimotoId == null) {
            tenseimotoId = postJson.get("Tb5TenseimotoDet.tenseimotoId");
        }
        if (tenseimotoId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object tenseimotoBn = postJson.get("tenseimotoBn");
        if (tenseimotoBn == null) {
            tenseimotoBn = postJson.get("Tb5TenseimotoDet.tenseimotoBn");
        }
        if (tenseimotoBn == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5TenseimotoDet e = FormValidator.toBean(Tb5TenseimotoDet.class.getName(), postJson);

        Tb5TenseimotoDet f = Tb5TenseimotoDet.get(e.getTenseimotoId(), e.getTenseimotoBn());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
