package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止元２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuYokushiMoto2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7ShuyakuYokushiMoto2RegistForm.class);

    /** 集約抑止元２ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakuYokushiMoto2Id;

    /**
     * @return 集約抑止元２ID
     */
    public String getShuyakuYokushiMoto2Id() {
        return shuyakuYokushiMoto2Id;
    }

    /**
     * @param p 集約抑止元２ID
     */
    public void setShuyakuYokushiMoto2Id(final String p) {
        this.shuyakuYokushiMoto2Id = p;
    }

    /** 集約抑止ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakuYokushiId;

    /**
     * @return 集約抑止ID
     */
    public String getShuyakuYokushiId() {
        return shuyakuYokushiId;
    }

    /**
     * @param p 集約抑止ID
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
