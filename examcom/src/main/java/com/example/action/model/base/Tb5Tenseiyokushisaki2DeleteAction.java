package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseiyokushisaki2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生抑止先２削除
 *
 * @author emarfkrow
 */
public class Tb5Tenseiyokushisaki2DeleteAction extends BaseAction {

    /** 転生抑止先２削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiyokushisaki2Id = postJson.get("tenseiyokushisaki2Id");
        if (tenseiyokushisaki2Id == null) {
            tenseiyokushisaki2Id = postJson.get("Tb5Tenseiyokushisaki2.tenseiyokushisaki2Id");
        }
        if (tenseiyokushisaki2Id == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5Tenseiyokushisaki2 e = FormValidator.toBean(Tb5Tenseiyokushisaki2.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
