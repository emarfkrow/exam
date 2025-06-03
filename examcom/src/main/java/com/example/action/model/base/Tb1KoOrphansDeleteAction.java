package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1KoOrphans;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 孤児削除
 *
 * @author emarfkrow
 */
public class Tb1KoOrphansDeleteAction extends BaseAction {

    /** 孤児削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaId = postJson.get("oyaId");
        if (oyaId == null) {
            oyaId = postJson.get("Tb1KoOrphans.oyaId");
        }
        if (oyaId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object koBn = postJson.get("koBn");
        if (koBn == null) {
            koBn = postJson.get("Tb1KoOrphans.koBn");
        }
        if (koBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb1KoOrphans e = FormValidator.toBean(Tb1KoOrphans.class.getName(), postJson);

        // child:Tb1Mago, parents:2

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
