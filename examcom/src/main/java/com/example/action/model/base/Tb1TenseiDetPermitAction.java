package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1TenseiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生明細承認
 *
 * @author emarfkrow
 */
public class Tb1TenseiDetPermitAction extends BaseAction {

    /** 転生明細承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiId = postJson.get("tenseiId");
        if (tenseiId == null) {
            tenseiId = postJson.get("Tb1TenseiDet.tenseiId");
        }
        if (tenseiId == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object tenseiBn = postJson.get("tenseiBn");
        if (tenseiBn == null) {
            tenseiBn = postJson.get("Tb1TenseiDet.tenseiBn");
        }
        if (tenseiBn == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb1TenseiDet e = FormValidator.toBean(Tb1TenseiDet.class.getName(), postJson);

        Tb1TenseiDet f = Tb1TenseiDet.get(e.getTenseiId(), e.getTenseiBn());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
