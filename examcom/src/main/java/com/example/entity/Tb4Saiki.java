package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 再帰
 * @author emarfkrow
 */
public class Tb4Saiki implements IEntity {

    /** SlickGridのDataView用ID */
    private Integer id;

    /** @return id */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id", index = 1)
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

    /** 再帰ID */
    private Integer saikiId;

    /** @return 再帰ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "SAIKI_ID", index = 2)
    public Integer getSaikiId() {
        return this.saikiId;
    }

    /** @param o 再帰ID */
    public void setSaikiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.saikiId = Integer.valueOf(o.toString());
        } else {
            this.saikiId = null;
        }
    }

    /** 参照ID */
    private Integer idrefId;

    /** @return 参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "IDREF_ID", index = 3)
    public Integer getIdrefId() {
        return this.idrefId;
    }

    /** @param o 参照ID */
    public void setIdrefId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idrefId = Integer.valueOf(o.toString());
        } else {
            this.idrefId = null;
        }
    }

    /** 参照ID参照 */
    private String idrefMei;

    /** @return 参照ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "IDREF_MEI", index = 4)
    public String getIdrefMei() {
        return this.idrefMei;
    }

    /** @param o 参照ID参照 */
    public void setIdrefMei(final Object o) {
        if (o != null) {
            this.idrefMei = o.toString();
        } else {
            this.idrefMei = null;
        }
    }

    /** 参照CD */
    private String cdrefCd;

    /** @return 参照CD */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "CDREF_CD", index = 5)
    public String getCdrefCd() {
        return this.cdrefCd;
    }

    /** @param o 参照CD */
    public void setCdrefCd(final Object o) {
        if (o != null) {
            this.cdrefCd = o.toString();
        } else {
            this.cdrefCd = null;
        }
    }

    /** 参照CD参照 */
    private String cdrefMei;

    /** @return 参照CD参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "CDREF_MEI", index = 6)
    public String getCdrefMei() {
        return this.cdrefMei;
    }

    /** @param o 参照CD参照 */
    public void setCdrefMei(final Object o) {
        if (o != null) {
            this.cdrefMei = o.toString();
        } else {
            this.cdrefMei = null;
        }
    }

    /** 参照NO */
    private String norefNo;

    /** @return 参照NO */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "NOREF_NO", index = 7)
    public String getNorefNo() {
        return this.norefNo;
    }

    /** @param o 参照NO */
    public void setNorefNo(final Object o) {
        if (o != null) {
            this.norefNo = o.toString();
        } else {
            this.norefNo = null;
        }
    }

    /** 参照NO参照 */
    private String norefMei;

    /** @return 参照NO参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "NOREF_MEI", index = 8)
    public String getNorefMei() {
        return this.norefMei;
    }

    /** @param o 参照NO参照 */
    public void setNorefMei(final Object o) {
        if (o != null) {
            this.norefMei = o.toString();
        } else {
            this.norefMei = null;
        }
    }

    /** 別参照ID */
    private Integer betsuIdrefId;

    /** @return 別参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "BETSU_IDREF_ID", index = 9)
    public Integer getBetsuIdrefId() {
        return this.betsuIdrefId;
    }

    /** @param o 別参照ID */
    public void setBetsuIdrefId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.betsuIdrefId = Integer.valueOf(o.toString());
        } else {
            this.betsuIdrefId = null;
        }
    }

    /** 別参照ID参照 */
    private String betsuIdrefMei;

    /** @return 別参照ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "BETSU_IDREF_MEI", index = 10)
    public String getBetsuIdrefMei() {
        return this.betsuIdrefMei;
    }

    /** @param o 別参照ID参照 */
    public void setBetsuIdrefMei(final Object o) {
        if (o != null) {
            this.betsuIdrefMei = o.toString();
        } else {
            this.betsuIdrefMei = null;
        }
    }

    /** ID連番 */
    private Integer refBn;

    /** @return ID連番 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "REF_BN", index = 11)
    public Integer getRefBn() {
        return this.refBn;
    }

    /** @param o ID連番 */
    public void setRefBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.refBn = Integer.valueOf(o.toString());
        } else {
            this.refBn = null;
        }
    }

    /** 親再帰ID */
    private Integer oyaSaikiId;

    /** @return 親再帰ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "OYA_SAIKI_ID", index = 12)
    public Integer getOyaSaikiId() {
        return this.oyaSaikiId;
    }

    /** @param o 親再帰ID */
    public void setOyaSaikiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaSaikiId = Integer.valueOf(o.toString());
        } else {
            this.oyaSaikiId = null;
        }
    }

    /** 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_TS", index = 13)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_ID", index = 14)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_SEI", index = 15)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_TS", index = 16)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_ID", index = 17)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_SEI", index = 18)
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
     * 再帰照会
     * @param param1 再帰ID
     * @return 再帰
     */
    public static Tb4Saiki get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SAIKI_ID` = :saiki_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SAIKI_ID` \n";
        sql += "    , a.`IDREF_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`CDREF_CD`) AS CDREF_CD \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NOREF_NO`) AS NOREF_NO \n";
        sql += "    , a.`BETSU_IDREF_ID` \n";
        sql += "    , a.`REF_BN` \n";
        sql += "    , a.`OYA_SAIKI_ID` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB4_SAIKI a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("saiki_id", param1);
        return Queries.get(sql, map, Tb4Saiki.class);
    }

    /**
     * 再帰追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 再帰IDの採番処理
        numbering();

        // 再帰の登録
        String sql = "INSERT INTO TB4_SAIKI(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SAIKI_ID` -- :saiki_id");
        nameList.add("`IDREF_ID` -- :idref_id");
        nameList.add("`CDREF_CD` -- :cdref_cd");
        nameList.add("`NOREF_NO` -- :noref_no");
        nameList.add("`BETSU_IDREF_ID` -- :betsu_idref_id");
        nameList.add("`REF_BN` -- :ref_bn");
        nameList.add("`OYA_SAIKI_ID` -- :oya_saiki_id");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":saiki_id");
        valueList.add(":idref_id");
        valueList.add(":cdref_cd");
        valueList.add(":noref_no");
        valueList.add(":betsu_idref_id");
        valueList.add(":ref_bn");
        valueList.add(":oya_saiki_id");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 再帰IDの採番処理 */
    private void numbering() {
        if (this.saikiId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`SAIKI_ID`) IS NULL THEN 0 ELSE MAX(e.`SAIKI_ID`) * 1 END + 1 AS `SAIKI_ID` FROM TB4_SAIKI e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("SAIKI_ID");
        this.setSaikiId(o);
    }

    /**
     * 再帰更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 再帰の登録
        String sql = "UPDATE TB4_SAIKI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SAIKI_ID` = :saiki_id");
        setList.add("`IDREF_ID` = :idref_id");
        setList.add("`CDREF_CD` = :cdref_cd");
        setList.add("`NOREF_NO` = :noref_no");
        setList.add("`BETSU_IDREF_ID` = :betsu_idref_id");
        setList.add("`REF_BN` = :ref_bn");
        setList.add("`OYA_SAIKI_ID` = :oya_saiki_id");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 再帰削除
     * @return 削除件数
     */
    public int delete() {

        // 再帰の削除
        String sql = "DELETE FROM TB4_SAIKI WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SAIKI_ID` = :saiki_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("saiki_id", this.saikiId);
        map.put("idref_id", this.idrefId);
        map.put("cdref_cd", this.cdrefCd);
        map.put("noref_no", this.norefNo);
        map.put("betsu_idref_id", this.betsuIdrefId);
        map.put("ref_bn", this.refBn);
        map.put("oya_saiki_id", this.oyaSaikiId);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
