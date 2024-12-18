package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1TenpuFile;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 添付ファイル照会
 *
 * @author emarfkrow
 */
public class Tb1TenpuFileGetAction extends BaseAction {

    /** 添付ファイル照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1TenpuFile.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1TenpuFile.oyaBn");
        }
        if (oyaBn == null) {
            return map;
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1TenpuFile.entityBn");
        }
        if (entityBn == null) {
            return map;
        }
        Object tenpuFileBn = postJson.get("tenpuFileBn");
        if (tenpuFileBn == null) {
            tenpuFileBn = postJson.get("Tb1TenpuFile.tenpuFileBn");
        }
        if (tenpuFileBn == null) {
            return map;
        }

        Tb1TenpuFile tb1TenpuFile = Tb1TenpuFile.get(sosenId, oyaBn, entityBn, tenpuFileBn);
        map.put("Tb1TenpuFile", tb1TenpuFile);
        return map;
    }

}
