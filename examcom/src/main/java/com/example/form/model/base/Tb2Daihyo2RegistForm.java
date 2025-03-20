package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 代表２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Daihyo2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Daihyo2RegistForm.class);

    /** 代表ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
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

    /** 代表２情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String daihyo2Info;

    /**
     * @return 代表２情報
     */
    public String getDaihyo2Info() {
        return daihyo2Info;
    }

    /**
     * @param p 代表２情報
     */
    public void setDaihyo2Info(final String p) {
        this.daihyo2Info = p;
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
