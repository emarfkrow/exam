package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 単位２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7Unit2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7Unit2RegistForm.class);

    /** 単位２ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String unit2Id;

    /**
     * @return 単位２ID
     */
    public String getUnit2Id() {
        return unit2Id;
    }

    /**
     * @param p 単位２ID
     */
    public void setUnit2Id(final String p) {
        this.unit2Id = p;
    }

    /** 集約抑止ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sum2Id;

    /**
     * @return 集約抑止ID
     */
    public String getSum2Id() {
        return sum2Id;
    }

    /**
     * @param p 集約抑止ID
     */
    public void setSum2Id(final String p) {
        this.sum2Id = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
