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
 * NO参照マスタ削除
 *
 * @author emarfkrow
 */
public class Mb4NosanshoDeleteAction extends BaseAction {

    /** NO参照マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object norefNo = postJson.get("norefNo");
        if (norefNo == null) {
            norefNo = postJson.get("Mb4Nosansho.norefNo");
        }
        if (norefNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        Mb4Nosansho e = FormValidator.toBean(Mb4Nosansho.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
