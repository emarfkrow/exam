package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 再帰登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4SaikiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4SaikiRegistForm.class);

    /** 再帰ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String saikiId;

    /**
     * @return 再帰ID
     */
    public String getSaikiId() {
        return saikiId;
    }

    /**
     * @param p 再帰ID
     */
    public void setSaikiId(final String p) {
        this.saikiId = p;
    }

    /** 再帰名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String saikiMei;

    /**
     * @return 再帰名
     */
    public String getSaikiMei() {
        return saikiMei;
    }

    /**
     * @param p 再帰名
     */
    public void setSaikiMei(final String p) {
        this.saikiMei = p;
    }

    /** 参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String idrefId;

    /**
     * @return 参照ID
     */
    public String getIdrefId() {
        return idrefId;
    }

    /**
     * @param p 参照ID
     */
    public void setIdrefId(final String p) {
        this.idrefId = p;
    }

    /** 参照CD */
    @jakarta.validation.constraints.Pattern(regexp = "([\\-0-9A-Za-z]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String cdrefCd;

    /**
     * @return 参照CD
     */
    public String getCdrefCd() {
        return cdrefCd;
    }

    /**
     * @param p 参照CD
     */
    public void setCdrefCd(final String p) {
        this.cdrefCd = p;
    }

    /** 参照NO */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String norefNo;

    /**
     * @return 参照NO
     */
    public String getNorefNo() {
        return norefNo;
    }

    /**
     * @param p 参照NO
     */
    public void setNorefNo(final String p) {
        this.norefNo = p;
    }

    /** 別参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String betsuIdrefId;

    /**
     * @return 別参照ID
     */
    public String getBetsuIdrefId() {
        return betsuIdrefId;
    }

    /**
     * @param p 別参照ID
     */
    public void setBetsuIdrefId(final String p) {
        this.betsuIdrefId = p;
    }

    /** ID連番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String refBn;

    /**
     * @return ID連番
     */
    public String getRefBn() {
        return refBn;
    }

    /**
     * @param p ID連番
     */
    public void setRefBn(final String p) {
        this.refBn = p;
    }

    /** 親再帰ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaSaikiId;

    /**
     * @return 親再帰ID
     */
    public String getOyaSaikiId() {
        return oyaSaikiId;
    }

    /**
     * @param p 親再帰ID
     */
    public void setOyaSaikiId(final String p) {
        this.oyaSaikiId = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");

        // 参照ID のマスタチェック
        baseProcess.masterCheck(errors, "Tb4IdSearch", "idrefId", this.getIdrefId(), jp.co.golorp.emarf.util.Messages.get("Tb4Saiki.idrefId"));

        // 参照CD のマスタチェック
        baseProcess.masterCheck(errors, "Tb4CdSearch", "cdrefCd", this.getCdrefCd(), jp.co.golorp.emarf.util.Messages.get("Tb4Saiki.cdrefCd"));

        // 参照NO のマスタチェック
        baseProcess.masterCheck(errors, "Tb4NoSearch", "norefNo", this.getNorefNo(), jp.co.golorp.emarf.util.Messages.get("Tb4Saiki.norefNo"));

        // 別参照ID のマスタチェック
        baseProcess.masterCheck(errors, "Tb4IdSearch", "idrefId", this.getBetsuIdrefId(), jp.co.golorp.emarf.util.Messages.get("Tb4Saiki.betsuIdrefId"));

        // 親再帰ID のマスタチェック
        baseProcess.masterCheck(errors, "Tb4SaikiSearch", "saikiId", this.getOyaSaikiId(), jp.co.golorp.emarf.util.Messages.get("Tb4Saiki.oyaSaikiId"));
    }

}
