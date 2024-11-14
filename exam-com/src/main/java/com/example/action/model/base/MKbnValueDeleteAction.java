package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MKbnValue;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 区分値マスタ削除
 *
 * @author emarfkrow
 */
public class MKbnValueDeleteAction extends BaseAction {

    /** 区分値マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kbnNm = postJson.get("kbnNm");
        if (kbnNm == null) {
            kbnNm = postJson.get("MKbnValue.kbnNm");
        }
        if (kbnNm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object kbnKb = postJson.get("kbnKb");
        if (kbnKb == null) {
            kbnKb = postJson.get("MKbnValue.kbnKb");
        }
        if (kbnKb == null) {
            throw new OptLockError("error.cant.delete");
        }

        MKbnValue e = FormValidator.toBean(MKbnValue.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
