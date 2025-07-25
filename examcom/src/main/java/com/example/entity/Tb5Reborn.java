package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 転生
 * @author emarfkrow
 */
public class Tb5Reborn implements IEntity {

    /** SlickGridのDataView用ID */
    @jp.co.golorp.emarf.validation.GridViewRowId
    private Integer id;

    /** @return id */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id", index = 1)
    public final Integer getId() {
        return id;
    }

    /** @param o id */
    public final void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.id = Integer.valueOf(o.toString());
        } else {
            this.id = null;
        }
    }

    /** 転生ID */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private Integer rebornId;

    /** @return 転生ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "REBORN_ID", index = 2)
    public Integer getRebornId() {
        return this.rebornId;
    }

    /** @param o 転生ID */
    public void setRebornId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.rebornId = Integer.valueOf(o.toString());
        } else {
            this.rebornId = null;
        }
    }

    /** 前世ID */
    private Integer prevId;

    /** @return 前世ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "PREV_ID", index = 3)
    public Integer getPrevId() {
        return this.prevId;
    }

    /** @param o 前世ID */
    public void setPrevId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.prevId = Integer.valueOf(o.toString());
        } else {
            this.prevId = null;
        }
    }

    /** 前世情報 */
    private String prevInfo;

    /** @return 前世情報 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "PREV_INFO", index = 4)
    public String getPrevInfo() {
        return this.prevInfo;
    }

    /** @param o 前世情報 */
    public void setPrevInfo(final Object o) {
        if (o != null) {
            this.prevInfo = o.toString();
        } else {
            this.prevInfo = null;
        }
    }

    /** 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_TS", index = 5)
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
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.insertTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.insertTs = null;
        }
    }

    /** 作成者 */
    private Integer insertUserId;

    /** @return 作成者 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_ID", index = 6)
    public Integer getInsertUserId() {
        return this.insertUserId;
    }

    /** @param o 作成者 */
    public void setInsertUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.insertUserId = Integer.valueOf(o.toString());
        } else {
            this.insertUserId = null;
        }
    }

    /** 作成者参照 */
    @jp.co.golorp.emarf.validation.ReferMei
    private String insertUserSei;

    /** @return 作成者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_SEI", index = 7)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_TS", index = 8)
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
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.updateTs = null;
        }
    }

    /** 更新者 */
    private Integer updateUserId;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_ID", index = 9)
    public Integer getUpdateUserId() {
        return this.updateUserId;
    }

    /** @param o 更新者 */
    public void setUpdateUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.updateUserId = Integer.valueOf(o.toString());
        } else {
            this.updateUserId = null;
        }
    }

    /** 更新者参照 */
    @jp.co.golorp.emarf.validation.ReferMei
    private String updateUserSei;

    /** @return 更新者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_SEI", index = 10)
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
     * 転生照会
     * @param param1 転生ID
     * @return 転生
     */
    public static Tb5Reborn get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`REBORN_ID` = :reborn_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`REBORN_ID` \n";
        sql += "    , a.`PREV_ID` \n";
        sql += "    , a.`PREV_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB5_REBORN a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("reborn_id", param1);
        return Queries.get(sql, map, Tb5Reborn.class);
    }

    /**
     * 転生追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 転生IDの採番処理
        numbering();

        // 転生明細の登録
        if (this.tb5RebornDets != null) {
            for (Tb5RebornDet tb5RebornDet : this.tb5RebornDets) {
                if (tb5RebornDet != null) {
                    tb5RebornDet.setRebornId(this.getRebornId());
                }
                tb5RebornDet.insert(now, execId);
            }
        }

        // 転生の登録
        String sql = "INSERT INTO TB5_REBORN(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`REBORN_ID` -- :reborn_id");
        nameList.add("`PREV_ID` -- :prev_id");
        nameList.add("`PREV_INFO` -- :prev_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":reborn_id");
        valueList.add(":prev_id");
        valueList.add(":prev_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 転生IDの採番処理 */
    private void numbering() {
        if (this.rebornId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`REBORN_ID`) IS NULL THEN 0 ELSE MAX(e.`REBORN_ID`) * 1 END + 1 AS `REBORN_ID` FROM TB5_REBORN e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("REBORN_ID");
        this.setRebornId(o);
    }

    /**
     * 転生更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 転生明細の登録
        if (this.tb5RebornDets != null) {
            for (Tb5RebornDet tb5RebornDet : this.tb5RebornDets) {
                if (tb5RebornDet == null) {
                    continue;
                }
                tb5RebornDet.setRebornId(this.rebornId);
                try {
                    tb5RebornDet.insert(now, execId);
                } catch (Exception e) {
                    tb5RebornDet.update(now, execId);
                }
            }
        }

        // 転生の登録
        String sql = "UPDATE TB5_REBORN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`REBORN_ID` = :reborn_id");
        setList.add("`PREV_ID` = :prev_id");
        setList.add("`PREV_INFO` = :prev_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 転生削除
     * @return 削除件数
     */
    public int delete() {

        // 転生明細の削除
        if (this.tb5RebornDets != null) {
            for (Tb5RebornDet tb5RebornDet : this.tb5RebornDets) {
                tb5RebornDet.delete();
            }
        }

        // 転生の削除
        String sql = "DELETE FROM TB5_REBORN WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`REBORN_ID` = :reborn_id");
        whereList.add("`update_ts` = '" + this.updateTs + "'");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("reborn_id", this.rebornId);
        map.put("prev_id", this.prevId);
        map.put("prev_info", this.prevInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /*
     * 子モデル：転生明細
     */

    /** 転生明細のリスト */
    private List<Tb5RebornDet> tb5RebornDets;

    /** @return 転生明細のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Tb5RebornDets", index = 11)
    public List<Tb5RebornDet> getTb5RebornDets() {
        return this.tb5RebornDets;
    }

    /** @param list 転生明細のリスト */
    public void setTb5RebornDets(final List<Tb5RebornDet> list) {
        this.tb5RebornDets = list;
    }

    /** @param tb5RebornDet */
    public void addTb5RebornDets(final Tb5RebornDet tb5RebornDet) {
        if (this.tb5RebornDets == null) {
            this.tb5RebornDets = new ArrayList<Tb5RebornDet>();
        }
        this.tb5RebornDets.add(tb5RebornDet);
    }

    /** @return 転生明細のリスト */
    public List<Tb5RebornDet> referTb5RebornDets() {
        this.tb5RebornDets = Tb5Reborn.referTb5RebornDets(this.rebornId);
        return this.tb5RebornDets;
    }

    /**
     * @param param1 rebornId
     * @return List<Tb5RebornDet>
     */
    public static List<Tb5RebornDet> referTb5RebornDets(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("REBORN_ID = :reborn_id");
        String sql = "SELECT ";
        sql += "`REBORN_ID`";
        sql += ", `REBORN_BN`";
        sql += ", `PREV_DET_INFO`";
        sql += ", `INSERT_TS` AS INSERT_TS";
        sql += ", `INSERT_USER_ID`";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", `UPDATE_TS` AS UPDATE_TS";
        sql += ", `UPDATE_USER_ID`";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += " FROM TB5_REBORN_DET a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "REBORN_ID, REBORN_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("reborn_id", param1);
        return Queries.select(sql, map, Tb5RebornDet.class, null, null);
    }
}
