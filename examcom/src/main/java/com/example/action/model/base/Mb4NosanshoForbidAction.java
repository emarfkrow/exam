package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Nosansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * NO参照マスタ否認
 *
 * @author emarfkrow
 */
public class Mb4NosanshoForbidAction extends BaseAction {

    /** NO参照マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object nosanshoNo = postJson.get("nosanshoNo");
        if (nosanshoNo == null) {
            nosanshoNo = postJson.get("Mb4Nosansho.nosanshoNo");
        }
        if (nosanshoNo == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Mb4Nosansho e = FormValidator.toBean(Mb4Nosansho.class.getName(), postJson);

        Mb4Nosansho f = Mb4Nosansho.get(e.getNosanshoNo());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
