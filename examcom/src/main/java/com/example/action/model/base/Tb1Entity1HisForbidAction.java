package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Entity1His;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * エンティティ１履歴否認
 *
 * @author emarfkrow
 */
public class Tb1Entity1HisForbidAction extends BaseAction {

    /** エンティティ１履歴否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Entity1His.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Entity1His.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Entity1His.entityBn");
        }
        if (entityBn == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object historyBn = postJson.get("historyBn");
        if (historyBn == null) {
            historyBn = postJson.get("Tb1Entity1His.historyBn");
        }
        if (historyBn == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb1Entity1His e = FormValidator.toBean(Tb1Entity1His.class.getName(), postJson);

        Tb1Entity1His f = Tb1Entity1His.get(e.getSosenId(), e.getOyaBn(), e.getEntityBn(), e.getHistoryBn());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
