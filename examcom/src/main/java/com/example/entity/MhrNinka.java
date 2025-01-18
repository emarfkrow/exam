package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 認可マスタ
 * @author emarfkrow
 */
public class MhrNinka implements IEntity {

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

    /** 部署ID */
    private Integer bushoId;

    /** @return 部署ID */
    @com.fasterxml.jackson.annotation.JsonProperty("BUSHO_ID")
    public Integer getBushoId() {
        return this.bushoId;
    }

    /** @param o 部署ID */
    public void setBushoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bushoId = Integer.valueOf(o.toString());
        } else {
            this.bushoId = null;
        }
    }

    /** 部署ID参照 */
    private String `bushoMei`;

    /** @return 部署ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("`BUSHO_MEI`")
    public String get`bushoMei`() {
        return this.`bushoMei`;
    }

    /** @param o 部署ID参照 */
    public void set`bushoMei`(final Object o) {
        if (o != null) {
            this.`bushoMei` = o.toString();
        } else {
            this.`bushoMei` = null;
        }
    }

    /** 職位ID */
    private Integer shokuiId;

    /** @return 職位ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SHOKUI_ID")
    public Integer getShokuiId() {
        return this.shokuiId;
    }

    /** @param o 職位ID */
    public void setShokuiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shokuiId = Integer.valueOf(o.toString());
        } else {
            this.shokuiId = null;
        }
    }

    /** 職位ID参照 */
    private String `shokuiMei`;

    /** @return 職位ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("`SHOKUI_MEI`")
    public String get`shokuiMei`() {
        return this.`shokuiMei`;
    }

    /** @param o 職位ID参照 */
    public void set`shokuiMei`(final Object o) {
        if (o != null) {
            this.`shokuiMei` = o.toString();
        } else {
            this.`shokuiMei` = null;
        }
    }

    /** 機能名称 */
    private String kinoNm;

    /** @return 機能名称 */
    @com.fasterxml.jackson.annotation.JsonProperty("KINO_NM")
    public String getKinoNm() {
        return this.kinoNm;
    }

    /** @param o 機能名称 */
    public void setKinoNm(final Object o) {
        if (o != null) {
            this.kinoNm = o.toString();
        } else {
            this.kinoNm = null;
        }
    }

    /** 権限区分 */
    private String kengenKb;

    /** @return 権限区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("KENGEN_KB")
    public String getKengenKb() {
        return this.kengenKb;
    }

    /** @param o 権限区分 */
    public void setKengenKb(final Object o) {
        if (o != null) {
            this.kengenKb = o.toString();
        } else {
            this.kengenKb = null;
        }
    }

    /** 開始日 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)
    private java.time.LocalDate kaishiBi;

    /** @return 開始日 */
    @com.fasterxml.jackson.annotation.JsonProperty("KAISHI_BI")
    public java.time.LocalDate getKaishiBi() {
        return this.kaishiBi;
    }

    /** @param o 開始日 */
    public void setKaishiBi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaishiBi = java.time.LocalDate.parse(o.toString().substring(0, 10));
        } else {
            this.kaishiBi = null;
        }
    }

    /** 終了日 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)
    private java.time.LocalDate shuryoBi;

    /** @return 終了日 */
    @com.fasterxml.jackson.annotation.JsonProperty("SHURYO_BI")
    public java.time.LocalDate getShuryoBi() {
        return this.shuryoBi;
    }

    /** @param o 終了日 */
    public void setShuryoBi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuryoBi = java.time.LocalDate.parse(o.toString().substring(0, 10));
        } else {
            this.shuryoBi = null;
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
     * 認可マスタ照会
     * @param param1 部署ID
     * @param param2 職位ID
     * @param param3 機能名称
     * @return 認可マスタ
     */
    public static MhrNinka get(final Object param1, final Object param2, final Object param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`BUSHO_ID` = :busho_id");
        whereList.add("`SHOKUI_ID` = :shokui_id");
        whereList.add("`KINO_NM` = :kino_nm");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`BUSHO_ID` \n";
        sql += "    , a.`SHOKUI_ID` \n";
        sql += "    , a.`KINO_NM` \n";
        sql += "    , a.`KENGEN_KB` \n";
        sql += "    , a.`KAISHI_BI` AS KAISHI_BI \n";
        sql += "    , a.`SHURYO_BI` AS SHURYO_BI \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    MHR_NINKA a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("busho_id", param1);
        map.put("shokui_id", param2);
        map.put("kino_nm", param3);
        return Queries.get(sql, map, MhrNinka.class);
    }

    /**
     * 認可マスタ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 認可マスタの登録
        String sql = "INSERT INTO MHR_NINKA(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`BUSHO_ID` -- :busho_id");
        nameList.add("`SHOKUI_ID` -- :shokui_id");
        nameList.add("`KINO_NM` -- :kino_nm");
        nameList.add("`KENGEN_KB` -- :kengen_kb");
        nameList.add("`KAISHI_BI` -- :kaishi_bi");
        nameList.add("`SHURYO_BI` -- :shuryo_bi");
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
        valueList.add(":busho_id");
        valueList.add(":shokui_id");
        valueList.add(":kino_nm");
        valueList.add(":kengen_kb");
        valueList.add(":kaishi_bi");
        valueList.add(":shuryo_bi");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 認可マスタ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 認可マスタの登録
        String sql = "UPDATE MHR_NINKA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`BUSHO_ID` = :busho_id");
        setList.add("`SHOKUI_ID` = :shokui_id");
        setList.add("`KINO_NM` = :kino_nm");
        setList.add("`KENGEN_KB` = :kengen_kb");
        setList.add("`KAISHI_BI` = :kaishi_bi");
        setList.add("`SHURYO_BI` = :shuryo_bi");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 認可マスタ削除
     * @return 削除件数
     */
    public int delete() {

        // 認可マスタの削除
        String sql = "DELETE FROM MHR_NINKA WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`BUSHO_ID` = :busho_id");
        whereList.add("`SHOKUI_ID` = :shokui_id");
        whereList.add("`KINO_NM` = :kino_nm");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("busho_id", this.bushoId);
        map.put("shokui_id", this.shokuiId);
        map.put("kino_nm", this.kinoNm);
        map.put("kengen_kb", this.kengenKb);
        map.put("kaishi_bi", this.kaishiBi);
        map.put("shuryo_bi", this.shuryoBi);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
