package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先否認
 *
 * @author emarfkrow
 */
public class Tb5TenseiSakiForbidAction extends BaseAction {

    /** 転生先否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiSakiId = postJson.get("tenseiSakiId");
        if (tenseiSakiId == null) {
            tenseiSakiId = postJson.get("Tb5TenseiSaki.tenseiSakiId");
        }
        if (tenseiSakiId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5TenseiSaki e = FormValidator.toBean(Tb5TenseiSaki.class.getName(), postJson);

        java.util.List<com.example.entity.Tb5TenseiSakiDet> tb5TenseiSakiDets = e.referTb5TenseiSakiDets();
        if (tb5TenseiSakiDets != null) {
            for (com.example.entity.Tb5TenseiSakiDet tb5TenseiSakiDet : tb5TenseiSakiDets) {

                tb5TenseiSakiDet.setStatusKb(-1);
                if (tb5TenseiSakiDet.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        Tb5TenseiSaki f = Tb5TenseiSaki.get(e.getTenseiSakiId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
