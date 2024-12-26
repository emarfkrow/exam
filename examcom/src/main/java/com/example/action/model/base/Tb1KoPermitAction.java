package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Ko;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子承認
 *
 * @author emarfkrow
 */
public class Tb1KoPermitAction extends BaseAction {

    /** 子承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Ko.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Ko.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Ko.entityBn");
        }
        if (entityBn == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1Ko.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb1Ko e = FormValidator.toBean(Tb1Ko.class.getName(), postJson);

        java.util.List<com.example.entity.Tb1Shison> tb1Shisons = e.referTb1Shisons();
        if (tb1Shisons != null) {
            for (com.example.entity.Tb1Shison tb1Shison : tb1Shisons) {

                tb1Shison.setStatusKb(1);
                if (tb1Shison.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.permit");
                }
            }
        }

        Tb1Ko f = Tb1Ko.get(e.getSosenId(), e.getOyaBn(), e.getEntityBn(), e.getKoBn());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
