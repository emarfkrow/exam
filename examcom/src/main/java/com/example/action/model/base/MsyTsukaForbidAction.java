package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MsyTsuka;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 通貨マスタ否認
 *
 * @author emarfkrow
 */
public class MsyTsukaForbidAction extends BaseAction {

    /** 通貨マスタ否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tsukaKb = postJson.get("tsukaKb");
        if (tsukaKb == null) {
            tsukaKb = postJson.get("MsyTsuka.tsukaKb");
        }
        if (tsukaKb == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object tekiyoBi = postJson.get("tekiyoBi");
        if (tekiyoBi == null) {
            tekiyoBi = postJson.get("MsyTsuka.tekiyoBi");
        }
        if (tekiyoBi == null) {
            throw new OptLockError("error.cant.forbid");
        }

        MsyTsuka e = FormValidator.toBean(MsyTsuka.class.getName(), postJson);

        MsyTsuka f = MsyTsuka.get(e.getTsukaKb(), e.getTekiyoBi());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
