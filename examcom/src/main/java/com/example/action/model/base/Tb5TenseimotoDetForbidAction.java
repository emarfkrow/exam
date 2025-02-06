package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiMotoDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生元明細否認
 *
 * @author emarfkrow
 */
public class Tb5TenseiMotoDetForbidAction extends BaseAction {

    /** 転生元明細否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiMotoId = postJson.get("tenseiMotoId");
        if (tenseiMotoId == null) {
            tenseiMotoId = postJson.get("Tb5TenseiMotoDet.tenseiMotoId");
        }
        if (tenseiMotoId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object tenseiMotoBn = postJson.get("tenseiMotoBn");
        if (tenseiMotoBn == null) {
            tenseiMotoBn = postJson.get("Tb5TenseiMotoDet.tenseiMotoBn");
        }
        if (tenseiMotoBn == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5TenseiMotoDet e = FormValidator.toBean(Tb5TenseiMotoDet.class.getName(), postJson);

        Tb5TenseiMotoDet f = Tb5TenseiMotoDet.get(e.getTenseiMotoId(), e.getTenseiMotoBn());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
