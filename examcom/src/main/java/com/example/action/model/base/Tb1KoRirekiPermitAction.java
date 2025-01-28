package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1KoRireki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 履歴承認
 *
 * @author emarfkrow
 */
public class Tb1KoRirekiPermitAction extends BaseAction {

    /** 履歴承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1KoRireki.oyaId");
        }
        if (oyaId == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1KoRireki.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object rirekiBn = postJson.get("rirekiBn");
        if (rirekiBn == null) {
            rirekiBn = postJson.get("Tb1KoRireki.rirekiBn");
        }
        if (rirekiBn == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb1KoRireki e = FormValidator.toBean(Tb1KoRireki.class.getName(), postJson);

        Tb1KoRireki f = Tb1KoRireki.get(e.getOyaId(), e.getKoBn(), e.getRirekiBn());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
