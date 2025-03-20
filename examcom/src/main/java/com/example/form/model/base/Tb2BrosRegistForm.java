package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2BrosRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2BrosRegistForm.class);

    /** 兄弟ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
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

    /** 兄弟情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String brosInfo;

    /**
     * @return 兄弟情報
     */
    public String getBrosInfo() {
        return brosInfo;
    }

    /**
     * @param p 兄弟情報
     */
    public void setBrosInfo(final String p) {
        this.brosInfo = p;
    }

    /** 兄弟２ */
    @jakarta.validation.Valid
    private Tb2Bros2RegistForm tb2Bros2RegistForm;

    /**
     * @return Tb2Bros2RegistForm
     */
    public Tb2Bros2RegistForm getTb2Bros2RegistForm() {
        return tb2Bros2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Bros2RegistForm(final Tb2Bros2RegistForm p) {
        this.tb2Bros2RegistForm = p;
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
