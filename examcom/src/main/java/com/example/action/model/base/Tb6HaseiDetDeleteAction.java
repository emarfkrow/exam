package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生明細削除
 *
 * @author emarfkrow
 */
public class Tb6HaseiDetDeleteAction extends BaseAction {

    /** 派生明細削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object haseiId = postJson.get("haseiId");
        if (haseiId == null) {
            haseiId = postJson.get("Tb6HaseiDet.haseiId");
        }
        if (haseiId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object haseiBn = postJson.get("haseiBn");
        if (haseiBn == null) {
            haseiBn = postJson.get("Tb6HaseiDet.haseiBn");
        }
        if (haseiBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6HaseiDet e = FormValidator.toBean(Tb6HaseiDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
