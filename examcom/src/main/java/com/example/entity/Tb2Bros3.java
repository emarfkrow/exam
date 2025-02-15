package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 兄弟３
 * @author emarfkrow
 */
public class Tb2Bros3 implements IEntity {

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
    private Integer brosId;

    /** @return 兄弟ID */
    @com.fasterxml.jackson.annotation.JsonProperty("BROS_ID")
    public Integer getBrosId() {
        return this.brosId;
    }

    /** @param o 兄弟ID */
    public void setBrosId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.brosId = Integer.valueOf(o.toString());
        } else {
            this.brosId = null;
        }
    }

    /** 兄弟３情報 */
    private String bros3Info;

    /** @return 兄弟３情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("BROS3_INFO")
    public String getBros3Info() {
        return this.bros3Info;
    }

    /** @param o 兄弟３情報 */
    public void setBros3Info(final Object o) {
        if (o != null) {
            this.bros3Info = o.toString();
        } else {
            this.bros3Info = null;
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
     * 兄弟３照会
     * @param param1 兄弟ID
     * @return 兄弟３
     */
    public static Tb2Bros3 get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`BROS_ID` = :bros_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`BROS_ID` \n";
        sql += "    , a.`BROS3_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB2_BROS3 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bros_id", param1);
        return Queries.get(sql, map, Tb2Bros3.class);
    }

    /**
     * 兄弟３追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 兄弟IDの採番処理
        numbering();

        // 兄弟の登録
        if (this.tb2Bros != null) {
            this.tb2Bros.setBrosId(this.getBrosId());
            this.tb2Bros.insert(now, execId);
        }

        // 兄弟２の登録
        if (this.tb2Bros2 != null) {
            this.tb2Bros2.setBrosId(this.getBrosId());
            this.tb2Bros2.insert(now, execId);
        }

        // 兄弟３の登録
        String sql = "INSERT INTO TB2_BROS3(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`BROS_ID` -- :bros_id");
        nameList.add("`BROS3_INFO` -- :bros_3_info");
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
        valueList.add(":bros_id");
        valueList.add(":bros_3_info");
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
        if (this.brosId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`BROS_ID`) IS NULL THEN 0 ELSE MAX(e.`BROS_ID`) * 1 END + 1 AS `BROS_ID` FROM TB2_BROS3 e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("BROS_ID");
        this.setBrosId(o);
    }

    /**
     * 兄弟３更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 兄弟の登録
        if (this.tb2Bros != null) {
            tb2Bros.setBrosId(this.getBrosId());
            try {
                tb2Bros.insert(now, execId);
            } catch (Exception e) {
                tb2Bros.update(now, execId);
            }
        }

        // 兄弟２の登録
        if (this.tb2Bros2 != null) {
            tb2Bros2.setBrosId(this.getBrosId());
            try {
                tb2Bros2.insert(now, execId);
            } catch (Exception e) {
                tb2Bros2.update(now, execId);
            }
        }

        // 兄弟３の登録
        String sql = "UPDATE TB2_BROS3\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`BROS_ID` = :bros_id");
        setList.add("`BROS3_INFO` = :bros_3_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 兄弟３削除
     * @return 削除件数
     */
    public int delete() {

        // 兄弟の削除
        if (this.tb2Bros != null) {
            this.tb2Bros.delete();
        }

        // 兄弟２の削除
        if (this.tb2Bros2 != null) {
            this.tb2Bros2.delete();
        }

        // 兄弟３の削除
        String sql = "DELETE FROM TB2_BROS3 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`BROS_ID` = :bros_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bros_id", this.brosId);
        map.put("bros_3_info", this.bros3Info);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 兄弟 */
    private Tb2Bros tb2Bros;

    /** @return 兄弟 */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Bros")
    public Tb2Bros getTb2Bros() {
        return this.tb2Bros;
    }

    /** @param p 兄弟 */
    public void setTb2Bros(final Tb2Bros p) {
        this.tb2Bros = p;
    }

    /** @return 兄弟 */
    public Tb2Bros referTb2Bros() {
        if (this.tb2Bros == null) {
            try {
                this.tb2Bros = Tb2Bros.get(this.brosId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Bros;
    }

    /** 兄弟２ */
    private Tb2Bros2 tb2Bros2;

    /** @return 兄弟２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Bros2")
    public Tb2Bros2 getTb2Bros2() {
        return this.tb2Bros2;
    }

    /** @param p 兄弟２ */
    public void setTb2Bros2(final Tb2Bros2 p) {
        this.tb2Bros2 = p;
    }

    /** @return 兄弟２ */
    public Tb2Bros2 referTb2Bros2() {
        if (this.tb2Bros2 == null) {
            try {
                this.tb2Bros2 = Tb2Bros2.get(this.brosId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Bros2;
    }
}
