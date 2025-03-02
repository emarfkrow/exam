package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 末弟３
 * @author emarfkrow
 */
public class Tb2Mattei3 implements IEntity {

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

    /** 末弟ID */
    private Integer matteiId;

    /** @return 末弟ID */
    @com.fasterxml.jackson.annotation.JsonProperty("MATTEI_ID")
    public Integer getMatteiId() {
        return this.matteiId;
    }

    /** @param o 末弟ID */
    public void setMatteiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.matteiId = Integer.valueOf(o.toString());
        } else {
            this.matteiId = null;
        }
    }

    /** 末弟３情報 */
    private String mattei3Info;

    /** @return 末弟３情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("MATTEI3_INFO")
    public String getMattei3Info() {
        return this.mattei3Info;
    }

    /** @param o 末弟３情報 */
    public void setMattei3Info(final Object o) {
        if (o != null) {
            this.mattei3Info = o.toString();
        } else {
            this.mattei3Info = null;
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
     * 末弟３照会
     * @param param1 末弟ID
     * @return 末弟３
     */
    public static Tb2Mattei3 get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`MATTEI_ID` = ::mattei_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`MATTEI_ID` \n";
        sql += "    , a.`MATTEI3_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB2_MATTEI3 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mattei_id", param1);
        return Queries.get(sql, map, Tb2Mattei3.class);
    }

    /**
     * 末弟３追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 末弟IDの採番処理
        numbering();

        // 末弟の登録
        if (this.tb2Mattei != null) {
            this.tb2Mattei.setMatteiId(this.getMatteiId());
            this.tb2Mattei.insert(now, execId);
        }

        // 末弟２の登録
        if (this.tb2Mattei2 != null) {
            this.tb2Mattei2.setMatteiId(this.getMatteiId());
            this.tb2Mattei2.insert(now, execId);
        }

        // 末弟３の登録
        String sql = "INSERT INTO TB2_MATTEI3(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`MATTEI_ID` -- :mattei_id");
        nameList.add("`MATTEI3_INFO` -- :mattei_3_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":mattei_id");
        valueList.add(":mattei_3_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 末弟IDの採番処理 */
    private void numbering() {
        if (this.matteiId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`MATTEI_ID`) IS NULL THEN 0 ELSE MAX(e.`MATTEI_ID`) * 1 END + 1 AS `MATTEI_ID` FROM TB2_MATTEI3 e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("MATTEI_ID");
        this.setMatteiId(o);
    }

    /**
     * 末弟３更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 末弟の登録
        if (this.tb2Mattei != null) {
            tb2Mattei.setMatteiId(this.getMatteiId());
            try {
                tb2Mattei.insert(now, execId);
            } catch (Exception e) {
                tb2Mattei.update(now, execId);
            }
        }

        // 末弟２の登録
        if (this.tb2Mattei2 != null) {
            tb2Mattei2.setMatteiId(this.getMatteiId());
            try {
                tb2Mattei2.insert(now, execId);
            } catch (Exception e) {
                tb2Mattei2.update(now, execId);
            }
        }

        // 末弟３の登録
        String sql = "UPDATE TB2_MATTEI3\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`MATTEI_ID` = :mattei_id");
        setList.add("`MATTEI3_INFO` = :mattei_3_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 末弟３削除
     * @return 削除件数
     */
    public int delete() {

        // 末弟の削除
        if (this.tb2Mattei != null) {
            this.tb2Mattei.delete();
        }

        // 末弟２の削除
        if (this.tb2Mattei2 != null) {
            this.tb2Mattei2.delete();
        }

        // 末弟３の削除
        String sql = "DELETE FROM TB2_MATTEI3 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`MATTEI_ID` = ::mattei_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mattei_id", this.matteiId);
        map.put("mattei_3_info", this.mattei3Info);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 末弟 */
    private Tb2Mattei tb2Mattei;

    /** @return 末弟 */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Mattei")
    public Tb2Mattei getTb2Mattei() {
        return this.tb2Mattei;
    }

    /** @param p 末弟 */
    public void setTb2Mattei(final Tb2Mattei p) {
        this.tb2Mattei = p;
    }

    /** @return 末弟 */
    public Tb2Mattei referTb2Mattei() {
        if (this.tb2Mattei == null) {
            try {
                this.tb2Mattei = Tb2Mattei.get(this.matteiId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Mattei;
    }

    /** 末弟２ */
    private Tb2Mattei2 tb2Mattei2;

    /** @return 末弟２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb2Mattei2")
    public Tb2Mattei2 getTb2Mattei2() {
        return this.tb2Mattei2;
    }

    /** @param p 末弟２ */
    public void setTb2Mattei2(final Tb2Mattei2 p) {
        this.tb2Mattei2 = p;
    }

    /** @return 末弟２ */
    public Tb2Mattei2 referTb2Mattei2() {
        if (this.tb2Mattei2 == null) {
            try {
                this.tb2Mattei2 = Tb2Mattei2.get(this.matteiId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb2Mattei2;
    }
}
