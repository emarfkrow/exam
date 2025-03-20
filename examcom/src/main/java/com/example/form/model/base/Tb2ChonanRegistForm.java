package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 長男登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2ChonanRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2ChonanRegistForm.class);

    /** 長男ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String chonanId;

    /**
     * @return 長男ID
     */
    public String getChonanId() {
        return chonanId;
    }

    /**
     * @param p 長男ID
     */
    public void setChonanId(final String p) {
        this.chonanId = p;
    }

    /** 長男情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String chonanInfo;

    /**
     * @return 長男情報
     */
    public String getChonanInfo() {
        return chonanInfo;
    }

    /**
     * @param p 長男情報
     */
    public void setChonanInfo(final String p) {
        this.chonanInfo = p;
    }

    /** 長男２ */
    @jakarta.validation.Valid
    private Tb2Chonan2RegistForm tb2Chonan2RegistForm;

    /**
     * @return Tb2Chonan2RegistForm
     */
    public Tb2Chonan2RegistForm getTb2Chonan2RegistForm() {
        return tb2Chonan2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Chonan2RegistForm(final Tb2Chonan2RegistForm p) {
        this.tb2Chonan2RegistForm = p;
    }

    /** 長男３ */
    @jakarta.validation.Valid
    private Tb2Chonan3RegistForm tb2Chonan3RegistForm;

    /**
     * @return Tb2Chonan3RegistForm
     */
    public Tb2Chonan3RegistForm getTb2Chonan3RegistForm() {
        return tb2Chonan3RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Chonan3RegistForm(final Tb2Chonan3RegistForm p) {
        this.tb2Chonan3RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
