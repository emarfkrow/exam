package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseisaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先承認
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiPermitAction extends BaseAction {

    /** 転生先承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseisakiId = postJson.get("tenseisakiId");
        if (tenseisakiId == null) {
            tenseisakiId = postJson.get("Tb5Tenseisaki.tenseisakiId");
        }
        if (tenseisakiId == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb5Tenseisaki e = FormValidator.toBean(Tb5Tenseisaki.class.getName(), postJson);

        java.util.List<com.example.entity.Tb5TenseisakiDet> tb5TenseisakiDets = e.referTb5TenseisakiDets();
        if (tb5TenseisakiDets != null) {
            for (com.example.entity.Tb5TenseisakiDet tb5TenseisakiDet : tb5TenseisakiDets) {

                tb5TenseisakiDet.setStatusKb(1);
                if (tb5TenseisakiDet.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.permit");
                }
            }
        }

        Tb5Tenseisaki f = Tb5Tenseisaki.get(e.getTenseisakiId());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
