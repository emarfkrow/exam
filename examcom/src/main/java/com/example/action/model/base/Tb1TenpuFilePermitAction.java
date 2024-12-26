package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1TenpuFile;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 添付ファイル承認
 *
 * @author emarfkrow
 */
public class Tb1TenpuFilePermitAction extends BaseAction {

    /** 添付ファイル承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1TenpuFile.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1TenpuFile.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1TenpuFile.entityBn");
        }
        if (entityBn == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object tenpuFileBn = postJson.get("tenpuFileBn");
        if (tenpuFileBn == null) {
            tenpuFileBn = postJson.get("Tb1TenpuFile.tenpuFileBn");
        }
        if (tenpuFileBn == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb1TenpuFile e = FormValidator.toBean(Tb1TenpuFile.class.getName(), postJson);

        Tb1TenpuFile f = Tb1TenpuFile.get(e.getSosenId(), e.getOyaBn(), e.getEntityBn(), e.getTenpuFileBn());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
