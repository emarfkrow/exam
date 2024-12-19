package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * VIEW
 * @author emarfkrow
 */
public class Vb2Entity implements IEntity {

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

    /** エンティティID */
    private Integer entityId;

    /** @return エンティティID */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_ID")
    public Integer getEntityId() {
        return this.entityId;
    }

    /** @param o エンティティID */
    public void setEntityId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entityId = Integer.valueOf(o.toString());
        } else {
            this.entityId = null;
        }
    }

    /** エンティティ名称 */
    private String entityNm;

    /** @return エンティティ名称 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_NM")
    public String getEntityNm() {
        return this.entityNm;
    }

    /** @param o エンティティ名称 */
    public void setEntityNm(final Object o) {
        if (o != null) {
            this.entityNm = o.toString();
        } else {
            this.entityNm = null;
        }
    }

    /** エンティティ名 */
    private String entityMei;

    /** @return エンティティ名 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_MEI")
    public String getEntityMei() {
        return this.entityMei;
    }

    /** @param o エンティティ名 */
    public void setEntityMei(final Object o) {
        if (o != null) {
            this.entityMei = o.toString();
        } else {
            this.entityMei = null;
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

    /** 年 */
    private String nenY;

    /** @return 年 */
    @com.fasterxml.jackson.annotation.JsonProperty("NEN_Y")
    public String getNenY() {
        return this.nenY;
    }

    /** @param o 年 */
    public void setNenY(final Object o) {
        if (o != null) {
            this.nenY = o.toString();
        } else {
            this.nenY = null;
        }
    }

    /** 月 */
    private String tsukiM;

    /** @return 月 */
    @com.fasterxml.jackson.annotation.JsonProperty("TSUKI_M")
    public String getTsukiM() {
        return this.tsukiM;
    }

    /** @param o 月 */
    public void setTsukiM(final Object o) {
        if (o != null) {
            this.tsukiM = o.toString();
        } else {
            this.tsukiM = null;
        }
    }

    /** 日 */
    private String hiD;

    /** @return 日 */
    @com.fasterxml.jackson.annotation.JsonProperty("HI_D")
    public String getHiD() {
        return this.hiD;
    }

    /** @param o 日 */
    public void setHiD(final Object o) {
        if (o != null) {
            this.hiD = o.toString();
        } else {
            this.hiD = null;
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
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nengetsuYm = String.valueOf(o.toString().replace("-", ""));
        } else {
            this.nengetsuYm = null;
        }
    }

    /** 年月日 */
    private String nengappiYmd;

    /** @return 年月日 */
    @com.fasterxml.jackson.annotation.JsonProperty("NENGAPPI_YMD")
    public String getNengappiYmd() {
        return this.nengappiYmd;
    }

    /** @param o 年月日 */
    public void setNengappiYmd(final Object o) {
        if (o != null) {
            this.nengappiYmd = o.toString();
        } else {
            this.nengappiYmd = null;
        }
    }

    /** タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timestampTs;

    /** @return タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty("TIMESTAMP_TS")
    public java.time.LocalDateTime getTimestampTs() {
        return this.timestampTs;
    }

    /** @param o タイムスタンプ */
    public void setTimestampTs(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timestampTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timestampTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timestampTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.timestampTs = null;
        }
    }

    /** 日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
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
            this.nichijiDt = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.nichijiDt = null;
        }
    }

    /** 日付 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)
    private java.time.LocalDate hidukeBi;

    /** @return 日付 */
    @com.fasterxml.jackson.annotation.JsonProperty("HIDUKE_BI")
    public java.time.LocalDate getHidukeBi() {
        return this.hidukeBi;
    }

    /** @param o 日付 */
    public void setHidukeBi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hidukeBi = java.time.LocalDate.parse(o.toString().substring(0, 10));
        } else {
            this.hidukeBi = null;
        }
    }

    /** 時刻 */
    private java.time.LocalTime jikokuHm;

    /** @return 時刻 */
    @com.fasterxml.jackson.annotation.JsonProperty("JIKOKU_HM")
    public java.time.LocalTime getJikokuHm() {
        return this.jikokuHm;
    }

    /** @param o 時刻 */
    public void setJikokuHm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jikokuHm = java.time.LocalTime.parse(o.toString());
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
    private java.math.BigDecimal tankaKg;

    /** @return 単価 */
    @com.fasterxml.jackson.annotation.JsonProperty("TANKA_KG")
    public java.math.BigDecimal getTankaKg() {
        return this.tankaKg;
    }

    /** @param o 単価 */
    public void setTankaKg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tankaKg = new java.math.BigDecimal(o.toString());
        } else {
            this.tankaKg = null;
        }
    }

    /** 税抜金額 */
    private java.math.BigDecimal zeinukiKg;

    /** @return 税抜金額 */
    @com.fasterxml.jackson.annotation.JsonProperty("ZEINUKI_KG")
    public java.math.BigDecimal getZeinukiKg() {
        return this.zeinukiKg;
    }

    /** @param o 税抜金額 */
    public void setZeinukiKg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zeinukiKg = new java.math.BigDecimal(o.toString());
        } else {
            this.zeinukiKg = null;
        }
    }

    /**
     * VIEW照会
     * @return VIEW
     */
    public static Vb2Entity get() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`ENTITY_ID` = :entity_id");
        whereList.add("`ENTITY_NM` = :entity_nm");
        whereList.add("`ENTITY_MEI` = :entity_mei");
        whereList.add("TRIM (`CHECK_F`) = TRIM (:check_f)");
        whereList.add("`RADIO_KB` = :radio_kb");
        whereList.add("`PULLDOWN_KB` = :pulldown_kb");
        whereList.add("`MEMO_TX` = :memo_tx");
        whereList.add("TRIM (`NEN_Y`) = TRIM (:nen_y)");
        whereList.add("TRIM (`TSUKI_M`) = TRIM (:tsuki_m)");
        whereList.add("TRIM (`HI_D`) = TRIM (:hi_d)");
        whereList.add("TRIM (`NENGETSU_YM`) = TRIM (:nengetsu_ym)");
        whereList.add("TRIM (`NENGAPPI_YMD`) = TRIM (:nengappi_ymd)");
        whereList.add("`TIMESTAMP_TS` = :timestamp_ts");
        whereList.add("`NICHIJI_DT` = :nichiji_dt");
        whereList.add("`HIDUKE_BI` = :hiduke_bi");
        whereList.add("`JIKOKU_HM` = :jikoku_hm");
        whereList.add("`JIKAN_TM` = :jikan_tm");
        whereList.add("`SURYO_QT` = :suryo_qt");
        whereList.add("`TANKA_KG` = :tanka_kg");
        whereList.add("`ZEINUKI_KG` = :zeinuki_kg");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`ENTITY_ID` \n";
        sql += "    , a.`ENTITY_NM` \n";
        sql += "    , a.`ENTITY_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`CHECK_F`) AS CHECK_F \n";
        sql += "    , a.`RADIO_KB` \n";
        sql += "    , a.`PULLDOWN_KB` \n";
        sql += "    , a.`MEMO_TX` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NEN_Y`) AS NEN_Y \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`TSUKI_M`) AS TSUKI_M \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`HI_D`) AS HI_D \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NENGETSU_YM`) AS NENGETSU_YM \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NENGAPPI_YMD`) AS NENGAPPI_YMD \n";
        sql += "    , a.`TIMESTAMP_TS` AS TIMESTAMP_TS \n";
        sql += "    , a.`NICHIJI_DT` AS NICHIJI_DT \n";
        sql += "    , a.`HIDUKE_BI` AS HIDUKE_BI \n";
        sql += "    , a.`JIKOKU_HM` \n";
        sql += "    , a.`JIKAN_TM` \n";
        sql += "    , a.`SURYO_QT` \n";
        sql += "    , a.`TANKA_KG` \n";
        sql += "    , a.`ZEINUKI_KG` \n";
        sql += "FROM \n";
        sql += "    vb2_entity a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        return Queries.get(sql, map, Vb2Entity.class);
    }

    /**
     * VIEW追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // VIEWの登録
        String sql = "INSERT INTO vb2_entity(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`ENTITY_ID` -- :entity_id");
        nameList.add("`ENTITY_NM` -- :entity_nm");
        nameList.add("`ENTITY_MEI` -- :entity_mei");
        nameList.add("`CHECK_F` -- :check_f");
        nameList.add("`RADIO_KB` -- :radio_kb");
        nameList.add("`PULLDOWN_KB` -- :pulldown_kb");
        nameList.add("`MEMO_TX` -- :memo_tx");
        nameList.add("`NEN_Y` -- :nen_y");
        nameList.add("`TSUKI_M` -- :tsuki_m");
        nameList.add("`HI_D` -- :hi_d");
        nameList.add("`NENGETSU_YM` -- :nengetsu_ym");
        nameList.add("`NENGAPPI_YMD` -- :nengappi_ymd");
        nameList.add("`TIMESTAMP_TS` -- :timestamp_ts");
        nameList.add("`NICHIJI_DT` -- :nichiji_dt");
        nameList.add("`HIDUKE_BI` -- :hiduke_bi");
        nameList.add("`JIKOKU_HM` -- :jikoku_hm");
        nameList.add("`JIKAN_TM` -- :jikan_tm");
        nameList.add("`SURYO_QT` -- :suryo_qt");
        nameList.add("`TANKA_KG` -- :tanka_kg");
        nameList.add("`ZEINUKI_KG` -- :zeinuki_kg");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":entity_id");
        valueList.add(":entity_nm");
        valueList.add(":entity_mei");
        valueList.add(":check_f");
        valueList.add(":radio_kb");
        valueList.add(":pulldown_kb");
        valueList.add(":memo_tx");
        valueList.add(":nen_y");
        valueList.add(":tsuki_m");
        valueList.add(":hi_d");
        valueList.add(":nengetsu_ym");
        valueList.add(":nengappi_ymd");
        valueList.add(":timestamp_ts");
        valueList.add(":nichiji_dt");
        valueList.add(":hiduke_bi");
        valueList.add(":jikoku_hm");
        valueList.add(":jikan_tm");
        valueList.add(":suryo_qt");
        valueList.add(":tanka_kg");
        valueList.add(":zeinuki_kg");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * VIEW更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // VIEWの登録
        String sql = "UPDATE vb2_entity\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`ENTITY_ID` = :entity_id");
        setList.add("`ENTITY_NM` = :entity_nm");
        setList.add("`ENTITY_MEI` = :entity_mei");
        setList.add("`CHECK_F` = :check_f");
        setList.add("`RADIO_KB` = :radio_kb");
        setList.add("`PULLDOWN_KB` = :pulldown_kb");
        setList.add("`MEMO_TX` = :memo_tx");
        setList.add("`NEN_Y` = :nen_y");
        setList.add("`TSUKI_M` = :tsuki_m");
        setList.add("`HI_D` = :hi_d");
        setList.add("`NENGETSU_YM` = :nengetsu_ym");
        setList.add("`NENGAPPI_YMD` = :nengappi_ymd");
        setList.add("`TIMESTAMP_TS` = :timestamp_ts");
        setList.add("`NICHIJI_DT` = :nichiji_dt");
        setList.add("`HIDUKE_BI` = :hiduke_bi");
        setList.add("`JIKOKU_HM` = :jikoku_hm");
        setList.add("`JIKAN_TM` = :jikan_tm");
        setList.add("`SURYO_QT` = :suryo_qt");
        setList.add("`TANKA_KG` = :tanka_kg");
        setList.add("`ZEINUKI_KG` = :zeinuki_kg");
        return String.join("\r\n    , ", setList);
    }

    /**
     * VIEW削除
     * @return 削除件数
     */
    public int delete() {

        // VIEWの削除
        String sql = "DELETE FROM vb2_entity WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("entity_id", this.entityId);
        map.put("entity_nm", this.entityNm);
        map.put("entity_mei", this.entityMei);
        map.put("check_f", this.checkF);
        map.put("radio_kb", this.radioKb);
        map.put("pulldown_kb", this.pulldownKb);
        map.put("memo_tx", this.memoTx);
        map.put("nen_y", this.nenY);
        map.put("tsuki_m", this.tsukiM);
        map.put("hi_d", this.hiD);
        map.put("nengetsu_ym", this.nengetsuYm);
        map.put("nengappi_ymd", this.nengappiYmd);
        map.put("timestamp_ts", this.timestampTs);
        map.put("nichiji_dt", this.nichijiDt);
        map.put("hiduke_bi", this.hidukeBi);
        map.put("jikoku_hm", this.jikokuHm);
        map.put("jikan_tm", this.jikanTm);
        map.put("suryo_qt", this.suryoQt);
        map.put("tanka_kg", this.tankaKg);
        map.put("zeinuki_kg", this.zeinukiKg);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }
}
