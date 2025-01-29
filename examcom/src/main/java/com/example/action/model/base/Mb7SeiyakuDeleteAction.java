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
 * 制約マスタ削除
 *
 * @author emarfkrow
 */
public class Mb7SeiyakuDeleteAction extends BaseAction {

    /** 制約マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object seiyakuId = postJson.get("seiyakuId");
        if (seiyakuId == null) {
            seiyakuId = postJson.get("Mb7Seiyaku.seiyakuId");
        }
        if (seiyakuId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Mb7Seiyaku e = FormValidator.toBean(Mb7Seiyaku.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
