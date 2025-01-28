package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb3Kyodai4;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 兄弟４一覧承認
 *
 * @author emarfkrow
 */
public class Tb3Kyodai4SForbidAction extends BaseAction {

    /** 兄弟４一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb3Kyodai4Grid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb3Kyodai4 e = FormValidator.toBean(Tb3Kyodai4.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object oyaId = e.getOyaId();
            if (oyaId == null) {
                throw new OptLockError("error.cant.forbid");
            }
            Object koBn = e.getKoBn();
            if (koBn == null) {
                throw new OptLockError("error.cant.forbid");
            }

            // child:Tb1Mago, parents:5

            Tb3Kyodai4 f = Tb3Kyodai4.get(oyaId, koBn);
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
