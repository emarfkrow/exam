package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 末弟登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2MatteiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2MatteiRegistForm.class);

    /** 末弟ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String matteiId;

    /**
     * @return 末弟ID
     */
    public String getMatteiId() {
        return matteiId;
    }

    /**
     * @param p 末弟ID
     */
    public void setMatteiId(final String p) {
        this.matteiId = p;
    }

    /** 末弟情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String matteiInfo;

    /**
     * @return 末弟情報
     */
    public String getMatteiInfo() {
        return matteiInfo;
    }

    /**
     * @param p 末弟情報
     */
    public void setMatteiInfo(final String p) {
        this.matteiInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
