package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb5Tenseisaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先一覧削除
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiSDeleteAction extends BaseAction {

    /** 転生先一覧削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb5TenseisakiGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            // 主キーが不足していたらエラー
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("TENSEISAKI_ID"))) {
                throw new OptLockError("error.cant.delete");
            }

            Tb5Tenseisaki e = FormValidator.toBean(Tb5Tenseisaki.class.getName(), gridRow);

            java.util.List<com.example.entity.Tb5TenseisakiDet> tb5TenseisakiDets = e.referTb5TenseisakiDets();
            if (tb5TenseisakiDets != null) {
                for (com.example.entity.Tb5TenseisakiDet tb5TenseisakiDet : tb5TenseisakiDets) {

                    if (tb5TenseisakiDet.delete() != 1) {
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
