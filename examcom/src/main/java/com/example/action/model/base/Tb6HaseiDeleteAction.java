package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Hasei;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生削除
 *
 * @author emarfkrow
 */
public class Tb6HaseiDeleteAction extends BaseAction {

    /** 派生削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object haseiId = postJson.get("haseiId");
        if (haseiId == null) {
            haseiId = postJson.get("Tb6Hasei.haseiId");
        }
        if (haseiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6Hasei e = FormValidator.toBean(Tb6Hasei.class.getName(), postJson);

        java.util.List<com.example.entity.Tb6HaseiDet> tb6HaseiDets = e.referTb6HaseiDets();
        if (tb6HaseiDets != null) {
            for (com.example.entity.Tb6HaseiDet tb6HaseiDet : tb6HaseiDets) {

                if (tb6HaseiDet.delete() != 1) {
                    throw new OptLockError("error.cant.delete");
                }
            }
        }

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
