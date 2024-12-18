package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 添付ファイル
 * @author emarfkrow
 */
public class Tb1TenpuFile implements IEntity {

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

    /** 親枝番 */
    private Integer oyaBn;

    /** @return 親枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_BN")
    public Integer getOyaBn() {
        return this.oyaBn;
    }

    /** @param o 親枝番 */
    public void setOyaBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaBn = Integer.valueOf(o.toString());
        } else {
            this.oyaBn = null;
        }
    }

    /** エンティティ枝番 */
    private Integer entityBn;

    /** @return エンティティ枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_BN")
    public Integer getEntityBn() {
        return this.entityBn;
    }

    /** @param o エンティティ枝番 */
    public void setEntityBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entityBn = Integer.valueOf(o.toString());
        } else {
            this.entityBn = null;
        }
    }

    /** 添付ファイル枝番 */
    private Integer tenpuFileBn;

    /** @return 添付ファイル枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENPU_FILE_BN")
    public Integer getTenpuFileBn() {
        return this.tenpuFileBn;
    }

    /** @param o 添付ファイル枝番 */
    public void setTenpuFileBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenpuFileBn = Integer.valueOf(o.toString());
        } else {
            this.tenpuFileBn = null;
        }
    }

    /** 添付ファイル名 */
    private String tenpuFileMei;

    /** @return 添付ファイル名 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENPU_FILE_MEI")
    public String getTenpuFileMei() {
        return this.tenpuFileMei;
    }

    /** @param o 添付ファイル名 */
    public void setTenpuFileMei(final Object o) {
        if (o != null) {
            this.tenpuFileMei = o.toString();
        } else {
            this.tenpuFileMei = null;
        }
    }

    /** 添付ファイルパス */
    private String tenpuFilePath;

    /** @return 添付ファイルパス */
    @com.fasterxml.jackson.annotation.JsonProperty("TENPU_FILE_PATH")
    public String getTenpuFilePath() {
        return this.tenpuFilePath;
    }

    /** @param o 添付ファイルパス */
    public void setTenpuFilePath(final Object o) {
        if (o != null) {
            this.tenpuFilePath = o.toString();
        } else {
            this.tenpuFilePath = null;
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
            this.insertTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T"));
        } else {
            this.insertTs = null;
        }
    }

    /** 作成者 */
    private Integer insertId;

    /** @return 作成者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_ID")
    public Integer getInsertId() {
        return this.insertId;
    }

    /** @param o 作成者 */
    public void setInsertId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertId = Integer.valueOf(o.toString());
        } else {
            this.insertId = null;
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
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T"));
        } else {
            this.updateTs = null;
        }
    }

    /** 更新者 */
    private Integer updateId;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_ID")
    public Integer getUpdateId() {
        return this.updateId;
    }

    /** @param o 更新者 */
    public void setUpdateId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateId = Integer.valueOf(o.toString());
        } else {
            this.updateId = null;
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

    /**
     * 添付ファイル照会
     * @param param1 祖先ID
     * @param param2 親枝番
     * @param param3 エンティティ枝番
     * @param param4 添付ファイル枝番
     * @return 添付ファイル
     */
    public static Tb1TenpuFile get(final Object param1, final Object param2, final Object param3, final Object param4) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        whereList.add("`ENTITY_BN` = :entity_bn");
        whereList.add("`TENPU_FILE_BN` = :tenpu_file_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SOSEN_ID` \n";
        sql += "    , a.`OYA_BN` \n";
        sql += "    , a.`ENTITY_BN` \n";
        sql += "    , a.`TENPU_FILE_BN` \n";
        sql += "    , a.`TENPU_FILE_MEI` \n";
        sql += "    , a.`TENPU_FILE_PATH` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    tb1_tenpu_file a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        map.put("tenpu_file_bn", param4);
        return Queries.get(sql, map, Tb1TenpuFile.class);
    }

    /**
     * 添付ファイル追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 添付ファイル枝番の採番処理
        numbering();

        // 添付ファイルの登録
        String sql = "INSERT INTO tb1_tenpu_file(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_BN` -- :oya_bn");
        nameList.add("`ENTITY_BN` -- :entity_bn");
        nameList.add("`TENPU_FILE_BN` -- :tenpu_file_bn");
        nameList.add("`TENPU_FILE_MEI` -- :tenpu_file_mei");
        nameList.add("`TENPU_FILE_PATH` -- :tenpu_file_path");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_ID` -- :insert_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_ID` -- :update_id");
        nameList.add("`DELETE_F` -- :delete_f");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_bn");
        valueList.add(":entity_bn");
        valueList.add(":tenpu_file_bn");
        valueList.add(":tenpu_file_mei");
        valueList.add(":tenpu_file_path");
        valueList.add(":insert_ts");
        valueList.add(":insert_id");
        valueList.add(":update_ts");
        valueList.add(":update_id");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** 添付ファイル枝番の採番処理 */
    private void numbering() {
        if (this.tenpuFileBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`TENPU_FILE_BN`) IS NULL THEN 0 ELSE MAX(e.`TENPU_FILE_BN`) * 1 END + 1 AS `TENPU_FILE_BN` FROM tb1_tenpu_file e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        whereList.add("e.`OYA_BN` = :oya_bn");
        whereList.add("e.`ENTITY_BN` = :entity_bn");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        map.put("oya_bn", this.oyaBn);
        map.put("entity_bn", this.entityBn);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("TENPU_FILE_BN");
        this.setTenpuFileBn(o);
    }

    /**
     * 添付ファイル更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 添付ファイルの登録
        String sql = "UPDATE tb1_tenpu_file\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_BN` = :oya_bn");
        setList.add("`ENTITY_BN` = :entity_bn");
        setList.add("`TENPU_FILE_BN` = :tenpu_file_bn");
        setList.add("`TENPU_FILE_MEI` = :tenpu_file_mei");
        setList.add("`TENPU_FILE_PATH` = :tenpu_file_path");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_ID` = :update_id");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 添付ファイル削除
     * @return 削除件数
     */
    public int delete() {

        Tb1TenpuFile tb1TenpuFile = Tb1TenpuFile.get(this.sosenId, this.oyaBn, this.entityBn, this.tenpuFileBn);
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get(tb1TenpuFile.tenpuFilePath));
        } catch (Exception e) {
            throw new jp.co.golorp.emarf.exception.SysError(e);
        }

        // 添付ファイルの削除
        String sql = "DELETE FROM tb1_tenpu_file WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        whereList.add("`ENTITY_BN` = :entity_bn");
        whereList.add("`TENPU_FILE_BN` = :tenpu_file_bn");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", this.sosenId);
        map.put("oya_bn", this.oyaBn);
        map.put("entity_bn", this.entityBn);
        map.put("tenpu_file_bn", this.tenpuFileBn);
        map.put("tenpu_file_mei", this.tenpuFileMei);
        map.put("tenpu_file_path", this.tenpuFilePath);
        map.put("delete_f", this.deleteF);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }
}
