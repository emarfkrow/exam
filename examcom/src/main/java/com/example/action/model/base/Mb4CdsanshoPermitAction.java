package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Cdsansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * CD参照マスタ承認
 *
 * @author emarfkrow
 */
public class Mb4CdsanshoPermitAction extends BaseAction {

    /** CD参照マスタ承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object cdsanshoCd = postJson.get("cdsanshoCd");
        if (cdsanshoCd == null) {
            cdsanshoCd = postJson.get("Mb4Cdsansho.cdsanshoCd");
        }
        if (cdsanshoCd == null) {
            throw new OptLockError("error.cant.permit");
        }

        Mb4Cdsansho e = FormValidator.toBean(Mb4Cdsansho.class.getName(), postJson);

        Mb4Cdsansho f = Mb4Cdsansho.get(e.getCdsanshoCd());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
