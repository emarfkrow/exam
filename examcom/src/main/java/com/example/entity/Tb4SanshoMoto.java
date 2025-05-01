package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 参照元
 * @author emarfkrow
 */
public class Tb4SanshoMoto implements IEntity {

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

    /** 参照元ID */
    private Integer refId;

    /** @return 参照元ID */
    @com.fasterxml.jackson.annotation.JsonProperty("REF_ID")
    public Integer getRefId() {
        return this.refId;
    }

    /** @param o 参照元ID */
    public void setRefId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.refId = Integer.valueOf(o.toString());
        } else {
            this.refId = null;
        }
    }

    /** ID参照ID */
    private Integer idrefId;

    /** @return ID参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty("IDREF_ID")
    public Integer getIdrefId() {
        return this.idrefId;
    }

    /** @param o ID参照ID */
    public void setIdrefId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idrefId = Integer.valueOf(o.toString());
        } else {
            this.idrefId = null;
        }
    }

    /** ID参照名 */
    private String idrefMei;

    /** @return ID参照名 */
    @com.fasterxml.jackson.annotation.JsonProperty("IDREF_MEI")
    public String getIdrefMei() {
        return this.idrefMei;
    }

    /** @param o ID参照名 */
    public void setIdrefMei(final Object o) {
        if (o != null) {
            this.idrefMei = o.toString();
        } else {
            this.idrefMei = null;
        }
    }

    /** CD参照CD */
    private String cdrefCd;

    /** @return CD参照CD */
    @com.fasterxml.jackson.annotation.JsonProperty("CDREF_CD")
    public String getCdrefCd() {
        return this.cdrefCd;
    }

    /** @param o CD参照CD */
    public void setCdrefCd(final Object o) {
        if (o != null) {
            this.cdrefCd = o.toString();
        } else {
            this.cdrefCd = null;
        }
    }

    /** CD参照名 */
    private String cdrefMei;

    /** @return CD参照名 */
    @com.fasterxml.jackson.annotation.JsonProperty("CDREF_MEI")
    public String getCdrefMei() {
        return this.cdrefMei;
    }

    /** @param o CD参照名 */
    public void setCdrefMei(final Object o) {
        if (o != null) {
            this.cdrefMei = o.toString();
        } else {
            this.cdrefMei = null;
        }
    }

    /** NO参照NO */
    private String norefNo;

    /** @return NO参照NO */
    @com.fasterxml.jackson.annotation.JsonProperty("NOREF_NO")
    public String getNorefNo() {
        return this.norefNo;
    }

    /** @param o NO参照NO */
    public void setNorefNo(final Object o) {
        if (o != null) {
            this.norefNo = o.toString();
        } else {
            this.norefNo = null;
        }
    }

    /** NO参照名 */
    private String norefMei;

    /** @return NO参照名 */
    @com.fasterxml.jackson.annotation.JsonProperty("NOREF_MEI")
    public String getNorefMei() {
        return this.norefMei;
    }

    /** @param o NO参照名 */
    public void setNorefMei(final Object o) {
        if (o != null) {
            this.norefMei = o.toString();
        } else {
            this.norefMei = null;
        }
    }

    /** 別ID参照ID */
    private Integer betsuIdrefId;

    /** @return 別ID参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_IDREF_ID")
    public Integer getBetsuIdrefId() {
        return this.betsuIdrefId;
    }

    /** @param o 別ID参照ID */
    public void setBetsuIdrefId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.betsuIdrefId = Integer.valueOf(o.toString());
        } else {
            this.betsuIdrefId = null;
        }
    }

    /** 別ID参照ID参照 */
    private String betsuIdrefMei;

    /** @return 別ID参照ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_IDREF_MEI")
    public String getBetsuIdrefMei() {
        return this.betsuIdrefMei;
    }

    /** @param o 別ID参照ID参照 */
    public void setBetsuIdrefMei(final Object o) {
        if (o != null) {
            this.betsuIdrefMei = o.toString();
        } else {
            this.betsuIdrefMei = null;
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

    /**
     * 参照元照会
     * @param param1 参照元ID
     * @return 参照元
     */
    public static Tb4SanshoMoto get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`REF_ID` = :ref_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`REF_ID` \n";
        sql += "    , a.`IDREF_ID` \n";
        sql += "    , a.`IDREF_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`CDREF_CD`) AS CDREF_CD \n";
        sql += "    , a.`CDREF_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NOREF_NO`) AS NOREF_NO \n";
        sql += "    , a.`NOREF_MEI` \n";
        sql += "    , a.`BETSU_IDREF_ID` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB4_SANSHO_MOTO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ref_id", param1);
        return Queries.get(sql, map, Tb4SanshoMoto.class);
    }

    /**
     * 参照元追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 参照元IDの採番処理
        numbering();

        // 参照元の登録
        String sql = "INSERT INTO TB4_SANSHO_MOTO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`REF_ID` -- :ref_id");
        nameList.add("`IDREF_ID` -- :idref_id");
        nameList.add("`IDREF_MEI` -- :idref_mei");
        nameList.add("`CDREF_CD` -- :cdref_cd");
        nameList.add("`CDREF_MEI` -- :cdref_mei");
        nameList.add("`NOREF_NO` -- :noref_no");
        nameList.add("`NOREF_MEI` -- :noref_mei");
        nameList.add("`BETSU_IDREF_ID` -- :betsu_idref_id");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":ref_id");
        valueList.add(":idref_id");
        valueList.add(":idref_mei");
        valueList.add(":cdref_cd");
        valueList.add(":cdref_mei");
        valueList.add(":noref_no");
        valueList.add(":noref_mei");
        valueList.add(":betsu_idref_id");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 参照元IDの採番処理 */
    private void numbering() {
        if (this.refId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`REF_ID`) IS NULL THEN 0 ELSE MAX(e.`REF_ID`) * 1 END + 1 AS `REF_ID` FROM TB4_SANSHO_MOTO e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("REF_ID");
        this.setRefId(o);
    }

    /**
     * 参照元更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 参照元の登録
        String sql = "UPDATE TB4_SANSHO_MOTO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`REF_ID` = :ref_id");
        setList.add("`IDREF_ID` = :idref_id");
        setList.add("`IDREF_MEI` = :idref_mei");
        setList.add("`CDREF_CD` = :cdref_cd");
        setList.add("`CDREF_MEI` = :cdref_mei");
        setList.add("`NOREF_NO` = :noref_no");
        setList.add("`NOREF_MEI` = :noref_mei");
        setList.add("`BETSU_IDREF_ID` = :betsu_idref_id");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 参照元削除
     * @return 削除件数
     */
    public int delete() {

        // 参照元の削除
        String sql = "DELETE FROM TB4_SANSHO_MOTO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`REF_ID` = :ref_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ref_id", this.refId);
        map.put("idref_id", this.idrefId);
        map.put("idref_mei", this.idrefMei);
        map.put("cdref_cd", this.cdrefCd);
        map.put("cdref_mei", this.cdrefMei);
        map.put("noref_no", this.norefNo);
        map.put("noref_mei", this.norefMei);
        map.put("betsu_idref_id", this.betsuIdrefId);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
