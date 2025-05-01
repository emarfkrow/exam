package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 里子３登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Satogo3RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Satogo3RegistForm.class);

    /** 里子ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String satogoId;

    /**
     * @return 里子ID
     */
    public String getSatogoId() {
        return satogoId;
    }

    /**
     * @param p 里子ID
     */
    public void setSatogoId(final String p) {
        this.satogoId = p;
    }

    /** 里子３情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String satogo3Info;

    /**
     * @return 里子３情報
     */
    public String getSatogo3Info() {
        return satogo3Info;
    }

    /**
     * @param p 里子３情報
     */
    public void setSatogo3Info(final String p) {
        this.satogo3Info = p;
    }

    /** 里子２ */
    @jakarta.validation.Valid
    private Tb2Satogo2RegistForm tb2Satogo2RegistForm;

    /**
     * @return Tb2Satogo2RegistForm
     */
    public Tb2Satogo2RegistForm getTb2Satogo2RegistForm() {
        return tb2Satogo2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Satogo2RegistForm(final Tb2Satogo2RegistForm p) {
        this.tb2Satogo2RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
