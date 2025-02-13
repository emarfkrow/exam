package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb3RirekiMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 履歴元一覧承認
 *
 * @author emarfkrow
 */
public class Tb3RirekiMotoSPermitAction extends BaseAction {

    /** 履歴元一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb3RirekiMotoGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb3RirekiMoto e = FormValidator.toBean(Tb3RirekiMoto.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object rirekiMotoId = e.getRirekiMotoId();
            if (rirekiMotoId == null) {
                throw new OptLockError("error.cant.permit");
            }

            java.util.List<com.example.entity.Tb3Rireki> tb3Rirekis = e.referTb3Rirekis();
            if (tb3Rirekis != null) {
                for (com.example.entity.Tb3Rireki tb3Rireki : tb3Rirekis) {

                    tb3Rireki.setStatusKb(1);
                    if (tb3Rireki.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.permit");
                    }
                }
            }

            Tb3RirekiMoto f = Tb3RirekiMoto.get(rirekiMotoId);
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
