package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生抑止先１登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiSaki1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiYokushiSaki1RegistForm.class);

    /** 転生抑止先１ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiYokushiSaki1Id;

    /**
     * @return 転生抑止先１ID
     */
    public String getTenseiYokushiSaki1Id() {
        return tenseiYokushiSaki1Id;
    }

    /**
     * @param p 転生抑止先１ID
     */
    public void setTenseiYokushiSaki1Id(final String p) {
        this.tenseiYokushiSaki1Id = p;
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
