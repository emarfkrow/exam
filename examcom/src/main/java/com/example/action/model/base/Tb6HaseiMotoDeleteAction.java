package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生元削除
 *
 * @author emarfkrow
 */
public class Tb6HaseiMotoDeleteAction extends BaseAction {

    /** 派生元削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object haseiMotoId = postJson.get("haseiMotoId");
        if (haseiMotoId == null) {
            haseiMotoId = postJson.get("Tb6HaseiMoto.haseiMotoId");
        }
        if (haseiMotoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6HaseiMoto e = FormValidator.toBean(Tb6HaseiMoto.class.getName(), postJson);

        java.util.List<com.example.entity.Tb6HaseiMotoDet> tb6HaseiMotoDets = e.referTb6HaseiMotoDets();
        if (tb6HaseiMotoDets != null) {
            for (com.example.entity.Tb6HaseiMotoDet tb6HaseiMotoDet : tb6HaseiMotoDets) {

                if (tb6HaseiMotoDet.delete() != 1) {
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
