package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb7Seiyaku;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 制約マスタ照会
 *
 * @author emarfkrow
 */
public class Mb7SeiyakuGetAction extends BaseAction {

    /** 制約マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object seiyakuId = postJson.get("seiyakuId");
        if (seiyakuId == null) {
            seiyakuId = postJson.get("Mb7Seiyaku.seiyakuId");
        }
        if (seiyakuId == null) {
            return map;
        }

        Mb7Seiyaku mb7Seiyaku = Mb7Seiyaku.get(seiyakuId);
        map.put("Mb7Seiyaku", mb7Seiyaku);
        return map;
    }

}
