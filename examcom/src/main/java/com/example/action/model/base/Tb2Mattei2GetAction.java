package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Mattei2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 末弟２照会
 *
 * @author emarfkrow
 */
public class Tb2Mattei2GetAction extends BaseAction {

    /** 末弟２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object matteiId = postJson.get("matteiId");
        if (matteiId == null) {
            matteiId = postJson.get("Tb2Mattei2.matteiId");
        }
        if (matteiId == null) {
            return map;
        }

        Tb2Mattei2 tb2Mattei2 = Tb2Mattei2.get(matteiId);
        tb2Mattei2.referTb2Mattei();
        tb2Mattei2.referTb2Mattei3();
        map.put("Tb2Mattei2", tb2Mattei2);
        return map;
    }

}
