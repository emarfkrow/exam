package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 複合
 * @author emarfkrow
 */
public class Tb8Combo implements IEntity {

    /** SlickGridのDataView用ID */
    private Integer id;

    /** @return id */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id", index = 1)
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

    /** 参照ID */
    private Integer referId;

    /** @return 参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "REFER_ID", index = 2)
    public Integer getReferId() {
        return this.referId;
    }

    /** @param o 参照ID */
    public void setReferId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.referId = Integer.valueOf(o.toString());
        } else {
            this.referId = null;
        }
    }

    /** 参照ID参照 */
    private String referMei;

    /** @return 参照ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "REFER_MEI", index = 3)
    public String getReferMei() {
        return this.referMei;
    }

    /** @param o 参照ID参照 */
    public void setReferMei(final Object o) {
        if (o != null) {
            this.referMei = o.toString();
        } else {
            this.referMei = null;
        }
    }

    /** 制約ID */
    private Integer stintId;

    /** @return 制約ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "STINT_ID", index = 4)
    public Integer getStintId() {
        return this.stintId;
    }

    /** @param o 制約ID */
    public void setStintId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stintId = Integer.valueOf(o.toString());
        } else {
            this.stintId = null;
        }
    }

    /** 制約ID参照 */
    private String stintMei;

    /** @return 制約ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "STINT_MEI", index = 5)
    public String getStintMei() {
        return this.stintMei;
    }

    /** @param o 制約ID参照 */
    public void setStintMei(final Object o) {
        if (o != null) {
            this.stintMei = o.toString();
        } else {
            this.stintMei = null;
        }
    }

    /** 適用日 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)
    private java.time.LocalDate tekiyoBi;

    /** @return 適用日 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "TEKIYO_BI", index = 6)
    public java.time.LocalDate getTekiyoBi() {
        return this.tekiyoBi;
    }

    /** @param o 適用日 */
    public void setTekiyoBi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tekiyoBi = java.time.LocalDate.parse(o.toString().substring(0, 10));
        } else {
            this.tekiyoBi = null;
        }
    }

    /** 複合情報 */
    private String comboInfo;

    /** @return 複合情報 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "COMBO_INFO", index = 7)
    public String getComboInfo() {
        return this.comboInfo;
    }

    /** @param o 複合情報 */
    public void setComboInfo(final Object o) {
        if (o != null) {
            this.comboInfo = o.toString();
        } else {
            this.comboInfo = null;
        }
    }

    /** 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_TS", index = 8)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_ID", index = 9)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_SEI", index = 10)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_TS", index = 11)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_ID", index = 12)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_SEI", index = 13)
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
     * 複合照会
     * @param param1 参照ID
     * @param param2 制約ID
     * @param param3 適用日
     * @return 複合
     */
    public static Tb8Combo get(final Object param1, final Object param2, final Object param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`REFER_ID` = :refer_id");
        whereList.add("`STINT_ID` = :stint_id");
        whereList.add("`TEKIYO_BI` = :tekiyo_bi");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`REFER_ID` \n";
        sql += "    , a.`STINT_ID` \n";
        sql += "    , a.`TEKIYO_BI` AS TEKIYO_BI \n";
        sql += "    , a.`COMBO_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB8_COMBO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("refer_id", param1);
        map.put("stint_id", param2);
        map.put("tekiyo_bi", param3);
        return Queries.get(sql, map, Tb8Combo.class);
    }

    /**
     * 複合追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 複合の登録
        String sql = "INSERT INTO TB8_COMBO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`REFER_ID` -- :refer_id");
        nameList.add("`STINT_ID` -- :stint_id");
        nameList.add("`TEKIYO_BI` -- :tekiyo_bi");
        nameList.add("`COMBO_INFO` -- :combo_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":refer_id");
        valueList.add(":stint_id");
        valueList.add(":tekiyo_bi");
        valueList.add(":combo_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 複合更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 複合の登録
        String sql = "UPDATE TB8_COMBO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`REFER_ID` = :refer_id");
        setList.add("`STINT_ID` = :stint_id");
        setList.add("`TEKIYO_BI` = :tekiyo_bi");
        setList.add("`COMBO_INFO` = :combo_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 複合削除
     * @return 削除件数
     */
    public int delete() {

        // 複合の削除
        String sql = "DELETE FROM TB8_COMBO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`REFER_ID` = :refer_id");
        whereList.add("`STINT_ID` = :stint_id");
        whereList.add("`TEKIYO_BI` = :tekiyo_bi");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("refer_id", this.referId);
        map.put("stint_id", this.stintId);
        map.put("tekiyo_bi", this.tekiyoBi);
        map.put("combo_info", this.comboInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
