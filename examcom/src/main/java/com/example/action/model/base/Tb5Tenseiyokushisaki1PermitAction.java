package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseiyokushisaki1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生抑止先１承認
 *
 * @author emarfkrow
 */
public class Tb5Tenseiyokushisaki1PermitAction extends BaseAction {

    /** 転生抑止先１承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiyokushisaki1Id = postJson.get("tenseiyokushisaki1Id");
        if (tenseiyokushisaki1Id == null) {
            tenseiyokushisaki1Id = postJson.get("Tb5Tenseiyokushisaki1.tenseiyokushisaki1Id");
        }
        if (tenseiyokushisaki1Id == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb5Tenseiyokushisaki1 e = FormValidator.toBean(Tb5Tenseiyokushisaki1.class.getName(), postJson);

        Tb5Tenseiyokushisaki1 f = Tb5Tenseiyokushisaki1.get(e.getTenseiyokushisaki1Id());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
