package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb1Oya;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 親一覧削除
 *
 * @author emarfkrow
 */
public class Tb1OyaSDeleteAction extends BaseAction {

    /** 親一覧削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb1OyaGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            // 主キーが不足していたらエラー
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("SOSEN_ID"))) {
                throw new OptLockError("error.cant.delete");
            }
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("OYA_BN"))) {
                throw new OptLockError("error.cant.delete");
            }

            Tb1Oya e = FormValidator.toBean(Tb1Oya.class.getName(), gridRow);

            java.util.List<com.example.entity.Tb1Entity1> tb1Entity1s = e.referTb1Entity1s();
            if (tb1Entity1s != null) {
                for (com.example.entity.Tb1Entity1 tb1Entity1 : tb1Entity1s) {

                    // child:TB1_KO, parents:5

                    // child:TB1_TENPU_FILE, parents:5

                    if (tb1Entity1.delete() != 1) {
                        throw new OptLockError("error.cant.delete");
                    }
                }
            }

            java.util.List<com.example.entity.Tb1Entity2> tb1Entity2s = e.referTb1Entity2s();
            if (tb1Entity2s != null) {
                for (com.example.entity.Tb1Entity2 tb1Entity2 : tb1Entity2s) {

                    // child:TB1_KO, parents:5

                    // child:TB1_TENPU_FILE, parents:5

                    if (tb1Entity2.delete() != 1) {
                        throw new OptLockError("error.cant.delete");
                    }
                }
            }

            java.util.List<com.example.entity.Tb1Entity3> tb1Entity3s = e.referTb1Entity3s();
            if (tb1Entity3s != null) {
                for (com.example.entity.Tb1Entity3 tb1Entity3 : tb1Entity3s) {

                    // child:TB1_KO, parents:5

                    // child:TB1_TENPU_FILE, parents:5

                    if (tb1Entity3.delete() != 1) {
                        throw new OptLockError("error.cant.delete");
                    }
                }
            }

            java.util.List<com.example.entity.Tb1Entity4> tb1Entity4s = e.referTb1Entity4s();
            if (tb1Entity4s != null) {
                for (com.example.entity.Tb1Entity4 tb1Entity4 : tb1Entity4s) {

                    // child:TB1_KO, parents:5

                    // child:TB1_TENPU_FILE, parents:5

                    if (tb1Entity4.delete() != 1) {
                        throw new OptLockError("error.cant.delete");
                    }
                }
            }

            java.util.List<com.example.entity.Tb1Entity5> tb1Entity5s = e.referTb1Entity5s();
            if (tb1Entity5s != null) {
                for (com.example.entity.Tb1Entity5 tb1Entity5 : tb1Entity5s) {

                    // child:TB1_KO, parents:5

                    // child:TB1_TENPU_FILE, parents:5

                    if (tb1Entity5.delete() != 1) {
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
