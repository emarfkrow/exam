package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseiyokushisaki2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生抑止先２照会
 *
 * @author emarfkrow
 */
public class Tb5Tenseiyokushisaki2GetAction extends BaseAction {

    /** 転生抑止先２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiyokushisaki2Id = postJson.get("tenseiyokushisaki2Id");
        if (tenseiyokushisaki2Id == null) {
            tenseiyokushisaki2Id = postJson.get("Tb5Tenseiyokushisaki2.tenseiyokushisaki2Id");
        }
        if (tenseiyokushisaki2Id == null) {
            return map;
        }

        Tb5Tenseiyokushisaki2 tb5Tenseiyokushisaki2 = Tb5Tenseiyokushisaki2.get(tenseiyokushisaki2Id);
        map.put("Tb5Tenseiyokushisaki2", tb5Tenseiyokushisaki2);
        return map;
    }

}
