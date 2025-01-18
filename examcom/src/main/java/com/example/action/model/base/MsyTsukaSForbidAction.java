package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MsyTsuka;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 通貨マスタ一覧承認
 *
 * @author emarfkrow
 */
public class MsyTsukaSForbidAction extends BaseAction {

    /** 通貨マスタ一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("MsyTsukaGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            MsyTsuka e = FormValidator.toBean(MsyTsuka.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object tsukaKb = e.getTsukaKb();
            if (tsukaKb == null) {
                throw new OptLockError("error.cant.forbid");
            }
            Object tekiyoBi = e.getTekiyoBi();
            if (tekiyoBi == null) {
                throw new OptLockError("error.cant.forbid");
            }

            MsyTsuka f = MsyTsuka.get(tsukaKb, tekiyoBi);
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
