package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * エンティティ３
 * @author emarfkrow
 */
public class Tb1Entity3 implements IEntity {

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

    /** エンティティ３名 */
    private String entity3Mei;

    /** @return エンティティ３名 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY3_MEI")
    public String getEntity3Mei() {
        return this.entity3Mei;
    }

    /** @param o エンティティ３名 */
    public void setEntity3Mei(final Object o) {
        if (o != null) {
            this.entity3Mei = o.toString();
        } else {
            this.entity3Mei = null;
        }
    }

    /** 登録日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
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
            this.insertDt = java.time.LocalDateTime.parse(o.toString().replace(" ", "T"));
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
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
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
            this.updateDt = java.time.LocalDateTime.parse(o.toString().replace(" ", "T"));
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
     * エンティティ３照会
     * @param param1 祖先ID
     * @param param2 親枝番
     * @param param3 エンティティ枝番
     * @return エンティティ３
     */
    public static Tb1Entity3 get(final Object param1, final Object param2, final Object param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        whereList.add("`ENTITY_BN` = :entity_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SOSEN_ID` \n";
        sql += "    , a.`OYA_BN` \n";
        sql += "    , a.`ENTITY_BN` \n";
        sql += "    , a.`ENTITY3_MEI` \n";
        sql += "    , a.`INSERT_DT` AS INSERT_DT \n";
        sql += "    , a.`INSERT_BY` \n";
        sql += "    , a.`UPDATE_DT` AS UPDATE_DT \n";
        sql += "    , a.`UPDATE_BY` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    tb1_entity3 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.get(sql, map, Tb1Entity3.class);
    }

    /**
     * エンティティ３追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // エンティティ枝番の採番処理
        numbering();

        // 子の登録
        if (this.tb1Kos != null) {
            for (Tb1Ko tb1Ko : this.tb1Kos) {
                tb1Ko.setSosenId(this.getSosenId());
                tb1Ko.setOyaBn(this.getOyaBn());
                tb1Ko.setEntityBn(this.getEntityBn());
                tb1Ko.insert(now, execId);
            }
        }

        // 添付ファイルの登録
        if (this.tb1TenpuFiles != null) {
            for (Tb1TenpuFile tb1TenpuFile : this.tb1TenpuFiles) {
                tb1TenpuFile.setSosenId(this.getSosenId());
                tb1TenpuFile.setOyaBn(this.getOyaBn());
                tb1TenpuFile.setEntityBn(this.getEntityBn());
                tb1TenpuFile.insert(now, execId);
            }
        }

        // エンティティ１の登録
        if (this.tb1Entity1 != null) {
            this.tb1Entity1.setSosenId(this.getSosenId());
            this.tb1Entity1.setOyaBn(this.getOyaBn());
            this.tb1Entity1.setEntityBn(this.getEntityBn());
            this.tb1Entity1.insert(now, execId);
        }

        // エンティティ２の登録
        if (this.tb1Entity2 != null) {
            this.tb1Entity2.setSosenId(this.getSosenId());
            this.tb1Entity2.setOyaBn(this.getOyaBn());
            this.tb1Entity2.setEntityBn(this.getEntityBn());
            this.tb1Entity2.insert(now, execId);
        }

        // エンティティ４の登録
        if (this.tb1Entity4 != null) {
            this.tb1Entity4.setSosenId(this.getSosenId());
            this.tb1Entity4.setOyaBn(this.getOyaBn());
            this.tb1Entity4.setEntityBn(this.getEntityBn());
            this.tb1Entity4.insert(now, execId);
        }

        // エンティティ５の登録
        if (this.tb1Entity5 != null) {
            this.tb1Entity5.setSosenId(this.getSosenId());
            this.tb1Entity5.setOyaBn(this.getOyaBn());
            this.tb1Entity5.setEntityBn(this.getEntityBn());
            this.tb1Entity5.insert(now, execId);
        }

        // エンティティ３の登録
        String sql = "INSERT INTO tb1_entity3(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_BN` -- :oya_bn");
        nameList.add("`ENTITY_BN` -- :entity_bn");
        nameList.add("`ENTITY3_MEI` -- :entity_3_mei");
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
        valueList.add(":oya_bn");
        valueList.add(":entity_bn");
        valueList.add(":entity_3_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** エンティティ枝番の採番処理 */
    private void numbering() {
        if (this.entityBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`ENTITY_BN`) IS NULL THEN 0 ELSE MAX(e.`ENTITY_BN`) * 1 END + 1 AS `ENTITY_BN` FROM tb1_entity3 e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        whereList.add("e.`OYA_BN` = :oya_bn");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        map.put("oya_bn", this.oyaBn);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("ENTITY_BN");
        this.setEntityBn(o);
    }

    /**
     * エンティティ３更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 子の登録
        if (this.tb1Kos != null) {
            for (Tb1Ko tb1Ko : this.tb1Kos) {
                if (tb1Ko == null) {
                    continue;
                }
                tb1Ko.setSosenId(this.sosenId);
                tb1Ko.setOyaBn(this.oyaBn);
                tb1Ko.setEntityBn(this.entityBn);
                try {
                    tb1Ko.insert(now, execId);
                } catch (Exception e) {
                    tb1Ko.update(now, execId);
                }
            }
        }

        // 添付ファイルの登録
        if (this.tb1TenpuFiles != null) {
            for (Tb1TenpuFile tb1TenpuFile : this.tb1TenpuFiles) {
                if (tb1TenpuFile == null) {
                    continue;
                }
                tb1TenpuFile.setSosenId(this.sosenId);
                tb1TenpuFile.setOyaBn(this.oyaBn);
                tb1TenpuFile.setEntityBn(this.entityBn);
                try {
                    tb1TenpuFile.insert(now, execId);
                } catch (Exception e) {
                    tb1TenpuFile.update(now, execId);
                }
            }
        }

        // エンティティ１の登録
        if (this.tb1Entity1 != null) {
            tb1Entity1.setSosenId(this.getSosenId());
            tb1Entity1.setOyaBn(this.getOyaBn());
            tb1Entity1.setEntityBn(this.getEntityBn());
            try {
                tb1Entity1.insert(now, execId);
            } catch (Exception e) {
                tb1Entity1.update(now, execId);
            }
        }

        // エンティティ２の登録
        if (this.tb1Entity2 != null) {
            tb1Entity2.setSosenId(this.getSosenId());
            tb1Entity2.setOyaBn(this.getOyaBn());
            tb1Entity2.setEntityBn(this.getEntityBn());
            try {
                tb1Entity2.insert(now, execId);
            } catch (Exception e) {
                tb1Entity2.update(now, execId);
            }
        }

        // エンティティ４の登録
        if (this.tb1Entity4 != null) {
            tb1Entity4.setSosenId(this.getSosenId());
            tb1Entity4.setOyaBn(this.getOyaBn());
            tb1Entity4.setEntityBn(this.getEntityBn());
            try {
                tb1Entity4.insert(now, execId);
            } catch (Exception e) {
                tb1Entity4.update(now, execId);
            }
        }

        // エンティティ５の登録
        if (this.tb1Entity5 != null) {
            tb1Entity5.setSosenId(this.getSosenId());
            tb1Entity5.setOyaBn(this.getOyaBn());
            tb1Entity5.setEntityBn(this.getEntityBn());
            try {
                tb1Entity5.insert(now, execId);
            } catch (Exception e) {
                tb1Entity5.update(now, execId);
            }
        }

        // エンティティ３の登録
        String sql = "UPDATE tb1_entity3\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_BN` = :oya_bn");
        setList.add("`ENTITY_BN` = :entity_bn");
        setList.add("`ENTITY3_MEI` = :entity_3_mei");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * エンティティ３削除
     * @return 削除件数
     */
    public int delete() {

        // 子の削除
        if (this.tb1Kos != null) {
            for (Tb1Ko tb1Ko : this.tb1Kos) {
                tb1Ko.delete();
            }
        }

        // 添付ファイルの削除
        if (this.tb1TenpuFiles != null) {
            for (Tb1TenpuFile tb1TenpuFile : this.tb1TenpuFiles) {
                tb1TenpuFile.delete();
            }
        }

        // エンティティ１の削除
        if (this.tb1Entity1 != null) {
            this.tb1Entity1.delete();
        }

        // エンティティ２の削除
        if (this.tb1Entity2 != null) {
            this.tb1Entity2.delete();
        }

        // エンティティ４の削除
        if (this.tb1Entity4 != null) {
            this.tb1Entity4.delete();
        }

        // エンティティ５の削除
        if (this.tb1Entity5 != null) {
            this.tb1Entity5.delete();
        }

        // エンティティ３の削除
        String sql = "DELETE FROM tb1_entity3 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        whereList.add("`ENTITY_BN` = :entity_bn");
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
        map.put("entity_3_mei", this.entity3Mei);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", execId);
        map.put("update_dt", now);
        map.put("update_by", execId);
        return map;
    }

    /** エンティティ１ */
    private Tb1Entity1 tb1Entity1;

    /** @return エンティティ１ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity1")
    public Tb1Entity1 getTb1Entity1() {
        return this.tb1Entity1;
    }

    /** @param p エンティティ１ */
    public void setTb1Entity1(final Tb1Entity1 p) {
        this.tb1Entity1 = p;
    }

    /** @return エンティティ１ */
    public Tb1Entity1 referTb1Entity1() {
        if (this.tb1Entity1 == null) {
            try {
                this.tb1Entity1 = Tb1Entity1.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1Entity1;
    }

    /** エンティティ２ */
    private Tb1Entity2 tb1Entity2;

    /** @return エンティティ２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity2")
    public Tb1Entity2 getTb1Entity2() {
        return this.tb1Entity2;
    }

    /** @param p エンティティ２ */
    public void setTb1Entity2(final Tb1Entity2 p) {
        this.tb1Entity2 = p;
    }

    /** @return エンティティ２ */
    public Tb1Entity2 referTb1Entity2() {
        if (this.tb1Entity2 == null) {
            try {
                this.tb1Entity2 = Tb1Entity2.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1Entity2;
    }

    /** エンティティ４ */
    private Tb1Entity4 tb1Entity4;

    /** @return エンティティ４ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity4")
    public Tb1Entity4 getTb1Entity4() {
        return this.tb1Entity4;
    }

    /** @param p エンティティ４ */
    public void setTb1Entity4(final Tb1Entity4 p) {
        this.tb1Entity4 = p;
    }

    /** @return エンティティ４ */
    public Tb1Entity4 referTb1Entity4() {
        if (this.tb1Entity4 == null) {
            try {
                this.tb1Entity4 = Tb1Entity4.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1Entity4;
    }

    /** エンティティ５ */
    private Tb1Entity5 tb1Entity5;

    /** @return エンティティ５ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity5")
    public Tb1Entity5 getTb1Entity5() {
        return this.tb1Entity5;
    }

    /** @param p エンティティ５ */
    public void setTb1Entity5(final Tb1Entity5 p) {
        this.tb1Entity5 = p;
    }

    /** @return エンティティ５ */
    public Tb1Entity5 referTb1Entity5() {
        if (this.tb1Entity5 == null) {
            try {
                this.tb1Entity5 = Tb1Entity5.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1Entity5;
    }

    /** 子のリスト */
    private List<Tb1Ko> tb1Kos;

    /** @return 子のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Kos")
    public List<Tb1Ko> getTb1Kos() {
        return this.tb1Kos;
    }

    /** @param list 子のリスト */
    public void setTb1Kos(final List<Tb1Ko> list) {
        this.tb1Kos = list;
    }

    /** @param tb1Ko */
    public void addTb1Kos(final Tb1Ko tb1Ko) {
        if (this.tb1Kos == null) {
            this.tb1Kos = new ArrayList<Tb1Ko>();
        }
        this.tb1Kos.add(tb1Ko);
    }

    /** @return 子のリスト */
    public List<Tb1Ko> referTb1Kos() {
        if (this.tb1Kos == null) {
            this.tb1Kos = Tb1Entity3.referTb1Kos(this.sosenId, this.oyaBn, this.entityBn);
        }
        return this.tb1Kos;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @param param3 entityBn
     * @return List<Tb1Ko>
     */
    public static List<Tb1Ko> referTb1Kos(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        whereList.add("ENTITY_BN = :entity_bn");
        String sql = "SELECT * FROM tb1_ko WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.select(sql, map, Tb1Ko.class, null, null);
    }

    /** 添付ファイルのリスト */
    private List<Tb1TenpuFile> tb1TenpuFiles;

    /** @return 添付ファイルのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1TenpuFiles")
    public List<Tb1TenpuFile> getTb1TenpuFiles() {
        return this.tb1TenpuFiles;
    }

    /** @param list 添付ファイルのリスト */
    public void setTb1TenpuFiles(final List<Tb1TenpuFile> list) {
        this.tb1TenpuFiles = list;
    }

    /** @param tb1TenpuFile */
    public void addTb1TenpuFiles(final Tb1TenpuFile tb1TenpuFile) {
        if (this.tb1TenpuFiles == null) {
            this.tb1TenpuFiles = new ArrayList<Tb1TenpuFile>();
        }
        this.tb1TenpuFiles.add(tb1TenpuFile);
    }

    /** @return 添付ファイルのリスト */
    public List<Tb1TenpuFile> referTb1TenpuFiles() {
        if (this.tb1TenpuFiles == null) {
            this.tb1TenpuFiles = Tb1Entity3.referTb1TenpuFiles(this.sosenId, this.oyaBn, this.entityBn);
        }
        return this.tb1TenpuFiles;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @param param3 entityBn
     * @return List<Tb1TenpuFile>
     */
    public static List<Tb1TenpuFile> referTb1TenpuFiles(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        whereList.add("ENTITY_BN = :entity_bn");
        String sql = "SELECT * FROM tb1_tenpu_file WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.select(sql, map, Tb1TenpuFile.class, null, null);
    }
}