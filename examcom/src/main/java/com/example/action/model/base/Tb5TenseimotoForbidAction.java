package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseimoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生元否認
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoForbidAction extends BaseAction {

    /** 転生元否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseimotoId = postJson.get("tenseimotoId");
        if (tenseimotoId == null) {
            tenseimotoId = postJson.get("Tb5Tenseimoto.tenseimotoId");
        }
        if (tenseimotoId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5Tenseimoto e = FormValidator.toBean(Tb5Tenseimoto.class.getName(), postJson);

        java.util.List<com.example.entity.Tb5TenseimotoDet> tb5TenseimotoDets = e.referTb5TenseimotoDets();
        if (tb5TenseimotoDets != null) {
            for (com.example.entity.Tb5TenseimotoDet tb5TenseimotoDet : tb5TenseimotoDets) {

                tb5TenseimotoDet.setStatusKb(-1);
                if (tb5TenseimotoDet.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        Tb5Tenseimoto f = Tb5Tenseimoto.get(e.getTenseimotoId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
