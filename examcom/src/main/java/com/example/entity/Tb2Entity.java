package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * エンティティ
 * @author emarfkrow
 */
public class Tb2Entity implements IEntity {

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

    /** 任意エンティティ名称 */
    private String nullEntityNm;

    /** @return 任意エンティティ名称 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_ENTITY_NM")
    public String getNullEntityNm() {
        return this.nullEntityNm;
    }

    /** @param o 任意エンティティ名称 */
    public void setNullEntityNm(final Object o) {
        if (o != null) {
            this.nullEntityNm = o.toString();
        } else {
            this.nullEntityNm = null;
        }
    }

    /** 任意エンティティ名 */
    private String nullEntityMei;

    /** @return 任意エンティティ名 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_ENTITY_MEI")
    public String getNullEntityMei() {
        return this.nullEntityMei;
    }

    /** @param o 任意エンティティ名 */
    public void setNullEntityMei(final Object o) {
        if (o != null) {
            this.nullEntityMei = o.toString();
        } else {
            this.nullEntityMei = null;
        }
    }

    /** 任意チェックフラグ */
    private String nullCheckF = "0";

    /** @return 任意チェックフラグ */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_CHECK_F")
    public String getNullCheckF() {
        return this.nullCheckF;
    }

    /** @param o 任意チェックフラグ */
    public void setNullCheckF(final Object o) {
        if (o != null) {
            this.nullCheckF = o.toString();
        } else {
            this.nullCheckF = null;
        }
    }

    /** 任意ラジオ区分 */
    private String nullRadioKb;

    /** @return 任意ラジオ区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_RADIO_KB")
    public String getNullRadioKb() {
        return this.nullRadioKb;
    }

    /** @param o 任意ラジオ区分 */
    public void setNullRadioKb(final Object o) {
        if (o != null) {
            this.nullRadioKb = o.toString();
        } else {
            this.nullRadioKb = null;
        }
    }

    /** 任意プルダウン区分 */
    private String nullPulldownKb;

    /** @return 任意プルダウン区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_PULLDOWN_KB")
    public String getNullPulldownKb() {
        return this.nullPulldownKb;
    }

    /** @param o 任意プルダウン区分 */
    public void setNullPulldownKb(final Object o) {
        if (o != null) {
            this.nullPulldownKb = o.toString();
        } else {
            this.nullPulldownKb = null;
        }
    }

    /** 任意メモ */
    private String nullMemoTx;

    /** @return 任意メモ */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_MEMO_TX")
    public String getNullMemoTx() {
        return this.nullMemoTx;
    }

    /** @param o 任意メモ */
    public void setNullMemoTx(final Object o) {
        if (o != null) {
            this.nullMemoTx = o.toString();
        } else {
            this.nullMemoTx = null;
        }
    }

    /** 任意年 */
    private String nullNenY;

    /** @return 任意年 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_NEN_Y")
    public String getNullNenY() {
        return this.nullNenY;
    }

    /** @param o 任意年 */
    public void setNullNenY(final Object o) {
        if (o != null) {
            this.nullNenY = o.toString();
        } else {
            this.nullNenY = null;
        }
    }

    /** 任意月 */
    private String nullTsukiM;

    /** @return 任意月 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_TSUKI_M")
    public String getNullTsukiM() {
        return this.nullTsukiM;
    }

    /** @param o 任意月 */
    public void setNullTsukiM(final Object o) {
        if (o != null) {
            this.nullTsukiM = o.toString();
        } else {
            this.nullTsukiM = null;
        }
    }

    /** 任意日 */
    private String nullHiD;

    /** @return 任意日 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_HI_D")
    public String getNullHiD() {
        return this.nullHiD;
    }

    /** @param o 任意日 */
    public void setNullHiD(final Object o) {
        if (o != null) {
            this.nullHiD = o.toString();
        } else {
            this.nullHiD = null;
        }
    }

    /** 任意年月 */
    private String nullNengetsuYm;

    /** @return 任意年月 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_NENGETSU_YM")
    public String getNullNengetsuYm() {
        return this.nullNengetsuYm;
    }

    /** @param o 任意年月 */
    public void setNullNengetsuYm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullNengetsuYm = String.valueOf(o.toString().replace("-", ""));
        } else {
            this.nullNengetsuYm = null;
        }
    }

    /** 任意年月日 */
    private String nullNengappiYmd;

    /** @return 任意年月日 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_NENGAPPI_YMD")
    public String getNullNengappiYmd() {
        return this.nullNengappiYmd;
    }

    /** @param o 任意年月日 */
    public void setNullNengappiYmd(final Object o) {
        if (o != null) {
            this.nullNengappiYmd = o.toString();
        } else {
            this.nullNengappiYmd = null;
        }
    }

    /** 任意タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime nullTimestampTs;

    /** @return 任意タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_TIMESTAMP_TS")
    public java.time.LocalDateTime getNullTimestampTs() {
        return this.nullTimestampTs;
    }

    /** @param o 任意タイムスタンプ */
    public void setNullTimestampTs(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.nullTimestampTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.nullTimestampTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullTimestampTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.nullTimestampTs = null;
        }
    }

    /** 任意日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime nullNichijiDt;

    /** @return 任意日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_NICHIJI_DT")
    public java.time.LocalDateTime getNullNichijiDt() {
        return this.nullNichijiDt;
    }

    /** @param o 任意日時 */
    public void setNullNichijiDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.nullNichijiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.nullNichijiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullNichijiDt = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.nullNichijiDt = null;
        }
    }

    /** 任意日付 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)
    private java.time.LocalDate nullHidukeBi;

    /** @return 任意日付 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_HIDUKE_BI")
    public java.time.LocalDate getNullHidukeBi() {
        return this.nullHidukeBi;
    }

    /** @param o 任意日付 */
    public void setNullHidukeBi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullHidukeBi = java.time.LocalDate.parse(o.toString().substring(0, 10));
        } else {
            this.nullHidukeBi = null;
        }
    }

    /** 任意時刻 */
    private java.time.LocalTime nullJikokuHm;

    /** @return 任意時刻 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_JIKOKU_HM")
    public java.time.LocalTime getNullJikokuHm() {
        return this.nullJikokuHm;
    }

    /** @param o 任意時刻 */
    public void setNullJikokuHm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullJikokuHm = java.time.LocalTime.parse(o.toString());
        } else {
            this.nullJikokuHm = null;
        }
    }

    /** 任意時間 */
    private String nullJikanTm;

    /** @return 任意時間 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_JIKAN_TM")
    public String getNullJikanTm() {
        return this.nullJikanTm;
    }

    /** @param o 任意時間 */
    public void setNullJikanTm(final Object o) {
        if (o != null) {
            this.nullJikanTm = o.toString();
        } else {
            this.nullJikanTm = null;
        }
    }

    /** 任意数量 */
    private java.math.BigDecimal nullSuryoQt;

    /** @return 任意数量 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_SURYO_QT")
    public java.math.BigDecimal getNullSuryoQt() {
        return this.nullSuryoQt;
    }

    /** @param o 任意数量 */
    public void setNullSuryoQt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullSuryoQt = new java.math.BigDecimal(o.toString());
        } else {
            this.nullSuryoQt = null;
        }
    }

    /** 任意単価 */
    private java.math.BigDecimal nullTankaKg;

    /** @return 任意単価 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_TANKA_KG")
    public java.math.BigDecimal getNullTankaKg() {
        return this.nullTankaKg;
    }

    /** @param o 任意単価 */
    public void setNullTankaKg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullTankaKg = new java.math.BigDecimal(o.toString());
        } else {
            this.nullTankaKg = null;
        }
    }

    /** 任意税抜金額 */
    private java.math.BigDecimal nullZeinukiKg;

    /** @return 任意税抜金額 */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_ZEINUKI_KG")
    public java.math.BigDecimal getNullZeinukiKg() {
        return this.nullZeinukiKg;
    }

    /** @param o 任意税抜金額 */
    public void setNullZeinukiKg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullZeinukiKg = new java.math.BigDecimal(o.toString());
        } else {
            this.nullZeinukiKg = null;
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
     * エンティティ照会
     * @param param1 エンティティID
     * @return エンティティ
     */
    public static Tb2Entity get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`ENTITY_ID` = :entity_id");
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
        sql += "    , a.`NULL_ENTITY_NM` \n";
        sql += "    , a.`NULL_ENTITY_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NULL_CHECK_F`) AS NULL_CHECK_F \n";
        sql += "    , a.`NULL_RADIO_KB` \n";
        sql += "    , a.`NULL_PULLDOWN_KB` \n";
        sql += "    , a.`NULL_MEMO_TX` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NULL_NEN_Y`) AS NULL_NEN_Y \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NULL_TSUKI_M`) AS NULL_TSUKI_M \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NULL_HI_D`) AS NULL_HI_D \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NULL_NENGETSU_YM`) AS NULL_NENGETSU_YM \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`NULL_NENGAPPI_YMD`) AS NULL_NENGAPPI_YMD \n";
        sql += "    , a.`NULL_TIMESTAMP_TS` AS NULL_TIMESTAMP_TS \n";
        sql += "    , a.`NULL_NICHIJI_DT` AS NULL_NICHIJI_DT \n";
        sql += "    , a.`NULL_HIDUKE_BI` AS NULL_HIDUKE_BI \n";
        sql += "    , a.`NULL_JIKOKU_HM` \n";
        sql += "    , a.`NULL_JIKAN_TM` \n";
        sql += "    , a.`NULL_SURYO_QT` \n";
        sql += "    , a.`NULL_TANKA_KG` \n";
        sql += "    , a.`NULL_ZEINUKI_KG` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB2_ENTITY a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("entity_id", param1);
        return Queries.get(sql, map, Tb2Entity.class);
    }

    /**
     * エンティティ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // エンティティIDの採番処理
        numbering();

        // エンティティの登録
        String sql = "INSERT INTO TB2_ENTITY(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
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
        nameList.add("`NULL_ENTITY_NM` -- :null_entity_nm");
        nameList.add("`NULL_ENTITY_MEI` -- :null_entity_mei");
        nameList.add("`NULL_CHECK_F` -- :null_check_f");
        nameList.add("`NULL_RADIO_KB` -- :null_radio_kb");
        nameList.add("`NULL_PULLDOWN_KB` -- :null_pulldown_kb");
        nameList.add("`NULL_MEMO_TX` -- :null_memo_tx");
        nameList.add("`NULL_NEN_Y` -- :null_nen_y");
        nameList.add("`NULL_TSUKI_M` -- :null_tsuki_m");
        nameList.add("`NULL_HI_D` -- :null_hi_d");
        nameList.add("`NULL_NENGETSU_YM` -- :null_nengetsu_ym");
        nameList.add("`NULL_NENGAPPI_YMD` -- :null_nengappi_ymd");
        nameList.add("`NULL_TIMESTAMP_TS` -- :null_timestamp_ts");
        nameList.add("`NULL_NICHIJI_DT` -- :null_nichiji_dt");
        nameList.add("`NULL_HIDUKE_BI` -- :null_hiduke_bi");
        nameList.add("`NULL_JIKOKU_HM` -- :null_jikoku_hm");
        nameList.add("`NULL_JIKAN_TM` -- :null_jikan_tm");
        nameList.add("`NULL_SURYO_QT` -- :null_suryo_qt");
        nameList.add("`NULL_TANKA_KG` -- :null_tanka_kg");
        nameList.add("`NULL_ZEINUKI_KG` -- :null_zeinuki_kg");
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
        valueList.add(":null_entity_nm");
        valueList.add(":null_entity_mei");
        valueList.add(":null_check_f");
        valueList.add(":null_radio_kb");
        valueList.add(":null_pulldown_kb");
        valueList.add(":null_memo_tx");
        valueList.add(":null_nen_y");
        valueList.add(":null_tsuki_m");
        valueList.add(":null_hi_d");
        valueList.add(":null_nengetsu_ym");
        valueList.add(":null_nengappi_ymd");
        valueList.add(":null_timestamp_ts");
        valueList.add(":null_nichiji_dt");
        valueList.add(":null_hiduke_bi");
        valueList.add(":null_jikoku_hm");
        valueList.add(":null_jikan_tm");
        valueList.add(":null_suryo_qt");
        valueList.add(":null_tanka_kg");
        valueList.add(":null_zeinuki_kg");
        valueList.add(":insert_ts");
        valueList.add(":insert_id");
        valueList.add(":update_ts");
        valueList.add(":update_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** エンティティIDの採番処理 */
    private void numbering() {
        if (this.entityId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`ENTITY_ID`) IS NULL THEN 0 ELSE MAX(e.`ENTITY_ID`) * 1 END + 1 AS `ENTITY_ID` FROM TB2_ENTITY e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("ENTITY_ID");
        this.setEntityId(o);
    }

    /**
     * エンティティ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // エンティティの登録
        String sql = "UPDATE TB2_ENTITY\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
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
        setList.add("`NULL_ENTITY_NM` = :null_entity_nm");
        setList.add("`NULL_ENTITY_MEI` = :null_entity_mei");
        setList.add("`NULL_CHECK_F` = :null_check_f");
        setList.add("`NULL_RADIO_KB` = :null_radio_kb");
        setList.add("`NULL_PULLDOWN_KB` = :null_pulldown_kb");
        setList.add("`NULL_MEMO_TX` = :null_memo_tx");
        setList.add("`NULL_NEN_Y` = :null_nen_y");
        setList.add("`NULL_TSUKI_M` = :null_tsuki_m");
        setList.add("`NULL_HI_D` = :null_hi_d");
        setList.add("`NULL_NENGETSU_YM` = :null_nengetsu_ym");
        setList.add("`NULL_NENGAPPI_YMD` = :null_nengappi_ymd");
        setList.add("`NULL_TIMESTAMP_TS` = :null_timestamp_ts");
        setList.add("`NULL_NICHIJI_DT` = :null_nichiji_dt");
        setList.add("`NULL_HIDUKE_BI` = :null_hiduke_bi");
        setList.add("`NULL_JIKOKU_HM` = :null_jikoku_hm");
        setList.add("`NULL_JIKAN_TM` = :null_jikan_tm");
        setList.add("`NULL_SURYO_QT` = :null_suryo_qt");
        setList.add("`NULL_TANKA_KG` = :null_tanka_kg");
        setList.add("`NULL_ZEINUKI_KG` = :null_zeinuki_kg");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_ID` = :update_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * エンティティ削除
     * @return 削除件数
     */
    public int delete() {

        // エンティティの削除
        String sql = "DELETE FROM TB2_ENTITY WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`ENTITY_ID` = :entity_id");
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
        map.put("null_entity_nm", this.nullEntityNm);
        map.put("null_entity_mei", this.nullEntityMei);
        map.put("null_check_f", this.nullCheckF);
        map.put("null_radio_kb", this.nullRadioKb);
        map.put("null_pulldown_kb", this.nullPulldownKb);
        map.put("null_memo_tx", this.nullMemoTx);
        map.put("null_nen_y", this.nullNenY);
        map.put("null_tsuki_m", this.nullTsukiM);
        map.put("null_hi_d", this.nullHiD);
        map.put("null_nengetsu_ym", this.nullNengetsuYm);
        map.put("null_nengappi_ymd", this.nullNengappiYmd);
        map.put("null_timestamp_ts", this.nullTimestampTs);
        map.put("null_nichiji_dt", this.nullNichijiDt);
        map.put("null_hiduke_bi", this.nullHidukeBi);
        map.put("null_jikoku_hm", this.nullJikokuHm);
        map.put("null_jikan_tm", this.nullJikanTm);
        map.put("null_suryo_qt", this.nullSuryoQt);
        map.put("null_tanka_kg", this.nullTankaKg);
        map.put("null_zeinuki_kg", this.nullZeinukiKg);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_id", execId);
        map.put("update_ts", now);
        map.put("update_id", execId);
        return map;
    }
}
