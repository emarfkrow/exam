package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孤児登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2KojiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2KojiRegistForm.class);

    /** 孤児ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String kojiId;

    /**
     * @return 孤児ID
     */
    public String getKojiId() {
        return kojiId;
    }

    /**
     * @param p 孤児ID
     */
    public void setKojiId(final String p) {
        this.kojiId = p;
    }

    /** 孤児情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String kojiInfo;

    /**
     * @return 孤児情報
     */
    public String getKojiInfo() {
        return kojiInfo;
    }

    /**
     * @param p 孤児情報
     */
    public void setKojiInfo(final String p) {
        this.kojiInfo = p;
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

    /** 孤児２ */
    @jakarta.validation.Valid
    private Tb2Koji2RegistForm tb2Koji2RegistForm;

    /**
     * @return Tb2Koji2RegistForm
     */
    public Tb2Koji2RegistForm getTb2Koji2RegistForm() {
        return tb2Koji2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Koji2RegistForm(final Tb2Koji2RegistForm p) {
        this.tb2Koji2RegistForm = p;
    }

    /** 孤児３ */
    @jakarta.validation.Valid
    private Tb2Koji3RegistForm tb2Koji3RegistForm;

    /**
     * @return Tb2Koji3RegistForm
     */
    public Tb2Koji3RegistForm getTb2Koji3RegistForm() {
        return tb2Koji3RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Koji3RegistForm(final Tb2Koji3RegistForm p) {
        this.tb2Koji3RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
