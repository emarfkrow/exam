package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 長兄
 * @author emarfkrow
 */
public class Tb2Eldest implements IEntity {

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

    /** 兄弟ID */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private Integer kyodaiId;

    /** @return 兄弟ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "KYODAI_ID", index = 2)
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public Integer getKyodaiId() {
        return this.kyodaiId;
    }

    /** @param o 兄弟ID */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setKyodaiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.kyodaiId = Integer.valueOf(o.toString());
        } else {
            this.kyodaiId = null;
        }
    }

    /** 長兄情報 */
    private String eldestInfo;

    /** @return 長兄情報 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ELDEST_INFO", index = 3)
    public String getEldestInfo() {
        return this.eldestInfo;
    }

    /** @param o 長兄情報 */
    public void setEldestInfo(final Object o) {
        if (o != null) {
            this.eldestInfo = o.toString();
        } else {
            this.eldestInfo = null;
        }
    }

    /** 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_TS", index = 4)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_ID", index = 5)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_SEI", index = 6)
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
    @jp.co.golorp.emarf.validation.OptLock
    private java.time.LocalDateTime updateTs;

    /** @return 更新タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_TS", index = 7)
    @jp.co.golorp.emarf.validation.OptLock
    public java.time.LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /** @param o 更新タイムスタンプ */
    @jp.co.golorp.emarf.validation.OptLock
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_ID", index = 8)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_SEI", index = 9)
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
     * 長兄照会
     * @param param1 兄弟ID
     * @return 長兄
     */
    public static Tb2Eldest get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KYODAI_ID` = :kyodai_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`KYODAI_ID` \n";
        sql += "    , a.`ELDEST_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB2_ELDEST a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kyodai_id", param1);
        return Queries.get(sql, map, Tb2Eldest.class);
    }

    /**
     * 長兄追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 兄弟IDの採番処理
        numbering();

        // 弟の登録
        if (this.tb2Younger != null) {
            this.tb2Younger.setKyodaiId(this.getKyodaiId());
            this.tb2Younger.insert(now, execId);
        }

        // 末弟の登録
        if (this.tb2Youngest != null) {
            this.tb2Youngest.setKyodaiId(this.getKyodaiId());
            this.tb2Youngest.insert(now, execId);
        }

        // 長兄の登録
        String sql = "INSERT INTO TB2_ELDEST(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`KYODAI_ID` -- :kyodai_id");
        nameList.add("`ELDEST_INFO` -- :eldest_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kyodai_id");
        valueList.add(":eldest_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 兄弟IDの採番処理 */
    private void numbering() {
        if (this.kyodaiId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`KYODAI_ID`) IS NULL THEN 0 ELSE MAX(e.`KYODAI_ID`) * 1 END + 1 AS `KYODAI_ID` FROM TB2_ELDEST e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("KYODAI_ID");
        this.setKyodaiId(o);
    }

    /**
     * 長兄更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 弟の登録
        if (this.tb2Younger != null) {
            tb2Younger.setKyodaiId(this.getKyodaiId());
            try {
                tb2Younger.insert(now, execId);
            } catch (Exception e) {
                tb2Younger.update(now, execId);
            }
        }

        // 末弟の登録
        if (this.tb2Youngest != null) {
            tb2Youngest.setKyodaiId(this.getKyodaiId());
            try {
                tb2Youngest.insert(now, execId);
            } catch (Exception e) {
                tb2Youngest.update(now, execId);
            }
        }

        // 長兄の登録
        String sql = "UPDATE TB2_ELDEST\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`KYODAI_ID` = :kyodai_id");
        setList.add("`ELDEST_INFO` = :eldest_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 長兄削除
     * @return 削除件数
     */
    public int delete() {

        // 弟の削除
        if (this.tb2Younger != null) {
            if (this.tb2Younger.delete() != 1) {
                throw new jp.co.golorp.emarf.exception.OptLockError("error.cant.delete", "弟");
            }
        }

        // 末弟の削除
        if (this.tb2Youngest != null) {
            if (this.tb2Youngest.delete() != 1) {
                throw new jp.co.golorp.emarf.exception.OptLockError("error.cant.delete", "末弟");
            }
        }

        // 長兄の削除
        String sql = "DELETE FROM TB2_ELDEST WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KYODAI_ID` = :kyodai_id");
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
        map.put("kyodai_id", this.kyodaiId);
        map.put("eldest_info", this.eldestInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 弟 */
    private Tb2Younger tb2Younger;

    /** @return 弟 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Tb2Younger", index = 10)
    public Tb2Younger getTb2Younger() {
        return this.tb2Younger;
    }

    /** @param p 弟 */
    public void setTb2Younger(final Tb2Younger p) {
        this.tb2Younger = p;
    }

    /** @return 弟 */
    public Tb2Younger referTb2Younger() {
        if (this.tb2Younger == null) {
            try {
                this.tb2Younger = Tb2Younger.get(this.kyodaiId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Younger;
    }

    /** 末弟 */
    private Tb2Youngest tb2Youngest;

    /** @return 末弟 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Tb2Youngest", index = 11)
    public Tb2Youngest getTb2Youngest() {
        return this.tb2Youngest;
    }

    /** @param p 末弟 */
    public void setTb2Youngest(final Tb2Youngest p) {
        this.tb2Youngest = p;
    }

    /** @return 末弟 */
    public Tb2Youngest referTb2Youngest() {
        if (this.tb2Youngest == null) {
            try {
                this.tb2Youngest = Tb2Youngest.get(this.kyodaiId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Youngest;
    }
}
