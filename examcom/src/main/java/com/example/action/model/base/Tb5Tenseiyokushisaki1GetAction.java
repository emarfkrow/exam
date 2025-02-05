package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Tenseiyokushisaki1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 転生抑止先１照会
 *
 * @author emarfkrow
 */
public class Tb5Tenseiyokushisaki1GetAction extends BaseAction {

    /** 転生抑止先１照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tenseiyokushisaki1Id = postJson.get("tenseiyokushisaki1Id");
        if (tenseiyokushisaki1Id == null) {
            tenseiyokushisaki1Id = postJson.get("Tb5Tenseiyokushisaki1.tenseiyokushisaki1Id");
        }
        if (tenseiyokushisaki1Id == null) {
            return map;
        }

        Tb5Tenseiyokushisaki1 tb5Tenseiyokushisaki1 = Tb5Tenseiyokushisaki1.get(tenseiyokushisaki1Id);
        map.put("Tb5Tenseiyokushisaki1", tb5Tenseiyokushisaki1);
        return map;
    }

}
