package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 参照３マスタ
 * @author emarfkrow
 */
public class Mb1Sansho3 implements IEntity {

    /** SlickGridのDataView用ID */
    private Integer id;

    /**
     * @return id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param o セットする id
     */
    public final void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.id = Integer.valueOf(o.toString());
        } else {
            this.id = null;
        }
    }

    /** 参照３NO */
    private String sansho3No;

    /** @return 参照３NO */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO3_NO")
    public String getSansho3No() {
        return this.sansho3No;
    }

    /** @param o 参照３NO */
    public void setSansho3No(final Object o) {
        if (o != null) {
            this.sansho3No = o.toString();
        } else {
            this.sansho3No = null;
        }
    }

    /** 参照３名 */
    private String sansho3Mei;

    /** @return 参照３名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO3_MEI")
    public String getSansho3Mei() {
        return this.sansho3Mei;
    }

    /** @param o 参照３名 */
    public void setSansho3Mei(final Object o) {
        if (o != null) {
            this.sansho3Mei = o.toString();
        } else {
            this.sansho3Mei = null;
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
            this.insertTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T"));
        } else {
            this.insertTs = null;
        }
    }

    /** 作成者 */
    private Integer insertId;

    /** @return 作成者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_ID")
    public Integer getInsertId() {
        return this.insertId;
    }

    /** @param o 作成者 */
    public void setInsertId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertId = Integer.valueOf(o.toString());
        } else {
            this.insertId = null;
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
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T"));
        } else {
            this.updateTs = null;
        }
    }

    /** 更新者 */
    private Integer updateId;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_ID")
    public Integer getUpdateId() {
        return this.updateId;
    }

    /** @param o 更新者 */
    public void setUpdateId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateId = Integer.valueOf(o.toString());
        } else {
            this.updateId = null;
        }
    }

    /** 削除フラグ */
    private String deleteF = "0";

    /** @return 削除フラグ */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_F")
    public String getDeleteF() {
        return this.deleteF;
    }

    /** @param o 削除フラグ */
    public void setDeleteF(final Object o) {
        if (o != null) {
            this.deleteF = o.toString();
        } else {
            this.deleteF = null;
        }
    }

    /**
     * 参照３マスタ照会
     * @param param1 参照３NO
     * @return 参照３マスタ
     */
    public static Mb1Sansho3 get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (`SANSHO3_NO`) = TRIM (:sansho_3_no)");
        String sql = "";
        sql += "SELECT \n";
        sql += "      TRIM(TRAILING ' ' FROM a.`SANSHO3_NO`) AS SANSHO3_NO \n";
        sql += "    , a.`SANSHO3_MEI` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    mb1_sansho3 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sansho_3_no", param1);
        return Queries.get(sql, map, Mb1Sansho3.class);
    }

    /**
     * 参照３マスタ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 参照３マスタの登録
        String sql = "INSERT INTO mb1_sansho3(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SANSHO3_NO` -- :sansho_3_no");
        nameList.add("`SANSHO3_MEI` -- :sansho_3_mei");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_ID` -- :insert_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_ID` -- :update_id");
        nameList.add("`DELETE_F` -- :delete_f");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sansho_3_no");
        valueList.add(":sansho_3_mei");
        valueList.add(":insert_ts");
        valueList.add(":insert_id");
        valueList.add(":update_ts");
        valueList.add(":update_id");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 参照３マスタ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 参照３マスタの登録
        String sql = "UPDATE mb1_sansho3\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SANSHO3_NO` = :sansho_3_no");
        setList.add("`SANSHO3_MEI` = :sansho_3_mei");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_ID` = :update_id");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 参照３マスタ削除
     * @return 削除件数
     */
    public int delete() {

        // 参照３マスタの削除
        String sql = "DELETE FROM mb1_sansho3 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (`SANSHO3_NO`) = TRIM (:sansho_3_no)");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sansho_3_no", this.sansho3No);
        map.put("sansho_3_mei", this.sansho3Mei);
        map.put("delete_f", this.deleteF);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }
}
