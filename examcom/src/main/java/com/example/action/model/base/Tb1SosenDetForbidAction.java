package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1SosenDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 祖先明細否認
 *
 * @author emarfkrow
 */
public class Tb1SosenDetForbidAction extends BaseAction {

    /** 祖先明細否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1SosenDet.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object sosenBn = postJson.get("sosenBn");
        if (sosenBn == null) {
            sosenBn = postJson.get("Tb1SosenDet.sosenBn");
        }
        if (sosenBn == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb1SosenDet e = FormValidator.toBean(Tb1SosenDet.class.getName(), postJson);

        Tb1SosenDet f = Tb1SosenDet.get(e.getSosenId(), e.getSosenBn());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
