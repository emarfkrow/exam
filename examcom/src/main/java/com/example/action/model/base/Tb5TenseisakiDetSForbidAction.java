package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb5TenseiSakiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先明細一覧承認
 *
 * @author emarfkrow
 */
public class Tb5TenseiSakiDetSForbidAction extends BaseAction {

    /** 転生先明細一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb5TenseiSakiDetGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb5TenseiSakiDet e = FormValidator.toBean(Tb5TenseiSakiDet.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object tenseiSakiId = e.getTenseiSakiId();
            if (tenseiSakiId == null) {
                throw new OptLockError("error.cant.forbid");
            }
            Object tenseiSakiBn = e.getTenseiSakiBn();
            if (tenseiSakiBn == null) {
                throw new OptLockError("error.cant.forbid");
            }

            Tb5TenseiSakiDet f = Tb5TenseiSakiDet.get(tenseiSakiId, tenseiSakiBn);
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
