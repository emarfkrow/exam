package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseimoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生元削除
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoDeleteAction extends BaseAction {

    /** 転生元削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseimotoId = postJson.get("tenseimotoId");
        if (tenseimotoId == null) {
            tenseimotoId = postJson.get("Tb5Tenseimoto.tenseimotoId");
        }
        if (tenseimotoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5Tenseimoto e = FormValidator.toBean(Tb5Tenseimoto.class.getName(), postJson);

        java.util.List<com.example.entity.Tb5TenseimotoDet> tb5TenseimotoDets = e.referTb5TenseimotoDets();
        if (tb5TenseimotoDets != null) {
            for (com.example.entity.Tb5TenseimotoDet tb5TenseimotoDet : tb5TenseimotoDets) {

                if (tb5TenseimotoDet.delete() != 1) {
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
