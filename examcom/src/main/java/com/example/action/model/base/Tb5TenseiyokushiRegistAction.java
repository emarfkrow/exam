package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseiyokushi;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生抑止登録
 *
 * @author emarfkrow
 */
public class Tb5TenseiyokushiRegistAction extends BaseAction {

    /** 転生抑止登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        Tb5Tenseiyokushi e = FormValidator.toBean(Tb5Tenseiyokushi.class.getName(), postJson);

        // 主キーが不足していたらINSERT
        boolean isNew = false;
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getTenseiyokushiId())) {
            isNew = true;
        }
        // 楽観ロック値がなくてもINSERT
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getUpdateTs())) {
            isNew = true;
        }

        e.setStatusKb(0);

        if (isNew) {

            if (e.insert(now, execId) != 1) {
                throw new OptLockError("error.cant.insert");
            }

            //集約の場合は、集約元に主キーを反映
            String summaryKey = postJson.get("Tb5Shuyakuyokushisaki1.shuyakuyokushisaki1Id").toString();
            if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(summaryKey)) {
                String[] summaryKeys = summaryKey.trim().split(",");
                for (String pk : summaryKeys) {
                    com.example.entity.Tb5Shuyakuyokushisaki1 tb5Shuyakuyokushisaki1 = com.example.entity.Tb5Shuyakuyokushisaki1.get(pk);
                    tb5Shuyakuyokushisaki1.setTenseiyokushiId(e.getTenseiyokushiId());
                    if (tb5Shuyakuyokushisaki1.update(now, execId) != 1) {
                        throw new OptLockError("error.cant.insert");
                    }
                }
            }

            map.put("INFO", Messages.get("info.insert"));

        } else {

            if (e.update(now, execId) == 1) {
                map.put("INFO", Messages.get("info.update"));
            } else if (e.insert(now, execId) == 1) {
                map.put("INFO", Messages.get("info.insert"));
            } else {
                throw new OptLockError("error.cant.update");
            }
        }

        return map;
    }

}
