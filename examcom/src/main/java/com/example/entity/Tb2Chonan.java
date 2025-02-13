package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 長男
 * @author emarfkrow
 */
public class Tb2Chonan implements IEntity {

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

    /** 長男ID */
    private Integer chonanId;

    /** @return 長男ID */
    @com.fasterxml.jackson.annotation.JsonProperty("CHONAN_ID")
    public Integer getChonanId() {
        return this.chonanId;
    }

    /** @param o 長男ID */
    public void setChonanId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chonanId = Integer.valueOf(o.toString());
        } else {
            this.chonanId = null;
        }
    }

    /** 長男情報 */
    private String chonanInfo;

    /** @return 長男情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("CHONAN_INFO")
    public String getChonanInfo() {
        return this.chonanInfo;
    }

    /** @param o 長男情報 */
    public void setChonanInfo(final Object o) {
        if (o != null) {
            this.chonanInfo = o.toString();
        } else {
            this.chonanInfo = null;
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
     * 長男照会
     * @param param1 長男ID
     * @return 長男
     */
    public static Tb2Chonan get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`CHONAN_ID` = :chonan_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`CHONAN_ID` \n";
        sql += "    , a.`CHONAN_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB2_CHONAN a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("chonan_id", param1);
        return Queries.get(sql, map, Tb2Chonan.class);
    }

    /**
     * 長男追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 長男IDの採番処理
        numbering();

        // 長男２の登録
        if (this.tb2Chonan2 != null) {
            this.tb2Chonan2.setChonanId(this.getChonanId());
            this.tb2Chonan2.insert(now, execId);
        }

        // 長男３の登録
        if (this.tb2Chonan3 != null) {
            this.tb2Chonan3.setChonanId(this.getChonanId());
            this.tb2Chonan3.insert(now, execId);
        }

        // 長男の登録
        String sql = "INSERT INTO TB2_CHONAN(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`CHONAN_ID` -- :chonan_id");
        nameList.add("`CHONAN_INFO` -- :chonan_info");
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
        valueList.add(":chonan_id");
        valueList.add(":chonan_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 長男IDの採番処理 */
    private void numbering() {
        if (this.chonanId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`CHONAN_ID`) IS NULL THEN 0 ELSE MAX(e.`CHONAN_ID`) * 1 END + 1 AS `CHONAN_ID` FROM TB2_CHONAN e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("CHONAN_ID");
        this.setChonanId(o);
    }

    /**
     * 長男更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 長男２の登録
        if (this.tb2Chonan2 != null) {
            tb2Chonan2.setChonanId(this.getChonanId());
            try {
                tb2Chonan2.insert(now, execId);
            } catch (Exception e) {
                tb2Chonan2.update(now, execId);
            }
        }

        // 長男３の登録
        if (this.tb2Chonan3 != null) {
            tb2Chonan3.setChonanId(this.getChonanId());
            try {
                tb2Chonan3.insert(now, execId);
            } catch (Exception e) {
                tb2Chonan3.update(now, execId);
            }
        }

        // 長男の登録
        String sql = "UPDATE TB2_CHONAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`CHONAN_ID` = :chonan_id");
        setList.add("`CHONAN_INFO` = :chonan_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 長男削除
     * @return 削除件数
     */
    public int delete() {

        // 長男２の削除
        if (this.tb2Chonan2 != null) {
            this.tb2Chonan2.delete();
        }

        // 長男３の削除
        if (this.tb2Chonan3 != null) {
            this.tb2Chonan3.delete();
        }

        // 長男の削除
        String sql = "DELETE FROM TB2_CHONAN WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`CHONAN_ID` = :chonan_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("chonan_id", this.chonanId);
        map.put("chonan_info", this.chonanInfo);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 長男２ */
    private Tb2Chonan2 tb2Chonan2;

    /** @return 長男２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Chonan2")
    public Tb2Chonan2 getTb2Chonan2() {
        return this.tb2Chonan2;
    }

    /** @param p 長男２ */
    public void setTb2Chonan2(final Tb2Chonan2 p) {
        this.tb2Chonan2 = p;
    }

    /** @return 長男２ */
    public Tb2Chonan2 referTb2Chonan2() {
        if (this.tb2Chonan2 == null) {
            try {
                this.tb2Chonan2 = Tb2Chonan2.get(this.chonanId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Chonan2;
    }

    /** 長男３ */
    private Tb2Chonan3 tb2Chonan3;

    /** @return 長男３ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Chonan3")
    public Tb2Chonan3 getTb2Chonan3() {
        return this.tb2Chonan3;
    }

    /** @param p 長男３ */
    public void setTb2Chonan3(final Tb2Chonan3 p) {
        this.tb2Chonan3 = p;
    }

    /** @return 長男３ */
    public Tb2Chonan3 referTb2Chonan3() {
        if (this.tb2Chonan3 == null) {
            try {
                this.tb2Chonan3 = Tb2Chonan3.get(this.chonanId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Chonan3;
    }
}
