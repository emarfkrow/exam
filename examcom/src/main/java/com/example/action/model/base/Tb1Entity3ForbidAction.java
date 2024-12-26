package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Entity3;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * エンティティ３否認
 *
 * @author emarfkrow
 */
public class Tb1Entity3ForbidAction extends BaseAction {

    /** エンティティ３否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Entity3.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Entity3.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Entity3.entityBn");
        }
        if (entityBn == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb1Entity3 e = FormValidator.toBean(Tb1Entity3.class.getName(), postJson);

        // child:Tb1Ko, parents:5

        // child:Tb1TenpuFile, parents:5

        Tb1Entity3 f = Tb1Entity3.get(e.getSosenId(), e.getOyaBn(), e.getEntityBn());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
