package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照元登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4SanshoMotoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4SanshoMotoRegistForm.class);

    /** 参照元ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String refId;

    /**
     * @return 参照元ID
     */
    public String getRefId() {
        return refId;
    }

    /**
     * @param p 参照元ID
     */
    public void setRefId(final String p) {
        this.refId = p;
    }

    /** ID参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String idrefId;

    /**
     * @return ID参照ID
     */
    public String getIdrefId() {
        return idrefId;
    }

    /**
     * @param p ID参照ID
     */
    public void setIdrefId(final String p) {
        this.idrefId = p;
    }

    /** ID参照名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String idrefMei;

    /**
     * @return ID参照名
     */
    public String getIdrefMei() {
        return idrefMei;
    }

    /**
     * @param p ID参照名
     */
    public void setIdrefMei(final String p) {
        this.idrefMei = p;
    }

    /** CD参照CD */
    @jakarta.validation.constraints.Pattern(regexp = "([\\-0-9A-Za-z]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String cdrefCd;

    /**
     * @return CD参照CD
     */
    public String getCdrefCd() {
        return cdrefCd;
    }

    /**
     * @param p CD参照CD
     */
    public void setCdrefCd(final String p) {
        this.cdrefCd = p;
    }

    /** CD参照名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String cdrefMei;

    /**
     * @return CD参照名
     */
    public String getCdrefMei() {
        return cdrefMei;
    }

    /**
     * @param p CD参照名
     */
    public void setCdrefMei(final String p) {
        this.cdrefMei = p;
    }

    /** NO参照NO */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String norefNo;

    /**
     * @return NO参照NO
     */
    public String getNorefNo() {
        return norefNo;
    }

    /**
     * @param p NO参照NO
     */
    public void setNorefNo(final String p) {
        this.norefNo = p;
    }

    /** NO参照名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String norefMei;

    /**
     * @return NO参照名
     */
    public String getNorefMei() {
        return norefMei;
    }

    /**
     * @param p NO参照名
     */
    public void setNorefMei(final String p) {
        this.norefMei = p;
    }

    /** 別ID参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String betsuIdrefId;

    /**
     * @return 別ID参照ID
     */
    public String getBetsuIdrefId() {
        return betsuIdrefId;
    }

    /**
     * @param p 別ID参照ID
     */
    public void setBetsuIdrefId(final String p) {
        this.betsuIdrefId = p;
    }

    /** IDBN連番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String idbnBn;

    /**
     * @return IDBN連番
     */
    public String getIdbnBn() {
        return idbnBn;
    }

    /**
     * @param p IDBN連番
     */
    public void setIdbnBn(final String p) {
        this.idbnBn = p;
    }

    /** IDBNNO */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String idbnNo;

    /**
     * @return IDBNNO
     */
    public String getIdbnNo() {
        return idbnNo;
    }

    /**
     * @param p IDBNNO
     */
    public void setIdbnNo(final String p) {
        this.idbnNo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
