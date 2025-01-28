package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb7Fukugo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 複合一覧承認
 *
 * @author emarfkrow
 */
public class Tb7FukugoSPermitAction extends BaseAction {

    /** 複合一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb7FukugoGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb7Fukugo e = FormValidator.toBean(Tb7Fukugo.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object sansho1Id = e.getSansho1Id();
            if (sansho1Id == null) {
                throw new OptLockError("error.cant.permit");
            }
            Object sansho2Id = e.getSansho2Id();
            if (sansho2Id == null) {
                throw new OptLockError("error.cant.permit");
            }
            Object tekiyoBi = e.getTekiyoBi();
            if (tekiyoBi == null) {
                throw new OptLockError("error.cant.permit");
            }

            Tb7Fukugo f = Tb7Fukugo.get(sansho1Id, sansho2Id, tekiyoBi);
            f.setStatusKb(1);
            if (f.update(now, execId) != 1) {
                throw new OptLockError("error.cant.permit");
            }
            ++count;
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
