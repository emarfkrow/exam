package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 里子２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Satogo2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Satogo2RegistForm.class);

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

    /** 里子２情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String satogo2Info;

    /**
     * @return 里子２情報
     */
    public String getSatogo2Info() {
        return satogo2Info;
    }

    /**
     * @param p 里子２情報
     */
    public void setSatogo2Info(final String p) {
        this.satogo2Info = p;
    }

    /** 里子３ */
    @jakarta.validation.Valid
    private Tb2Satogo3RegistForm tb2Satogo3RegistForm;

    /**
     * @return Tb2Satogo3RegistForm
     */
    public Tb2Satogo3RegistForm getTb2Satogo3RegistForm() {
        return tb2Satogo3RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Satogo3RegistForm(final Tb2Satogo3RegistForm p) {
        this.tb2Satogo3RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
