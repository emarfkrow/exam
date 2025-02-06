package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiSakiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先明細削除
 *
 * @author emarfkrow
 */
public class Tb5TenseiSakiDetDeleteAction extends BaseAction {

    /** 転生先明細削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiSakiId = postJson.get("tenseiSakiId");
        if (tenseiSakiId == null) {
            tenseiSakiId = postJson.get("Tb5TenseiSakiDet.tenseiSakiId");
        }
        if (tenseiSakiId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object tenseiSakiBn = postJson.get("tenseiSakiBn");
        if (tenseiSakiBn == null) {
            tenseiSakiBn = postJson.get("Tb5TenseiSakiDet.tenseiSakiBn");
        }
        if (tenseiSakiBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5TenseiSakiDet e = FormValidator.toBean(Tb5TenseiSakiDet.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
