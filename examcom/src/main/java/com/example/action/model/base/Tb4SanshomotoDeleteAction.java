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
 * 参照元削除
 *
 * @author emarfkrow
 */
public class Tb4SanshomotoDeleteAction extends BaseAction {

    /** 参照元削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sanshomotoId = postJson.get("sanshomotoId");
        if (sanshomotoId == null) {
            sanshomotoId = postJson.get("Tb4Sanshomoto.sanshomotoId");
        }
        if (sanshomotoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb4Sanshomoto e = FormValidator.toBean(Tb4Sanshomoto.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
