package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb7Seiyaku;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 制約マスタ否認
 *
 * @author emarfkrow
 */
public class Mb7SeiyakuForbidAction extends BaseAction {

    /** 制約マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object seiyakuId = postJson.get("seiyakuId");
        if (seiyakuId == null) {
            seiyakuId = postJson.get("Mb7Seiyaku.seiyakuId");
        }
        if (seiyakuId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Mb7Seiyaku e = FormValidator.toBean(Mb7Seiyaku.class.getName(), postJson);

        Mb7Seiyaku f = Mb7Seiyaku.get(e.getSeiyakuId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
