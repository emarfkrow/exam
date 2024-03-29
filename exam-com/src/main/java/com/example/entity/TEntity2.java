package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * エンティティ２
 * @author emarfkrow
 */
public class TEntity2 implements IEntity {

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

    /** エンティティ連番 */
    private Integer entitySn;

    /** @return エンティティ連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_SN")
    public Integer getEntitySn() {
        return this.entitySn;
    }

    /** @param o エンティティ連番 */
    public void setEntitySn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entitySn = Integer.valueOf(o.toString());
        } else {
            this.entitySn = null;
        }
    }

    /** 任意エンティティ２名 */
    private String nullEntity2Mei;

    /** @return 任意エンティティ２名 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_ENTITY2_MEI")
    public String getNullEntity2Mei() {
        return this.nullEntity2Mei;
    }

    /** @param o 任意エンティティ２名 */
    public void setNullEntity2Mei(final Object o) {
        if (o != null) {
            this.nullEntity2Mei = o.toString();
        } else {
            this.nullEntity2Mei = null;
        }
    }

    /** エンティティ２名 */
    private String entity2Mei;

    /** @return エンティティ２名 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY2_MEI")
    public String getEntity2Mei() {
        return this.entity2Mei;
    }

    /** @param o エンティティ２名 */
    public void setEntity2Mei(final Object o) {
        if (o != null) {
            this.entity2Mei = o.toString();
        } else {
            this.entity2Mei = null;
        }
    }

    /** チェックフラグ */
    private String checkF = "0";

    /** @return チェックフラグ */
    @com.fasterxml.jackson.annotation.JsonProperty("CHECK_F")
    public String getCheckF() {
        return this.checkF;
    }

    /** @param o チェックフラグ */
    public void setCheckF(final Object o) {
        if (o != null) {
            this.checkF = o.toString();
        } else {
            this.checkF = null;
        }
    }

    /** ラジオ区分 */
    private String radioKb;

    /** @return ラジオ区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("RADIO_KB")
    public String getRadioKb() {
        return this.radioKb;
    }

    /** @param o ラジオ区分 */
    public void setRadioKb(final Object o) {
        if (o != null) {
            this.radioKb = o.toString();
        } else {
            this.radioKb = null;
        }
    }

    /** プルダウン区分 */
    private String pulldownKb;

    /** @return プルダウン区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("PULLDOWN_KB")
    public String getPulldownKb() {
        return this.pulldownKb;
    }

    /** @param o プルダウン区分 */
    public void setPulldownKb(final Object o) {
        if (o != null) {
            this.pulldownKb = o.toString();
        } else {
            this.pulldownKb = null;
        }
    }

    /** メモ */
    private String memoTx;

    /** @return メモ */
    @com.fasterxml.jackson.annotation.JsonProperty("MEMO_TX")
    public String getMemoTx() {
        return this.memoTx;
    }

    /** @param o メモ */
    public void setMemoTx(final Object o) {
        if (o != null) {
            this.memoTx = o.toString();
        } else {
            this.memoTx = null;
        }
    }

    /** 日付 */
    private String hidukeYmd;

    /** @return 日付 */
    @com.fasterxml.jackson.annotation.JsonProperty("HIDUKE_YMD")
    public String getHidukeYmd() {
        return this.hidukeYmd;
    }

    /** @param o 日付 */
    public void setHidukeYmd(final Object o) {
        if (o != null) {
            this.hidukeYmd = o.toString();
        } else {
            this.hidukeYmd = null;
        }
    }

    /** 年月 */
    private String nengetsuYm;

    /** @return 年月 */
    @com.fasterxml.jackson.annotation.JsonProperty("NENGETSU_YM")
    public String getNengetsuYm() {
        return this.nengetsuYm;
    }

    /** @param o 年月 */
    public void setNengetsuYm(final Object o) {
        if (o != null) {
            this.nengetsuYm = o.toString();
        } else {
            this.nengetsuYm = null;
        }
    }

    /** 年 */
    private String sampleY;

    /** @return 年 */
    @com.fasterxml.jackson.annotation.JsonProperty("SAMPLE_Y")
    public String getSampleY() {
        return this.sampleY;
    }

    /** @param o 年 */
    public void setSampleY(final Object o) {
        if (o != null) {
            this.sampleY = o.toString();
        } else {
            this.sampleY = null;
        }
    }

    /** 月 */
    private String sampleM;

    /** @return 月 */
    @com.fasterxml.jackson.annotation.JsonProperty("SAMPLE_M")
    public String getSampleM() {
        return this.sampleM;
    }

    /** @param o 月 */
    public void setSampleM(final Object o) {
        if (o != null) {
            this.sampleM = o.toString();
        } else {
            this.sampleM = null;
        }
    }

    /** 日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime nichijiDt;

    /** @return 日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("NICHIJI_DT")
    public java.time.LocalDateTime getNichijiDt() {
        return this.nichijiDt;
    }

    /** @param o 日時 */
    public void setNichijiDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.nichijiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.nichijiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nichijiDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.nichijiDt = null;
        }
    }

    /** 時刻 */
    private String jikokuHm;

    /** @return 時刻 */
    @com.fasterxml.jackson.annotation.JsonProperty("JIKOKU_HM")
    public String getJikokuHm() {
        return this.jikokuHm;
    }

    /** @param o 時刻 */
    public void setJikokuHm(final Object o) {
        if (o != null) {
            this.jikokuHm = o.toString();
        } else {
            this.jikokuHm = null;
        }
    }

    /** 時間 */
    private String jikanTm;

    /** @return 時間 */
    @com.fasterxml.jackson.annotation.JsonProperty("JIKAN_TM")
    public String getJikanTm() {
        return this.jikanTm;
    }

    /** @param o 時間 */
    public void setJikanTm(final Object o) {
        if (o != null) {
            this.jikanTm = o.toString();
        } else {
            this.jikanTm = null;
        }
    }

    /** 数量 */
    private java.math.BigDecimal suryoQt;

    /** @return 数量 */
    @com.fasterxml.jackson.annotation.JsonProperty("SURYO_QT")
    public java.math.BigDecimal getSuryoQt() {
        return this.suryoQt;
    }

    /** @param o 数量 */
    public void setSuryoQt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.suryoQt = new java.math.BigDecimal(o.toString());
        } else {
            this.suryoQt = null;
        }
    }

    /** 単価 */
    private java.math.BigDecimal tankaAm;

    /** @return 単価 */
    @com.fasterxml.jackson.annotation.JsonProperty("TANKA_AM")
    public java.math.BigDecimal getTankaAm() {
        return this.tankaAm;
    }

    /** @param o 単価 */
    public void setTankaAm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tankaAm = new java.math.BigDecimal(o.toString());
        } else {
            this.tankaAm = null;
        }
    }

    /** 金額 */
    private java.math.BigDecimal kingakuAm;

    /** @return 金額 */
    @com.fasterxml.jackson.annotation.JsonProperty("KINGAKU_AM")
    public java.math.BigDecimal getKingakuAm() {
        return this.kingakuAm;
    }

    /** @param o 金額 */
    public void setKingakuAm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kingakuAm = new java.math.BigDecimal(o.toString());
        } else {
            this.kingakuAm = null;
        }
    }

    /** 8桁日 */
    private String fig8Bi;

    /** @return 8桁日 */
    @com.fasterxml.jackson.annotation.JsonProperty("FIG_8_BI")
    public String getFig8Bi() {
        return this.fig8Bi;
    }

    /** @param o 8桁日 */
    public void setFig8Bi(final Object o) {
        if (o != null) {
            this.fig8Bi = o.toString();
        } else {
            this.fig8Bi = null;
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
     * エンティティ２照会
     * @param param1 祖先ID
     * @param param2 親連番
     * @param param3 エンティティ連番
     * @return エンティティ２
     */
    public static TEntity2 get(final Object param1, final Object param2, final Object param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        whereList.add("`ENTITY_SN` = :entity_sn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SOSEN_ID` \n";
        sql += "    , a.`OYA_SN` \n";
        sql += "    , a.`ENTITY_SN` \n";
        sql += "    , a.`NULL_ENTITY2_MEI` \n";
        sql += "    , a.`ENTITY2_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`CHECK_F`) AS CHECK_F \n";
        sql += "    , a.`RADIO_KB` \n";
        sql += "    , a.`PULLDOWN_KB` \n";
        sql += "    , a.`MEMO_TX` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`HIDUKE_YMD`) AS HIDUKE_YMD \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NENGETSU_YM`) AS NENGETSU_YM \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`SAMPLE_Y`) AS SAMPLE_Y \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`SAMPLE_M`) AS SAMPLE_M \n";
        sql += "    , a.`NICHIJI_DT` \n";
        sql += "    , a.`JIKOKU_HM` \n";
        sql += "    , a.`JIKAN_TM` \n";
        sql += "    , a.`SURYO_QT` \n";
        sql += "    , a.`TANKA_AM` \n";
        sql += "    , a.`KINGAKU_AM` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`FIG_8_BI`) AS FIG_8_BI \n";
        sql += "    , a.`INSERT_DT` \n";
        sql += "    , a.`INSERT_BY` \n";
        sql += "    , a.`UPDATE_DT` \n";
        sql += "    , a.`UPDATE_BY` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    t_entity2 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        map.put("entity_sn", param3);
        return Queries.get(sql, map, TEntity2.class);
    }

    /**
     * エンティティ２追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // エンティティ連番の採番処理
        numbering();

        // 子の登録
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.setSosenId(this.getSosenId());
                tKo.setOyaSn(this.getOyaSn());
                tKo.setEntitySn(this.getEntitySn());
                tKo.insert(now, execId);
            }
        }

        // 添付ファイルの登録
        if (this.tTenpuFiles != null) {
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                tTenpuFile.setSosenId(this.getSosenId());
                tTenpuFile.setOyaSn(this.getOyaSn());
                tTenpuFile.setEntitySn(this.getEntitySn());
                tTenpuFile.insert(now, execId);
            }
        }

        // エンティティの登録
        if (this.tEntity != null) {
            this.tEntity.setSosenId(this.getSosenId());
            this.tEntity.setOyaSn(this.getOyaSn());
            this.tEntity.setEntitySn(this.getEntitySn());
            this.tEntity.insert(now, execId);
        }

        // エンティティ２の登録
        String sql = "INSERT INTO t_entity2(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_SN` -- :oya_sn");
        nameList.add("`ENTITY_SN` -- :entity_sn");
        nameList.add("`NULL_ENTITY2_MEI` -- :null_entity_2_mei");
        nameList.add("`ENTITY2_MEI` -- :entity_2_mei");
        nameList.add("`CHECK_F` -- :check_f");
        nameList.add("`RADIO_KB` -- :radio_kb");
        nameList.add("`PULLDOWN_KB` -- :pulldown_kb");
        nameList.add("`MEMO_TX` -- :memo_tx");
        nameList.add("`HIDUKE_YMD` -- :hiduke_ymd");
        nameList.add("`NENGETSU_YM` -- :nengetsu_ym");
        nameList.add("`SAMPLE_Y` -- :sample_y");
        nameList.add("`SAMPLE_M` -- :sample_m");
        nameList.add("`NICHIJI_DT` -- :nichiji_dt");
        nameList.add("`JIKOKU_HM` -- :jikoku_hm");
        nameList.add("`JIKAN_TM` -- :jikan_tm");
        nameList.add("`SURYO_QT` -- :suryo_qt");
        nameList.add("`TANKA_AM` -- :tanka_am");
        nameList.add("`KINGAKU_AM` -- :kingaku_am");
        nameList.add("`FIG_8_BI` -- :fig_8_bi");
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
        valueList.add(":entity_sn");
        valueList.add(":null_entity_2_mei");
        valueList.add(":entity_2_mei");
        valueList.add(":check_f");
        valueList.add(":radio_kb");
        valueList.add(":pulldown_kb");
        valueList.add(":memo_tx");
        valueList.add(":hiduke_ymd");
        valueList.add(":nengetsu_ym");
        valueList.add(":sample_y");
        valueList.add(":sample_m");
        valueList.add(":nichiji_dt");
        valueList.add(":jikoku_hm");
        valueList.add(":jikan_tm");
        valueList.add(":suryo_qt");
        valueList.add(":tanka_am");
        valueList.add(":kingaku_am");
        valueList.add(":fig_8_bi");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** エンティティ連番の採番処理 */
    private void numbering() {
        if (this.entitySn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`ENTITY_SN`) IS NULL THEN 0 ELSE MAX(e.`ENTITY_SN`) * 1 END + 1 AS `ENTITY_SN` FROM t_entity2 e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        whereList.add("e.`OYA_SN` = :oya_sn");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        map.put("oya_sn", this.oyaSn);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("ENTITY_SN");
        this.setEntitySn(o);
    }

    /**
     * エンティティ２更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 子の登録
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                if (tKo == null) {
                    continue;
                }
                tKo.setSosenId(this.sosenId);
                tKo.setOyaSn(this.oyaSn);
                tKo.setEntitySn(this.entitySn);
                try {
                    tKo.insert(now, execId);
                } catch (Exception e) {
                    tKo.update(now, execId);
                }
            }
        }

        // 添付ファイルの登録
        if (this.tTenpuFiles != null) {
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                if (tTenpuFile == null) {
                    continue;
                }
                tTenpuFile.setSosenId(this.sosenId);
                tTenpuFile.setOyaSn(this.oyaSn);
                tTenpuFile.setEntitySn(this.entitySn);
                try {
                    tTenpuFile.insert(now, execId);
                } catch (Exception e) {
                    tTenpuFile.update(now, execId);
                }
            }
        }

        // エンティティの登録
        if (this.tEntity != null) {
            tEntity.setSosenId(this.getSosenId());
            tEntity.setOyaSn(this.getOyaSn());
            tEntity.setEntitySn(this.getEntitySn());
            try {
                tEntity.insert(now, execId);
            } catch (Exception e) {
                tEntity.update(now, execId);
            }
        }

        // エンティティ２の登録
        String sql = "UPDATE t_entity2\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_SN` = :oya_sn");
        setList.add("`ENTITY_SN` = :entity_sn");
        setList.add("`NULL_ENTITY2_MEI` = :null_entity_2_mei");
        setList.add("`ENTITY2_MEI` = :entity_2_mei");
        setList.add("`CHECK_F` = :check_f");
        setList.add("`RADIO_KB` = :radio_kb");
        setList.add("`PULLDOWN_KB` = :pulldown_kb");
        setList.add("`MEMO_TX` = :memo_tx");
        setList.add("`HIDUKE_YMD` = :hiduke_ymd");
        setList.add("`NENGETSU_YM` = :nengetsu_ym");
        setList.add("`SAMPLE_Y` = :sample_y");
        setList.add("`SAMPLE_M` = :sample_m");
        setList.add("`NICHIJI_DT` = :nichiji_dt");
        setList.add("`JIKOKU_HM` = :jikoku_hm");
        setList.add("`JIKAN_TM` = :jikan_tm");
        setList.add("`SURYO_QT` = :suryo_qt");
        setList.add("`TANKA_AM` = :tanka_am");
        setList.add("`KINGAKU_AM` = :kingaku_am");
        setList.add("`FIG_8_BI` = :fig_8_bi");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * エンティティ２削除
     * @return 削除件数
     */
    public int delete() {

        // 子の削除
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.delete();
            }
        }

        // 添付ファイルの削除
        if (this.tTenpuFiles != null) {
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                tTenpuFile.delete();
            }
        }

        // エンティティの削除
        if (this.tEntity != null) {
            this.tEntity.delete();
        }

        // エンティティ２の削除
        String sql = "DELETE FROM t_entity2 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        whereList.add("`ENTITY_SN` = :entity_sn");
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
        map.put("entity_sn", this.entitySn);
        map.put("null_entity_2_mei", this.nullEntity2Mei);
        map.put("entity_2_mei", this.entity2Mei);
        map.put("check_f", this.checkF);
        map.put("radio_kb", this.radioKb);
        map.put("pulldown_kb", this.pulldownKb);
        map.put("memo_tx", this.memoTx);
        map.put("hiduke_ymd", this.hidukeYmd);
        map.put("nengetsu_ym", this.nengetsuYm);
        map.put("sample_y", this.sampleY);
        map.put("sample_m", this.sampleM);
        map.put("nichiji_dt", this.nichijiDt);
        map.put("jikoku_hm", this.jikokuHm);
        map.put("jikan_tm", this.jikanTm);
        map.put("suryo_qt", this.suryoQt);
        map.put("tanka_am", this.tankaAm);
        map.put("kingaku_am", this.kingakuAm);
        map.put("fig_8_bi", this.fig8Bi);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", execId);
        map.put("update_dt", now);
        map.put("update_by", execId);
        return map;
    }

    /** エンティティ */
    private TEntity tEntity;

    /** @return エンティティ */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntity")
    public TEntity getTEntity() {
        return this.tEntity;
    }

    /** @param p エンティティ */
    public void setTEntity(final TEntity p) {
        this.tEntity = p;
    }

    /** @return エンティティ */
    public TEntity referTEntity() {
        if (this.tEntity == null) {
            try {
                this.tEntity = TEntity.get(this.sosenId, this.oyaSn, this.entitySn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tEntity;
    }

    /** 子のリスト */
    private List<TKo> tKos;

    /** @return 子のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("TKos")
    public List<TKo> getTKos() {
        return this.tKos;
    }

    /** @param list 子のリスト */
    public void setTKos(final List<TKo> list) {
        this.tKos = list;
    }

    /** @param tKo */
    public void addTKos(final TKo tKo) {
        if (this.tKos == null) {
            this.tKos = new ArrayList<TKo>();
        }
        this.tKos.add(tKo);
    }

    /** @return 子のリスト */
    public List<TKo> referTKos() {
        if (this.tKos == null) {
            this.tKos = TEntity2.referTKos(this.sosenId, this.oyaSn, this.entitySn);
        }
        return this.tKos;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaSn
     * @param param3 entitySn
     * @return List<TKo>
     */
    public static List<TKo> referTKos(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_SN = :oya_sn");
        whereList.add("ENTITY_SN = :entity_sn");
        String sql = "SELECT * FROM t_ko WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        map.put("entity_sn", param3);
        return Queries.select(sql, map, TKo.class, null, null);
    }

    /** 添付ファイルのリスト */
    private List<TTenpuFile> tTenpuFiles;

    /** @return 添付ファイルのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("TTenpuFiles")
    public List<TTenpuFile> getTTenpuFiles() {
        return this.tTenpuFiles;
    }

    /** @param list 添付ファイルのリスト */
    public void setTTenpuFiles(final List<TTenpuFile> list) {
        this.tTenpuFiles = list;
    }

    /** @param tTenpuFile */
    public void addTTenpuFiles(final TTenpuFile tTenpuFile) {
        if (this.tTenpuFiles == null) {
            this.tTenpuFiles = new ArrayList<TTenpuFile>();
        }
        this.tTenpuFiles.add(tTenpuFile);
    }

    /** @return 添付ファイルのリスト */
    public List<TTenpuFile> referTTenpuFiles() {
        if (this.tTenpuFiles == null) {
            this.tTenpuFiles = TEntity2.referTTenpuFiles(this.sosenId, this.oyaSn, this.entitySn);
        }
        return this.tTenpuFiles;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaSn
     * @param param3 entitySn
     * @return List<TTenpuFile>
     */
    public static List<TTenpuFile> referTTenpuFiles(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_SN = :oya_sn");
        whereList.add("ENTITY_SN = :entity_sn");
        String sql = "SELECT * FROM t_tenpu_file WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        map.put("entity_sn", param3);
        return Queries.select(sql, map, TTenpuFile.class, null, null);
    }
}
