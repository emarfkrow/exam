package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生明細削除
 *
 * @author emarfkrow
 */
public class Tb5TenseiDetDeleteAction extends BaseAction {

    /** 転生明細削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiId = postJson.get("tenseiId");
        if (tenseiId == null) {
            tenseiId = postJson.get("Tb5TenseiDet.tenseiId");
        }
        if (tenseiId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object tenseiBn = postJson.get("tenseiBn");
        if (tenseiBn == null) {
            tenseiBn = postJson.get("Tb5TenseiDet.tenseiBn");
        }
        if (tenseiBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb5TenseiDet e = FormValidator.toBean(Tb5TenseiDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
