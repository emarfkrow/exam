package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiTo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先削除
 *
 * @author emarfkrow
 */
public class Tb5TenseiToDeleteAction extends BaseAction {

    /** 転生先削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiToId = postJson.get("tenseiToId");
        if (tenseiToId == null) {
            tenseiToId = postJson.get("Tb5TenseiTo.tenseiToId");
        }
        if (tenseiToId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5TenseiTo e = FormValidator.toBean(Tb5TenseiTo.class.getName(), postJson);

        java.util.List<com.example.entity.Tb5TenseiToDet> tb5TenseiToDets = e.referTb5TenseiToDets();
        if (tb5TenseiToDets != null) {
            for (com.example.entity.Tb5TenseiToDet tb5TenseiToDet : tb5TenseiToDets) {

                if (tb5TenseiToDet.delete() != 1) {
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
