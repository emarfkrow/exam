package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 代表登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2DaihyoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2DaihyoRegistForm.class);

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

    /** 代表情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String daihyoInfo;

    /**
     * @return 代表情報
     */
    public String getDaihyoInfo() {
        return daihyoInfo;
    }

    /**
     * @param p 代表情報
     */
    public void setDaihyoInfo(final String p) {
        this.daihyoInfo = p;
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

    /** 代表３ */
    @jakarta.validation.Valid
    private Tb2Daihyo3RegistForm tb2Daihyo3RegistForm;

    /**
     * @return Tb2Daihyo3RegistForm
     */
    public Tb2Daihyo3RegistForm getTb2Daihyo3RegistForm() {
        return tb2Daihyo3RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Daihyo3RegistForm(final Tb2Daihyo3RegistForm p) {
        this.tb2Daihyo3RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
