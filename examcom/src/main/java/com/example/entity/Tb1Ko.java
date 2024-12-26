package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 子
 * @author emarfkrow
 */
public class Tb1Ko implements IEntity {

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

    /** 子枝番 */
    private Integer koBn;

    /** @return 子枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("KO_BN")
    public Integer getKoBn() {
        return this.koBn;
    }

    /** @param o 子枝番 */
    public void setKoBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koBn = Integer.valueOf(o.toString());
        } else {
            this.koBn = null;
        }
    }

    /** 子名 */
    private String koMei;

    /** @return 子名 */
    @com.fasterxml.jackson.annotation.JsonProperty("KO_MEI")
    public String getKoMei() {
        return this.koMei;
    }

    /** @param o 子名 */
    public void setKoMei(final Object o) {
        if (o != null) {
            this.koMei = o.toString();
        } else {
            this.koMei = null;
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
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
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
     * 子照会
     * @param param1 祖先ID
     * @param param2 親枝番
     * @param param3 エンティティ枝番
     * @param param4 子枝番
     * @return 子
     */
    public static Tb1Ko get(final Object param1, final Object param2, final Object param3, final Object param4) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SOSEN_ID\" = :sosen_id");
        whereList.add("\"OYA_BN\" = :oya_bn");
        whereList.add("\"ENTITY_BN\" = :entity_bn");
        whereList.add("\"KO_BN\" = :ko_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.\"SOSEN_ID\" \n";
        sql += "    , a.\"OYA_BN\" \n";
        sql += "    , a.\"ENTITY_BN\" \n";
        sql += "    , a.\"KO_BN\" \n";
        sql += "    , a.\"KO_MEI\" \n";
        sql += "    , TO_CHAR (a.\"INSERT_TS\", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS \n";
        sql += "    , a.\"INSERT_ID\" \n";
        sql += "    , TO_CHAR (a.\"UPDATE_TS\", 'YYYY-MM-DD HH24:MI:SS.FF3') AS UPDATE_TS \n";
        sql += "    , a.\"UPDATE_ID\" \n";
        sql += "    , RTRIM (RTRIM (a.\"DELETE_F\"), '　') AS DELETE_F \n";
        sql += "    , a.\"STATUS_KB\" \n";
        sql += "FROM \n";
        sql += "    TB1_KO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        map.put("ko_bn", param4);
        return Queries.get(sql, map, Tb1Ko.class);
    }

    /**
     * 子追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 子枝番の採番処理
        numbering();

        // 子孫の登録
        if (this.tb1Shisons != null) {
            for (Tb1Shison tb1Shison : this.tb1Shisons) {
                tb1Shison.setSosenId(this.getSosenId());
                tb1Shison.setOyaBn(this.getOyaBn());
                tb1Shison.setEntityBn(this.getEntityBn());
                tb1Shison.setKoBn(this.getKoBn());
                tb1Shison.insert(now, execId);
            }
        }

        // 子の登録
        String sql = "INSERT INTO TB1_KO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SOSEN_ID\" -- :sosen_id");
        nameList.add("\"OYA_BN\" -- :oya_bn");
        nameList.add("\"ENTITY_BN\" -- :entity_bn");
        nameList.add("\"KO_BN\" -- :ko_bn");
        nameList.add("\"KO_MEI\" -- :ko_mei");
        nameList.add("\"INSERT_TS\" -- :insert_ts");
        nameList.add("\"INSERT_ID\" -- :insert_id");
        nameList.add("\"UPDATE_TS\" -- :update_ts");
        nameList.add("\"UPDATE_ID\" -- :update_id");
        nameList.add("\"DELETE_F\" -- :delete_f");
        nameList.add("\"STATUS_KB\" -- :status_kb");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_bn");
        valueList.add(":entity_bn");
        valueList.add(":ko_bn");
        valueList.add(":ko_mei");
        valueList.add("TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')");
        valueList.add(":insert_id");
        valueList.add("TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')");
        valueList.add(":update_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 子枝番の採番処理 */
    private void numbering() {
        if (this.koBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.\"KO_BN\") IS NULL THEN 0 ELSE MAX(e.\"KO_BN\") * 1 END + 1 AS \"KO_BN\" FROM TB1_KO e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"SOSEN_ID\" = :sosen_id");
        whereList.add("e.\"OYA_BN\" = :oya_bn");
        whereList.add("e.\"ENTITY_BN\" = :entity_bn");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        map.put("oya_bn", this.oyaBn);
        map.put("entity_bn", this.entityBn);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("KO_BN");
        this.setKoBn(o);
    }

    /**
     * 子更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 子孫の登録
        if (this.tb1Shisons != null) {
            for (Tb1Shison tb1Shison : this.tb1Shisons) {
                if (tb1Shison == null) {
                    continue;
                }
                tb1Shison.setSosenId(this.sosenId);
                tb1Shison.setOyaBn(this.oyaBn);
                tb1Shison.setEntityBn(this.entityBn);
                tb1Shison.setKoBn(this.koBn);
                try {
                    tb1Shison.insert(now, execId);
                } catch (Exception e) {
                    tb1Shison.update(now, execId);
                }
            }
        }

        // 子の登録
        String sql = "UPDATE TB1_KO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SOSEN_ID\" = :sosen_id");
        setList.add("\"OYA_BN\" = :oya_bn");
        setList.add("\"ENTITY_BN\" = :entity_bn");
        setList.add("\"KO_BN\" = :ko_bn");
        setList.add("\"KO_MEI\" = :ko_mei");
        setList.add("\"UPDATE_TS\" = TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')");
        setList.add("\"UPDATE_ID\" = :update_id");
        setList.add("\"DELETE_F\" = :delete_f");
        setList.add("\"STATUS_KB\" = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 子削除
     * @return 削除件数
     */
    public int delete() {

        // 子孫の削除
        if (this.tb1Shisons != null) {
            for (Tb1Shison tb1Shison : this.tb1Shisons) {
                tb1Shison.delete();
            }
        }

        // 子の削除
        String sql = "DELETE FROM TB1_KO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SOSEN_ID\" = :sosen_id");
        whereList.add("\"OYA_BN\" = :oya_bn");
        whereList.add("\"ENTITY_BN\" = :entity_bn");
        whereList.add("\"KO_BN\" = :ko_bn");
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
        map.put("ko_bn", this.koBn);
        map.put("ko_mei", this.koMei);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }

    /** 子孫のリスト */
    private List<Tb1Shison> tb1Shisons;

    /** @return 子孫のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Shisons")
    public List<Tb1Shison> getTb1Shisons() {
        return this.tb1Shisons;
    }

    /** @param list 子孫のリスト */
    public void setTb1Shisons(final List<Tb1Shison> list) {
        this.tb1Shisons = list;
    }

    /** @param tb1Shison */
    public void addTb1Shisons(final Tb1Shison tb1Shison) {
        if (this.tb1Shisons == null) {
            this.tb1Shisons = new ArrayList<Tb1Shison>();
        }
        this.tb1Shisons.add(tb1Shison);
    }

    /** @return 子孫のリスト */
    public List<Tb1Shison> referTb1Shisons() {
        this.tb1Shisons = Tb1Ko.referTb1Shisons(this.sosenId, this.oyaBn, this.entityBn, this.koBn);
        return this.tb1Shisons;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @param param3 entityBn
     * @param param4 koBn
     * @return List<Tb1Shison>
     */
    public static List<Tb1Shison> referTb1Shisons(final Integer param1, final Integer param2, final Integer param3, final Integer param4) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        whereList.add("ENTITY_BN = :entity_bn");
        whereList.add("KO_BN = :ko_bn");
        String sql = "SELECT * FROM TB1_SHISON WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "SOSEN_ID, OYA_BN, ENTITY_BN, KO_BN, SHISON_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        map.put("ko_bn", param4);
        return Queries.select(sql, map, Tb1Shison.class, null, null);
    }
}
