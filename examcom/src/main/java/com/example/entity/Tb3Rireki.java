package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 履歴元
 * @author emarfkrow
 */
public class Tb3Rireki implements IEntity {

    /** SlickGridのDataView用ID */
    private Integer id;

    /** @return id */
    public final Integer getId() {
        return id;
    }

    /** @param o id */
    public final void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.id = Integer.valueOf(o.toString());
        } else {
            this.id = null;
        }
    }

    /** 履歴元ID */
    private Integer rirekiMotoId;

    /** @return 履歴元ID */
    @com.fasterxml.jackson.annotation.JsonProperty("RIREKI_MOTO_ID")
    public Integer getRirekiMotoId() {
        return this.rirekiMotoId;
    }

    /** @param o 履歴元ID */
    public void setRirekiMotoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rirekiMotoId = Integer.valueOf(o.toString());
        } else {
            this.rirekiMotoId = null;
        }
    }

    /** 履歴元情報 */
    private String rirekiMotoInfo;

    /** @return 履歴元情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("RIREKI_MOTO_INFO")
    public String getRirekiMotoInfo() {
        return this.rirekiMotoInfo;
    }

    /** @param o 履歴元情報 */
    public void setRirekiMotoInfo(final Object o) {
        if (o != null) {
            this.rirekiMotoInfo = o.toString();
        } else {
            this.rirekiMotoInfo = null;
        }
    }

    /** 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_TS")
    public java.time.LocalDateTime getInsertTs() {
        return this.insertTs;
    }

    /** @param o 作成タイムスタンプ */
    public void setInsertTs(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.insertTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.insertTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.insertTs = null;
        }
    }

    /** 作成者 */
    private Integer insertUserId;

    /** @return 作成者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_USER_ID")
    public Integer getInsertUserId() {
        return this.insertUserId;
    }

    /** @param o 作成者 */
    public void setInsertUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertUserId = Integer.valueOf(o.toString());
        } else {
            this.insertUserId = null;
        }
    }

    /** 作成者参照 */
    private String insertUserSei;

    /** @return 作成者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_USER_SEI")
    public String getInsertUserSei() {
        return this.insertUserSei;
    }

    /** @param o 作成者参照 */
    public void setInsertUserSei(final Object o) {
        if (o != null) {
            this.insertUserSei = o.toString();
        } else {
            this.insertUserSei = null;
        }
    }

    /** 更新タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime updateTs;

    /** @return 更新タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_TS")
    public java.time.LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /** @param o 更新タイムスタンプ */
    public void setUpdateTs(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.updateTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.updateTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.updateTs = null;
        }
    }

    /** 更新者 */
    private Integer updateUserId;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_USER_ID")
    public Integer getUpdateUserId() {
        return this.updateUserId;
    }

    /** @param o 更新者 */
    public void setUpdateUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateUserId = Integer.valueOf(o.toString());
        } else {
            this.updateUserId = null;
        }
    }

    /** 更新者参照 */
    private String updateUserSei;

    /** @return 更新者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_USER_SEI")
    public String getUpdateUserSei() {
        return this.updateUserSei;
    }

    /** @param o 更新者参照 */
    public void setUpdateUserSei(final Object o) {
        if (o != null) {
            this.updateUserSei = o.toString();
        } else {
            this.updateUserSei = null;
        }
    }

    /** henkoRiyu */
    private String henkoRiyu;

    /** @return henkoRiyu */
    public String getHenkoRiyu() {
        return this.henkoRiyu;
    }

    /** @param o henkoRiyu */
    public void setHenkoRiyu(final Object o) {
        if (o != null) {
            this.henkoRiyu = o.toString();
        }
    }

    /**
     * 履歴元照会
     * @param param1 履歴元ID
     * @return 履歴元
     */
    public static Tb3Rireki get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`RIREKI_MOTO_ID` = :rireki_moto_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`RIREKI_MOTO_ID` \n";
        sql += "    , a.`RIREKI_MOTO_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB3_RIREKI a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rireki_moto_id", param1);
        return Queries.get(sql, map, Tb3Rireki.class);
    }

    /**
     * 履歴元追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 履歴元IDの採番処理
        numbering();

        // 履歴先の登録
        Tb3RirekiSaki tb3RirekiSaki = new Tb3RirekiSaki();
        tb3RirekiSaki.setRirekiMotoId(this.rirekiMotoId);
        tb3RirekiSaki.setRirekiMotoInfo(this.rirekiMotoInfo);
        tb3RirekiSaki.setInsertTs(this.insertTs);
        tb3RirekiSaki.setInsertUserId(this.insertUserId);
        tb3RirekiSaki.setUpdateTs(this.updateTs);
        tb3RirekiSaki.setUpdateUserId(this.updateUserId);
        tb3RirekiSaki.setHenkoRiyu(this.henkoRiyu);
        tb3RirekiSaki.insert(now, execId);

        // 履歴元の登録
        String sql = "INSERT INTO TB3_RIREKI(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`RIREKI_MOTO_ID` -- :rireki_moto_id");
        nameList.add("`RIREKI_MOTO_INFO` -- :rireki_moto_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":rireki_moto_id");
        valueList.add(":rireki_moto_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 履歴元IDの採番処理 */
    private void numbering() {
        if (this.rirekiMotoId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`RIREKI_MOTO_ID`) IS NULL THEN 0 ELSE MAX(e.`RIREKI_MOTO_ID`) * 1 END + 1 AS `RIREKI_MOTO_ID` FROM TB3_RIREKI e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("RIREKI_MOTO_ID");
        this.setRirekiMotoId(o);
    }

    /**
     * 履歴元更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 履歴先の登録
        Tb3RirekiSaki tb3RirekiSaki = new Tb3RirekiSaki();
        tb3RirekiSaki.setRirekiMotoId(this.rirekiMotoId);
        tb3RirekiSaki.setRirekiMotoInfo(this.rirekiMotoInfo);
        tb3RirekiSaki.setInsertTs(this.insertTs);
        tb3RirekiSaki.setInsertUserId(this.insertUserId);
        tb3RirekiSaki.setUpdateTs(this.updateTs);
        tb3RirekiSaki.setUpdateUserId(this.updateUserId);
        tb3RirekiSaki.setHenkoRiyu(this.henkoRiyu);
        tb3RirekiSaki.insert(now, execId);

        // 履歴元の登録
        String sql = "UPDATE TB3_RIREKI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`RIREKI_MOTO_ID` = :rireki_moto_id");
        setList.add("`RIREKI_MOTO_INFO` = :rireki_moto_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 履歴元削除
     * @return 削除件数
     */
    public int delete() {

        // 履歴元の削除
        String sql = "DELETE FROM TB3_RIREKI WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`RIREKI_MOTO_ID` = :rireki_moto_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rireki_moto_id", this.rirekiMotoId);
        map.put("rireki_moto_info", this.rirekiMotoInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
