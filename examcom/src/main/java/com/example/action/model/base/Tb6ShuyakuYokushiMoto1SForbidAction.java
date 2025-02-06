package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb6ShuyakuYokushiMoto1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約抑止元１一覧承認
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiMoto1SForbidAction extends BaseAction {

    /** 集約抑止元１一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb6ShuyakuYokushiMoto1Grid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb6ShuyakuYokushiMoto1 e = FormValidator.toBean(Tb6ShuyakuYokushiMoto1.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object shuyakuYokushiMoto1Id = e.getShuyakuYokushiMoto1Id();
            if (shuyakuYokushiMoto1Id == null) {
                throw new OptLockError("error.cant.forbid");
            }

            Tb6ShuyakuYokushiMoto1 f = Tb6ShuyakuYokushiMoto1.get(shuyakuYokushiMoto1Id);
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
