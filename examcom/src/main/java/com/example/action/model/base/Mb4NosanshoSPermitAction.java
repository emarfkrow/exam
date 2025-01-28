package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Mb4Nosansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * NO参照マスタ一覧承認
 *
 * @author emarfkrow
 */
public class Mb4NosanshoSPermitAction extends BaseAction {

    /** NO参照マスタ一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Mb4NosanshoGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Mb4Nosansho e = FormValidator.toBean(Mb4Nosansho.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object nosanshoNo = e.getNosanshoNo();
            if (nosanshoNo == null) {
                throw new OptLockError("error.cant.permit");
            }

            Mb4Nosansho f = Mb4Nosansho.get(nosanshoNo);
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
