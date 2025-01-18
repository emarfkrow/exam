package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * エンティティ１履歴
 * @author emarfkrow
 */
public class Tb1Entity1His implements IEntity {

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

    /** 親枝番 */
    private Integer oyaBn;

    /** @return 親枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_BN")
    public Integer getOyaBn() {
        return this.oyaBn;
    }

    /** @param o 親枝番 */
    public void setOyaBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaBn = Integer.valueOf(o.toString());
        } else {
            this.oyaBn = null;
        }
    }

    /** エンティティ枝番 */
    private Integer entityBn;

    /** @return エンティティ枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_BN")
    public Integer getEntityBn() {
        return this.entityBn;
    }

    /** @param o エンティティ枝番 */
    public void setEntityBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entityBn = Integer.valueOf(o.toString());
        } else {
            this.entityBn = null;
        }
    }

    /** 履歴枝番 */
    private Integer historyBn;

    /** @return 履歴枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("HISTORY_BN")
    public Integer getHistoryBn() {
        return this.historyBn;
    }

    /** @param o 履歴枝番 */
    public void setHistoryBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.historyBn = Integer.valueOf(o.toString());
        } else {
            this.historyBn = null;
        }
    }

    /** エンティティ１名 */
    private String entity1Mei;

    /** @return エンティティ１名 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY1_MEI")
    public String getEntity1Mei() {
        return this.entity1Mei;
    }

    /** @param o エンティティ１名 */
    public void setEntity1Mei(final Object o) {
        if (o != null) {
            this.entity1Mei = o.toString();
        } else {
            this.entity1Mei = null;
        }
    }

    /** 参照１ID */
    private Integer sansho1Id;

    /** @return 参照１ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO1_ID")
    public Integer getSansho1Id() {
        return this.sansho1Id;
    }

    /** @param o 参照１ID */
    public void setSansho1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho1Id = Integer.valueOf(o.toString());
        } else {
            this.sansho1Id = null;
        }
    }

    /** 参照１名 */
    private String sansho1Mei;

    /** @return 参照１名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO1_MEI")
    public String getSansho1Mei() {
        return this.sansho1Mei;
    }

    /** @param o 参照１名 */
    public void setSansho1Mei(final Object o) {
        if (o != null) {
            this.sansho1Mei = o.toString();
        } else {
            this.sansho1Mei = null;
        }
    }

    /** 参照２CD */
    private String sansho2Cd;

    /** @return 参照２CD */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO2_CD")
    public String getSansho2Cd() {
        return this.sansho2Cd;
    }

    /** @param o 参照２CD */
    public void setSansho2Cd(final Object o) {
        if (o != null) {
            this.sansho2Cd = o.toString();
        } else {
            this.sansho2Cd = null;
        }
    }

    /** 参照２名 */
    private String sansho2Mei;

    /** @return 参照２名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO2_MEI")
    public String getSansho2Mei() {
        return this.sansho2Mei;
    }

    /** @param o 参照２名 */
    public void setSansho2Mei(final Object o) {
        if (o != null) {
            this.sansho2Mei = o.toString();
        } else {
            this.sansho2Mei = null;
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

    /** 別参照１ID */
    private Integer betsuSansho1Id;

    /** @return 別参照１ID */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_SANSHO1_ID")
    public Integer getBetsuSansho1Id() {
        return this.betsuSansho1Id;
    }

    /** @param o 別参照１ID */
    public void setBetsuSansho1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.betsuSansho1Id = Integer.valueOf(o.toString());
        } else {
            this.betsuSansho1Id = null;
        }
    }

    /** 別参照１名 */
    private String betsuSansho1Mei;

    /** @return 別参照１名 */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_SANSHO1_MEI")
    public String getBetsuSansho1Mei() {
        return this.betsuSansho1Mei;
    }

    /** @param o 別参照１名 */
    public void setBetsuSansho1Mei(final Object o) {
        if (o != null) {
            this.betsuSansho1Mei = o.toString();
        } else {
            this.betsuSansho1Mei = null;
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
    private String `insertUserSei`;

    /** @return 作成者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("`INSERT_USER_SEI`")
    public String get`insertUserSei`() {
        return this.`insertUserSei`;
    }

    /** @param o 作成者参照 */
    public void set`insertUserSei`(final Object o) {
        if (o != null) {
            this.`insertUserSei` = o.toString();
        } else {
            this.`insertUserSei` = null;
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
    private String `updateUserSei`;

    /** @return 更新者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("`UPDATE_USER_SEI`")
    public String get`updateUserSei`() {
        return this.`updateUserSei`;
    }

    /** @param o 更新者参照 */
    public void set`updateUserSei`(final Object o) {
        if (o != null) {
            this.`updateUserSei` = o.toString();
        } else {
            this.`updateUserSei` = null;
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

    /** ステータス区分 */
    private String statusKb;

    /** @return ステータス区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("STATUS_KB")
    public String getStatusKb() {
        return this.statusKb;
    }

    /** @param o ステータス区分 */
    public void setStatusKb(final Object o) {
        if (o != null) {
            this.statusKb = o.toString();
        } else {
            this.statusKb = null;
        }
    }

    /**
     * エンティティ１履歴照会
     * @param param1 祖先ID
     * @param param2 親枝番
     * @param param3 エンティティ枝番
     * @param param4 履歴枝番
     * @return エンティティ１履歴
     */
    public static Tb1Entity1His get(final Object param1, final Object param2, final Object param3, final Object param4) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        whereList.add("`ENTITY_BN` = :entity_bn");
        whereList.add("`HISTORY_BN` = :history_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SOSEN_ID` \n";
        sql += "    , a.`OYA_BN` \n";
        sql += "    , a.`ENTITY_BN` \n";
        sql += "    , a.`HISTORY_BN` \n";
        sql += "    , a.`ENTITY1_MEI` \n";
        sql += "    , a.`SANSHO1_ID` \n";
        sql += "    , a.`SANSHO1_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`SANSHO2_CD`) AS SANSHO2_CD \n";
        sql += "    , a.`SANSHO2_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`SANSHO3_NO`) AS SANSHO3_NO \n";
        sql += "    , a.`SANSHO3_MEI` \n";
        sql += "    , a.`BETSU_SANSHO1_ID` \n";
        sql += "    , a.`BETSU_SANSHO1_MEI` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB1_ENTITY1_HIS a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        map.put("history_bn", param4);
        return Queries.get(sql, map, Tb1Entity1His.class);
    }

    /**
     * エンティティ１履歴追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 履歴枝番の採番処理
        numbering();

        // エンティティ１履歴の登録
        String sql = "INSERT INTO TB1_ENTITY1_HIS(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_BN` -- :oya_bn");
        nameList.add("`ENTITY_BN` -- :entity_bn");
        nameList.add("`HISTORY_BN` -- :history_bn");
        nameList.add("`ENTITY1_MEI` -- :entity_1_mei");
        nameList.add("`SANSHO1_ID` -- :sansho_1_id");
        nameList.add("`SANSHO1_MEI` -- :sansho_1_mei");
        nameList.add("`SANSHO2_CD` -- :sansho_2_cd");
        nameList.add("`SANSHO2_MEI` -- :sansho_2_mei");
        nameList.add("`SANSHO3_NO` -- :sansho_3_no");
        nameList.add("`SANSHO3_MEI` -- :sansho_3_mei");
        nameList.add("`BETSU_SANSHO1_ID` -- :betsu_sansho_1_id");
        nameList.add("`BETSU_SANSHO1_MEI` -- :betsu_sansho_1_mei");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        nameList.add("`DELETE_F` -- :delete_f");
        nameList.add("`STATUS_KB` -- :status_kb");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_bn");
        valueList.add(":entity_bn");
        valueList.add(":history_bn");
        valueList.add(":entity_1_mei");
        valueList.add(":sansho_1_id");
        valueList.add(":sansho_1_mei");
        valueList.add(":sansho_2_cd");
        valueList.add(":sansho_2_mei");
        valueList.add(":sansho_3_no");
        valueList.add(":sansho_3_mei");
        valueList.add(":betsu_sansho_1_id");
        valueList.add(":betsu_sansho_1_mei");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 履歴枝番の採番処理 */
    private void numbering() {
        if (this.historyBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`HISTORY_BN`) IS NULL THEN 0 ELSE MAX(e.`HISTORY_BN`) * 1 END + 1 AS `HISTORY_BN` FROM TB1_ENTITY1_HIS e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        whereList.add("e.`OYA_BN` = :oya_bn");
        whereList.add("e.`ENTITY_BN` = :entity_bn");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        map.put("oya_bn", this.oyaBn);
        map.put("entity_bn", this.entityBn);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("HISTORY_BN");
        this.setHistoryBn(o);
    }

    /**
     * エンティティ１履歴更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // エンティティ１履歴の登録
        String sql = "UPDATE TB1_ENTITY1_HIS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_BN` = :oya_bn");
        setList.add("`ENTITY_BN` = :entity_bn");
        setList.add("`HISTORY_BN` = :history_bn");
        setList.add("`ENTITY1_MEI` = :entity_1_mei");
        setList.add("`SANSHO1_ID` = :sansho_1_id");
        setList.add("`SANSHO1_MEI` = :sansho_1_mei");
        setList.add("`SANSHO2_CD` = :sansho_2_cd");
        setList.add("`SANSHO2_MEI` = :sansho_2_mei");
        setList.add("`SANSHO3_NO` = :sansho_3_no");
        setList.add("`SANSHO3_MEI` = :sansho_3_mei");
        setList.add("`BETSU_SANSHO1_ID` = :betsu_sansho_1_id");
        setList.add("`BETSU_SANSHO1_MEI` = :betsu_sansho_1_mei");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * エンティティ１履歴削除
     * @return 削除件数
     */
    public int delete() {

        // エンティティ１履歴の削除
        String sql = "DELETE FROM TB1_ENTITY1_HIS WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        whereList.add("`ENTITY_BN` = :entity_bn");
        whereList.add("`HISTORY_BN` = :history_bn");
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
        map.put("oya_bn", this.oyaBn);
        map.put("entity_bn", this.entityBn);
        map.put("history_bn", this.historyBn);
        map.put("entity_1_mei", this.entity1Mei);
        map.put("sansho_1_id", this.sansho1Id);
        map.put("sansho_1_mei", this.sansho1Mei);
        map.put("sansho_2_cd", this.sansho2Cd);
        map.put("sansho_2_mei", this.sansho2Mei);
        map.put("sansho_3_no", this.sansho3No);
        map.put("sansho_3_mei", this.sansho3Mei);
        map.put("betsu_sansho_1_id", this.betsuSansho1Id);
        map.put("betsu_sansho_1_mei", this.betsuSansho1Mei);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
