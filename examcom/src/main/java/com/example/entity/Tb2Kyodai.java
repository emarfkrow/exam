package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 兄弟
 * @author emarfkrow
 */
public class Tb2Kyodai implements IEntity {

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

    /** 兄弟ID */
    private Integer kyodaiId;

    /** @return 兄弟ID */
    @com.fasterxml.jackson.annotation.JsonProperty("KYODAI_ID")
    public Integer getKyodaiId() {
        return this.kyodaiId;
    }

    /** @param o 兄弟ID */
    public void setKyodaiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kyodaiId = Integer.valueOf(o.toString());
        } else {
            this.kyodaiId = null;
        }
    }

    /** 兄弟情報 */
    private String kyodaiInfo;

    /** @return 兄弟情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("KYODAI_INFO")
    public String getKyodaiInfo() {
        return this.kyodaiInfo;
    }

    /** @param o 兄弟情報 */
    public void setKyodaiInfo(final Object o) {
        if (o != null) {
            this.kyodaiInfo = o.toString();
        } else {
            this.kyodaiInfo = null;
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
     * 兄弟照会
     * @param param1 兄弟ID
     * @return 兄弟
     */
    public static Tb2Kyodai get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KYODAI_ID` = :kyodai_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`KYODAI_ID` \n";
        sql += "    , a.`KYODAI_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB2_KYODAI a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kyodai_id", param1);
        return Queries.get(sql, map, Tb2Kyodai.class);
    }

    /**
     * 兄弟追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 兄弟IDの採番処理
        numbering();

        // 兄弟２の登録
        if (this.tb2Kyodai2 != null) {
            this.tb2Kyodai2.setKyodaiId(this.getKyodaiId());
            this.tb2Kyodai2.insert(now, execId);
        }

        // 兄弟３の登録
        if (this.tb2Kyodai3 != null) {
            this.tb2Kyodai3.setKyodaiId(this.getKyodaiId());
            this.tb2Kyodai3.insert(now, execId);
        }

        // 兄弟の登録
        String sql = "INSERT INTO TB2_KYODAI(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`KYODAI_ID` -- :kyodai_id");
        nameList.add("`KYODAI_INFO` -- :kyodai_info");
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
        valueList.add(":kyodai_id");
        valueList.add(":kyodai_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 兄弟IDの採番処理 */
    private void numbering() {
        if (this.kyodaiId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`KYODAI_ID`) IS NULL THEN 0 ELSE MAX(e.`KYODAI_ID`) * 1 END + 1 AS `KYODAI_ID` FROM TB2_KYODAI e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("KYODAI_ID");
        this.setKyodaiId(o);
    }

    /**
     * 兄弟更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 兄弟２の登録
        if (this.tb2Kyodai2 != null) {
            tb2Kyodai2.setKyodaiId(this.getKyodaiId());
            try {
                tb2Kyodai2.insert(now, execId);
            } catch (Exception e) {
                tb2Kyodai2.update(now, execId);
            }
        }

        // 兄弟３の登録
        if (this.tb2Kyodai3 != null) {
            tb2Kyodai3.setKyodaiId(this.getKyodaiId());
            try {
                tb2Kyodai3.insert(now, execId);
            } catch (Exception e) {
                tb2Kyodai3.update(now, execId);
            }
        }

        // 兄弟の登録
        String sql = "UPDATE TB2_KYODAI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`KYODAI_ID` = :kyodai_id");
        setList.add("`KYODAI_INFO` = :kyodai_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 兄弟削除
     * @return 削除件数
     */
    public int delete() {

        // 兄弟２の削除
        if (this.tb2Kyodai2 != null) {
            this.tb2Kyodai2.delete();
        }

        // 兄弟３の削除
        if (this.tb2Kyodai3 != null) {
            this.tb2Kyodai3.delete();
        }

        // 兄弟の削除
        String sql = "DELETE FROM TB2_KYODAI WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KYODAI_ID` = :kyodai_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kyodai_id", this.kyodaiId);
        map.put("kyodai_info", this.kyodaiInfo);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 兄弟２ */
    private Tb2Kyodai2 tb2Kyodai2;

    /** @return 兄弟２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Kyodai2")
    public Tb2Kyodai2 getTb2Kyodai2() {
        return this.tb2Kyodai2;
    }

    /** @param p 兄弟２ */
    public void setTb2Kyodai2(final Tb2Kyodai2 p) {
        this.tb2Kyodai2 = p;
    }

    /** @return 兄弟２ */
    public Tb2Kyodai2 referTb2Kyodai2() {
        if (this.tb2Kyodai2 == null) {
            try {
                this.tb2Kyodai2 = Tb2Kyodai2.get(this.kyodaiId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Kyodai2;
    }

    /** 兄弟３ */
    private Tb2Kyodai3 tb2Kyodai3;

    /** @return 兄弟３ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Kyodai3")
    public Tb2Kyodai3 getTb2Kyodai3() {
        return this.tb2Kyodai3;
    }

    /** @param p 兄弟３ */
    public void setTb2Kyodai3(final Tb2Kyodai3 p) {
        this.tb2Kyodai3 = p;
    }

    /** @return 兄弟３ */
    public Tb2Kyodai3 referTb2Kyodai3() {
        if (this.tb2Kyodai3 == null) {
            try {
                this.tb2Kyodai3 = Tb2Kyodai3.get(this.kyodaiId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Kyodai3;
    }
}
