package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Tensei;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生否認
 *
 * @author emarfkrow
 */
public class Tb1TenseiForbidAction extends BaseAction {

    /** 転生否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiId = postJson.get("tenseiId");
        if (tenseiId == null) {
            tenseiId = postJson.get("Tb1Tensei.tenseiId");
        }
        if (tenseiId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb1Tensei e = FormValidator.toBean(Tb1Tensei.class.getName(), postJson);

        java.util.List<com.example.entity.Tb1TenseiDet> tb1TenseiDets = e.referTb1TenseiDets();
        if (tb1TenseiDets != null) {
            for (com.example.entity.Tb1TenseiDet tb1TenseiDet : tb1TenseiDets) {

                tb1TenseiDet.setStatusKb(-1);
                if (tb1TenseiDet.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        Tb1Tensei f = Tb1Tensei.get(e.getTenseiId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
