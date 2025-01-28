package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb3Kyodai5;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 兄弟５一覧承認
 *
 * @author emarfkrow
 */
public class Tb3Kyodai5SPermitAction extends BaseAction {

    /** 兄弟５一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb3Kyodai5Grid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb3Kyodai5 e = FormValidator.toBean(Tb3Kyodai5.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object oyaId = e.getOyaId();
            if (oyaId == null) {
                throw new OptLockError("error.cant.permit");
            }
            Object koBn = e.getKoBn();
            if (koBn == null) {
                throw new OptLockError("error.cant.permit");
            }

            // child:Tb1Mago, parents:5

            Tb3Kyodai5 f = Tb3Kyodai5.get(oyaId, koBn);
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
