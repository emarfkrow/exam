package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 代表３
 * @author emarfkrow
 */
public class Tb2Daihyo3 implements IEntity {

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

    /** 代表ID */
    private Integer daihyoId;

    /** @return 代表ID */
    @com.fasterxml.jackson.annotation.JsonProperty("DAIHYO_ID")
    public Integer getDaihyoId() {
        return this.daihyoId;
    }

    /** @param o 代表ID */
    public void setDaihyoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.daihyoId = Integer.valueOf(o.toString());
        } else {
            this.daihyoId = null;
        }
    }

    /** 代表３情報 */
    private String daihyo3Info;

    /** @return 代表３情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("DAIHYO3_INFO")
    public String getDaihyo3Info() {
        return this.daihyo3Info;
    }

    /** @param o 代表３情報 */
    public void setDaihyo3Info(final Object o) {
        if (o != null) {
            this.daihyo3Info = o.toString();
        } else {
            this.daihyo3Info = null;
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
     * 代表３照会
     * @param param1 代表ID
     * @return 代表３
     */
    public static Tb2Daihyo3 get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`DAIHYO_ID` = :daihyo_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`DAIHYO_ID` \n";
        sql += "    , a.`DAIHYO3_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB2_DAIHYO3 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daihyo_id", param1);
        return Queries.get(sql, map, Tb2Daihyo3.class);
    }

    /**
     * 代表３追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 代表IDの採番処理
        numbering();

        // 代表の登録
        if (this.tb2Daihyo != null) {
            this.tb2Daihyo.setDaihyoId(this.getDaihyoId());
            this.tb2Daihyo.insert(now, execId);
        }

        // 代表２の登録
        if (this.tb2Daihyo2 != null) {
            this.tb2Daihyo2.setDaihyoId(this.getDaihyoId());
            this.tb2Daihyo2.insert(now, execId);
        }

        // 代表３の登録
        String sql = "INSERT INTO TB2_DAIHYO3(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`DAIHYO_ID` -- :daihyo_id");
        nameList.add("`DAIHYO3_INFO` -- :daihyo_3_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":daihyo_id");
        valueList.add(":daihyo_3_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 代表IDの採番処理 */
    private void numbering() {
        if (this.daihyoId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`DAIHYO_ID`) IS NULL THEN 0 ELSE MAX(e.`DAIHYO_ID`) * 1 END + 1 AS `DAIHYO_ID` FROM TB2_DAIHYO3 e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("DAIHYO_ID");
        this.setDaihyoId(o);
    }

    /**
     * 代表３更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 代表の登録
        if (this.tb2Daihyo != null) {
            tb2Daihyo.setDaihyoId(this.getDaihyoId());
            try {
                tb2Daihyo.insert(now, execId);
            } catch (Exception e) {
                tb2Daihyo.update(now, execId);
            }
        }

        // 代表２の登録
        if (this.tb2Daihyo2 != null) {
            tb2Daihyo2.setDaihyoId(this.getDaihyoId());
            try {
                tb2Daihyo2.insert(now, execId);
            } catch (Exception e) {
                tb2Daihyo2.update(now, execId);
            }
        }

        // 代表３の登録
        String sql = "UPDATE TB2_DAIHYO3\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`DAIHYO_ID` = :daihyo_id");
        setList.add("`DAIHYO3_INFO` = :daihyo_3_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 代表３削除
     * @return 削除件数
     */
    public int delete() {

        // 代表の削除
        if (this.tb2Daihyo != null) {
            this.tb2Daihyo.delete();
        }

        // 代表２の削除
        if (this.tb2Daihyo2 != null) {
            this.tb2Daihyo2.delete();
        }

        // 代表３の削除
        String sql = "DELETE FROM TB2_DAIHYO3 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`DAIHYO_ID` = :daihyo_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("daihyo_id", this.daihyoId);
        map.put("daihyo_3_info", this.daihyo3Info);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 代表 */
    private Tb2Daihyo tb2Daihyo;

    /** @return 代表 */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Daihyo")
    public Tb2Daihyo getTb2Daihyo() {
        return this.tb2Daihyo;
    }

    /** @param p 代表 */
    public void setTb2Daihyo(final Tb2Daihyo p) {
        this.tb2Daihyo = p;
    }

    /** @return 代表 */
    public Tb2Daihyo referTb2Daihyo() {
        if (this.tb2Daihyo == null) {
            try {
                this.tb2Daihyo = Tb2Daihyo.get(this.daihyoId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Daihyo;
    }

    /** 代表２ */
    private Tb2Daihyo2 tb2Daihyo2;

    /** @return 代表２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Daihyo2")
    public Tb2Daihyo2 getTb2Daihyo2() {
        return this.tb2Daihyo2;
    }

    /** @param p 代表２ */
    public void setTb2Daihyo2(final Tb2Daihyo2 p) {
        this.tb2Daihyo2 = p;
    }

    /** @return 代表２ */
    public Tb2Daihyo2 referTb2Daihyo2() {
        if (this.tb2Daihyo2 == null) {
            try {
                this.tb2Daihyo2 = Tb2Daihyo2.get(this.daihyoId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Daihyo2;
    }
}
