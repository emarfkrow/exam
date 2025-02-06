package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiSakiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先明細否認
 *
 * @author emarfkrow
 */
public class Tb5TenseiSakiDetForbidAction extends BaseAction {

    /** 転生先明細否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiSakiId = postJson.get("tenseiSakiId");
        if (tenseiSakiId == null) {
            tenseiSakiId = postJson.get("Tb5TenseiSakiDet.tenseiSakiId");
        }
        if (tenseiSakiId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object tenseiSakiBn = postJson.get("tenseiSakiBn");
        if (tenseiSakiBn == null) {
            tenseiSakiBn = postJson.get("Tb5TenseiSakiDet.tenseiSakiBn");
        }
        if (tenseiSakiBn == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5TenseiSakiDet e = FormValidator.toBean(Tb5TenseiSakiDet.class.getName(), postJson);

        Tb5TenseiSakiDet f = Tb5TenseiSakiDet.get(e.getTenseiSakiId(), e.getTenseiSakiBn());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
