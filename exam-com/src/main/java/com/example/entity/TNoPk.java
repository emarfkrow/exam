package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 主キーなし
 * @author emarfkrow
 */
public class TNoPk implements IEntity {

    /** SlickGridのDataView用ID */
    private java.math.BigInteger id;

    /**
     * @return id
     */
    public final java.math.BigInteger getId() {
        return id;
    }

    /**
     * @param i セットする id
     */
    public final void setId(final java.math.BigInteger i) {
        this.id = i;
    }

    /** 列Ａ */
    private String columnA;

    /** @return 列Ａ */
    @com.fasterxml.jackson.annotation.JsonProperty("COLUMN_A")
    public String getColumnA() {
        return this.columnA;
    }

    /** @param o 列Ａ */
    public void setColumnA(final Object o) {
        if (o != null) {
            this.columnA = String.valueOf(o.toString());
        } else {
            this.columnA = null;
        }
    }

    /** 列Ｂ */
    private String columnB;

    /** @return 列Ｂ */
    @com.fasterxml.jackson.annotation.JsonProperty("COLUMN_B")
    public String getColumnB() {
        return this.columnB;
    }

    /** @param o 列Ｂ */
    public void setColumnB(final Object o) {
        if (o != null) {
            this.columnB = String.valueOf(o.toString());
        } else {
            this.columnB = null;
        }
    }

    /** 列Ｃ */
    private String columnC;

    /** @return 列Ｃ */
    @com.fasterxml.jackson.annotation.JsonProperty("COLUMN_C")
    public String getColumnC() {
        return this.columnC;
    }

    /** @param o 列Ｃ */
    public void setColumnC(final Object o) {
        if (o != null) {
            this.columnC = String.valueOf(o.toString());
        } else {
            this.columnC = null;
        }
    }

    /** 列Ｄ */
    private String columnD;

    /** @return 列Ｄ */
    @com.fasterxml.jackson.annotation.JsonProperty("COLUMN_D")
    public String getColumnD() {
        return this.columnD;
    }

    /** @param o 列Ｄ */
    public void setColumnD(final Object o) {
        if (o != null) {
            this.columnD = String.valueOf(o.toString());
        } else {
            this.columnD = null;
        }
    }

    /** 列Ｅ */
    private String columnE;

    /** @return 列Ｅ */
    @com.fasterxml.jackson.annotation.JsonProperty("COLUMN_E")
    public String getColumnE() {
        return this.columnE;
    }

    /** @param o 列Ｅ */
    public void setColumnE(final Object o) {
        if (o != null) {
            this.columnE = String.valueOf(o.toString());
        } else {
            this.columnE = null;
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
            this.insertBy = String.valueOf(o.toString());
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
            this.updateBy = String.valueOf(o.toString());
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
            this.deleteF = String.valueOf(o.toString());
        } else {
            this.deleteF = null;
        }
    }

    /**
     * 主キーなし照会
     * @return 主キーなし
     */
    public static TNoPk get() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`COLUMN_A` = :column_a");
        whereList.add("`COLUMN_B` = :column_b");
        whereList.add("`COLUMN_C` = :column_c");
        whereList.add("`COLUMN_D` = :column_d");
        whereList.add("`COLUMN_E` = :column_e");
        whereList.add("`INSERT_DT` = :insert_dt");
        whereList.add("`INSERT_BY` = :insert_by");
        whereList.add("`UPDATE_DT` = :update_dt");
        whereList.add("`UPDATE_BY` = :update_by");
        whereList.add("TRIM (`DELETE_F`) = TRIM (:delete_f)");
        String sql = "SELECT * FROM t_no_pk WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        return Queries.get(sql, map, TNoPk.class);
    }

    /**
     * 主キーなし追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 主キーなしの登録
        String sql = "INSERT INTO t_no_pk(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`COLUMN_A` -- :column_a");
        nameList.add("`COLUMN_B` -- :column_b");
        nameList.add("`COLUMN_C` -- :column_c");
        nameList.add("`COLUMN_D` -- :column_d");
        nameList.add("`COLUMN_E` -- :column_e");
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
        valueList.add(":column_a");
        valueList.add(":column_b");
        valueList.add(":column_c");
        valueList.add(":column_d");
        valueList.add(":column_e");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 主キーなし更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 主キーなしの登録
        String sql = "UPDATE t_no_pk\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`COLUMN_A` = :column_a");
        setList.add("`COLUMN_B` = :column_b");
        setList.add("`COLUMN_C` = :column_c");
        setList.add("`COLUMN_D` = :column_d");
        setList.add("`COLUMN_E` = :column_e");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 主キーなし削除
     * @return 削除件数
     */
    public int delete() {

        // 主キーなしの削除
        String sql = "DELETE FROM t_no_pk WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("column_a", this.columnA);
        map.put("column_b", this.columnB);
        map.put("column_c", this.columnC);
        map.put("column_d", this.columnD);
        map.put("column_e", this.columnE);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", execId);
        map.put("update_dt", now);
        map.put("update_by", execId);
        return map;
    }
}
