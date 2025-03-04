package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 転生先明細
 * @author emarfkrow
 */
public class Tb5TenseiSakiDet implements IEntity {

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

    /** 転生先ID */
    private Integer tenseiSakiId;

    /** @return 転生先ID */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_SAKI_ID")
    public Integer getTenseiSakiId() {
        return this.tenseiSakiId;
    }

    /** @param o 転生先ID */
    public void setTenseiSakiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenseiSakiId = Integer.valueOf(o.toString());
        } else {
            this.tenseiSakiId = null;
        }
    }

    /** 転生先枝番 */
    private Integer tenseiSakiBn;

    /** @return 転生先枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_SAKI_BN")
    public Integer getTenseiSakiBn() {
        return this.tenseiSakiBn;
    }

    /** @param o 転生先枝番 */
    public void setTenseiSakiBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenseiSakiBn = Integer.valueOf(o.toString());
        } else {
            this.tenseiSakiBn = null;
        }
    }

    /** 転生先明細情報 */
    private String tenseiSakiDetInfo;

    /** @return 転生先明細情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_SAKI_DET_INFO")
    public String getTenseiSakiDetInfo() {
        return this.tenseiSakiDetInfo;
    }

    /** @param o 転生先明細情報 */
    public void setTenseiSakiDetInfo(final Object o) {
        if (o != null) {
            this.tenseiSakiDetInfo = o.toString();
        } else {
            this.tenseiSakiDetInfo = null;
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
     * 転生先明細照会
     * @param param1 転生先ID
     * @param param2 転生先枝番
     * @return 転生先明細
     */
    public static Tb5TenseiSakiDet get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_SAKI_ID` = :tensei_saki_id");
        whereList.add("`TENSEI_SAKI_BN` = :tensei_saki_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`TENSEI_SAKI_ID` \n";
        sql += "    , a.`TENSEI_SAKI_BN` \n";
        sql += "    , a.`TENSEI_SAKI_DET_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB5_TENSEI_SAKI_DET a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_saki_id", param1);
        map.put("tensei_saki_bn", param2);
        return Queries.get(sql, map, Tb5TenseiSakiDet.class);
    }

    /**
     * 転生先明細追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 転生先枝番の採番処理
        numbering();

        // 転生先明細の登録
        String sql = "INSERT INTO TB5_TENSEI_SAKI_DET(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`TENSEI_SAKI_ID` -- :tensei_saki_id");
        nameList.add("`TENSEI_SAKI_BN` -- :tensei_saki_bn");
        nameList.add("`TENSEI_SAKI_DET_INFO` -- :tensei_saki_det_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":tensei_saki_id");
        valueList.add(":tensei_saki_bn");
        valueList.add(":tensei_saki_det_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 転生先枝番の採番処理 */
    private void numbering() {
        if (this.tenseiSakiBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`TENSEI_SAKI_BN`) IS NULL THEN 0 ELSE MAX(e.`TENSEI_SAKI_BN`) * 1 END + 1 AS `TENSEI_SAKI_BN` FROM TB5_TENSEI_SAKI_DET e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`TENSEI_SAKI_ID` = :tensei_saki_id");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("tensei_saki_id", this.tenseiSakiId);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("TENSEI_SAKI_BN");
        this.setTenseiSakiBn(o);
    }

    /**
     * 転生先明細更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 転生先明細の登録
        String sql = "UPDATE TB5_TENSEI_SAKI_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`TENSEI_SAKI_ID` = :tensei_saki_id");
        setList.add("`TENSEI_SAKI_BN` = :tensei_saki_bn");
        setList.add("`TENSEI_SAKI_DET_INFO` = :tensei_saki_det_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 転生先明細削除
     * @return 削除件数
     */
    public int delete() {

        // 転生先明細の削除
        String sql = "DELETE FROM TB5_TENSEI_SAKI_DET WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_SAKI_ID` = :tensei_saki_id");
        whereList.add("`TENSEI_SAKI_BN` = :tensei_saki_bn");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_saki_id", this.tenseiSakiId);
        map.put("tensei_saki_bn", this.tenseiSakiBn);
        map.put("tensei_saki_det_info", this.tenseiSakiDetInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
