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
public class TOya implements IEntity {

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

    /** 親連番 */
    private Integer oyaSn;

    /** @return 親連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_SN")
    public Integer getOyaSn() {
        return this.oyaSn;
    }

    /** @param o 親連番 */
    public void setOyaSn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaSn = Integer.valueOf(o.toString());
        } else {
            this.oyaSn = null;
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

    /** 登録日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertDt;

    /** @return 登録日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_DT")
    public java.time.LocalDateTime getInsertDt() {
        return this.insertDt;
    }

    /** @param o 登録日時 */
    public void setInsertDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.insertDt = null;
        }
    }

    /** 登録者 */
    private String insertBy;

    /** @return 登録者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_BY")
    public String getInsertBy() {
        return this.insertBy;
    }

    /** @param o 登録者 */
    public void setInsertBy(final Object o) {
        if (o != null) {
            this.insertBy = o.toString();
        } else {
            this.insertBy = null;
        }
    }

    /** 更新日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime updateDt;

    /** @return 更新日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_DT")
    public java.time.LocalDateTime getUpdateDt() {
        return this.updateDt;
    }

    /** @param o 更新日時 */
    public void setUpdateDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.updateDt = null;
        }
    }

    /** 更新者 */
    private String updateBy;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_BY")
    public String getUpdateBy() {
        return this.updateBy;
    }

    /** @param o 更新者 */
    public void setUpdateBy(final Object o) {
        if (o != null) {
            this.updateBy = o.toString();
        } else {
            this.updateBy = null;
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
     * @param param2 親連番
     * @return 親
     */
    public static TOya get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SOSEN_ID` \n";
        sql += "    , a.`OYA_SN` \n";
        sql += "    , a.`OYA_MEI` \n";
        sql += "    , a.`INSERT_DT` \n";
        sql += "    , a.`INSERT_BY` \n";
        sql += "    , a.`UPDATE_DT` \n";
        sql += "    , a.`UPDATE_BY` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    t_oya a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        return Queries.get(sql, map, TOya.class);
    }

    /**
     * 親追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 親連番の採番処理
        numbering();

        // エンティティの登録
        if (this.tEntitys != null) {
            for (TEntity tEntity : this.tEntitys) {
                tEntity.setSosenId(this.getSosenId());
                tEntity.setOyaSn(this.getOyaSn());
                tEntity.insert(now, execId);
            }
        }

        // エンティティ２の登録
        if (this.tEntity2s != null) {
            for (TEntity2 tEntity2 : this.tEntity2s) {
                tEntity2.setSosenId(this.getSosenId());
                tEntity2.setOyaSn(this.getOyaSn());
                tEntity2.insert(now, execId);
            }
        }

        // 親の登録
        String sql = "INSERT INTO t_oya(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_SN` -- :oya_sn");
        nameList.add("`OYA_MEI` -- :oya_mei");
        nameList.add("`INSERT_DT` -- :insert_dt");
        nameList.add("`INSERT_BY` -- :insert_by");
        nameList.add("`UPDATE_DT` -- :update_dt");
        nameList.add("`UPDATE_BY` -- :update_by");
        nameList.add("`DELETE_F` -- :delete_f");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_sn");
        valueList.add(":oya_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** 親連番の採番処理 */
    private void numbering() {
        if (this.oyaSn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`OYA_SN`) IS NULL THEN 0 ELSE MAX(e.`OYA_SN`) * 1 END + 1 AS `OYA_SN` FROM t_oya e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("OYA_SN");
        this.setOyaSn(o);
    }

    /**
     * 親更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // エンティティの登録
        if (this.tEntitys != null) {
            for (TEntity tEntity : this.tEntitys) {
                if (tEntity == null) {
                    continue;
                }
                tEntity.setSosenId(this.sosenId);
                tEntity.setOyaSn(this.oyaSn);
                try {
                    tEntity.insert(now, execId);
                } catch (Exception e) {
                    tEntity.update(now, execId);
                }
            }
        }

        // エンティティ２の登録
        if (this.tEntity2s != null) {
            for (TEntity2 tEntity2 : this.tEntity2s) {
                if (tEntity2 == null) {
                    continue;
                }
                tEntity2.setSosenId(this.sosenId);
                tEntity2.setOyaSn(this.oyaSn);
                try {
                    tEntity2.insert(now, execId);
                } catch (Exception e) {
                    tEntity2.update(now, execId);
                }
            }
        }

        // 親の登録
        String sql = "UPDATE t_oya\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_SN` = :oya_sn");
        setList.add("`OYA_MEI` = :oya_mei");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 親削除
     * @return 削除件数
     */
    public int delete() {

        // エンティティの削除
        if (this.tEntitys != null) {
            for (TEntity tEntity : this.tEntitys) {
                tEntity.delete();
            }
        }

        // エンティティ２の削除
        if (this.tEntity2s != null) {
            for (TEntity2 tEntity2 : this.tEntity2s) {
                tEntity2.delete();
            }
        }

        // 親の削除
        String sql = "DELETE FROM t_oya WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
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
        map.put("oya_sn", this.oyaSn);
        map.put("oya_mei", this.oyaMei);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", execId);
        map.put("update_dt", now);
        map.put("update_by", execId);
        return map;
    }

    /** エンティティのリスト */
    private List<TEntity> tEntitys;

    /** @return エンティティのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntitys")
    public List<TEntity> getTEntitys() {
        return this.tEntitys;
    }

    /** @param list エンティティのリスト */
    public void setTEntitys(final List<TEntity> list) {
        this.tEntitys = list;
    }

    /** @param tEntity */
    public void addTEntitys(final TEntity tEntity) {
        if (this.tEntitys == null) {
            this.tEntitys = new ArrayList<TEntity>();
        }
        this.tEntitys.add(tEntity);
    }

    /** @return エンティティのリスト */
    public List<TEntity> referTEntitys() {
        if (this.tEntitys == null) {
            this.tEntitys = TOya.referTEntitys(this.sosenId, this.oyaSn);
        }
        return this.tEntitys;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaSn
     * @return List<TEntity>
     */
    public static List<TEntity> referTEntitys(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_SN = :oya_sn");
        String sql = "SELECT * FROM t_entity WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        return Queries.select(sql, map, TEntity.class, null, null);
    }

    /** エンティティ２のリスト */
    private List<TEntity2> tEntity2s;

    /** @return エンティティ２のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntity2s")
    public List<TEntity2> getTEntity2s() {
        return this.tEntity2s;
    }

    /** @param list エンティティ２のリスト */
    public void setTEntity2s(final List<TEntity2> list) {
        this.tEntity2s = list;
    }

    /** @param tEntity2 */
    public void addTEntity2s(final TEntity2 tEntity2) {
        if (this.tEntity2s == null) {
            this.tEntity2s = new ArrayList<TEntity2>();
        }
        this.tEntity2s.add(tEntity2);
    }

    /** @return エンティティ２のリスト */
    public List<TEntity2> referTEntity2s() {
        if (this.tEntity2s == null) {
            this.tEntity2s = TOya.referTEntity2s(this.sosenId, this.oyaSn);
        }
        return this.tEntity2s;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaSn
     * @return List<TEntity2>
     */
    public static List<TEntity2> referTEntity2s(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_SN = :oya_sn");
        String sql = "SELECT * FROM t_entity2 WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        return Queries.select(sql, map, TEntity2.class, null, null);
    }
}
