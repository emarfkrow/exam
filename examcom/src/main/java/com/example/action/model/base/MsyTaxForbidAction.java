package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyTax;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 税マスタ否認
 *
 * @author emarfkrow
 */
public class MsyTaxForbidAction extends BaseAction {

    /** 税マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object taxKb = postJson.get("taxKb");
        if (taxKb == null) {
            taxKb = postJson.get("MsyTax.taxKb");
        }
        if (taxKb == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object kaishiBi = postJson.get("kaishiBi");
        if (kaishiBi == null) {
            kaishiBi = postJson.get("MsyTax.kaishiBi");
        }
        if (kaishiBi == null) {
            throw new OptLockError("error.cant.forbid");
        }

        MsyTax e = FormValidator.toBean(MsyTax.class.getName(), postJson);

        MsyTax f = MsyTax.get(e.getTaxKb(), e.getKaishiBi());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
