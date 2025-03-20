package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb8Seiyaku;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 制約マスタ照会
 *
 * @author emarfkrow
 */
public class Mb8SeiyakuGetAction extends BaseAction {

    /** 制約マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object seiyakuId = postJson.get("seiyakuId");
        if (seiyakuId == null) {
            seiyakuId = postJson.get("Mb8Seiyaku.seiyakuId");
        }
        if (seiyakuId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Mb8Seiyaku mb8Seiyaku = Mb8Seiyaku.get(seiyakuId);
        map.put("Mb8Seiyaku", mb8Seiyaku);
        return map;
    }

}
