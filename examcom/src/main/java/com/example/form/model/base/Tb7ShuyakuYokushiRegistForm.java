package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuYokushiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7ShuyakuYokushiRegistForm.class);

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

    /** 集約抑止情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String shuyakuYokushiInfo;

    /**
     * @return 集約抑止情報
     */
    public String getShuyakuYokushiInfo() {
        return shuyakuYokushiInfo;
    }

    /**
     * @param p 集約抑止情報
     */
    public void setShuyakuYokushiInfo(final String p) {
        this.shuyakuYokushiInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
