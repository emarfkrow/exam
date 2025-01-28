package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3Kyodai2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 兄弟２否認
 *
 * @author emarfkrow
 */
public class Tb3Kyodai2ForbidAction extends BaseAction {

    /** 兄弟２否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb3Kyodai2.oyaId");
        }
        if (oyaId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb3Kyodai2.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb3Kyodai2 e = FormValidator.toBean(Tb3Kyodai2.class.getName(), postJson);

        // child:Tb1Mago, parents:5

        Tb3Kyodai2 f = Tb3Kyodai2.get(e.getOyaId(), e.getKoBn());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
