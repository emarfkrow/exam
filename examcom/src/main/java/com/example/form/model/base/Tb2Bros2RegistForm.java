package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Bros2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Bros2RegistForm.class);

    /** 兄弟ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String brosId;

    /**
     * @return 兄弟ID
     */
    public String getBrosId() {
        return brosId;
    }

    /**
     * @param p 兄弟ID
     */
    public void setBrosId(final String p) {
        this.brosId = p;
    }

    /** 兄弟２情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String bros2Info;

    /**
     * @return 兄弟２情報
     */
    public String getBros2Info() {
        return bros2Info;
    }

    /**
     * @param p 兄弟２情報
     */
    public void setBros2Info(final String p) {
        this.bros2Info = p;
    }

    /** 兄弟 */
    @jakarta.validation.Valid
    private Tb2BrosRegistForm tb2BrosRegistForm;

    /**
     * @return Tb2BrosRegistForm
     */
    public Tb2BrosRegistForm getTb2BrosRegistForm() {
        return tb2BrosRegistForm;
    }

    /**
     * @param p
     */
    public void setTb2BrosRegistForm(final Tb2BrosRegistForm p) {
        this.tb2BrosRegistForm = p;
    }

    /** 兄弟３ */
    @jakarta.validation.Valid
    private Tb2Bros3RegistForm tb2Bros3RegistForm;

    /**
     * @return Tb2Bros3RegistForm
     */
    public Tb2Bros3RegistForm getTb2Bros3RegistForm() {
        return tb2Bros3RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Bros3RegistForm(final Tb2Bros3RegistForm p) {
        this.tb2Bros3RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
