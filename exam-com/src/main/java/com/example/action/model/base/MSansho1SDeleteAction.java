package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MSansho1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照１マスタ一覧削除
 *
 * @author emarfkrow
 */
public class MSansho1SDeleteAction extends BaseAction {

    /** 参照１マスタ一覧削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("MSansho1Grid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            // 主キーが不足していたらエラー
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("SANSHO1_ID"))) {
                throw new OptLockError("error.cant.delete");
            }

            MSansho1 e = FormValidator.toBean(MSansho1.class.getName(), gridRow);
            if (e.delete() != 1) {
                throw new OptLockError("error.cant.delete");
            }
        }

        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
