package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生抑止先２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiSaki2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiYokushiSaki2RegistForm.class);

    /** 転生抑止先２ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiYokushiSaki2Id;

    /**
     * @return 転生抑止先２ID
     */
    public String getTenseiYokushiSaki2Id() {
        return tenseiYokushiSaki2Id;
    }

    /**
     * @param p 転生抑止先２ID
     */
    public void setTenseiYokushiSaki2Id(final String p) {
        this.tenseiYokushiSaki2Id = p;
    }

    /** 転生抑止ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiYokushiId;

    /**
     * @return 転生抑止ID
     */
    public String getTenseiYokushiId() {
        return tenseiYokushiId;
    }

    /**
     * @param p 転生抑止ID
     */
    public void setTenseiYokushiId(final String p) {
        this.tenseiYokushiId = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
