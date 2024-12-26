package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyKbn;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 区分マスタ承認
 *
 * @author emarfkrow
 */
public class MsyKbnPermitAction extends BaseAction {

    /** 区分マスタ承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kbnNm = postJson.get("kbnNm");
        if (kbnNm == null) {
            kbnNm = postJson.get("MsyKbn.kbnNm");
        }
        if (kbnNm == null) {
            throw new OptLockError("error.cant.permit");
        }

        MsyKbn e = FormValidator.toBean(MsyKbn.class.getName(), postJson);

        java.util.List<com.example.entity.MsyKbnVal> msyKbnVals = e.referMsyKbnVals();
        if (msyKbnVals != null) {
            for (com.example.entity.MsyKbnVal msyKbnVal : msyKbnVals) {

                msyKbnVal.setStatusKb(1);
                if (msyKbnVal.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.permit");
                }
            }
        }

        MsyKbn f = MsyKbn.get(e.getKbnNm());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
