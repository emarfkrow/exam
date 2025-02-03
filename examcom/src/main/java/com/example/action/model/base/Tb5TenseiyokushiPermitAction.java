package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseiyokushi;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生抑止承認
 *
 * @author emarfkrow
 */
public class Tb5TenseiyokushiPermitAction extends BaseAction {

    /** 転生抑止承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiyokushiId = postJson.get("tenseiyokushiId");
        if (tenseiyokushiId == null) {
            tenseiyokushiId = postJson.get("Tb5Tenseiyokushi.tenseiyokushiId");
        }
        if (tenseiyokushiId == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb5Tenseiyokushi e = FormValidator.toBean(Tb5Tenseiyokushi.class.getName(), postJson);

        Tb5Tenseiyokushi f = Tb5Tenseiyokushi.get(e.getTenseiyokushiId());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
