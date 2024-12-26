package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2NoPk;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 主キーなし承認
 *
 * @author emarfkrow
 */
public class Tb2NoPkPermitAction extends BaseAction {

    /** 主キーなし承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object columnA = postJson.get("columnA");
        if (columnA == null) {
            columnA = postJson.get("Tb2NoPk.columnA");
        }
        if (columnA == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb2NoPk e = FormValidator.toBean(Tb2NoPk.class.getName(), postJson);

        Tb2NoPk f = Tb2NoPk.get(e.getColumnA());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
