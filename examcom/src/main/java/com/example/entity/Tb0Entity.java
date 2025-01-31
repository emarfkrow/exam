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
public class Tb0Entity implements IEntity {

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

    /** プルダウン種別 */
    private String pulldownSb;

    /** @return プルダウン種別 */
    @com.fasterxml.jackson.annotation.JsonProperty("PULLDOWN_SB")
    public String getPulldownSb() {
        return this.pulldownSb;
    }

    /** @param o プルダウン種別 */
    public void setPulldownSb(final Object o) {
        if (o != null) {
            this.pulldownSb = o.toString();
        } else {
            this.pulldownSb = null;
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

    /** １行メモ */
    private String memo;

    /** @return １行メモ */
    @com.fasterxml.jackson.annotation.JsonProperty("MEMO")
    public String getMemo() {
        return this.memo;
    }

    /** @param o １行メモ */
    public void setMemo(final Object o) {
        if (o != null) {
            this.memo = o.toString();
        } else {
            this.memo = null;
        }
    }

    /** ファイルパス */
    private String filePath;

    /** @return ファイルパス */
    @com.fasterxml.jackson.annotation.JsonProperty("FILE_PATH")
    public String getFilePath() {
        return this.filePath;
    }

    /** @param o ファイルパス */
    public void setFilePath(final Object o) {
        if (o != null) {
            this.filePath = o.toString();
        } else {
            this.filePath = null;
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
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "hh:mm")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer.class)
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
    private java.math.BigDecimal tankaPr;

    /** @return 単価 */
    @com.fasterxml.jackson.annotation.JsonProperty("TANKA_PR")
    public java.math.BigDecimal getTankaPr() {
        return this.tankaPr;
    }

    /** @param o 単価 */
    public void setTankaPr(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tankaPr = new java.math.BigDecimal(o.toString());
        } else {
            this.tankaPr = null;
        }
    }

    /** 通貨区分 */
    private String tsukaKb;

    /** @return 通貨区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("TSUKA_KB")
    public String getTsukaKb() {
        return this.tsukaKb;
    }

    /** @param o 通貨区分 */
    public void setTsukaKb(final Object o) {
        if (o != null) {
            this.tsukaKb = o.toString();
        } else {
            this.tsukaKb = null;
        }
    }

    /** 税抜金額 */
    private java.math.BigDecimal zeinukiAm;

    /** @return 税抜金額 */
    @com.fasterxml.jackson.annotation.JsonProperty("ZEINUKI_AM")
    public java.math.BigDecimal getZeinukiAm() {
        return this.zeinukiAm;
    }

    /** @param o 税抜金額 */
    public void setZeinukiAm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zeinukiAm = new java.math.BigDecimal(o.toString());
        } else {
            this.zeinukiAm = null;
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
    private Integer insertUserId;

    /** @return 作成者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_USER_ID")
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
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_USER_SEI")
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
    private Integer updateUserId;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_USER_ID")
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
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_USER_SEI")
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
    public static Tb0Entity get(final Object param1) {
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
        sql += "    , a.`PULLDOWN_SB` \n";
        sql += "    , a.`MEMO_TX` \n";
        sql += "    , a.`MEMO` \n";
        sql += "    , a.`FILE_PATH` \n";
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
        sql += "    , a.`TANKA_PR` \n";
        sql += "    , a.`TSUKA_KB` \n";
        sql += "    , a.`ZEINUKI_AM` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB0_ENTITY a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("entity_id", param1);
        return Queries.get(sql, map, Tb0Entity.class);
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
        String sql = "INSERT INTO TB0_ENTITY(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
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
        nameList.add("`PULLDOWN_SB` -- :pulldown_sb");
        nameList.add("`MEMO_TX` -- :memo_tx");
        nameList.add("`MEMO` -- :memo");
        nameList.add("`FILE_PATH` -- :file_path");
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
        nameList.add("`TANKA_PR` -- :tanka_pr");
        nameList.add("`TSUKA_KB` -- :tsuka_kb");
        nameList.add("`ZEINUKI_AM` -- :zeinuki_am");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
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
        valueList.add(":pulldown_sb");
        valueList.add(":memo_tx");
        valueList.add(":memo");
        valueList.add(":file_path");
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
        valueList.add(":tanka_pr");
        valueList.add(":tsuka_kb");
        valueList.add(":zeinuki_am");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** エンティティIDの採番処理 */
    private void numbering() {
        if (this.entityId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`ENTITY_ID`) IS NULL THEN 0 ELSE MAX(e.`ENTITY_ID`) * 1 END + 1 AS `ENTITY_ID` FROM TB0_ENTITY e";
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
        String sql = "UPDATE TB0_ENTITY\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
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
        setList.add("`PULLDOWN_SB` = :pulldown_sb");
        setList.add("`MEMO_TX` = :memo_tx");
        setList.add("`MEMO` = :memo");
        setList.add("`FILE_PATH` = :file_path");
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
        setList.add("`TANKA_PR` = :tanka_pr");
        setList.add("`TSUKA_KB` = :tsuka_kb");
        setList.add("`ZEINUKI_AM` = :zeinuki_am");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * エンティティ削除
     * @return 削除件数
     */
    public int delete() {

        Tb0Entity tb0Entity = Tb0Entity.get(this.entityId);
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get(tb0Entity.filePath));
        } catch (Exception e) {
            throw new jp.co.golorp.emarf.exception.SysError(e);
        }

        // エンティティの削除
        String sql = "DELETE FROM TB0_ENTITY WHERE " + getWhere();
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
        map.put("pulldown_sb", this.pulldownSb);
        map.put("memo_tx", this.memoTx);
        map.put("memo", this.memo);
        map.put("file_path", this.filePath);
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
        map.put("tanka_pr", this.tankaPr);
        map.put("tsuka_kb", this.tsukaKb);
        map.put("zeinuki_am", this.zeinukiAm);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
