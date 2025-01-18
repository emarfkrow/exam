package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1SosenDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 祖先明細照会
 *
 * @author emarfkrow
 */
public class Tb1SosenDetGetAction extends BaseAction {

    /** 祖先明細照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1SosenDet.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object sosenBn = postJson.get("sosenBn");
        if (sosenBn == null) {
            sosenBn = postJson.get("Tb1SosenDet.sosenBn");
        }
        if (sosenBn == null) {
            return map;
        }

        Tb1SosenDet tb1SosenDet = Tb1SosenDet.get(sosenId, sosenBn);
        map.put("Tb1SosenDet", tb1SosenDet);
        return map;
    }

}
