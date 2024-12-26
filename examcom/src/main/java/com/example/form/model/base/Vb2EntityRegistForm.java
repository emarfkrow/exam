package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ検索登録フォーム
 *
 * @author emarfkrow
 */
public class Vb2EntityRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Vb2EntityRegistForm.class);

    /** ENTITY_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String entityId;

    /**
     * @return ENTITY_ID
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * @param p ENTITY_ID
     */
    public void setEntityId(final String p) {
        this.entityId = p;
    }

    /** ENTITY_NM */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String entityNm;

    /**
     * @return ENTITY_NM
     */
    public String getEntityNm() {
        return entityNm;
    }

    /**
     * @param p ENTITY_NM
     */
    public void setEntityNm(final String p) {
        this.entityNm = p;
    }

    /** ENTITY_MEI */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String entityMei;

    /**
     * @return ENTITY_MEI
     */
    public String getEntityMei() {
        return entityMei;
    }

    /**
     * @param p ENTITY_MEI
     */
    public void setEntityMei(final String p) {
        this.entityMei = p;
    }

    /** CHECK_F */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String checkF;

    /**
     * @return CHECK_F
     */
    public String getCheckF() {
        return checkF;
    }

    /**
     * @param p CHECK_F
     */
    public void setCheckF(final String p) {
        this.checkF = p;
    }

    /** RADIO_KB */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String radioKb;

    /**
     * @return RADIO_KB
     */
    public String getRadioKb() {
        return radioKb;
    }

    /**
     * @param p RADIO_KB
     */
    public void setRadioKb(final String p) {
        this.radioKb = p;
    }

    /** PULLDOWN_KB */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String pulldownKb;

    /**
     * @return PULLDOWN_KB
     */
    public String getPulldownKb() {
        return pulldownKb;
    }

    /**
     * @param p PULLDOWN_KB
     */
    public void setPulldownKb(final String p) {
        this.pulldownKb = p;
    }

    /** MEMO_TX */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 800)
    private String memoTx;

    /**
     * @return MEMO_TX
     */
    public String getMemoTx() {
        return memoTx;
    }

    /**
     * @param p MEMO_TX
     */
    public void setMemoTx(final String p) {
        this.memoTx = p;
    }

    /** NEN_Y */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4})?")
    private String nenY;

    /**
     * @return NEN_Y
     */
    public String getNenY() {
        return nenY;
    }

    /**
     * @param p NEN_Y
     */
    public void setNenY(final String p) {
        this.nenY = p;
    }

    /** TSUKI_M */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String tsukiM;

    /**
     * @return TSUKI_M
     */
    public String getTsukiM() {
        return tsukiM;
    }

    /**
     * @param p TSUKI_M
     */
    public void setTsukiM(final String p) {
        this.tsukiM = p;
    }

    /** HI_D */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String hiD;

    /**
     * @return HI_D
     */
    public String getHiD() {
        return hiD;
    }

    /**
     * @param p HI_D
     */
    public void setHiD(final String p) {
        this.hiD = p;
    }

    /** NENGETSU_YM */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2})?")
    private String nengetsuYm;

    /**
     * @return NENGETSU_YM
     */
    public String getNengetsuYm() {
        return nengetsuYm;
    }

    /**
     * @param p NENGETSU_YM
     */
    public void setNengetsuYm(final String p) {
        this.nengetsuYm = p;
    }

    /** NENGAPPI_YMD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{8})?")
    private String nengappiYmd;

    /**
     * @return NENGAPPI_YMD
     */
    public String getNengappiYmd() {
        return nengappiYmd;
    }

    /**
     * @param p NENGAPPI_YMD
     */
    public void setNengappiYmd(final String p) {
        this.nengappiYmd = p;
    }

    /** TIMESTAMP_TS */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    private String timestampTs;

    /**
     * @return TIMESTAMP_TS
     */
    public String getTimestampTs() {
        return timestampTs;
    }

    /**
     * @param p TIMESTAMP_TS
     */
    public void setTimestampTs(final String p) {
        this.timestampTs = p;
    }

    /** NICHIJI_DT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    private String nichijiDt;

    /**
     * @return NICHIJI_DT
     */
    public String getNichijiDt() {
        return nichijiDt;
    }

    /**
     * @param p NICHIJI_DT
     */
    public void setNichijiDt(final String p) {
        this.nichijiDt = p;
    }

    /** HIDUKE_BI */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String hidukeBi;

    /**
     * @return HIDUKE_BI
     */
    public String getHidukeBi() {
        return hidukeBi;
    }

    /**
     * @param p HIDUKE_BI
     */
    public void setHidukeBi(final String p) {
        this.hidukeBi = p;
    }

    /** JIKOKU_HM */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,2}:[0-9]{1,2})?")
    private String jikokuHm;

    /**
     * @return JIKOKU_HM
     */
    public String getJikokuHm() {
        return jikokuHm;
    }

    /**
     * @param p JIKOKU_HM
     */
    public void setJikokuHm(final String p) {
        this.jikokuHm = p;
    }

    /** JIKAN_TM */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,}:[0-9]{1,2})?")
    private String jikanTm;

    /**
     * @return JIKAN_TM
     */
    public String getJikanTm() {
        return jikanTm;
    }

    /**
     * @param p JIKAN_TM
     */
    public void setJikanTm(final String p) {
        this.jikanTm = p;
    }

    /** SURYO_QT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,7}\\.?[0-9]{0,2}?)?")
    private String suryoQt;

    /**
     * @return SURYO_QT
     */
    public String getSuryoQt() {
        return suryoQt;
    }

    /**
     * @param p SURYO_QT
     */
    public void setSuryoQt(final String p) {
        this.suryoQt = p;
    }

    /** TANKA_KG */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,8}\\.?[0-9]{0,3}?)?")
    private String tankaKg;

    /**
     * @return TANKA_KG
     */
    public String getTankaKg() {
        return tankaKg;
    }

    /**
     * @param p TANKA_KG
     */
    public void setTankaKg(final String p) {
        this.tankaKg = p;
    }

    /** ZEINUKI_KG */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,8}\\.?[0-9]{0,3}?)?")
    private String zeinukiKg;

    /**
     * @return ZEINUKI_KG
     */
    public String getZeinukiKg() {
        return zeinukiKg;
    }

    /**
     * @param p ZEINUKI_KG
     */
    public void setZeinukiKg(final String p) {
        this.zeinukiKg = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
