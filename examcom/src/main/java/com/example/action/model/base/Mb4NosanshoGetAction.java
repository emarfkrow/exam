package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Nosansho;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * NO参照マスタ照会
 *
 * @author emarfkrow
 */
public class Mb4NosanshoGetAction extends BaseAction {

    /** NO参照マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object nosanshoNo = postJson.get("nosanshoNo");
        if (nosanshoNo == null) {
            nosanshoNo = postJson.get("Mb4Nosansho.nosanshoNo");
        }
        if (nosanshoNo == null) {
            return map;
        }

        Mb4Nosansho mb4Nosansho = Mb4Nosansho.get(nosanshoNo);
        map.put("Mb4Nosansho", mb4Nosansho);
        return map;
    }

}
