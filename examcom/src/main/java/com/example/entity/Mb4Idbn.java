package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * IDBN参照マスタ
 * @author emarfkrow
 */
public class Mb4Idbn implements IEntity {

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

    /** ID参照ID */
    private Integer idrefId;

    /** @return ID参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty("IDREF_ID")
    public Integer getIdrefId() {
        return this.idrefId;
    }

    /** @param o ID参照ID */
    public void setIdrefId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idrefId = Integer.valueOf(o.toString());
        } else {
            this.idrefId = null;
        }
    }

    /** ID参照ID参照 */
    private String idrefMei;

    /** @return ID参照ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("IDREF_MEI")
    public String getIdrefMei() {
        return this.idrefMei;
    }

    /** @param o ID参照ID参照 */
    public void setIdrefMei(final Object o) {
        if (o != null) {
            this.idrefMei = o.toString();
        } else {
            this.idrefMei = null;
        }
    }

    /** IDBN連番 */
    private Integer idbnBn;

    /** @return IDBN連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("IDBN_BN")
    public Integer getIdbnBn() {
        return this.idbnBn;
    }

    /** @param o IDBN連番 */
    public void setIdbnBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idbnBn = Integer.valueOf(o.toString());
        } else {
            this.idbnBn = null;
        }
    }

    /** IDBNNO */
    private String idbnNo;

    /** @return IDBNNO */
    @com.fasterxml.jackson.annotation.JsonProperty("IDBN_NO")
    public String getIdbnNo() {
        return this.idbnNo;
    }

    /** @param o IDBNNO */
    public void setIdbnNo(final Object o) {
        if (o != null) {
            this.idbnNo = o.toString();
        } else {
            this.idbnNo = null;
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
     * IDBN参照マスタ照会
     * @param param1 ID参照ID
     * @param param2 IDBN連番
     * @return IDBN参照マスタ
     */
    public static Mb4Idbn get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`IDREF_ID` = :idref_id");
        whereList.add("`IDBN_BN` = :idbn_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`IDREF_ID` \n";
        sql += "    , a.`IDBN_BN` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`IDBN_NO`) AS IDBN_NO \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    MB4_IDBN a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("idref_id", param1);
        map.put("idbn_bn", param2);
        return Queries.get(sql, map, Mb4Idbn.class);
    }

    /**
     * IDBN参照マスタ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // IDBN連番の採番処理
        numbering();

        // IDBN参照マスタの登録
        String sql = "INSERT INTO MB4_IDBN(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`IDREF_ID` -- :idref_id");
        nameList.add("`IDBN_BN` -- :idbn_bn");
        nameList.add("`IDBN_NO` -- :idbn_no");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":idref_id");
        valueList.add(":idbn_bn");
        valueList.add(":idbn_no");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** IDBN連番の採番処理 */
    private void numbering() {
        if (this.idbnBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`IDBN_BN`) IS NULL THEN 0 ELSE MAX(e.`IDBN_BN`) * 1 END + 1 AS `IDBN_BN` FROM MB4_IDBN e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`IDREF_ID` = :idref_id");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("idref_id", this.idrefId);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("IDBN_BN");
        this.setIdbnBn(o);
    }

    /**
     * IDBN参照マスタ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // IDBN参照マスタの登録
        String sql = "UPDATE MB4_IDBN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`IDREF_ID` = :idref_id");
        setList.add("`IDBN_BN` = :idbn_bn");
        setList.add("`IDBN_NO` = :idbn_no");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * IDBN参照マスタ削除
     * @return 削除件数
     */
    public int delete() {

        // IDBN参照マスタの削除
        String sql = "DELETE FROM MB4_IDBN WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`IDREF_ID` = :idref_id");
        whereList.add("`IDBN_BN` = :idbn_bn");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("idref_id", this.idrefId);
        map.put("idbn_bn", this.idbnBn);
        map.put("idbn_no", this.idbnNo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
