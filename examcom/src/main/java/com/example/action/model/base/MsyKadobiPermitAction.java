package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyKadobi;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 稼働日マスタ承認
 *
 * @author emarfkrow
 */
public class MsyKadobiPermitAction extends BaseAction {

    /** 稼働日マスタ承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kadoBi = postJson.get("kadoBi");
        if (kadoBi == null) {
            kadoBi = postJson.get("MsyKadobi.kadoBi");
        }
        if (kadoBi == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object bushoKb = postJson.get("bushoKb");
        if (bushoKb == null) {
            bushoKb = postJson.get("MsyKadobi.bushoKb");
        }
        if (bushoKb == null) {
            throw new OptLockError("error.cant.permit");
        }

        MsyKadobi e = FormValidator.toBean(MsyKadobi.class.getName(), postJson);

        MsyKadobi f = MsyKadobi.get(e.getKadoBi(), e.getBushoKb());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
