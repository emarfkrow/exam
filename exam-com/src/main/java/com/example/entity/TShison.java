package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 子孫
 * @author emarfkrow
 */
public class TShison implements IEntity {

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

    /** 祖先ID */
    private Integer sosenId;

    /** @return 祖先ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SOSEN_ID")
    public Integer getSosenId() {
        return this.sosenId;
    }

    /** @param o 祖先ID */
    public void setSosenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sosenId = Integer.valueOf(o.toString());
        } else {
            this.sosenId = null;
        }
    }

    /** 親連番 */
    private Integer oyaSn;

    /** @return 親連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_SN")
    public Integer getOyaSn() {
        return this.oyaSn;
    }

    /** @param o 親連番 */
    public void setOyaSn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaSn = Integer.valueOf(o.toString());
        } else {
            this.oyaSn = null;
        }
    }

    /** エンティティ連番 */
    private Integer entitySn;

    /** @return エンティティ連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_SN")
    public Integer getEntitySn() {
        return this.entitySn;
    }

    /** @param o エンティティ連番 */
    public void setEntitySn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entitySn = Integer.valueOf(o.toString());
        } else {
            this.entitySn = null;
        }
    }

    /** 子連番 */
    private Integer koSn;

    /** @return 子連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("KO_SN")
    public Integer getKoSn() {
        return this.koSn;
    }

    /** @param o 子連番 */
    public void setKoSn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koSn = Integer.valueOf(o.toString());
        } else {
            this.koSn = null;
        }
    }

    /** 子孫連番 */
    private Integer shisonSn;

    /** @return 子孫連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("SHISON_SN")
    public Integer getShisonSn() {
        return this.shisonSn;
    }

    /** @param o 子孫連番 */
    public void setShisonSn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shisonSn = Integer.valueOf(o.toString());
        } else {
            this.shisonSn = null;
        }
    }

    /** 子孫名 */
    private String shisonMei;

    /** @return 子孫名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SHISON_MEI")
    public String getShisonMei() {
        return this.shisonMei;
    }

    /** @param o 子孫名 */
    public void setShisonMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shisonMei = String.valueOf(o.toString());
        } else {
            this.shisonMei = null;
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
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
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
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
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
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteF = String.valueOf(o.toString());
        } else {
            this.deleteF = null;
        }
    }

    /**
     * 子孫照会
     * @param param1 祖先ID
     * @param param2 親連番
     * @param param3 エンティティ連番
     * @param param4 子連番
     * @param param5 子孫連番
     * @return 子孫
     */
    public static TShison get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        whereList.add("`ENTITY_SN` = :entity_sn");
        whereList.add("`KO_SN` = :ko_sn");
        whereList.add("`SHISON_SN` = :shison_sn");
        String sql = "SELECT * FROM t_shison WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        map.put("entity_sn", param3);
        map.put("ko_sn", param4);
        map.put("shison_sn", param5);
        return Queries.get(sql, map, TShison.class);
    }

    /**
     * 子孫追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 子孫連番の採番処理
        numbering();

        // 子孫の登録
        String sql = "INSERT INTO t_shison(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_SN` -- :oya_sn");
        nameList.add("`ENTITY_SN` -- :entity_sn");
        nameList.add("`KO_SN` -- :ko_sn");
        nameList.add("`SHISON_SN` -- :shison_sn");
        nameList.add("`SHISON_MEI` -- :shison_mei");
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
        valueList.add(":sosen_id");
        valueList.add(":oya_sn");
        valueList.add(":entity_sn");
        valueList.add(":ko_sn");
        valueList.add(":shison_sn");
        valueList.add(":shison_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** 子孫連番の採番処理 */
    private void numbering() {
        if (this.shisonSn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`SHISON_SN`) IS NULL THEN 0 ELSE MAX(e.`SHISON_SN`) * 1 END + 1 AS `SHISON_SN` FROM t_shison e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        whereList.add("e.`OYA_SN` = :oya_sn");
        whereList.add("e.`ENTITY_SN` = :entity_sn");
        whereList.add("e.`KO_SN` = :ko_sn");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        map.put("oya_sn", this.oyaSn);
        map.put("entity_sn", this.entitySn);
        map.put("ko_sn", this.koSn);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, 1, 1);
        Object o = mapList.get(0).get("SHISON_SN");
        this.setShisonSn(o);
    }

    /**
     * 子孫更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 子孫の登録
        String sql = "UPDATE t_shison\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_SN` = :oya_sn");
        setList.add("`ENTITY_SN` = :entity_sn");
        setList.add("`KO_SN` = :ko_sn");
        setList.add("`SHISON_SN` = :shison_sn");
        setList.add("`SHISON_MEI` = :shison_mei");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 子孫削除
     * @return 削除件数
     */
    public int delete() {

        // 子孫の削除
        String sql = "DELETE FROM t_shison WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        whereList.add("`ENTITY_SN` = :entity_sn");
        whereList.add("`KO_SN` = :ko_sn");
        whereList.add("`SHISON_SN` = :shison_sn");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", this.sosenId);
        map.put("oya_sn", this.oyaSn);
        map.put("entity_sn", this.entitySn);
        map.put("ko_sn", this.koSn);
        map.put("shison_sn", this.shisonSn);
        map.put("shison_mei", this.shisonMei);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", execId);
        map.put("update_dt", now);
        map.put("update_by", execId);
        return map;
    }
}
