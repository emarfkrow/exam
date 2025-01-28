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
        Object sansho1Id = postJson.get("sansho1Id");
        if (sansho1Id == null) {
            sansho1Id = postJson.get("Tb7Fukugo.sansho1Id");
        }
        if (sansho1Id == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object sansho2Id = postJson.get("sansho2Id");
        if (sansho2Id == null) {
            sansho2Id = postJson.get("Tb7Fukugo.sansho2Id");
        }
        if (sansho2Id == null) {
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
