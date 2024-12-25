package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * VIEW
 * @author emarfkrow
 */
public class Vb1Shison implements IEntity {

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

    /** entity_name */
    private String entityName;

    /** @return entity_name */
    @com.fasterxml.jackson.annotation.JsonProperty("entity_name")
    public String getEntityName() {
        return this.entityName;
    }

    /** @param o entity_name */
    public void setEntityName(final Object o) {
        if (o != null) {
            this.entityName = o.toString();
        } else {
            this.entityName = null;
        }
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

    /** 祖先名 */
    private String sosenMei;

    /** @return 祖先名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SOSEN_MEI")
    public String getSosenMei() {
        return this.sosenMei;
    }

    /** @param o 祖先名 */
    public void setSosenMei(final Object o) {
        if (o != null) {
            this.sosenMei = o.toString();
        } else {
            this.sosenMei = null;
        }
    }

    /** 親名 */
    private String oyaMei;

    /** @return 親名 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_MEI")
    public String getOyaMei() {
        return this.oyaMei;
    }

    /** @param o 親名 */
    public void setOyaMei(final Object o) {
        if (o != null) {
            this.oyaMei = o.toString();
        } else {
            this.oyaMei = null;
        }
    }

    /** エンティティ名 */
    private String entity1Mei;

    /** @return エンティティ名 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY1_MEI")
    public String getEntity1Mei() {
        return this.entity1Mei;
    }

    /** @param o エンティティ名 */
    public void setEntity1Mei(final Object o) {
        if (o != null) {
            this.entity1Mei = o.toString();
        } else {
            this.entity1Mei = null;
        }
    }

    /** 子名 */
    private String koMei;

    /** @return 子名 */
    @com.fasterxml.jackson.annotation.JsonProperty("KO_MEI")
    public String getKoMei() {
        return this.koMei;
    }

    /** @param o 子名 */
    public void setKoMei(final Object o) {
        if (o != null) {
            this.koMei = o.toString();
        } else {
            this.koMei = null;
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
        if (o != null) {
            this.shisonMei = o.toString();
        } else {
            this.shisonMei = null;
        }
    }

    /** 祖先ID */
    private Integer searchSosenId;

    /** @return 祖先ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_SOSEN_ID")
    public Integer getSearchSosenId() {
        return this.searchSosenId;
    }

    /** @param o 祖先ID */
    public void setSearchSosenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchSosenId = Integer.valueOf(o.toString());
        } else {
            this.searchSosenId = null;
        }
    }

    /** 親枝番 */
    private Integer searchOyaBn;

    /** @return 親枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_OYA_BN")
    public Integer getSearchOyaBn() {
        return this.searchOyaBn;
    }

    /** @param o 親枝番 */
    public void setSearchOyaBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchOyaBn = Integer.valueOf(o.toString());
        } else {
            this.searchOyaBn = null;
        }
    }

    /** エンティティ枝番 */
    private Integer searchEntityBn;

    /** @return エンティティ枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_ENTITY_BN")
    public Integer getSearchEntityBn() {
        return this.searchEntityBn;
    }

    /** @param o エンティティ枝番 */
    public void setSearchEntityBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchEntityBn = Integer.valueOf(o.toString());
        } else {
            this.searchEntityBn = null;
        }
    }

    /** 子枝番 */
    private Integer searchKoBn;

    /** @return 子枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_KO_BN")
    public Integer getSearchKoBn() {
        return this.searchKoBn;
    }

    /** @param o 子枝番 */
    public void setSearchKoBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchKoBn = Integer.valueOf(o.toString());
        } else {
            this.searchKoBn = null;
        }
    }

    /** 子孫枝番 */
    private Integer searchShisonBn;

    /** @return 子孫枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_SHISON_BN")
    public Integer getSearchShisonBn() {
        return this.searchShisonBn;
    }

    /** @param o 子孫枝番 */
    public void setSearchShisonBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchShisonBn = Integer.valueOf(o.toString());
        } else {
            this.searchShisonBn = null;
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

    /**
     * VIEW照会
     * @return VIEW
     */
    public static Vb1Shison get() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`entity_name` = :entity_name");
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`SOSEN_MEI` = :sosen_mei");
        whereList.add("`OYA_MEI` = :oya_mei");
        whereList.add("`ENTITY1_MEI` = :entity_1_mei");
        whereList.add("`KO_MEI` = :ko_mei");
        whereList.add("`SHISON_MEI` = :shison_mei");
        whereList.add("`SEARCH_SOSEN_ID` = :search_sosen_id");
        whereList.add("`SEARCH_OYA_BN` = :search_oya_bn");
        whereList.add("`SEARCH_ENTITY_BN` = :search_entity_bn");
        whereList.add("`SEARCH_KO_BN` = :search_ko_bn");
        whereList.add("`SEARCH_SHISON_BN` = :search_shison_bn");
        whereList.add("`INSERT_TS` = :insert_ts");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`entity_name` \n";
        sql += "    , a.`SOSEN_ID` \n";
        sql += "    , a.`SOSEN_MEI` \n";
        sql += "    , a.`OYA_MEI` \n";
        sql += "    , a.`ENTITY1_MEI` \n";
        sql += "    , a.`KO_MEI` \n";
        sql += "    , a.`SHISON_MEI` \n";
        sql += "    , a.`SEARCH_SOSEN_ID` \n";
        sql += "    , a.`SEARCH_OYA_BN` \n";
        sql += "    , a.`SEARCH_ENTITY_BN` \n";
        sql += "    , a.`SEARCH_KO_BN` \n";
        sql += "    , a.`SEARCH_SHISON_BN` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "FROM \n";
        sql += "    VB1_SHISON a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        return Queries.get(sql, map, Vb1Shison.class);
    }

    /**
     * VIEW追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // VIEWの登録
        String sql = "INSERT INTO VB1_SHISON(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`entity_name` -- :entity_name");
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`SOSEN_MEI` -- :sosen_mei");
        nameList.add("`OYA_MEI` -- :oya_mei");
        nameList.add("`ENTITY1_MEI` -- :entity_1_mei");
        nameList.add("`KO_MEI` -- :ko_mei");
        nameList.add("`SHISON_MEI` -- :shison_mei");
        nameList.add("`SEARCH_SOSEN_ID` -- :search_sosen_id");
        nameList.add("`SEARCH_OYA_BN` -- :search_oya_bn");
        nameList.add("`SEARCH_ENTITY_BN` -- :search_entity_bn");
        nameList.add("`SEARCH_KO_BN` -- :search_ko_bn");
        nameList.add("`SEARCH_SHISON_BN` -- :search_shison_bn");
        nameList.add("`INSERT_TS` -- :insert_ts");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":entity_name");
        valueList.add(":sosen_id");
        valueList.add(":sosen_mei");
        valueList.add(":oya_mei");
        valueList.add(":entity_1_mei");
        valueList.add(":ko_mei");
        valueList.add(":shison_mei");
        valueList.add(":search_sosen_id");
        valueList.add(":search_oya_bn");
        valueList.add(":search_entity_bn");
        valueList.add(":search_ko_bn");
        valueList.add(":search_shison_bn");
        valueList.add(":insert_ts");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * VIEW更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // VIEWの登録
        String sql = "UPDATE VB1_SHISON\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`entity_name` = :entity_name");
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`SOSEN_MEI` = :sosen_mei");
        setList.add("`OYA_MEI` = :oya_mei");
        setList.add("`ENTITY1_MEI` = :entity_1_mei");
        setList.add("`KO_MEI` = :ko_mei");
        setList.add("`SHISON_MEI` = :shison_mei");
        setList.add("`SEARCH_SOSEN_ID` = :search_sosen_id");
        setList.add("`SEARCH_OYA_BN` = :search_oya_bn");
        setList.add("`SEARCH_ENTITY_BN` = :search_entity_bn");
        setList.add("`SEARCH_KO_BN` = :search_ko_bn");
        setList.add("`SEARCH_SHISON_BN` = :search_shison_bn");
        return String.join("\r\n    , ", setList);
    }

    /**
     * VIEW削除
     * @return 削除件数
     */
    public int delete() {

        // VIEWの削除
        String sql = "DELETE FROM VB1_SHISON WHERE " + getWhere();
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
        map.put("entity_name", this.entityName);
        map.put("sosen_id", this.sosenId);
        map.put("sosen_mei", this.sosenMei);
        map.put("oya_mei", this.oyaMei);
        map.put("entity_1_mei", this.entity1Mei);
        map.put("ko_mei", this.koMei);
        map.put("shison_mei", this.shisonMei);
        map.put("search_sosen_id", this.searchSosenId);
        map.put("search_oya_bn", this.searchOyaBn);
        map.put("search_entity_bn", this.searchEntityBn);
        map.put("search_ko_bn", this.searchKoBn);
        map.put("search_shison_bn", this.searchShisonBn);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }
}
