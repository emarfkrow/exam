package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 長男２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Chonan2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Chonan2RegistForm.class);

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

    /** 長男２情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String chonan2Info;

    /**
     * @return 長男２情報
     */
    public String getChonan2Info() {
        return chonan2Info;
    }

    /**
     * @param p 長男２情報
     */
    public void setChonan2Info(final String p) {
        this.chonan2Info = p;
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
