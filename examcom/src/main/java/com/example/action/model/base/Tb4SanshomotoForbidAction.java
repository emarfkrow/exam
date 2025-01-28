package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4Sanshomoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照元否認
 *
 * @author emarfkrow
 */
public class Tb4SanshomotoForbidAction extends BaseAction {

    /** 参照元否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sanshomotoId = postJson.get("sanshomotoId");
        if (sanshomotoId == null) {
            sanshomotoId = postJson.get("Tb4Sanshomoto.sanshomotoId");
        }
        if (sanshomotoId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb4Sanshomoto e = FormValidator.toBean(Tb4Sanshomoto.class.getName(), postJson);

        Tb4Sanshomoto f = Tb4Sanshomoto.get(e.getSanshomotoId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
