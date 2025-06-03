package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 弟登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2YoungerRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2YoungerRegistForm.class);

    /** 兄弟ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String kyodaiId;

    /**
     * @return 兄弟ID
     */
    public String getKyodaiId() {
        return kyodaiId;
    }

    /**
     * @param p 兄弟ID
     */
    public void setKyodaiId(final String p) {
        this.kyodaiId = p;
    }

    /** 弟情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String youngerInfo;

    /**
     * @return 弟情報
     */
    public String getYoungerInfo() {
        return youngerInfo;
    }

    /**
     * @param p 弟情報
     */
    public void setYoungerInfo(final String p) {
        this.youngerInfo = p;
    }

    /** 末っ子 */
    @jakarta.validation.Valid
    private Tb2YoungestRegistForm tb2YoungestRegistForm;

    /**
     * @return Tb2YoungestRegistForm
     */
    public Tb2YoungestRegistForm getTb2YoungestRegistForm() {
        return tb2YoungestRegistForm;
    }

    /**
     * @param p
     */
    public void setTb2YoungestRegistForm(final Tb2YoungestRegistForm p) {
        this.tb2YoungestRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
