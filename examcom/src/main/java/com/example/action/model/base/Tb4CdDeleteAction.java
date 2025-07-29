package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4Cd;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * CDマスタ削除
 *
 * @author emarfkrow
 */
public class Tb4CdDeleteAction extends BaseAction {

    /** CDマスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object cdrefCd = postJson.get("cdrefCd");
        if (cdrefCd == null) {
            cdrefCd = postJson.get("Tb4Cd.cdrefCd");
        }
        if (cdrefCd == null) {
            throw new OptLockError("error.cant.delete", "CDマスタ");
        }

        Tb4Cd e = FormValidator.toBean(Tb4Cd.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete", "CDマスタ");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
