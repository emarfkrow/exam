package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb1Shison;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子孫一覧承認
 *
 * @author emarfkrow
 */
public class Tb1ShisonSForbidAction extends BaseAction {

    /** 子孫一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb1ShisonGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb1Shison e = FormValidator.toBean(Tb1Shison.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object sosenId = e.getSosenId();
            if (sosenId == null) {
                throw new OptLockError("error.cant.forbid");
            }
            Object oyaBn = e.getOyaBn();
            if (oyaBn == null) {
                throw new OptLockError("error.cant.forbid");
            }
            Object entityBn = e.getEntityBn();
            if (entityBn == null) {
                throw new OptLockError("error.cant.forbid");
            }
            Object koBn = e.getKoBn();
            if (koBn == null) {
                throw new OptLockError("error.cant.forbid");
            }
            Object shisonBn = e.getShisonBn();
            if (shisonBn == null) {
                throw new OptLockError("error.cant.forbid");
            }

            Tb1Shison f = Tb1Shison.get(sosenId, oyaBn, entityBn, koBn, shisonBn);
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
