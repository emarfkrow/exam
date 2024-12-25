package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 区分マスタ
 * @author emarfkrow
 */
public class MsyKbn implements IEntity {

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

    /** 区分名称 */
    private String kbnNm;

    /** @return 区分名称 */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN_NM")
    public String getKbnNm() {
        return this.kbnNm;
    }

    /** @param o 区分名称 */
    public void setKbnNm(final Object o) {
        if (o != null) {
            this.kbnNm = o.toString();
        } else {
            this.kbnNm = null;
        }
    }

    /** 区分名 */
    private String kbnMei;

    /** @return 区分名 */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN_MEI")
    public String getKbnMei() {
        return this.kbnMei;
    }

    /** @param o 区分名 */
    public void setKbnMei(final Object o) {
        if (o != null) {
            this.kbnMei = o.toString();
        } else {
            this.kbnMei = null;
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
     * 区分マスタ照会
     * @param param1 区分名称
     * @return 区分マスタ
     */
    public static MsyKbn get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KBN_NM` = :kbn_nm");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`KBN_NM` \n";
        sql += "    , a.`KBN_MEI` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    MSY_KBN a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kbn_nm", param1);
        return Queries.get(sql, map, MsyKbn.class);
    }

    /**
     * 区分マスタ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 区分値マスタの登録
        if (this.msyKbnVals != null) {
            for (MsyKbnVal msyKbnVal : this.msyKbnVals) {
                msyKbnVal.setKbnNm(this.getKbnNm());
                msyKbnVal.insert(now, execId);
            }
        }

        // 区分マスタの登録
        String sql = "INSERT INTO MSY_KBN(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`KBN_NM` -- :kbn_nm");
        nameList.add("`KBN_MEI` -- :kbn_mei");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_ID` -- :insert_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_ID` -- :update_id");
        nameList.add("`DELETE_F` -- :delete_f");
        nameList.add("`STATUS_KB` -- :status_kb");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kbn_nm");
        valueList.add(":kbn_mei");
        valueList.add(":insert_ts");
        valueList.add(":insert_id");
        valueList.add(":update_ts");
        valueList.add(":update_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 区分マスタ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 区分値マスタの登録
        if (this.msyKbnVals != null) {
            for (MsyKbnVal msyKbnVal : this.msyKbnVals) {
                if (msyKbnVal == null) {
                    continue;
                }
                msyKbnVal.setKbnNm(this.kbnNm);
                try {
                    msyKbnVal.insert(now, execId);
                } catch (Exception e) {
                    msyKbnVal.update(now, execId);
                }
            }
        }

        // 区分マスタの登録
        String sql = "UPDATE MSY_KBN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`KBN_NM` = :kbn_nm");
        setList.add("`KBN_MEI` = :kbn_mei");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_ID` = :update_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 区分マスタ削除
     * @return 削除件数
     */
    public int delete() {

        // 区分値マスタの削除
        if (this.msyKbnVals != null) {
            for (MsyKbnVal msyKbnVal : this.msyKbnVals) {
                msyKbnVal.delete();
            }
        }

        // 区分マスタの削除
        String sql = "DELETE FROM MSY_KBN WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`KBN_NM` = :kbn_nm");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kbn_nm", this.kbnNm);
        map.put("kbn_mei", this.kbnMei);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }

    /** 区分値マスタのリスト */
    private List<MsyKbnVal> msyKbnVals;

    /** @return 区分値マスタのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("MsyKbnVals")
    public List<MsyKbnVal> getMsyKbnVals() {
        return this.msyKbnVals;
    }

    /** @param list 区分値マスタのリスト */
    public void setMsyKbnVals(final List<MsyKbnVal> list) {
        this.msyKbnVals = list;
    }

    /** @param msyKbnVal */
    public void addMsyKbnVals(final MsyKbnVal msyKbnVal) {
        if (this.msyKbnVals == null) {
            this.msyKbnVals = new ArrayList<MsyKbnVal>();
        }
        this.msyKbnVals.add(msyKbnVal);
    }

    /** @return 区分値マスタのリスト */
    public List<MsyKbnVal> referMsyKbnVals() {
        if (this.msyKbnVals == null) {
            this.msyKbnVals = MsyKbn.referMsyKbnVals(this.kbnNm);
        }
        return this.msyKbnVals;
    }

    /**
     * @param param1 kbnNm
     * @return List<MsyKbnVal>
     */
    public static List<MsyKbnVal> referMsyKbnVals(final String param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("KBN_NM = :kbn_nm");
        String sql = "SELECT * FROM MSY_KBN_VAL WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "KBN_NM, KBN_VAL";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kbn_nm", param1);
        return Queries.select(sql, map, MsyKbnVal.class, null, null);
    }
}
