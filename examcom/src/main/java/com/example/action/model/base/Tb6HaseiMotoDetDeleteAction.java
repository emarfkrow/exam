package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiMotoDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生元明細削除
 *
 * @author emarfkrow
 */
public class Tb6HaseiMotoDetDeleteAction extends BaseAction {

    /** 派生元明細削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object haseiMotoId = postJson.get("haseiMotoId");
        if (haseiMotoId == null) {
            haseiMotoId = postJson.get("Tb6HaseiMotoDet.haseiMotoId");
        }
        if (haseiMotoId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object haseiMotoBn = postJson.get("haseiMotoBn");
        if (haseiMotoBn == null) {
            haseiMotoBn = postJson.get("Tb6HaseiMotoDet.haseiMotoBn");
        }
        if (haseiMotoBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6HaseiMotoDet e = FormValidator.toBean(Tb6HaseiMotoDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
