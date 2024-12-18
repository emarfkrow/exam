package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 親
 * @author emarfkrow
 */
public class Tb1Oya implements IEntity {

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

    /** 親名 */
    private String oyaMei;

    /** @return 親名 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_MEI")
    public String getOyaMei() {
        return this.oyaMei;
    }

    /** @param o 親名 */
    public void setOyaMei(final Object o) {
        if (o != null) {
            this.oyaMei = o.toString();
        } else {
            this.oyaMei = null;
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
     * 親照会
     * @param param1 祖先ID
     * @param param2 親枝番
     * @return 親
     */
    public static Tb1Oya get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SOSEN_ID` \n";
        sql += "    , a.`OYA_BN` \n";
        sql += "    , a.`OYA_MEI` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    tb1_oya a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        return Queries.get(sql, map, Tb1Oya.class);
    }

    /**
     * 親追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 親枝番の採番処理
        numbering();

        // エンティティ１の登録
        if (this.tb1Entity1s != null) {
            for (Tb1Entity1 tb1Entity1 : this.tb1Entity1s) {
                tb1Entity1.setSosenId(this.getSosenId());
                tb1Entity1.setOyaBn(this.getOyaBn());
                tb1Entity1.insert(now, execId);
            }
        }

        // エンティティ２の登録
        if (this.tb1Entity2s != null) {
            for (Tb1Entity2 tb1Entity2 : this.tb1Entity2s) {
                tb1Entity2.setSosenId(this.getSosenId());
                tb1Entity2.setOyaBn(this.getOyaBn());
                tb1Entity2.insert(now, execId);
            }
        }

        // エンティティ３の登録
        if (this.tb1Entity3s != null) {
            for (Tb1Entity3 tb1Entity3 : this.tb1Entity3s) {
                tb1Entity3.setSosenId(this.getSosenId());
                tb1Entity3.setOyaBn(this.getOyaBn());
                tb1Entity3.insert(now, execId);
            }
        }

        // エンティティ４の登録
        if (this.tb1Entity4s != null) {
            for (Tb1Entity4 tb1Entity4 : this.tb1Entity4s) {
                tb1Entity4.setSosenId(this.getSosenId());
                tb1Entity4.setOyaBn(this.getOyaBn());
                tb1Entity4.insert(now, execId);
            }
        }

        // エンティティ５の登録
        if (this.tb1Entity5s != null) {
            for (Tb1Entity5 tb1Entity5 : this.tb1Entity5s) {
                tb1Entity5.setSosenId(this.getSosenId());
                tb1Entity5.setOyaBn(this.getOyaBn());
                tb1Entity5.insert(now, execId);
            }
        }

        // 親の登録
        String sql = "INSERT INTO tb1_oya(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_BN` -- :oya_bn");
        nameList.add("`OYA_MEI` -- :oya_mei");
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
        valueList.add(":oya_mei");
        valueList.add(":insert_ts");
        valueList.add(":insert_id");
        valueList.add(":update_ts");
        valueList.add(":update_id");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** 親枝番の採番処理 */
    private void numbering() {
        if (this.oyaBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`OYA_BN`) IS NULL THEN 0 ELSE MAX(e.`OYA_BN`) * 1 END + 1 AS `OYA_BN` FROM tb1_oya e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("OYA_BN");
        this.setOyaBn(o);
    }

    /**
     * 親更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // エンティティ１の登録
        if (this.tb1Entity1s != null) {
            for (Tb1Entity1 tb1Entity1 : this.tb1Entity1s) {
                if (tb1Entity1 == null) {
                    continue;
                }
                tb1Entity1.setSosenId(this.sosenId);
                tb1Entity1.setOyaBn(this.oyaBn);
                try {
                    tb1Entity1.insert(now, execId);
                } catch (Exception e) {
                    tb1Entity1.update(now, execId);
                }
            }
        }

        // エンティティ２の登録
        if (this.tb1Entity2s != null) {
            for (Tb1Entity2 tb1Entity2 : this.tb1Entity2s) {
                if (tb1Entity2 == null) {
                    continue;
                }
                tb1Entity2.setSosenId(this.sosenId);
                tb1Entity2.setOyaBn(this.oyaBn);
                try {
                    tb1Entity2.insert(now, execId);
                } catch (Exception e) {
                    tb1Entity2.update(now, execId);
                }
            }
        }

        // エンティティ３の登録
        if (this.tb1Entity3s != null) {
            for (Tb1Entity3 tb1Entity3 : this.tb1Entity3s) {
                if (tb1Entity3 == null) {
                    continue;
                }
                tb1Entity3.setSosenId(this.sosenId);
                tb1Entity3.setOyaBn(this.oyaBn);
                try {
                    tb1Entity3.insert(now, execId);
                } catch (Exception e) {
                    tb1Entity3.update(now, execId);
                }
            }
        }

        // エンティティ４の登録
        if (this.tb1Entity4s != null) {
            for (Tb1Entity4 tb1Entity4 : this.tb1Entity4s) {
                if (tb1Entity4 == null) {
                    continue;
                }
                tb1Entity4.setSosenId(this.sosenId);
                tb1Entity4.setOyaBn(this.oyaBn);
                try {
                    tb1Entity4.insert(now, execId);
                } catch (Exception e) {
                    tb1Entity4.update(now, execId);
                }
            }
        }

        // エンティティ５の登録
        if (this.tb1Entity5s != null) {
            for (Tb1Entity5 tb1Entity5 : this.tb1Entity5s) {
                if (tb1Entity5 == null) {
                    continue;
                }
                tb1Entity5.setSosenId(this.sosenId);
                tb1Entity5.setOyaBn(this.oyaBn);
                try {
                    tb1Entity5.insert(now, execId);
                } catch (Exception e) {
                    tb1Entity5.update(now, execId);
                }
            }
        }

        // 親の登録
        String sql = "UPDATE tb1_oya\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_BN` = :oya_bn");
        setList.add("`OYA_MEI` = :oya_mei");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_ID` = :update_id");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 親削除
     * @return 削除件数
     */
    public int delete() {

        // エンティティ１の削除
        if (this.tb1Entity1s != null) {
            for (Tb1Entity1 tb1Entity1 : this.tb1Entity1s) {
                tb1Entity1.delete();
            }
        }

        // エンティティ２の削除
        if (this.tb1Entity2s != null) {
            for (Tb1Entity2 tb1Entity2 : this.tb1Entity2s) {
                tb1Entity2.delete();
            }
        }

        // エンティティ３の削除
        if (this.tb1Entity3s != null) {
            for (Tb1Entity3 tb1Entity3 : this.tb1Entity3s) {
                tb1Entity3.delete();
            }
        }

        // エンティティ４の削除
        if (this.tb1Entity4s != null) {
            for (Tb1Entity4 tb1Entity4 : this.tb1Entity4s) {
                tb1Entity4.delete();
            }
        }

        // エンティティ５の削除
        if (this.tb1Entity5s != null) {
            for (Tb1Entity5 tb1Entity5 : this.tb1Entity5s) {
                tb1Entity5.delete();
            }
        }

        // 親の削除
        String sql = "DELETE FROM tb1_oya WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
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
        map.put("oya_mei", this.oyaMei);
        map.put("delete_f", this.deleteF);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }

    /** エンティティ１のリスト */
    private List<Tb1Entity1> tb1Entity1s;

    /** @return エンティティ１のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity1s")
    public List<Tb1Entity1> getTb1Entity1s() {
        return this.tb1Entity1s;
    }

    /** @param list エンティティ１のリスト */
    public void setTb1Entity1s(final List<Tb1Entity1> list) {
        this.tb1Entity1s = list;
    }

    /** @param tb1Entity1 */
    public void addTb1Entity1s(final Tb1Entity1 tb1Entity1) {
        if (this.tb1Entity1s == null) {
            this.tb1Entity1s = new ArrayList<Tb1Entity1>();
        }
        this.tb1Entity1s.add(tb1Entity1);
    }

    /** @return エンティティ１のリスト */
    public List<Tb1Entity1> referTb1Entity1s() {
        if (this.tb1Entity1s == null) {
            this.tb1Entity1s = Tb1Oya.referTb1Entity1s(this.sosenId, this.oyaBn);
        }
        return this.tb1Entity1s;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @return List<Tb1Entity1>
     */
    public static List<Tb1Entity1> referTb1Entity1s(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        String sql = "SELECT * FROM tb1_entity1 WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "SOSEN_ID, OYA_BN, ENTITY_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        return Queries.select(sql, map, Tb1Entity1.class, null, null);
    }

    /** エンティティ２のリスト */
    private List<Tb1Entity2> tb1Entity2s;

    /** @return エンティティ２のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity2s")
    public List<Tb1Entity2> getTb1Entity2s() {
        return this.tb1Entity2s;
    }

    /** @param list エンティティ２のリスト */
    public void setTb1Entity2s(final List<Tb1Entity2> list) {
        this.tb1Entity2s = list;
    }

    /** @param tb1Entity2 */
    public void addTb1Entity2s(final Tb1Entity2 tb1Entity2) {
        if (this.tb1Entity2s == null) {
            this.tb1Entity2s = new ArrayList<Tb1Entity2>();
        }
        this.tb1Entity2s.add(tb1Entity2);
    }

    /** @return エンティティ２のリスト */
    public List<Tb1Entity2> referTb1Entity2s() {
        if (this.tb1Entity2s == null) {
            this.tb1Entity2s = Tb1Oya.referTb1Entity2s(this.sosenId, this.oyaBn);
        }
        return this.tb1Entity2s;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @return List<Tb1Entity2>
     */
    public static List<Tb1Entity2> referTb1Entity2s(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        String sql = "SELECT * FROM tb1_entity2 WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "SOSEN_ID, OYA_BN, ENTITY_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        return Queries.select(sql, map, Tb1Entity2.class, null, null);
    }

    /** エンティティ３のリスト */
    private List<Tb1Entity3> tb1Entity3s;

    /** @return エンティティ３のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity3s")
    public List<Tb1Entity3> getTb1Entity3s() {
        return this.tb1Entity3s;
    }

    /** @param list エンティティ３のリスト */
    public void setTb1Entity3s(final List<Tb1Entity3> list) {
        this.tb1Entity3s = list;
    }

    /** @param tb1Entity3 */
    public void addTb1Entity3s(final Tb1Entity3 tb1Entity3) {
        if (this.tb1Entity3s == null) {
            this.tb1Entity3s = new ArrayList<Tb1Entity3>();
        }
        this.tb1Entity3s.add(tb1Entity3);
    }

    /** @return エンティティ３のリスト */
    public List<Tb1Entity3> referTb1Entity3s() {
        if (this.tb1Entity3s == null) {
            this.tb1Entity3s = Tb1Oya.referTb1Entity3s(this.sosenId, this.oyaBn);
        }
        return this.tb1Entity3s;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @return List<Tb1Entity3>
     */
    public static List<Tb1Entity3> referTb1Entity3s(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        String sql = "SELECT * FROM tb1_entity3 WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "SOSEN_ID, OYA_BN, ENTITY_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        return Queries.select(sql, map, Tb1Entity3.class, null, null);
    }

    /** エンティティ４のリスト */
    private List<Tb1Entity4> tb1Entity4s;

    /** @return エンティティ４のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity4s")
    public List<Tb1Entity4> getTb1Entity4s() {
        return this.tb1Entity4s;
    }

    /** @param list エンティティ４のリスト */
    public void setTb1Entity4s(final List<Tb1Entity4> list) {
        this.tb1Entity4s = list;
    }

    /** @param tb1Entity4 */
    public void addTb1Entity4s(final Tb1Entity4 tb1Entity4) {
        if (this.tb1Entity4s == null) {
            this.tb1Entity4s = new ArrayList<Tb1Entity4>();
        }
        this.tb1Entity4s.add(tb1Entity4);
    }

    /** @return エンティティ４のリスト */
    public List<Tb1Entity4> referTb1Entity4s() {
        if (this.tb1Entity4s == null) {
            this.tb1Entity4s = Tb1Oya.referTb1Entity4s(this.sosenId, this.oyaBn);
        }
        return this.tb1Entity4s;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @return List<Tb1Entity4>
     */
    public static List<Tb1Entity4> referTb1Entity4s(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        String sql = "SELECT * FROM tb1_entity4 WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "SOSEN_ID, OYA_BN, ENTITY_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        return Queries.select(sql, map, Tb1Entity4.class, null, null);
    }

    /** エンティティ５のリスト */
    private List<Tb1Entity5> tb1Entity5s;

    /** @return エンティティ５のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity5s")
    public List<Tb1Entity5> getTb1Entity5s() {
        return this.tb1Entity5s;
    }

    /** @param list エンティティ５のリスト */
    public void setTb1Entity5s(final List<Tb1Entity5> list) {
        this.tb1Entity5s = list;
    }

    /** @param tb1Entity5 */
    public void addTb1Entity5s(final Tb1Entity5 tb1Entity5) {
        if (this.tb1Entity5s == null) {
            this.tb1Entity5s = new ArrayList<Tb1Entity5>();
        }
        this.tb1Entity5s.add(tb1Entity5);
    }

    /** @return エンティティ５のリスト */
    public List<Tb1Entity5> referTb1Entity5s() {
        if (this.tb1Entity5s == null) {
            this.tb1Entity5s = Tb1Oya.referTb1Entity5s(this.sosenId, this.oyaBn);
        }
        return this.tb1Entity5s;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @return List<Tb1Entity5>
     */
    public static List<Tb1Entity5> referTb1Entity5s(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        String sql = "SELECT * FROM tb1_entity5 WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "SOSEN_ID, OYA_BN, ENTITY_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        return Queries.select(sql, map, Tb1Entity5.class, null, null);
    }
}
