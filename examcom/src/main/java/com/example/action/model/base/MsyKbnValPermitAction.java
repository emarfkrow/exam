package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyKbnVal;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 区分値マスタ承認
 *
 * @author emarfkrow
 */
public class MsyKbnValPermitAction extends BaseAction {

    /** 区分値マスタ承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kbnNm = postJson.get("kbnNm");
        if (kbnNm == null) {
            kbnNm = postJson.get("MsyKbnVal.kbnNm");
        }
        if (kbnNm == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object kbnVal = postJson.get("kbnVal");
        if (kbnVal == null) {
            kbnVal = postJson.get("MsyKbnVal.kbnVal");
        }
        if (kbnVal == null) {
            throw new OptLockError("error.cant.permit");
        }

        MsyKbnVal e = FormValidator.toBean(MsyKbnVal.class.getName(), postJson);

        MsyKbnVal f = MsyKbnVal.get(e.getKbnNm(), e.getKbnVal());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
