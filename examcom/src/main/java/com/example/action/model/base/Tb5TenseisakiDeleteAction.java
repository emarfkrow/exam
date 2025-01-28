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
 * 転生先削除
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiDeleteAction extends BaseAction {

    /** 転生先削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseisakiId = postJson.get("tenseisakiId");
        if (tenseisakiId == null) {
            tenseisakiId = postJson.get("Tb5Tenseisaki.tenseisakiId");
        }
        if (tenseisakiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5Tenseisaki e = FormValidator.toBean(Tb5Tenseisaki.class.getName(), postJson);

        java.util.List<com.example.entity.Tb5TenseisakiDet> tb5TenseisakiDets = e.referTb5TenseisakiDets();
        if (tb5TenseisakiDets != null) {
            for (com.example.entity.Tb5TenseisakiDet tb5TenseisakiDet : tb5TenseisakiDets) {

                if (tb5TenseisakiDet.delete() != 1) {
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
