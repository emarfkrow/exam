package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 代表３登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Daihyo3RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Daihyo3RegistForm.class);

    /** 代表ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String daihyoId;

    /**
     * @return 代表ID
     */
    public String getDaihyoId() {
        return daihyoId;
    }

    /**
     * @param p 代表ID
     */
    public void setDaihyoId(final String p) {
        this.daihyoId = p;
    }

    /** 代表３情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String daihyo3Info;

    /**
     * @return 代表３情報
     */
    public String getDaihyo3Info() {
        return daihyo3Info;
    }

    /**
     * @param p 代表３情報
     */
    public void setDaihyo3Info(final String p) {
        this.daihyo3Info = p;
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

    /** 代表 */
    @jakarta.validation.Valid
    private Tb2DaihyoRegistForm tb2DaihyoRegistForm;

    /**
     * @return Tb2DaihyoRegistForm
     */
    public Tb2DaihyoRegistForm getTb2DaihyoRegistForm() {
        return tb2DaihyoRegistForm;
    }

    /**
     * @param p
     */
    public void setTb2DaihyoRegistForm(final Tb2DaihyoRegistForm p) {
        this.tb2DaihyoRegistForm = p;
    }

    /** 代表２ */
    @jakarta.validation.Valid
    private Tb2Daihyo2RegistForm tb2Daihyo2RegistForm;

    /**
     * @return Tb2Daihyo2RegistForm
     */
    public Tb2Daihyo2RegistForm getTb2Daihyo2RegistForm() {
        return tb2Daihyo2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Daihyo2RegistForm(final Tb2Daihyo2RegistForm p) {
        this.tb2Daihyo2RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
