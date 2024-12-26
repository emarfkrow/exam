package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MsyKbn;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 区分マスタ一覧承認
 *
 * @author emarfkrow
 */
public class MsyKbnSForbidAction extends BaseAction {

    /** 区分マスタ一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("MsyKbnGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            MsyKbn e = FormValidator.toBean(MsyKbn.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object kbnNm = e.getKbnNm();
            if (kbnNm == null) {
                throw new OptLockError("error.cant.forbid");
            }

            java.util.List<com.example.entity.MsyKbnVal> msyKbnVals = e.referMsyKbnVals();
            if (msyKbnVals != null) {
                for (com.example.entity.MsyKbnVal msyKbnVal : msyKbnVals) {

                    msyKbnVal.setStatusKb(-1);
                    if (msyKbnVal.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.forbid");
                    }
                }
            }

            MsyKbn f = MsyKbn.get(kbnNm);
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
