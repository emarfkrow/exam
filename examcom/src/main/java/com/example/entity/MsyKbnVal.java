package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 区分値マスタ
 * @author emarfkrow
 */
public class MsyKbnVal implements IEntity {

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

    /** 区分名称 */
    private String kbnNm;

    /** @return 区分名称 */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN_NM")
    public String getKbnNm() {
        return this.kbnNm;
    }

    /** @param o 区分名称 */
    public void setKbnNm(final Object o) {
        if (o != null) {
            this.kbnNm = o.toString();
        } else {
            this.kbnNm = null;
        }
    }

    /** 区分値 */
    private String kbnVal;

    /** @return 区分値 */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN_VAL")
    public String getKbnVal() {
        return this.kbnVal;
    }

    /** @param o 区分値 */
    public void setKbnVal(final Object o) {
        if (o != null) {
            this.kbnVal = o.toString();
        } else {
            this.kbnVal = null;
        }
    }

    /** 区分値名 */
    private String kbnValMei;

    /** @return 区分値名 */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN_VAL_MEI")
    public String getKbnValMei() {
        return this.kbnValMei;
    }

    /** @param o 区分値名 */
    public void setKbnValMei(final Object o) {
        if (o != null) {
            this.kbnValMei = o.toString();
        } else {
            this.kbnValMei = null;
        }
    }

    /** 表示順 */
    private Integer hyojiOn;

    /** @return 表示順 */
    @com.fasterxml.jackson.annotation.JsonProperty("HYOJI_ON")
    public Integer getHyojiOn() {
        return this.hyojiOn;
    }

    /** @param o 表示順 */
    public void setHyojiOn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hyojiOn = Integer.valueOf(o.toString());
        } else {
            this.hyojiOn = null;
        }
    }

    /** 取得条件 */
    private String criteria;

    /** @return 取得条件 */
    @com.fasterxml.jackson.annotation.JsonProperty("CRITERIA")
    public String getCriteria() {
        return this.criteria;
    }

    /** @param o 取得条件 */
    public void setCriteria(final Object o) {
        if (o != null) {
            this.criteria = o.toString();
        } else {
            this.criteria = null;
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
     * 区分値マスタ照会
     * @param param1 区分名称
     * @param param2 区分値
     * @return 区分値マスタ
     */
    public static MsyKbnVal get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KBN_NM` = :kbn_nm");
        whereList.add("`KBN_VAL` = :kbn_val");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`KBN_NM` \n";
        sql += "    , a.`KBN_VAL` \n";
        sql += "    , a.`KBN_VAL_MEI` \n";
        sql += "    , a.`HYOJI_ON` \n";
        sql += "    , a.`CRITERIA` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    msy_kbn_val a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kbn_nm", param1);
        map.put("kbn_val", param2);
        return Queries.get(sql, map, MsyKbnVal.class);
    }

    /**
     * 区分値マスタ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 区分値マスタの登録
        String sql = "INSERT INTO msy_kbn_val(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`KBN_NM` -- :kbn_nm");
        nameList.add("`KBN_VAL` -- :kbn_val");
        nameList.add("`KBN_VAL_MEI` -- :kbn_val_mei");
        nameList.add("`HYOJI_ON` -- :hyoji_on");
        nameList.add("`CRITERIA` -- :criteria");
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
        valueList.add(":kbn_nm");
        valueList.add(":kbn_val");
        valueList.add(":kbn_val_mei");
        valueList.add(":hyoji_on");
        valueList.add(":criteria");
        valueList.add(":insert_ts");
        valueList.add(":insert_id");
        valueList.add(":update_ts");
        valueList.add(":update_id");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 区分値マスタ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 区分値マスタの登録
        String sql = "UPDATE msy_kbn_val\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`KBN_NM` = :kbn_nm");
        setList.add("`KBN_VAL` = :kbn_val");
        setList.add("`KBN_VAL_MEI` = :kbn_val_mei");
        setList.add("`HYOJI_ON` = :hyoji_on");
        setList.add("`CRITERIA` = :criteria");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_ID` = :update_id");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 区分値マスタ削除
     * @return 削除件数
     */
    public int delete() {

        // 区分値マスタの削除
        String sql = "DELETE FROM msy_kbn_val WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KBN_NM` = :kbn_nm");
        whereList.add("`KBN_VAL` = :kbn_val");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kbn_nm", this.kbnNm);
        map.put("kbn_val", this.kbnVal);
        map.put("kbn_val_mei", this.kbnValMei);
        map.put("hyoji_on", this.hyojiOn);
        map.put("criteria", this.criteria);
        map.put("delete_f", this.deleteF);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }
}