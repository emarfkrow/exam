package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb1Sosen;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 祖先一覧削除
 *
 * @author emarfkrow
 */
public class Tb1SosenSDeleteAction extends BaseAction {

    /** 祖先一覧削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb1SosenGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            // 主キーが不足していたらエラー
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("SOSEN_ID"))) {
                throw new OptLockError("error.cant.delete");
            }

            Tb1Sosen e = FormValidator.toBean(Tb1Sosen.class.getName(), gridRow);

            java.util.List<com.example.entity.Tb1Oya> tb1Oyas = e.referTb1Oyas();
            if (tb1Oyas != null) {
                for (com.example.entity.Tb1Oya tb1Oya : tb1Oyas) {

                java.util.List<com.example.entity.Tb1Entity1> tb1Entity1s = tb1Oya.referTb1Entity1s();
                if (tb1Entity1s != null) {
                    for (com.example.entity.Tb1Entity1 tb1Entity1 : tb1Entity1s) {

                        // child:tb1_ko, parents:5

                        // child:tb1_tenpu_file, parents:5

                        if (tb1Entity1.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                java.util.List<com.example.entity.Tb1Entity2> tb1Entity2s = tb1Oya.referTb1Entity2s();
                if (tb1Entity2s != null) {
                    for (com.example.entity.Tb1Entity2 tb1Entity2 : tb1Entity2s) {

                        // child:tb1_ko, parents:5

                        // child:tb1_tenpu_file, parents:5

                        if (tb1Entity2.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                java.util.List<com.example.entity.Tb1Entity3> tb1Entity3s = tb1Oya.referTb1Entity3s();
                if (tb1Entity3s != null) {
                    for (com.example.entity.Tb1Entity3 tb1Entity3 : tb1Entity3s) {

                        // child:tb1_ko, parents:5

                        // child:tb1_tenpu_file, parents:5

                        if (tb1Entity3.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                java.util.List<com.example.entity.Tb1Entity4> tb1Entity4s = tb1Oya.referTb1Entity4s();
                if (tb1Entity4s != null) {
                    for (com.example.entity.Tb1Entity4 tb1Entity4 : tb1Entity4s) {

                        // child:tb1_ko, parents:5

                        // child:tb1_tenpu_file, parents:5

                        if (tb1Entity4.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                java.util.List<com.example.entity.Tb1Entity5> tb1Entity5s = tb1Oya.referTb1Entity5s();
                if (tb1Entity5s != null) {
                    for (com.example.entity.Tb1Entity5 tb1Entity5 : tb1Entity5s) {

                        // child:tb1_ko, parents:5

                        // child:tb1_tenpu_file, parents:5

                        if (tb1Entity5.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                    if (tb1Oya.delete() != 1) {
                        throw new OptLockError("error.cant.delete");
                    }
                }
            }

            if (e.delete() != 1) {
                throw new OptLockError("error.cant.delete");
            }
        }

        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
