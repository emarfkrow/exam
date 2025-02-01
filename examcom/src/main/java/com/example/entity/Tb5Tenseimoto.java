package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 転生元
 * @author emarfkrow
 */
public class Tb5Tenseimoto implements IEntity {

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

    /** 転生元情報 */
    private String tenseimotoInfo;

    /** @return 転生元情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEIMOTO_INFO")
    public String getTenseimotoInfo() {
        return this.tenseimotoInfo;
    }

    /** @param o 転生元情報 */
    public void setTenseimotoInfo(final Object o) {
        if (o != null) {
            this.tenseimotoInfo = o.toString();
        } else {
            this.tenseimotoInfo = null;
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
     * 転生元照会
     * @param param1 転生元ID
     * @return 転生元
     */
    public static Tb5Tenseimoto get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEIMOTO_ID` = :tenseimoto_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`TENSEIMOTO_ID` \n";
        sql += "    , a.`TENSEIMOTO_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB5_TENSEIMOTO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tenseimoto_id", param1);
        return Queries.get(sql, map, Tb5Tenseimoto.class);
    }

    /**
     * 転生元追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 転生元IDの採番処理
        numbering();

        // 転生元明細の登録
        if (this.tb5TenseimotoDets != null) {
            for (Tb5TenseimotoDet tb5TenseimotoDet : this.tb5TenseimotoDets) {
                if (tb5TenseimotoDet != null) {
                    tb5TenseimotoDet.setTenseimotoId(this.getTenseimotoId());
                }
                tb5TenseimotoDet.insert(now, execId);
            }
        }

        // 転生元の登録
        String sql = "INSERT INTO TB5_TENSEIMOTO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`TENSEIMOTO_ID` -- :tenseimoto_id");
        nameList.add("`TENSEIMOTO_INFO` -- :tenseimoto_info");
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
        valueList.add(":tenseimoto_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 転生元IDの採番処理 */
    private void numbering() {
        if (this.tenseimotoId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`TENSEIMOTO_ID`) IS NULL THEN 0 ELSE MAX(e.`TENSEIMOTO_ID`) * 1 END + 1 AS `TENSEIMOTO_ID` FROM TB5_TENSEIMOTO e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("TENSEIMOTO_ID");
        this.setTenseimotoId(o);
    }

    /**
     * 転生元更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 転生元明細の登録
        if (this.tb5TenseimotoDets != null) {
            for (Tb5TenseimotoDet tb5TenseimotoDet : this.tb5TenseimotoDets) {
                if (tb5TenseimotoDet == null) {
                    continue;
                }
                tb5TenseimotoDet.setTenseimotoId(this.tenseimotoId);
                try {
                    tb5TenseimotoDet.insert(now, execId);
                } catch (Exception e) {
                    tb5TenseimotoDet.update(now, execId);
                }
            }
        }

        // 転生元の登録
        String sql = "UPDATE TB5_TENSEIMOTO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`TENSEIMOTO_ID` = :tenseimoto_id");
        setList.add("`TENSEIMOTO_INFO` = :tenseimoto_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 転生元削除
     * @return 削除件数
     */
    public int delete() {

        // 転生元明細の削除
        if (this.tb5TenseimotoDets != null) {
            for (Tb5TenseimotoDet tb5TenseimotoDet : this.tb5TenseimotoDets) {
                tb5TenseimotoDet.delete();
            }
        }

        // 転生元の削除
        String sql = "DELETE FROM TB5_TENSEIMOTO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEIMOTO_ID` = :tenseimoto_id");
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
        map.put("tenseimoto_info", this.tenseimotoInfo);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 転生元明細のリスト */
    private List<Tb5TenseimotoDet> tb5TenseimotoDets;

    /** @return 転生元明細のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb5TenseimotoDets")
    public List<Tb5TenseimotoDet> getTb5TenseimotoDets() {
        return this.tb5TenseimotoDets;
    }

    /** @param list 転生元明細のリスト */
    public void setTb5TenseimotoDets(final List<Tb5TenseimotoDet> list) {
        this.tb5TenseimotoDets = list;
    }

    /** @param tb5TenseimotoDet */
    public void addTb5TenseimotoDets(final Tb5TenseimotoDet tb5TenseimotoDet) {
        if (this.tb5TenseimotoDets == null) {
            this.tb5TenseimotoDets = new ArrayList<Tb5TenseimotoDet>();
        }
        this.tb5TenseimotoDets.add(tb5TenseimotoDet);
    }

    /** @return 転生元明細のリスト */
    public List<Tb5TenseimotoDet> referTb5TenseimotoDets() {
        this.tb5TenseimotoDets = Tb5Tenseimoto.referTb5TenseimotoDets(this.tenseimotoId);
        return this.tb5TenseimotoDets;
    }

    /**
     * @param param1 tenseimotoId
     * @return List<Tb5TenseimotoDet>
     */
    public static List<Tb5TenseimotoDet> referTb5TenseimotoDets(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TENSEIMOTO_ID = :tenseimoto_id");
        String sql = "SELECT ";
        sql += "TENSEIMOTO_ID";
        sql += ", TENSEIMOTO_BN";
        sql += ", TENSEIMOTO_DET_INFO";
        sql += ", INSERT_TS";
        sql += ", INSERT_USER_ID";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", UPDATE_TS";
        sql += ", UPDATE_USER_ID";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += ", DELETE_F";
        sql += ", STATUS_KB";
        sql += " FROM TB5_TENSEIMOTO_DET a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "TENSEIMOTO_ID, TENSEIMOTO_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tenseimoto_id", param1);
        return Queries.select(sql, map, Tb5TenseimotoDet.class, null, null);
    }
}
