package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生元削除
 *
 * @author emarfkrow
 */
public class Tb5TenseiMotoDeleteAction extends BaseAction {

    /** 転生元削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiMotoId = postJson.get("tenseiMotoId");
        if (tenseiMotoId == null) {
            tenseiMotoId = postJson.get("Tb5TenseiMoto.tenseiMotoId");
        }
        if (tenseiMotoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5TenseiMoto e = FormValidator.toBean(Tb5TenseiMoto.class.getName(), postJson);

        java.util.List<com.example.entity.Tb5TenseiMotoDet> tb5TenseiMotoDets = e.referTb5TenseiMotoDets();
        if (tb5TenseiMotoDets != null) {
            for (com.example.entity.Tb5TenseiMotoDet tb5TenseiMotoDet : tb5TenseiMotoDets) {

                if (tb5TenseiMotoDet.delete() != 1) {
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
