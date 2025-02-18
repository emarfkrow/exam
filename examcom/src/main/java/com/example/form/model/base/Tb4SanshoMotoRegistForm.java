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
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sanshoMotoId;

    /**
     * @return 参照元ID
     */
    public String getSanshoMotoId() {
        return sanshoMotoId;
    }

    /**
     * @param p 参照元ID
     */
    public void setSanshoMotoId(final String p) {
        this.sanshoMotoId = p;
    }

    /** ID参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String idsanshoId;

    /**
     * @return ID参照ID
     */
    public String getIdsanshoId() {
        return idsanshoId;
    }

    /**
     * @param p ID参照ID
     */
    public void setIdsanshoId(final String p) {
        this.idsanshoId = p;
    }

    /** ID参照名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String idsanshoMei;

    /**
     * @return ID参照名
     */
    public String getIdsanshoMei() {
        return idsanshoMei;
    }

    /**
     * @param p ID参照名
     */
    public void setIdsanshoMei(final String p) {
        this.idsanshoMei = p;
    }

    /** CD参照CD */
    @jakarta.validation.constraints.Pattern(regexp = "([\\-0-9A-Za-z]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String cdsanshoCd;

    /**
     * @return CD参照CD
     */
    public String getCdsanshoCd() {
        return cdsanshoCd;
    }

    /**
     * @param p CD参照CD
     */
    public void setCdsanshoCd(final String p) {
        this.cdsanshoCd = p;
    }

    /** CD参照名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String cdsanshoMei;

    /**
     * @return CD参照名
     */
    public String getCdsanshoMei() {
        return cdsanshoMei;
    }

    /**
     * @param p CD参照名
     */
    public void setCdsanshoMei(final String p) {
        this.cdsanshoMei = p;
    }

    /** NO参照NO */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String nosanshoNo;

    /**
     * @return NO参照NO
     */
    public String getNosanshoNo() {
        return nosanshoNo;
    }

    /**
     * @param p NO参照NO
     */
    public void setNosanshoNo(final String p) {
        this.nosanshoNo = p;
    }

    /** NO参照名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String nosanshoMei;

    /**
     * @return NO参照名
     */
    public String getNosanshoMei() {
        return nosanshoMei;
    }

    /**
     * @param p NO参照名
     */
    public void setNosanshoMei(final String p) {
        this.nosanshoMei = p;
    }

    /** 別ID参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String betsuIdsanshoId;

    /**
     * @return 別ID参照ID
     */
    public String getBetsuIdsanshoId() {
        return betsuIdsanshoId;
    }

    /**
     * @param p 別ID参照ID
     */
    public void setBetsuIdsanshoId(final String p) {
        this.betsuIdsanshoId = p;
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

    /** ステータス区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String statusKb;

    /**
     * @return ステータス区分
     */
    public String getStatusKb() {
        return statusKb;
    }

    /**
     * @param p ステータス区分
     */
    public void setStatusKb(final String p) {
        this.statusKb = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
