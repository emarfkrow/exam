package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Mb4Cdsansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * CD参照マスタ一覧承認
 *
 * @author emarfkrow
 */
public class Mb4CdsanshoSPermitAction extends BaseAction {

    /** CD参照マスタ一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Mb4CdsanshoGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Mb4Cdsansho e = FormValidator.toBean(Mb4Cdsansho.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object cdsanshoCd = e.getCdsanshoCd();
            if (cdsanshoCd == null) {
                throw new OptLockError("error.cant.permit");
            }

            Mb4Cdsansho f = Mb4Cdsansho.get(cdsanshoCd);
            f.setStatusKb(1);
            if (f.update(now, execId) != 1) {
                throw new OptLockError("error.cant.permit");
            }
            ++count;
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
