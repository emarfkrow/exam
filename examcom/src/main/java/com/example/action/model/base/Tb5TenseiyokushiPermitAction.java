package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiYokushi;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生抑止承認
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiPermitAction extends BaseAction {

    /** 転生抑止承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiYokushiId = postJson.get("tenseiYokushiId");
        if (tenseiYokushiId == null) {
            tenseiYokushiId = postJson.get("Tb5TenseiYokushi.tenseiYokushiId");
        }
        if (tenseiYokushiId == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb5TenseiYokushi e = FormValidator.toBean(Tb5TenseiYokushi.class.getName(), postJson);

        Tb5TenseiYokushi f = Tb5TenseiYokushi.get(e.getTenseiYokushiId());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
