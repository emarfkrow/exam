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
public class Tb1Tensei implements IEntity {

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

    /** 転生ID */
    private Integer tenseiId;

    /** @return 転生ID */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_ID")
    public Integer getTenseiId() {
        return this.tenseiId;
    }

    /** @param o 転生ID */
    public void setTenseiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenseiId = Integer.valueOf(o.toString());
        } else {
            this.tenseiId = null;
        }
    }

    /** 転生名 */
    private String tenseiMei;

    /** @return 転生名 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_MEI")
    public String getTenseiMei() {
        return this.tenseiMei;
    }

    /** @param o 転生名 */
    public void setTenseiMei(final Object o) {
        if (o != null) {
            this.tenseiMei = o.toString();
        } else {
            this.tenseiMei = null;
        }
    }

    /** 祖先ID */
    private Integer sosenId;

    /** @return 祖先ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SOSEN_ID")
    public Integer getSosenId() {
        return this.sosenId;
    }

    /** @param o 祖先ID */
    public void setSosenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sosenId = Integer.valueOf(o.toString());
        } else {
            this.sosenId = null;
        }
    }

    /** メモ */
    private String memo;

    /** @return メモ */
    @com.fasterxml.jackson.annotation.JsonProperty("MEMO")
    public String getMemo() {
        return this.memo;
    }

    /** @param o メモ */
    public void setMemo(final Object o) {
        if (o != null) {
            this.memo = o.toString();
        } else {
            this.memo = null;
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
     * 転生照会
     * @param param1 転生ID
     * @return 転生
     */
    public static Tb1Tensei get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_ID` = :tensei_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`TENSEI_ID` \n";
        sql += "    , a.`TENSEI_MEI` \n";
        sql += "    , a.`SOSEN_ID` \n";
        sql += "    , a.`MEMO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB1_TENSEI a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_id", param1);
        return Queries.get(sql, map, Tb1Tensei.class);
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
        if (this.tb1TenseiDets != null) {
            for (Tb1TenseiDet tb1TenseiDet : this.tb1TenseiDets) {
                tb1TenseiDet.setTenseiId(this.getTenseiId());
                tb1TenseiDet.insert(now, execId);
            }
        }

        // 転生の登録
        String sql = "INSERT INTO TB1_TENSEI(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`TENSEI_ID` -- :tensei_id");
        nameList.add("`TENSEI_MEI` -- :tensei_mei");
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`MEMO` -- :memo");
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
        valueList.add(":tensei_id");
        valueList.add(":tensei_mei");
        valueList.add(":sosen_id");
        valueList.add(":memo");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 転生IDの採番処理 */
    private void numbering() {
        if (this.tenseiId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`TENSEI_ID`) IS NULL THEN 0 ELSE MAX(e.`TENSEI_ID`) * 1 END + 1 AS `TENSEI_ID` FROM TB1_TENSEI e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("TENSEI_ID");
        this.setTenseiId(o);
    }

    /**
     * 転生更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 転生明細の登録
        if (this.tb1TenseiDets != null) {
            for (Tb1TenseiDet tb1TenseiDet : this.tb1TenseiDets) {
                if (tb1TenseiDet == null) {
                    continue;
                }
                tb1TenseiDet.setTenseiId(this.tenseiId);
                try {
                    tb1TenseiDet.insert(now, execId);
                } catch (Exception e) {
                    tb1TenseiDet.update(now, execId);
                }
            }
        }

        // 転生の登録
        String sql = "UPDATE TB1_TENSEI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`TENSEI_ID` = :tensei_id");
        setList.add("`TENSEI_MEI` = :tensei_mei");
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`MEMO` = :memo");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 転生削除
     * @return 削除件数
     */
    public int delete() {

        // 転生明細の削除
        if (this.tb1TenseiDets != null) {
            for (Tb1TenseiDet tb1TenseiDet : this.tb1TenseiDets) {
                tb1TenseiDet.delete();
            }
        }

        // 転生の削除
        String sql = "DELETE FROM TB1_TENSEI WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_ID` = :tensei_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_id", this.tenseiId);
        map.put("tensei_mei", this.tenseiMei);
        map.put("sosen_id", this.sosenId);
        map.put("memo", this.memo);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 転生明細のリスト */
    private List<Tb1TenseiDet> tb1TenseiDets;

    /** @return 転生明細のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1TenseiDets")
    public List<Tb1TenseiDet> getTb1TenseiDets() {
        return this.tb1TenseiDets;
    }

    /** @param list 転生明細のリスト */
    public void setTb1TenseiDets(final List<Tb1TenseiDet> list) {
        this.tb1TenseiDets = list;
    }

    /** @param tb1TenseiDet */
    public void addTb1TenseiDets(final Tb1TenseiDet tb1TenseiDet) {
        if (this.tb1TenseiDets == null) {
            this.tb1TenseiDets = new ArrayList<Tb1TenseiDet>();
        }
        this.tb1TenseiDets.add(tb1TenseiDet);
    }

    /** @return 転生明細のリスト */
    public List<Tb1TenseiDet> referTb1TenseiDets() {
        this.tb1TenseiDets = Tb1Tensei.referTb1TenseiDets(this.tenseiId);
        return this.tb1TenseiDets;
    }

    /**
     * @param param1 tenseiId
     * @return List<Tb1TenseiDet>
     */
    public static List<Tb1TenseiDet> referTb1TenseiDets(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TENSEI_ID = :tensei_id");
        String sql = "SELECT ";
        sql += "TENSEI_ID";
        sql += ", TENSEI_BN";
        sql += ", MEMO";
        sql += ", INSERT_TS";
        sql += ", INSERT_USER_ID";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", UPDATE_TS";
        sql += ", UPDATE_USER_ID";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += ", DELETE_F";
        sql += ", STATUS_KB";
        sql += " FROM TB1_TENSEI_DET a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "TENSEI_ID, TENSEI_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_id", param1);
        return Queries.select(sql, map, Tb1TenseiDet.class, null, null);
    }
}
