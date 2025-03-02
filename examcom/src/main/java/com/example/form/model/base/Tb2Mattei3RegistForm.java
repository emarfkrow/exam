package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 末弟３登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Mattei3RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Mattei3RegistForm.class);

    /** 末弟ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String matteiId;

    /**
     * @return 末弟ID
     */
    public String getMatteiId() {
        return matteiId;
    }

    /**
     * @param p 末弟ID
     */
    public void setMatteiId(final String p) {
        this.matteiId = p;
    }

    /** 末弟３情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String mattei3Info;

    /**
     * @return 末弟３情報
     */
    public String getMattei3Info() {
        return mattei3Info;
    }

    /**
     * @param p 末弟３情報
     */
    public void setMattei3Info(final String p) {
        this.mattei3Info = p;
    }

    /** 末弟 */
    @jakarta.validation.Valid
    private Tb2MatteiRegistForm tb2MatteiRegistForm;

    /**
     * @return Tb2MatteiRegistForm
     */
    public Tb2MatteiRegistForm getTb2MatteiRegistForm() {
        return tb2MatteiRegistForm;
    }

    /**
     * @param p
     */
    public void setTb2MatteiRegistForm(final Tb2MatteiRegistForm p) {
        this.tb2MatteiRegistForm = p;
    }

    /** 末弟２ */
    @jakarta.validation.Valid
    private Tb2Mattei2RegistForm tb2Mattei2RegistForm;

    /**
     * @return Tb2Mattei2RegistForm
     */
    public Tb2Mattei2RegistForm getTb2Mattei2RegistForm() {
        return tb2Mattei2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Mattei2RegistForm(final Tb2Mattei2RegistForm p) {
        this.tb2Mattei2RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
