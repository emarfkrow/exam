package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4Id;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * IDマスタ削除
 *
 * @author emarfkrow
 */
public class Tb4IdDeleteAction extends BaseAction {

    /** IDマスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object idrefId = postJson.get("idrefId");
        if (idrefId == null) {
            idrefId = postJson.get("Tb4Id.idrefId");
        }
        if (idrefId == null) {
            throw new OptLockError("error.cant.delete", "IDマスタ");
        }

        Tb4Id e = FormValidator.toBean(Tb4Id.class.getName(), postJson);

        java.util.List<com.example.entity.Tb4Idbn> tb4Idbns = e.referTb4Idbns();
        if (tb4Idbns != null) {
            for (com.example.entity.Tb4Idbn tb4Idbn : tb4Idbns) {

                if (tb4Idbn.delete() != 1) {
                    throw new OptLockError("error.cant.delete", "ID-BNマスタ");
                }
            }
        }

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete", "IDマスタ");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
