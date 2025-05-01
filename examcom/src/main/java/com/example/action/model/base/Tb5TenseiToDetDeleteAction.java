package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiToDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先明細削除
 *
 * @author emarfkrow
 */
public class Tb5TenseiToDetDeleteAction extends BaseAction {

    /** 転生先明細削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiToId = postJson.get("tenseiToId");
        if (tenseiToId == null) {
            tenseiToId = postJson.get("Tb5TenseiToDet.tenseiToId");
        }
        if (tenseiToId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object tenseiToBn = postJson.get("tenseiToBn");
        if (tenseiToBn == null) {
            tenseiToBn = postJson.get("Tb5TenseiToDet.tenseiToBn");
        }
        if (tenseiToBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5TenseiToDet e = FormValidator.toBean(Tb5TenseiToDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
