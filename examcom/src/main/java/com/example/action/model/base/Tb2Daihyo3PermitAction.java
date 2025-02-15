package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Daihyo3;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 代表３承認
 *
 * @author emarfkrow
 */
public class Tb2Daihyo3PermitAction extends BaseAction {

    /** 代表３承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object daihyoId = postJson.get("daihyoId");
        if (daihyoId == null) {
            daihyoId = postJson.get("Tb2Daihyo3.daihyoId");
        }
        if (daihyoId == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb2Daihyo3 e = FormValidator.toBean(Tb2Daihyo3.class.getName(), postJson);

        Tb2Daihyo3 f = Tb2Daihyo3.get(e.getDaihyoId());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
