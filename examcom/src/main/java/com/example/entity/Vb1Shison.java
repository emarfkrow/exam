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
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_NAME")
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

    /** SOSEN_ID */
    private Integer sosenId;

    /** @return SOSEN_ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SOSEN_ID")
    public Integer getSosenId() {
        return this.sosenId;
    }

    /** @param o SOSEN_ID */
    public void setSosenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sosenId = Integer.valueOf(o.toString());
        } else {
            this.sosenId = null;
        }
    }

    /** OYA_MEI */
    private String oyaMei;

    /** @return OYA_MEI */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_MEI")
    public String getOyaMei() {
        return this.oyaMei;
    }

    /** @param o OYA_MEI */
    public void setOyaMei(final Object o) {
        if (o != null) {
            this.oyaMei = o.toString();
        } else {
            this.oyaMei = null;
        }
    }

    /** ENTITY1_MEI */
    private String entity1Mei;

    /** @return ENTITY1_MEI */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY1_MEI")
    public String getEntity1Mei() {
        return this.entity1Mei;
    }

    /** @param o ENTITY1_MEI */
    public void setEntity1Mei(final Object o) {
        if (o != null) {
            this.entity1Mei = o.toString();
        } else {
            this.entity1Mei = null;
        }
    }

    /** KO_MEI */
    private String koMei;

    /** @return KO_MEI */
    @com.fasterxml.jackson.annotation.JsonProperty("KO_MEI")
    public String getKoMei() {
        return this.koMei;
    }

    /** @param o KO_MEI */
    public void setKoMei(final Object o) {
        if (o != null) {
            this.koMei = o.toString();
        } else {
            this.koMei = null;
        }
    }

    /** SHISON_MEI */
    private String shisonMei;

    /** @return SHISON_MEI */
    @com.fasterxml.jackson.annotation.JsonProperty("SHISON_MEI")
    public String getShisonMei() {
        return this.shisonMei;
    }

    /** @param o SHISON_MEI */
    public void setShisonMei(final Object o) {
        if (o != null) {
            this.shisonMei = o.toString();
        } else {
            this.shisonMei = null;
        }
    }

    /** SEARCH_SOSEN_ID */
    private Integer searchSosenId;

    /** @return SEARCH_SOSEN_ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_SOSEN_ID")
    public Integer getSearchSosenId() {
        return this.searchSosenId;
    }

    /** @param o SEARCH_SOSEN_ID */
    public void setSearchSosenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchSosenId = Integer.valueOf(o.toString());
        } else {
            this.searchSosenId = null;
        }
    }

    /** SEARCH_OYA_BN */
    private Integer searchOyaBn;

    /** @return SEARCH_OYA_BN */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_OYA_BN")
    public Integer getSearchOyaBn() {
        return this.searchOyaBn;
    }

    /** @param o SEARCH_OYA_BN */
    public void setSearchOyaBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchOyaBn = Integer.valueOf(o.toString());
        } else {
            this.searchOyaBn = null;
        }
    }

    /** SEARCH_ENTITY_BN */
    private Integer searchEntityBn;

    /** @return SEARCH_ENTITY_BN */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_ENTITY_BN")
    public Integer getSearchEntityBn() {
        return this.searchEntityBn;
    }

    /** @param o SEARCH_ENTITY_BN */
    public void setSearchEntityBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchEntityBn = Integer.valueOf(o.toString());
        } else {
            this.searchEntityBn = null;
        }
    }

    /** SEARCH_KO_BN */
    private Integer searchKoBn;

    /** @return SEARCH_KO_BN */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_KO_BN")
    public Integer getSearchKoBn() {
        return this.searchKoBn;
    }

    /** @param o SEARCH_KO_BN */
    public void setSearchKoBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchKoBn = Integer.valueOf(o.toString());
        } else {
            this.searchKoBn = null;
        }
    }

    /** SEARCH_SHISON_BN */
    private Integer searchShisonBn;

    /** @return SEARCH_SHISON_BN */
    @com.fasterxml.jackson.annotation.JsonProperty("SEARCH_SHISON_BN")
    public Integer getSearchShisonBn() {
        return this.searchShisonBn;
    }

    /** @param o SEARCH_SHISON_BN */
    public void setSearchShisonBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.searchShisonBn = Integer.valueOf(o.toString());
        } else {
            this.searchShisonBn = null;
        }
    }

    /** INSERT_TS */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return INSERT_TS */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_TS")
    public java.time.LocalDateTime getInsertTs() {
        return this.insertTs;
    }

    /** @param o INSERT_TS */
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
     * 子孫照会
     * @return 子孫
     */
    public static Vb1Shison get() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ENTITY_NAME\") = TRIM (:entity_name)");
        whereList.add("\"SOSEN_ID\" = :sosen_id");
        whereList.add("\"OYA_MEI\" = :oya_mei");
        whereList.add("\"ENTITY1_MEI\" = :entity_1_mei");
        whereList.add("\"KO_MEI\" = :ko_mei");
        whereList.add("\"SHISON_MEI\" = :shison_mei");
        whereList.add("\"SEARCH_SOSEN_ID\" = :search_sosen_id");
        whereList.add("\"SEARCH_OYA_BN\" = :search_oya_bn");
        whereList.add("\"SEARCH_ENTITY_BN\" = :search_entity_bn");
        whereList.add("\"SEARCH_KO_BN\" = :search_ko_bn");
        whereList.add("\"SEARCH_SHISON_BN\" = :search_shison_bn");
        whereList.add("\"INSERT_TS\" = :insert_ts");
        String sql = "";
        sql += "SELECT \n";
        sql += "      RTRIM (RTRIM (a.\"ENTITY_NAME\"), '　') AS ENTITY_NAME \n";
        sql += "    , a.\"SOSEN_ID\" \n";
        sql += "    , a.\"OYA_MEI\" \n";
        sql += "    , a.\"ENTITY1_MEI\" \n";
        sql += "    , a.\"KO_MEI\" \n";
        sql += "    , a.\"SHISON_MEI\" \n";
        sql += "    , a.\"SEARCH_SOSEN_ID\" \n";
        sql += "    , a.\"SEARCH_OYA_BN\" \n";
        sql += "    , a.\"SEARCH_ENTITY_BN\" \n";
        sql += "    , a.\"SEARCH_KO_BN\" \n";
        sql += "    , a.\"SEARCH_SHISON_BN\" \n";
        sql += "    , TO_CHAR (a.\"INSERT_TS\", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS \n";
        sql += "FROM \n";
        sql += "    VB1_SHISON a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        return Queries.get(sql, map, Vb1Shison.class);
    }

    /**
     * 子孫追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 子孫の登録
        String sql = "INSERT INTO VB1_SHISON(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"ENTITY_NAME\" -- :entity_name");
        nameList.add("\"SOSEN_ID\" -- :sosen_id");
        nameList.add("\"OYA_MEI\" -- :oya_mei");
        nameList.add("\"ENTITY1_MEI\" -- :entity_1_mei");
        nameList.add("\"KO_MEI\" -- :ko_mei");
        nameList.add("\"SHISON_MEI\" -- :shison_mei");
        nameList.add("\"SEARCH_SOSEN_ID\" -- :search_sosen_id");
        nameList.add("\"SEARCH_OYA_BN\" -- :search_oya_bn");
        nameList.add("\"SEARCH_ENTITY_BN\" -- :search_entity_bn");
        nameList.add("\"SEARCH_KO_BN\" -- :search_ko_bn");
        nameList.add("\"SEARCH_SHISON_BN\" -- :search_shison_bn");
        nameList.add("\"INSERT_TS\" -- :insert_ts");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":entity_name");
        valueList.add(":sosen_id");
        valueList.add(":oya_mei");
        valueList.add(":entity_1_mei");
        valueList.add(":ko_mei");
        valueList.add(":shison_mei");
        valueList.add(":search_sosen_id");
        valueList.add(":search_oya_bn");
        valueList.add(":search_entity_bn");
        valueList.add(":search_ko_bn");
        valueList.add(":search_shison_bn");
        valueList.add("TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 子孫更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 子孫の登録
        String sql = "UPDATE VB1_SHISON\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"ENTITY_NAME\" = :entity_name");
        setList.add("\"SOSEN_ID\" = :sosen_id");
        setList.add("\"OYA_MEI\" = :oya_mei");
        setList.add("\"ENTITY1_MEI\" = :entity_1_mei");
        setList.add("\"KO_MEI\" = :ko_mei");
        setList.add("\"SHISON_MEI\" = :shison_mei");
        setList.add("\"SEARCH_SOSEN_ID\" = :search_sosen_id");
        setList.add("\"SEARCH_OYA_BN\" = :search_oya_bn");
        setList.add("\"SEARCH_ENTITY_BN\" = :search_entity_bn");
        setList.add("\"SEARCH_KO_BN\" = :search_ko_bn");
        setList.add("\"SEARCH_SHISON_BN\" = :search_shison_bn");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 子孫削除
     * @return 削除件数
     */
    public int delete() {

        // 子孫の削除
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
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
