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
public class Tb5Tensei implements IEntity {

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

    /** 転生情報 */
    private String tenseiInfo;

    /** @return 転生情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_INFO")
    public String getTenseiInfo() {
        return this.tenseiInfo;
    }

    /** @param o 転生情報 */
    public void setTenseiInfo(final Object o) {
        if (o != null) {
            this.tenseiInfo = o.toString();
        } else {
            this.tenseiInfo = null;
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
     * 転生照会
     * @param param1 転生ID
     * @return 転生
     */
    public static Tb5Tensei get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_ID` = :tensei_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`TENSEI_ID` \n";
        sql += "    , a.`TENSEI_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB5_TENSEI a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_id", param1);
        return Queries.get(sql, map, Tb5Tensei.class);
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
        if (this.tb5TenseiDets != null) {
            for (Tb5TenseiDet tb5TenseiDet : this.tb5TenseiDets) {
                if (tb5TenseiDet != null) {
                    tb5TenseiDet.setTenseiId(this.getTenseiId());
                }
                tb5TenseiDet.insert(now, execId);
            }
        }

        // 転生の登録
        String sql = "INSERT INTO TB5_TENSEI(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`TENSEI_ID` -- :tensei_id");
        nameList.add("`TENSEI_INFO` -- :tensei_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":tensei_id");
        valueList.add(":tensei_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 転生IDの採番処理 */
    private void numbering() {
        if (this.tenseiId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`TENSEI_ID`) IS NULL THEN 0 ELSE MAX(e.`TENSEI_ID`) * 1 END + 1 AS `TENSEI_ID` FROM TB5_TENSEI e";
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
        if (this.tb5TenseiDets != null) {
            for (Tb5TenseiDet tb5TenseiDet : this.tb5TenseiDets) {
                if (tb5TenseiDet == null) {
                    continue;
                }
                tb5TenseiDet.setTenseiId(this.tenseiId);
                try {
                    tb5TenseiDet.insert(now, execId);
                } catch (Exception e) {
                    tb5TenseiDet.update(now, execId);
                }
            }
        }

        // 転生の登録
        String sql = "UPDATE TB5_TENSEI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`TENSEI_ID` = :tensei_id");
        setList.add("`TENSEI_INFO` = :tensei_info");
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
        if (this.tb5TenseiDets != null) {
            for (Tb5TenseiDet tb5TenseiDet : this.tb5TenseiDets) {
                tb5TenseiDet.delete();
            }
        }

        // 転生の削除
        String sql = "DELETE FROM TB5_TENSEI WHERE " + getWhere();
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
        map.put("tensei_info", this.tenseiInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 転生明細のリスト */
    private List<Tb5TenseiDet> tb5TenseiDets;

    /** @return 転生明細のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb5TenseiDets")
    public List<Tb5TenseiDet> getTb5TenseiDets() {
        return this.tb5TenseiDets;
    }

    /** @param list 転生明細のリスト */
    public void setTb5TenseiDets(final List<Tb5TenseiDet> list) {
        this.tb5TenseiDets = list;
    }

    /** @param tb5TenseiDet */
    public void addTb5TenseiDets(final Tb5TenseiDet tb5TenseiDet) {
        if (this.tb5TenseiDets == null) {
            this.tb5TenseiDets = new ArrayList<Tb5TenseiDet>();
        }
        this.tb5TenseiDets.add(tb5TenseiDet);
    }

    /** @return 転生明細のリスト */
    public List<Tb5TenseiDet> referTb5TenseiDets() {
        this.tb5TenseiDets = Tb5Tensei.referTb5TenseiDets(this.tenseiId);
        return this.tb5TenseiDets;
    }

    /**
     * @param param1 tenseiId
     * @return List<Tb5TenseiDet>
     */
    public static List<Tb5TenseiDet> referTb5TenseiDets(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TENSEI_ID = :tensei_id");
        String sql = "SELECT ";
        sql += "`TENSEI_ID`";
        sql += ", `TENSEI_BN`";
        sql += ", `TENSEI_DET_INFO`";
        sql += ", `INSERT_TS` AS INSERT_TS";
        sql += ", `INSERT_USER_ID`";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", `UPDATE_TS` AS UPDATE_TS";
        sql += ", `UPDATE_USER_ID`";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += " FROM TB5_TENSEI_DET a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "TENSEI_ID, TENSEI_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_id", param1);
        return Queries.select(sql, map, Tb5TenseiDet.class, null, null);
    }
}
