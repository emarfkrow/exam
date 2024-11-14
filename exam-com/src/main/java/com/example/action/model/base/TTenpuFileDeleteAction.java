package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TTenpuFile;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 添付ファイル削除
 *
 * @author emarfkrow
 */
public class TTenpuFileDeleteAction extends BaseAction {

    /** 添付ファイル削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TTenpuFile.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TTenpuFile.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TTenpuFile.entityBn");
        }
        if (entityBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object tenpuFileBn = postJson.get("tenpuFileBn");
        if (tenpuFileBn == null) {
            tenpuFileBn = postJson.get("TTenpuFile.tenpuFileBn");
        }
        if (tenpuFileBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        TTenpuFile e = FormValidator.toBean(TTenpuFile.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
