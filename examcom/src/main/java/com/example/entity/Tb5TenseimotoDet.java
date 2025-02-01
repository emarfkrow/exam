package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 転生元明細
 * @author emarfkrow
 */
public class Tb5TenseimotoDet implements IEntity {

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

    /** 転生元ID */
    private Integer tenseimotoId;

    /** @return 転生元ID */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEIMOTO_ID")
    public Integer getTenseimotoId() {
        return this.tenseimotoId;
    }

    /** @param o 転生元ID */
    public void setTenseimotoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenseimotoId = Integer.valueOf(o.toString());
        } else {
            this.tenseimotoId = null;
        }
    }

    /** 転生元枝番 */
    private Integer tenseimotoBn;

    /** @return 転生元枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEIMOTO_BN")
    public Integer getTenseimotoBn() {
        return this.tenseimotoBn;
    }

    /** @param o 転生元枝番 */
    public void setTenseimotoBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenseimotoBn = Integer.valueOf(o.toString());
        } else {
            this.tenseimotoBn = null;
        }
    }

    /** 転生元明細情報 */
    private String tenseimotoDetInfo;

    /** @return 転生元明細情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEIMOTO_DET_INFO")
    public String getTenseimotoDetInfo() {
        return this.tenseimotoDetInfo;
    }

    /** @param o 転生元明細情報 */
    public void setTenseimotoDetInfo(final Object o) {
        if (o != null) {
            this.tenseimotoDetInfo = o.toString();
        } else {
            this.tenseimotoDetInfo = null;
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
     * 転生元明細照会
     * @param param1 転生元ID
     * @param param2 転生元枝番
     * @return 転生元明細
     */
    public static Tb5TenseimotoDet get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEIMOTO_ID` = :tenseimoto_id");
        whereList.add("`TENSEIMOTO_BN` = :tenseimoto_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`TENSEIMOTO_ID` \n";
        sql += "    , a.`TENSEIMOTO_BN` \n";
        sql += "    , a.`TENSEIMOTO_DET_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB5_TENSEIMOTO_DET a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tenseimoto_id", param1);
        map.put("tenseimoto_bn", param2);
        return Queries.get(sql, map, Tb5TenseimotoDet.class);
    }

    /**
     * 転生元明細追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 転生元枝番の採番処理
        numbering();

        // 転生元明細の登録
        String sql = "INSERT INTO TB5_TENSEIMOTO_DET(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`TENSEIMOTO_ID` -- :tenseimoto_id");
        nameList.add("`TENSEIMOTO_BN` -- :tenseimoto_bn");
        nameList.add("`TENSEIMOTO_DET_INFO` -- :tenseimoto_det_info");
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
        valueList.add(":tenseimoto_id");
        valueList.add(":tenseimoto_bn");
        valueList.add(":tenseimoto_det_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 転生元枝番の採番処理 */
    private void numbering() {
        if (this.tenseimotoBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`TENSEIMOTO_BN`) IS NULL THEN 0 ELSE MAX(e.`TENSEIMOTO_BN`) * 1 END + 1 AS `TENSEIMOTO_BN` FROM TB5_TENSEIMOTO_DET e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`TENSEIMOTO_ID` = :tenseimoto_id");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("tenseimoto_id", this.tenseimotoId);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("TENSEIMOTO_BN");
        this.setTenseimotoBn(o);
    }

    /**
     * 転生元明細更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 転生元明細の登録
        String sql = "UPDATE TB5_TENSEIMOTO_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`TENSEIMOTO_ID` = :tenseimoto_id");
        setList.add("`TENSEIMOTO_BN` = :tenseimoto_bn");
        setList.add("`TENSEIMOTO_DET_INFO` = :tenseimoto_det_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 転生元明細削除
     * @return 削除件数
     */
    public int delete() {

        // 転生元明細の削除
        String sql = "DELETE FROM TB5_TENSEIMOTO_DET WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEIMOTO_ID` = :tenseimoto_id");
        whereList.add("`TENSEIMOTO_BN` = :tenseimoto_bn");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tenseimoto_id", this.tenseimotoId);
        map.put("tenseimoto_bn", this.tenseimotoBn);
        map.put("tenseimoto_det_info", this.tenseimotoDetInfo);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
