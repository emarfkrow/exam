package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MSansho3;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照３マスタ削除
 *
 * @author emarfkrow
 */
public class MSansho3DeleteAction extends BaseAction {

    /** 参照３マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sansho3No = postJson.get("sansho3No");
        if (sansho3No == null) {
            sansho3No = postJson.get("MSansho3.sansho3No");
        }
        if (sansho3No == null) {
            throw new OptLockError("error.cant.delete");
        }

        MSansho3 e = FormValidator.toBean(MSansho3.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
