package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb4Id;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * IDマスタ一覧削除
 *
 * @author emarfkrow
 */
public class Tb4IdSDeleteAction extends BaseAction {

    /** IDマスタ一覧削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb4IdGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            // 主キーが不足していたらエラー
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(gridRow.get("IDREF_ID"))) {
                throw new OptLockError("error.cant.delete");
            }

            Tb4Id e = FormValidator.toBean(Tb4Id.class.getName(), gridRow);

            java.util.List<com.example.entity.Tb4Idbn> tb4Idbns = e.referTb4Idbns();
            if (tb4Idbns != null) {
                for (com.example.entity.Tb4Idbn tb4Idbn : tb4Idbns) {

                    if (tb4Idbn.delete() != 1) {
                        throw new OptLockError("error.cant.delete");
                    }
                }
            }

            if (e.delete() != 1) {
                throw new OptLockError("error.cant.delete");
            }
            ++count;
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
