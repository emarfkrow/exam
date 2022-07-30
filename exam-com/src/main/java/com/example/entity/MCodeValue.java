package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * コード値マスタ
 * @author emarfkrow
 */
public class MCodeValue implements IEntity {

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

    /** コード名称 */
    private String codeNm;

    /** @return コード名称 */
    @com.fasterxml.jackson.annotation.JsonProperty("CODE_NM")
    public String getCodeNm() {
        return this.codeNm;
    }

    /** @param o コード名称 */
    public void setCodeNm(final Object o) {
        if (o != null) {
            this.codeNm = o.toString();
        } else {
            this.codeNm = null;
        }
    }

    /** コード値 */
    private String codeValue;

    /** @return コード値 */
    @com.fasterxml.jackson.annotation.JsonProperty("CODE_VALUE")
    public String getCodeValue() {
        return this.codeValue;
    }

    /** @param o コード値 */
    public void setCodeValue(final Object o) {
        if (o != null) {
            this.codeValue = o.toString();
        } else {
            this.codeValue = null;
        }
    }

    /** コード値名 */
    private String codeValueMei;

    /** @return コード値名 */
    @com.fasterxml.jackson.annotation.JsonProperty("CODE_VALUE_MEI")
    public String getCodeValueMei() {
        return this.codeValueMei;
    }

    /** @param o コード値名 */
    public void setCodeValueMei(final Object o) {
        if (o != null) {
            this.codeValueMei = o.toString();
        } else {
            this.codeValueMei = null;
        }
    }

    /** 表示順 */
    private Integer hyojiJun;

    /** @return 表示順 */
    @com.fasterxml.jackson.annotation.JsonProperty("HYOJI_JUN")
    public Integer getHyojiJun() {
        return this.hyojiJun;
    }

    /** @param o 表示順 */
    public void setHyojiJun(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hyojiJun = Integer.valueOf(o.toString());
        } else {
            this.hyojiJun = null;
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

    /** 登録日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertDt;

    /** @return 登録日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_DT")
    public java.time.LocalDateTime getInsertDt() {
        return this.insertDt;
    }

    /** @param o 登録日時 */
    public void setInsertDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.insertDt = null;
        }
    }

    /** 登録者 */
    private String insertBy;

    /** @return 登録者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_BY")
    public String getInsertBy() {
        return this.insertBy;
    }

    /** @param o 登録者 */
    public void setInsertBy(final Object o) {
        if (o != null) {
            this.insertBy = o.toString();
        } else {
            this.insertBy = null;
        }
    }

    /** 更新日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime updateDt;

    /** @return 更新日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_DT")
    public java.time.LocalDateTime getUpdateDt() {
        return this.updateDt;
    }

    /** @param o 更新日時 */
    public void setUpdateDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.updateDt = null;
        }
    }

    /** 更新者 */
    private String updateBy;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_BY")
    public String getUpdateBy() {
        return this.updateBy;
    }

    /** @param o 更新者 */
    public void setUpdateBy(final Object o) {
        if (o != null) {
            this.updateBy = o.toString();
        } else {
            this.updateBy = null;
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
     * コード値マスタ照会
     * @param param1 コード名称
     * @param param2 コード値
     * @return コード値マスタ
     */
    public static MCodeValue get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`CODE_NM` = :code_nm");
        whereList.add("`CODE_VALUE` = :code_value");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`CODE_NM` \n";
        sql += "    , a.`CODE_VALUE` \n";
        sql += "    , a.`CODE_VALUE_MEI` \n";
        sql += "    , a.`HYOJI_JUN` \n";
        sql += "    , a.`CRITERIA` \n";
        sql += "    , a.`INSERT_DT` \n";
        sql += "    , a.`INSERT_BY` \n";
        sql += "    , a.`UPDATE_DT` \n";
        sql += "    , a.`UPDATE_BY` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    m_code_value a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code_nm", param1);
        map.put("code_value", param2);
        return Queries.get(sql, map, MCodeValue.class);
    }

    /**
     * コード値マスタ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // コード値マスタの登録
        String sql = "INSERT INTO m_code_value(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`CODE_NM` -- :code_nm");
        nameList.add("`CODE_VALUE` -- :code_value");
        nameList.add("`CODE_VALUE_MEI` -- :code_value_mei");
        nameList.add("`HYOJI_JUN` -- :hyoji_jun");
        nameList.add("`CRITERIA` -- :criteria");
        nameList.add("`INSERT_DT` -- :insert_dt");
        nameList.add("`INSERT_BY` -- :insert_by");
        nameList.add("`UPDATE_DT` -- :update_dt");
        nameList.add("`UPDATE_BY` -- :update_by");
        nameList.add("`DELETE_F` -- :delete_f");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":code_nm");
        valueList.add(":code_value");
        valueList.add(":code_value_mei");
        valueList.add(":hyoji_jun");
        valueList.add(":criteria");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add("NVL (:delete_f, ' ')");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * コード値マスタ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // コード値マスタの登録
        String sql = "UPDATE m_code_value\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`CODE_NM` = :code_nm");
        setList.add("`CODE_VALUE` = :code_value");
        setList.add("`CODE_VALUE_MEI` = :code_value_mei");
        setList.add("`HYOJI_JUN` = :hyoji_jun");
        setList.add("`CRITERIA` = :criteria");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = NVL (:delete_f, ' ')");
        return String.join("\r\n    , ", setList);
    }

    /**
     * コード値マスタ削除
     * @return 削除件数
     */
    public int delete() {

        // コード値マスタの削除
        String sql = "DELETE FROM m_code_value WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`CODE_NM` = :code_nm");
        whereList.add("`CODE_VALUE` = :code_value");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code_nm", this.codeNm);
        map.put("code_value", this.codeValue);
        map.put("code_value_mei", this.codeValueMei);
        map.put("hyoji_jun", this.hyojiJun);
        map.put("criteria", this.criteria);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", execId);
        map.put("update_dt", now);
        map.put("update_by", execId);
        return map;
    }
}
