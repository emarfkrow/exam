package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生先１削除
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki1DeleteAction extends BaseAction {

    /** 派生先１削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object haseiSaki1Id = postJson.get("haseiSaki1Id");
        if (haseiSaki1Id == null) {
            haseiSaki1Id = postJson.get("Tb6HaseiSaki1.haseiSaki1Id");
        }
        if (haseiSaki1Id == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6HaseiSaki1 e = FormValidator.toBean(Tb6HaseiSaki1.class.getName(), postJson);

        java.util.List<com.example.entity.Tb6HaseiSaki1Det> tb6HaseiSaki1Dets = e.referTb6HaseiSaki1Dets();
        if (tb6HaseiSaki1Dets != null) {
            for (com.example.entity.Tb6HaseiSaki1Det tb6HaseiSaki1Det : tb6HaseiSaki1Dets) {

                if (tb6HaseiSaki1Det.delete() != 1) {
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
