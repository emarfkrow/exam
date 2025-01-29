package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7Fukugo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 複合削除
 *
 * @author emarfkrow
 */
public class Tb7FukugoDeleteAction extends BaseAction {

    /** 複合削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sanshoId = postJson.get("sanshoId");
        if (sanshoId == null) {
            sanshoId = postJson.get("Tb7Fukugo.sanshoId");
        }
        if (sanshoId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object seiyakuId = postJson.get("seiyakuId");
        if (seiyakuId == null) {
            seiyakuId = postJson.get("Tb7Fukugo.seiyakuId");
        }
        if (seiyakuId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("Tb7Fukugo.tekiyoBi");
        }
        if (tekiyoBi == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb7Fukugo e = FormValidator.toBean(Tb7Fukugo.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
