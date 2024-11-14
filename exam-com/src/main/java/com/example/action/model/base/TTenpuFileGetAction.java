package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TTenpuFile;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 添付ファイル照会
 *
 * @author emarfkrow
 */
public class TTenpuFileGetAction extends BaseAction {

    /** 添付ファイル照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TTenpuFile.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("TTenpuFile.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("TTenpuFile.entityBn");
        }
        if (entityBn == null) {
            return map;
        }
        Object tenpuFileBn = postJson.get("tenpuFileBn");
        if (tenpuFileBn == null) {
            tenpuFileBn = postJson.get("TTenpuFile.tenpuFileBn");
        }
        if (tenpuFileBn == null) {
            return map;
        }

        TTenpuFile tTenpuFile = TTenpuFile.get(sosenId, oyaBn, entityBn, tenpuFileBn);
        map.put("TTenpuFile", tTenpuFile);
        return map;
    }

}
