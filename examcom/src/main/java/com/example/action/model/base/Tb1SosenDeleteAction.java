package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Sosen;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 祖先削除
 *
 * @author emarfkrow
 */
public class Tb1SosenDeleteAction extends BaseAction {

    /** 祖先削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Sosen.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb1Sosen e = FormValidator.toBean(Tb1Sosen.class.getName(), postJson);

        java.util.List<com.example.entity.Tb1Oya> tb1Oyas = e.referTb1Oyas();
        if (tb1Oyas != null) {
            for (com.example.entity.Tb1Oya tb1Oya : tb1Oyas) {

                java.util.List<com.example.entity.Tb1Entity1> tb1Entity1s = tb1Oya.referTb1Entity1s();
                if (tb1Entity1s != null) {
                    for (com.example.entity.Tb1Entity1 tb1Entity1 : tb1Entity1s) {

                        // child:Tb1Ko, parents:5

                        // child:Tb1TenpuFile, parents:5

                        if (tb1Entity1.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                java.util.List<com.example.entity.Tb1Entity2> tb1Entity2s = tb1Oya.referTb1Entity2s();
                if (tb1Entity2s != null) {
                    for (com.example.entity.Tb1Entity2 tb1Entity2 : tb1Entity2s) {

                        // child:Tb1Ko, parents:5

                        // child:Tb1TenpuFile, parents:5

                        if (tb1Entity2.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                java.util.List<com.example.entity.Tb1Entity3> tb1Entity3s = tb1Oya.referTb1Entity3s();
                if (tb1Entity3s != null) {
                    for (com.example.entity.Tb1Entity3 tb1Entity3 : tb1Entity3s) {

                        // child:Tb1Ko, parents:5

                        // child:Tb1TenpuFile, parents:5

                        if (tb1Entity3.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                java.util.List<com.example.entity.Tb1Entity4> tb1Entity4s = tb1Oya.referTb1Entity4s();
                if (tb1Entity4s != null) {
                    for (com.example.entity.Tb1Entity4 tb1Entity4 : tb1Entity4s) {

                        // child:Tb1Ko, parents:5

                        // child:Tb1TenpuFile, parents:5

                        if (tb1Entity4.delete() != 1) {
                            throw new OptLockError("error.cant.delete");
                        }
                    }
                }

                java.util.List<com.example.entity.Tb1Entity5> tb1Entity5s = tb1Oya.referTb1Entity5s();
                if (tb1Entity5s != null) {
                    for (com.example.entity.Tb1Entity5 tb1Entity5 : tb1Entity5s) {

                        // child:Tb1Ko, parents:5

                        // child:Tb1TenpuFile, parents:5

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

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
