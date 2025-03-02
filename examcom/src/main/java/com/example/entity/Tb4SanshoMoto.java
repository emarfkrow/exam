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
    private Integer sanshoMotoId;

    /** @return 参照元ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO_MOTO_ID")
    public Integer getSanshoMotoId() {
        return this.sanshoMotoId;
    }

    /** @param o 参照元ID */
    public void setSanshoMotoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sanshoMotoId = Integer.valueOf(o.toString());
        } else {
            this.sanshoMotoId = null;
        }
    }

    /** ID参照ID */
    private Integer idsanshoId;

    /** @return ID参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty("IDSANSHO_ID")
    public Integer getIdsanshoId() {
        return this.idsanshoId;
    }

    /** @param o ID参照ID */
    public void setIdsanshoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idsanshoId = Integer.valueOf(o.toString());
        } else {
            this.idsanshoId = null;
        }
    }

    /** ID参照名 */
    private String idsanshoMei;

    /** @return ID参照名 */
    @com.fasterxml.jackson.annotation.JsonProperty("IDSANSHO_MEI")
    public String getIdsanshoMei() {
        return this.idsanshoMei;
    }

    /** @param o ID参照名 */
    public void setIdsanshoMei(final Object o) {
        if (o != null) {
            this.idsanshoMei = o.toString();
        } else {
            this.idsanshoMei = null;
        }
    }

    /** CD参照CD */
    private String cdsanshoCd;

    /** @return CD参照CD */
    @com.fasterxml.jackson.annotation.JsonProperty("CDSANSHO_CD")
    public String getCdsanshoCd() {
        return this.cdsanshoCd;
    }

    /** @param o CD参照CD */
    public void setCdsanshoCd(final Object o) {
        if (o != null) {
            this.cdsanshoCd = o.toString();
        } else {
            this.cdsanshoCd = null;
        }
    }

    /** CD参照名 */
    private String cdsanshoMei;

    /** @return CD参照名 */
    @com.fasterxml.jackson.annotation.JsonProperty("CDSANSHO_MEI")
    public String getCdsanshoMei() {
        return this.cdsanshoMei;
    }

    /** @param o CD参照名 */
    public void setCdsanshoMei(final Object o) {
        if (o != null) {
            this.cdsanshoMei = o.toString();
        } else {
            this.cdsanshoMei = null;
        }
    }

    /** NO参照NO */
    private String nosanshoNo;

    /** @return NO参照NO */
    @com.fasterxml.jackson.annotation.JsonProperty("NOSANSHO_NO")
    public String getNosanshoNo() {
        return this.nosanshoNo;
    }

    /** @param o NO参照NO */
    public void setNosanshoNo(final Object o) {
        if (o != null) {
            this.nosanshoNo = o.toString();
        } else {
            this.nosanshoNo = null;
        }
    }

    /** NO参照名 */
    private String nosanshoMei;

    /** @return NO参照名 */
    @com.fasterxml.jackson.annotation.JsonProperty("NOSANSHO_MEI")
    public String getNosanshoMei() {
        return this.nosanshoMei;
    }

    /** @param o NO参照名 */
    public void setNosanshoMei(final Object o) {
        if (o != null) {
            this.nosanshoMei = o.toString();
        } else {
            this.nosanshoMei = null;
        }
    }

    /** 別ID参照ID */
    private Integer betsuIdsanshoId;

    /** @return 別ID参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_IDSANSHO_ID")
    public Integer getBetsuIdsanshoId() {
        return this.betsuIdsanshoId;
    }

    /** @param o 別ID参照ID */
    public void setBetsuIdsanshoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.betsuIdsanshoId = Integer.valueOf(o.toString());
        } else {
            this.betsuIdsanshoId = null;
        }
    }

    /** 別ID参照ID参照 */
    private String betsuIdsanshoMei;

    /** @return 別ID参照ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_IDSANSHO_MEI")
    public String getBetsuIdsanshoMei() {
        return this.betsuIdsanshoMei;
    }

    /** @param o 別ID参照ID参照 */
    public void setBetsuIdsanshoMei(final Object o) {
        if (o != null) {
            this.betsuIdsanshoMei = o.toString();
        } else {
            this.betsuIdsanshoMei = null;
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
        whereList.add("`SANSHO_MOTO_ID` = ::sansho_moto_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SANSHO_MOTO_ID` \n";
        sql += "    , a.`IDSANSHO_ID` \n";
        sql += "    , a.`IDSANSHO_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`CDSANSHO_CD`) AS CDSANSHO_CD \n";
        sql += "    , a.`CDSANSHO_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NOSANSHO_NO`) AS NOSANSHO_NO \n";
        sql += "    , a.`NOSANSHO_MEI` \n";
        sql += "    , a.`BETSU_IDSANSHO_ID` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB4_SANSHO_MOTO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sansho_moto_id", param1);
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
        nameList.add("`SANSHO_MOTO_ID` -- :sansho_moto_id");
        nameList.add("`IDSANSHO_ID` -- :idsansho_id");
        nameList.add("`IDSANSHO_MEI` -- :idsansho_mei");
        nameList.add("`CDSANSHO_CD` -- :cdsansho_cd");
        nameList.add("`CDSANSHO_MEI` -- :cdsansho_mei");
        nameList.add("`NOSANSHO_NO` -- :nosansho_no");
        nameList.add("`NOSANSHO_MEI` -- :nosansho_mei");
        nameList.add("`BETSU_IDSANSHO_ID` -- :betsu_idsansho_id");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sansho_moto_id");
        valueList.add(":idsansho_id");
        valueList.add(":idsansho_mei");
        valueList.add(":cdsansho_cd");
        valueList.add(":cdsansho_mei");
        valueList.add(":nosansho_no");
        valueList.add(":nosansho_mei");
        valueList.add(":betsu_idsansho_id");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 参照元IDの採番処理 */
    private void numbering() {
        if (this.sanshoMotoId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`SANSHO_MOTO_ID`) IS NULL THEN 0 ELSE MAX(e.`SANSHO_MOTO_ID`) * 1 END + 1 AS `SANSHO_MOTO_ID` FROM TB4_SANSHO_MOTO e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("SANSHO_MOTO_ID");
        this.setSanshoMotoId(o);
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
        setList.add("`SANSHO_MOTO_ID` = :sansho_moto_id");
        setList.add("`IDSANSHO_ID` = :idsansho_id");
        setList.add("`IDSANSHO_MEI` = :idsansho_mei");
        setList.add("`CDSANSHO_CD` = :cdsansho_cd");
        setList.add("`CDSANSHO_MEI` = :cdsansho_mei");
        setList.add("`NOSANSHO_NO` = :nosansho_no");
        setList.add("`NOSANSHO_MEI` = :nosansho_mei");
        setList.add("`BETSU_IDSANSHO_ID` = :betsu_idsansho_id");
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
        whereList.add("`SANSHO_MOTO_ID` = ::sansho_moto_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sansho_moto_id", this.sanshoMotoId);
        map.put("idsansho_id", this.idsanshoId);
        map.put("idsansho_mei", this.idsanshoMei);
        map.put("cdsansho_cd", this.cdsanshoCd);
        map.put("cdsansho_mei", this.cdsanshoMei);
        map.put("nosansho_no", this.nosanshoNo);
        map.put("nosansho_mei", this.nosanshoMei);
        map.put("betsu_idsansho_id", this.betsuIdsanshoId);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
