package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Derive1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生１削除
 *
 * @author emarfkrow
 */
public class Tb6Derive1DeleteAction extends BaseAction {

    /** 派生１削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object derive1Id = postJson.get("derive1Id");
        if (derive1Id == null) {
            derive1Id = postJson.get("Tb6Derive1.derive1Id");
        }
        if (derive1Id == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6Derive1 e = FormValidator.toBean(Tb6Derive1.class.getName(), postJson);

        java.util.List<com.example.entity.Tb6Derive1Det> tb6Derive1Dets = e.referTb6Derive1Dets();
        if (tb6Derive1Dets != null) {
            for (com.example.entity.Tb6Derive1Det tb6Derive1Det : tb6Derive1Dets) {

                if (tb6Derive1Det.delete() != 1) {
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
