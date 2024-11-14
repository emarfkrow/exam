package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ登録フォーム
 *
 * @author emarfkrow
 */
public class TEntityRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntityRegistForm.class);

    /** エンティティID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String entityId;

    /**
     * @return エンティティID
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * @param p エンティティID
     */
    public void setEntityId(final String p) {
        this.entityId = p;
    }

    /** エンティティ名称 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
    private String entityNm;

    /**
     * @return エンティティ名称
     */
    public String getEntityNm() {
        return entityNm;
    }

    /**
     * @param p エンティティ名称
     */
    public void setEntityNm(final String p) {
        this.entityNm = p;
    }

    /** エンティティ名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String entityMei;

    /**
     * @return エンティティ名
     */
    public String getEntityMei() {
        return entityMei;
    }

    /**
     * @param p エンティティ名
     */
    public void setEntityMei(final String p) {
        this.entityMei = p;
    }

    /** チェックフラグ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String checkF;

    /**
     * @return チェックフラグ
     */
    public String getCheckF() {
        return checkF;
    }

    /**
     * @param p チェックフラグ
     */
    public void setCheckF(final String p) {
        this.checkF = p;
    }

    /** ラジオ区分 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String radioKb;

    /**
     * @return ラジオ区分
     */
    public String getRadioKb() {
        return radioKb;
    }

    /**
     * @param p ラジオ区分
     */
    public void setRadioKb(final String p) {
        this.radioKb = p;
    }

    /** プルダウン区分 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String pulldownKb;

    /**
     * @return プルダウン区分
     */
    public String getPulldownKb() {
        return pulldownKb;
    }

    /**
     * @param p プルダウン区分
     */
    public void setPulldownKb(final String p) {
        this.pulldownKb = p;
    }

    /** メモ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 800)
    private String memoTx;

    /**
     * @return メモ
     */
    public String getMemoTx() {
        return memoTx;
    }

    /**
     * @param p メモ
     */
    public void setMemoTx(final String p) {
        this.memoTx = p;
    }

    /** 年 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4})?")
    private String nenY;

    /**
     * @return 年
     */
    public String getNenY() {
        return nenY;
    }

    /**
     * @param p 年
     */
    public void setNenY(final String p) {
        this.nenY = p;
    }

    /** 月 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String tsukiM;

    /**
     * @return 月
     */
    public String getTsukiM() {
        return tsukiM;
    }

    /**
     * @param p 月
     */
    public void setTsukiM(final String p) {
        this.tsukiM = p;
    }

    /** 日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String hiD;

    /**
     * @return 日
     */
    public String getHiD() {
        return hiD;
    }

    /**
     * @param p 日
     */
    public void setHiD(final String p) {
        this.hiD = p;
    }

    /** 年月 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2})?")
    private String nengetsuYm;

    /**
     * @return 年月
     */
    public String getNengetsuYm() {
        return nengetsuYm;
    }

    /**
     * @param p 年月
     */
    public void setNengetsuYm(final String p) {
        this.nengetsuYm = p;
    }

    /** 年月日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{8})?")
    private String nengappiYmd;

    /**
     * @return 年月日
     */
    public String getNengappiYmd() {
        return nengappiYmd;
    }

    /**
     * @param p 年月日
     */
    public void setNengappiYmd(final String p) {
        this.nengappiYmd = p;
    }

    /** タイムスタンプ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    private String timestampTs;

    /**
     * @return タイムスタンプ
     */
    public String getTimestampTs() {
        return timestampTs;
    }

    /**
     * @param p タイムスタンプ
     */
    public void setTimestampTs(final String p) {
        this.timestampTs = p;
    }

    /** 日時 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    private String nichijiDt;

    /**
     * @return 日時
     */
    public String getNichijiDt() {
        return nichijiDt;
    }

    /**
     * @param p 日時
     */
    public void setNichijiDt(final String p) {
        this.nichijiDt = p;
    }

    /** 日付 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String hidukeBi;

    /**
     * @return 日付
     */
    public String getHidukeBi() {
        return hidukeBi;
    }

    /**
     * @param p 日付
     */
    public void setHidukeBi(final String p) {
        this.hidukeBi = p;
    }

    /** 時刻 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,2}:[0-9]{1,2})?")
    private String jikokuHm;

    /**
     * @return 時刻
     */
    public String getJikokuHm() {
        return jikokuHm;
    }

    /**
     * @param p 時刻
     */
    public void setJikokuHm(final String p) {
        this.jikokuHm = p;
    }

    /** 時間 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,}:[0-9]{1,2})?")
    private String jikanTm;

    /**
     * @return 時間
     */
    public String getJikanTm() {
        return jikanTm;
    }

    /**
     * @param p 時間
     */
    public void setJikanTm(final String p) {
        this.jikanTm = p;
    }

    /** 数量 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,7}\\.?[0-9]{0,2}?)?")
    private String suryoQt;

    /**
     * @return 数量
     */
    public String getSuryoQt() {
        return suryoQt;
    }

    /**
     * @param p 数量
     */
    public void setSuryoQt(final String p) {
        this.suryoQt = p;
    }

    /** 単価 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,8}\\.?[0-9]{0,3}?)?")
    private String tankaKg;

    /**
     * @return 単価
     */
    public String getTankaKg() {
        return tankaKg;
    }

    /**
     * @param p 単価
     */
    public void setTankaKg(final String p) {
        this.tankaKg = p;
    }

    /** 税抜金額 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,8}\\.?[0-9]{0,3}?)?")
    private String zeinukiKg;

    /**
     * @return 税抜金額
     */
    public String getZeinukiKg() {
        return zeinukiKg;
    }

    /**
     * @param p 税抜金額
     */
    public void setZeinukiKg(final String p) {
        this.zeinukiKg = p;
    }

    /** 任意エンティティ名称 */
    @jakarta.validation.constraints.Size(max = 30)
    private String nullEntityNm;

    /**
     * @return 任意エンティティ名称
     */
    public String getNullEntityNm() {
        return nullEntityNm;
    }

    /**
     * @param p 任意エンティティ名称
     */
    public void setNullEntityNm(final String p) {
        this.nullEntityNm = p;
    }

    /** 任意エンティティ名 */
    @jakarta.validation.constraints.Size(max = 120)
    private String nullEntityMei;

    /**
     * @return 任意エンティティ名
     */
    public String getNullEntityMei() {
        return nullEntityMei;
    }

    /**
     * @param p 任意エンティティ名
     */
    public void setNullEntityMei(final String p) {
        this.nullEntityMei = p;
    }

    /** 任意チェックフラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String nullCheckF;

    /**
     * @return 任意チェックフラグ
     */
    public String getNullCheckF() {
        return nullCheckF;
    }

    /**
     * @param p 任意チェックフラグ
     */
    public void setNullCheckF(final String p) {
        this.nullCheckF = p;
    }

    /** 任意ラジオ区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String nullRadioKb;

    /**
     * @return 任意ラジオ区分
     */
    public String getNullRadioKb() {
        return nullRadioKb;
    }

    /**
     * @param p 任意ラジオ区分
     */
    public void setNullRadioKb(final String p) {
        this.nullRadioKb = p;
    }

    /** 任意プルダウン区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String nullPulldownKb;

    /**
     * @return 任意プルダウン区分
     */
    public String getNullPulldownKb() {
        return nullPulldownKb;
    }

    /**
     * @param p 任意プルダウン区分
     */
    public void setNullPulldownKb(final String p) {
        this.nullPulldownKb = p;
    }

    /** 任意メモ */
    @jakarta.validation.constraints.Size(max = 800)
    private String nullMemoTx;

    /**
     * @return 任意メモ
     */
    public String getNullMemoTx() {
        return nullMemoTx;
    }

    /**
     * @param p 任意メモ
     */
    public void setNullMemoTx(final String p) {
        this.nullMemoTx = p;
    }

    /** 任意年 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4})?")
    private String nullNenY;

    /**
     * @return 任意年
     */
    public String getNullNenY() {
        return nullNenY;
    }

    /**
     * @param p 任意年
     */
    public void setNullNenY(final String p) {
        this.nullNenY = p;
    }

    /** 任意月 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String nullTsukiM;

    /**
     * @return 任意月
     */
    public String getNullTsukiM() {
        return nullTsukiM;
    }

    /**
     * @param p 任意月
     */
    public void setNullTsukiM(final String p) {
        this.nullTsukiM = p;
    }

    /** 任意日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String nullHiD;

    /**
     * @return 任意日
     */
    public String getNullHiD() {
        return nullHiD;
    }

    /**
     * @param p 任意日
     */
    public void setNullHiD(final String p) {
        this.nullHiD = p;
    }

    /** 任意年月 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2})?")
    private String nullNengetsuYm;

    /**
     * @return 任意年月
     */
    public String getNullNengetsuYm() {
        return nullNengetsuYm;
    }

    /**
     * @param p 任意年月
     */
    public void setNullNengetsuYm(final String p) {
        this.nullNengetsuYm = p;
    }

    /** 任意年月日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{8})?")
    private String nullNengappiYmd;

    /**
     * @return 任意年月日
     */
    public String getNullNengappiYmd() {
        return nullNengappiYmd;
    }

    /**
     * @param p 任意年月日
     */
    public void setNullNengappiYmd(final String p) {
        this.nullNengappiYmd = p;
    }

    /** 任意タイムスタンプ */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    private String nullTimestampTs;

    /**
     * @return 任意タイムスタンプ
     */
    public String getNullTimestampTs() {
        return nullTimestampTs;
    }

    /**
     * @param p 任意タイムスタンプ
     */
    public void setNullTimestampTs(final String p) {
        this.nullTimestampTs = p;
    }

    /** 任意日時 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    private String nullNichijiDt;

    /**
     * @return 任意日時
     */
    public String getNullNichijiDt() {
        return nullNichijiDt;
    }

    /**
     * @param p 任意日時
     */
    public void setNullNichijiDt(final String p) {
        this.nullNichijiDt = p;
    }

    /** 任意日付 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String nullHidukeBi;

    /**
     * @return 任意日付
     */
    public String getNullHidukeBi() {
        return nullHidukeBi;
    }

    /**
     * @param p 任意日付
     */
    public void setNullHidukeBi(final String p) {
        this.nullHidukeBi = p;
    }

    /** 任意時刻 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,2}:[0-9]{1,2})?")
    private String nullJikokuHm;

    /**
     * @return 任意時刻
     */
    public String getNullJikokuHm() {
        return nullJikokuHm;
    }

    /**
     * @param p 任意時刻
     */
    public void setNullJikokuHm(final String p) {
        this.nullJikokuHm = p;
    }

    /** 任意時間 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,}:[0-9]{1,2})?")
    private String nullJikanTm;

    /**
     * @return 任意時間
     */
    public String getNullJikanTm() {
        return nullJikanTm;
    }

    /**
     * @param p 任意時間
     */
    public void setNullJikanTm(final String p) {
        this.nullJikanTm = p;
    }

    /** 任意数量 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,7}\\.?[0-9]{0,2}?)?")
    private String nullSuryoQt;

    /**
     * @return 任意数量
     */
    public String getNullSuryoQt() {
        return nullSuryoQt;
    }

    /**
     * @param p 任意数量
     */
    public void setNullSuryoQt(final String p) {
        this.nullSuryoQt = p;
    }

    /** 任意単価 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,8}\\.?[0-9]{0,3}?)?")
    private String nullTankaKg;

    /**
     * @return 任意単価
     */
    public String getNullTankaKg() {
        return nullTankaKg;
    }

    /**
     * @param p 任意単価
     */
    public void setNullTankaKg(final String p) {
        this.nullTankaKg = p;
    }

    /** 任意税抜金額 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,8}\\.?[0-9]{0,3}?)?")
    private String nullZeinukiKg;

    /**
     * @return 任意税抜金額
     */
    public String getNullZeinukiKg() {
        return nullZeinukiKg;
    }

    /**
     * @param p 任意税抜金額
     */
    public void setNullZeinukiKg(final String p) {
        this.nullZeinukiKg = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
