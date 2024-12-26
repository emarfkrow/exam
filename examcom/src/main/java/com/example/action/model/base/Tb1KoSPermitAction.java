package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb1Ko;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子一覧承認
 *
 * @author emarfkrow
 */
public class Tb1KoSPermitAction extends BaseAction {

    /** 子一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb1KoGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb1Ko e = FormValidator.toBean(Tb1Ko.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object sosenId = e.getSosenId();
            if (sosenId == null) {
                throw new OptLockError("error.cant.permit");
            }
            Object oyaBn = e.getOyaBn();
            if (oyaBn == null) {
                throw new OptLockError("error.cant.permit");
            }
            Object entityBn = e.getEntityBn();
            if (entityBn == null) {
                throw new OptLockError("error.cant.permit");
            }
            Object koBn = e.getKoBn();
            if (koBn == null) {
                throw new OptLockError("error.cant.permit");
            }

            java.util.List<com.example.entity.Tb1Shison> tb1Shisons = e.referTb1Shisons();
            if (tb1Shisons != null) {
                for (com.example.entity.Tb1Shison tb1Shison : tb1Shisons) {

                    tb1Shison.setStatusKb(1);
                    if (tb1Shison.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.permit");
                    }
                }
            }

            Tb1Ko f = Tb1Ko.get(sosenId, oyaBn, entityBn, koBn);
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
