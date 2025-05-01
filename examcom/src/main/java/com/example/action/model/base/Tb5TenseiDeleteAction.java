package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tensei;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生削除
 *
 * @author emarfkrow
 */
public class Tb5TenseiDeleteAction extends BaseAction {

    /** 転生削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiId = postJson.get("tenseiId");
        if (tenseiId == null) {
            tenseiId = postJson.get("Tb5Tensei.tenseiId");
        }
        if (tenseiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5Tensei e = FormValidator.toBean(Tb5Tensei.class.getName(), postJson);

        java.util.List<com.example.entity.Tb5TenseiDet> tb5TenseiDets = e.referTb5TenseiDets();
        if (tb5TenseiDets != null) {
            for (com.example.entity.Tb5TenseiDet tb5TenseiDet : tb5TenseiDets) {

                if (tb5TenseiDet.delete() != 1) {
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
