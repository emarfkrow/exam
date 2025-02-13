package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 孤児
 * @author emarfkrow
 */
public class Tb2Koji implements IEntity {

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

    /** 孤児ID */
    private Integer kojiId;

    /** @return 孤児ID */
    @com.fasterxml.jackson.annotation.JsonProperty("KOJI_ID")
    public Integer getKojiId() {
        return this.kojiId;
    }

    /** @param o 孤児ID */
    public void setKojiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kojiId = Integer.valueOf(o.toString());
        } else {
            this.kojiId = null;
        }
    }

    /** 孤児情報 */
    private String kojiInfo;

    /** @return 孤児情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("KOJI_INFO")
    public String getKojiInfo() {
        return this.kojiInfo;
    }

    /** @param o 孤児情報 */
    public void setKojiInfo(final Object o) {
        if (o != null) {
            this.kojiInfo = o.toString();
        } else {
            this.kojiInfo = null;
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
     * 孤児照会
     * @param param1 孤児ID
     * @return 孤児
     */
    public static Tb2Koji get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KOJI_ID` = :koji_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`KOJI_ID` \n";
        sql += "    , a.`KOJI_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB2_KOJI a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("koji_id", param1);
        return Queries.get(sql, map, Tb2Koji.class);
    }

    /**
     * 孤児追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 孤児IDの採番処理
        numbering();

        // 孤児２の登録
        if (this.tb2Koji2 != null) {
            this.tb2Koji2.setKojiId(this.getKojiId());
            this.tb2Koji2.insert(now, execId);
        }

        // 孤児３の登録
        if (this.tb2Koji3 != null) {
            this.tb2Koji3.setKojiId(this.getKojiId());
            this.tb2Koji3.insert(now, execId);
        }

        // 孤児の登録
        String sql = "INSERT INTO TB2_KOJI(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`KOJI_ID` -- :koji_id");
        nameList.add("`KOJI_INFO` -- :koji_info");
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
        valueList.add(":koji_id");
        valueList.add(":koji_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 孤児IDの採番処理 */
    private void numbering() {
        if (this.kojiId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`KOJI_ID`) IS NULL THEN 0 ELSE MAX(e.`KOJI_ID`) * 1 END + 1 AS `KOJI_ID` FROM TB2_KOJI e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("KOJI_ID");
        this.setKojiId(o);
    }

    /**
     * 孤児更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 孤児２の登録
        if (this.tb2Koji2 != null) {
            tb2Koji2.setKojiId(this.getKojiId());
            try {
                tb2Koji2.insert(now, execId);
            } catch (Exception e) {
                tb2Koji2.update(now, execId);
            }
        }

        // 孤児３の登録
        if (this.tb2Koji3 != null) {
            tb2Koji3.setKojiId(this.getKojiId());
            try {
                tb2Koji3.insert(now, execId);
            } catch (Exception e) {
                tb2Koji3.update(now, execId);
            }
        }

        // 孤児の登録
        String sql = "UPDATE TB2_KOJI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`KOJI_ID` = :koji_id");
        setList.add("`KOJI_INFO` = :koji_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 孤児削除
     * @return 削除件数
     */
    public int delete() {

        // 孤児２の削除
        if (this.tb2Koji2 != null) {
            this.tb2Koji2.delete();
        }

        // 孤児３の削除
        if (this.tb2Koji3 != null) {
            this.tb2Koji3.delete();
        }

        // 孤児の削除
        String sql = "DELETE FROM TB2_KOJI WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KOJI_ID` = :koji_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("koji_id", this.kojiId);
        map.put("koji_info", this.kojiInfo);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 孤児２ */
    private Tb2Koji2 tb2Koji2;

    /** @return 孤児２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Koji2")
    public Tb2Koji2 getTb2Koji2() {
        return this.tb2Koji2;
    }

    /** @param p 孤児２ */
    public void setTb2Koji2(final Tb2Koji2 p) {
        this.tb2Koji2 = p;
    }

    /** @return 孤児２ */
    public Tb2Koji2 referTb2Koji2() {
        if (this.tb2Koji2 == null) {
            try {
                this.tb2Koji2 = Tb2Koji2.get(this.kojiId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Koji2;
    }

    /** 孤児３ */
    private Tb2Koji3 tb2Koji3;

    /** @return 孤児３ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Koji3")
    public Tb2Koji3 getTb2Koji3() {
        return this.tb2Koji3;
    }

    /** @param p 孤児３ */
    public void setTb2Koji3(final Tb2Koji3 p) {
        this.tb2Koji3 = p;
    }

    /** @return 孤児３ */
    public Tb2Koji3 referTb2Koji3() {
        if (this.tb2Koji3 == null) {
            try {
                this.tb2Koji3 = Tb2Koji3.get(this.kojiId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Koji3;
    }
}
