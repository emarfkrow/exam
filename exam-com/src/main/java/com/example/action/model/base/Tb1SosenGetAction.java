package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Sosen;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 祖先照会
 *
 * @author emarfkrow
 */
public class Tb1SosenGetAction extends BaseAction {

    /** 祖先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Sosen.sosenId");
        }
        if (sosenId == null) {
            return map;
        }

        Tb1Sosen tb1Sosen = Tb1Sosen.get(sosenId);
        tb1Sosen.referTb1Oyas();
        map.put("Tb1Sosen", tb1Sosen);
        return map;
    }

}
