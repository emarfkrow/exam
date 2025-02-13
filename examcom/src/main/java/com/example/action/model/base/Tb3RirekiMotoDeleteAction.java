package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3RirekiMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 履歴元削除
 *
 * @author emarfkrow
 */
public class Tb3RirekiMotoDeleteAction extends BaseAction {

    /** 履歴元削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object rirekiMotoId = postJson.get("rirekiMotoId");
        if (rirekiMotoId == null) {
            rirekiMotoId = postJson.get("Tb3RirekiMoto.rirekiMotoId");
        }
        if (rirekiMotoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb3RirekiMoto e = FormValidator.toBean(Tb3RirekiMoto.class.getName(), postJson);

        java.util.List<com.example.entity.Tb3Rireki> tb3Rirekis = e.referTb3Rirekis();
        if (tb3Rirekis != null) {
            for (com.example.entity.Tb3Rireki tb3Rireki : tb3Rirekis) {

                if (tb3Rireki.delete() != 1) {
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
