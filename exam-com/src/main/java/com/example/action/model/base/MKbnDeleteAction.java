package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MKbn;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 区分マスタ削除
 *
 * @author emarfkrow
 */
public class MKbnDeleteAction extends BaseAction {

    /** 区分マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kbnNm = postJson.get("kbnNm");
        if (kbnNm == null) {
            kbnNm = postJson.get("MKbn.kbnNm");
        }
        if (kbnNm == null) {
            throw new OptLockError("error.cant.delete");
        }

        MKbn e = FormValidator.toBean(MKbn.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
