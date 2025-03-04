package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止元１登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuYokushiMoto1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7ShuyakuYokushiMoto1RegistForm.class);

    /** 集約抑止元１ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakuYokushiMoto1Id;

    /**
     * @return 集約抑止元１ID
     */
    public String getShuyakuYokushiMoto1Id() {
        return shuyakuYokushiMoto1Id;
    }

    /**
     * @param p 集約抑止元１ID
     */
    public void setShuyakuYokushiMoto1Id(final String p) {
        this.shuyakuYokushiMoto1Id = p;
    }

    /** 転生抑止ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakuYokushiId;

    /**
     * @return 転生抑止ID
     */
    public String getShuyakuYokushiId() {
        return shuyakuYokushiId;
    }

    /**
     * @param p 転生抑止ID
     */
    public void setShuyakuYokushiId(final String p) {
        this.shuyakuYokushiId = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
