package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Oya;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 親削除
 *
 * @author emarfkrow
 */
public class Tb1OyaDeleteAction extends BaseAction {

    /** 親削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1Oya.oyaId");
        }
        if (oyaId == null) {
            throw new OptLockError("error.cant.delete", "親");
        }

        Tb1Oya e = FormValidator.toBean(Tb1Oya.class.getName(), postJson);

        java.util.List<com.example.entity.Tb1Ko> tb1Kos = e.referTb1Kos();
        if (tb1Kos != null) {
            for (com.example.entity.Tb1Ko tb1Ko : tb1Kos) {

                // child:Tb1Mago, parents:2


                if (tb1Ko.delete() != 1) {
                    throw new OptLockError("error.cant.delete", "子");
                }
            }
        }


        java.util.List<com.example.entity.Tb1KoDinks> tb1KoDinkss = e.referTb1KoDinkss();
        if (tb1KoDinkss != null) {
            for (com.example.entity.Tb1KoDinks tb1KoDinks : tb1KoDinkss) {

                if (tb1KoDinks.delete() != 1) {
                    throw new OptLockError("error.cant.delete", "子なし");
                }
            }
        }

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete", "親");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
