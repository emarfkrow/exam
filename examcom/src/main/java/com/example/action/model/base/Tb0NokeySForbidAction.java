package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb0Nokey;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 主キーなし一覧承認
 *
 * @author emarfkrow
 */
public class Tb0NokeySForbidAction extends BaseAction {

    /** 主キーなし一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb0NokeyGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb0Nokey e = FormValidator.toBean(Tb0Nokey.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object colA = e.getColA();
            if (colA == null) {
                throw new OptLockError("error.cant.forbid");
            }
            Object colB = e.getColB();
            if (colB == null) {
                throw new OptLockError("error.cant.forbid");
            }

            Tb0Nokey f = Tb0Nokey.get(colA, colB);
            f.setStatusKb(-1);
            if (f.update(now, execId) != 1) {
                throw new OptLockError("error.cant.forbid");
            }
            ++count;
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
