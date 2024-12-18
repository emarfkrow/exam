package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 機能マスタ
 * @author emarfkrow
 */
public class MsyKino implements IEntity {

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

    /** 機能名称 */
    private String kinoNm;

    /** @return 機能名称 */
    @com.fasterxml.jackson.annotation.JsonProperty("KINO_NM")
    public String getKinoNm() {
        return this.kinoNm;
    }

    /** @param o 機能名称 */
    public void setKinoNm(final Object o) {
        if (o != null) {
            this.kinoNm = o.toString();
        } else {
            this.kinoNm = null;
        }
    }

    /** 機能名 */
    private String kinoMei;

    /** @return 機能名 */
    @com.fasterxml.jackson.annotation.JsonProperty("KINO_MEI")
    public String getKinoMei() {
        return this.kinoMei;
    }

    /** @param o 機能名 */
    public void setKinoMei(final Object o) {
        if (o != null) {
            this.kinoMei = o.toString();
        } else {
            this.kinoMei = null;
        }
    }

    /** 開始日 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)
    private java.time.LocalDate kaishiBi;

    /** @return 開始日 */
    @com.fasterxml.jackson.annotation.JsonProperty("KAISHI_BI")
    public java.time.LocalDate getKaishiBi() {
        return this.kaishiBi;
    }

    /** @param o 開始日 */
    public void setKaishiBi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaishiBi = java.time.LocalDate.parse(o.toString().substring(0, 10));
        } else {
            this.kaishiBi = null;
        }
    }

    /** 終了日 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)
    private java.time.LocalDate shuryoBi;

    /** @return 終了日 */
    @com.fasterxml.jackson.annotation.JsonProperty("SHURYO_BI")
    public java.time.LocalDate getShuryoBi() {
        return this.shuryoBi;
    }

    /** @param o 終了日 */
    public void setShuryoBi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuryoBi = java.time.LocalDate.parse(o.toString().substring(0, 10));
        } else {
            this.shuryoBi = null;
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
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
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
     * 機能マスタ照会
     * @param param1 機能名称
     * @return 機能マスタ
     */
    public static MsyKino get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KINO_NM` = :kino_nm");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`KINO_NM` \n";
        sql += "    , a.`KINO_MEI` \n";
        sql += "    , a.`KAISHI_BI` AS KAISHI_BI \n";
        sql += "    , a.`SHURYO_BI` AS SHURYO_BI \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    msy_kino a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kino_nm", param1);
        return Queries.get(sql, map, MsyKino.class);
    }

    /**
     * 機能マスタ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 機能マスタの登録
        String sql = "INSERT INTO msy_kino(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`KINO_NM` -- :kino_nm");
        nameList.add("`KINO_MEI` -- :kino_mei");
        nameList.add("`KAISHI_BI` -- :kaishi_bi");
        nameList.add("`SHURYO_BI` -- :shuryo_bi");
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
        valueList.add(":kino_nm");
        valueList.add(":kino_mei");
        valueList.add(":kaishi_bi");
        valueList.add(":shuryo_bi");
        valueList.add(":insert_ts");
        valueList.add(":insert_id");
        valueList.add(":update_ts");
        valueList.add(":update_id");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 機能マスタ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 機能マスタの登録
        String sql = "UPDATE msy_kino\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`KINO_NM` = :kino_nm");
        setList.add("`KINO_MEI` = :kino_mei");
        setList.add("`KAISHI_BI` = :kaishi_bi");
        setList.add("`SHURYO_BI` = :shuryo_bi");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_ID` = :update_id");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 機能マスタ削除
     * @return 削除件数
     */
    public int delete() {

        // 機能マスタの削除
        String sql = "DELETE FROM msy_kino WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KINO_NM` = :kino_nm");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kino_nm", this.kinoNm);
        map.put("kino_mei", this.kinoMei);
        map.put("kaishi_bi", this.kaishiBi);
        map.put("shuryo_bi", this.shuryoBi);
        map.put("delete_f", this.deleteF);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }
}
