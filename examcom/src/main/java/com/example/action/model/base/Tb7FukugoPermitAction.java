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
 * 複合承認
 *
 * @author emarfkrow
 */
public class Tb7FukugoPermitAction extends BaseAction {

    /** 複合承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sansho1Id = postJson.get("sansho1Id");
        if (sansho1Id == null) {
            sansho1Id = postJson.get("Tb7Fukugo.sansho1Id");
        }
        if (sansho1Id == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object sansho2Id = postJson.get("sansho2Id");
        if (sansho2Id == null) {
            sansho2Id = postJson.get("Tb7Fukugo.sansho2Id");
        }
        if (sansho2Id == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("Tb7Fukugo.tekiyoBi");
        }
        if (tekiyoBi == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb7Fukugo e = FormValidator.toBean(Tb7Fukugo.class.getName(), postJson);

        Tb7Fukugo f = Tb7Fukugo.get(e.getSansho1Id(), e.getSansho2Id(), e.getTekiyoBi());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
