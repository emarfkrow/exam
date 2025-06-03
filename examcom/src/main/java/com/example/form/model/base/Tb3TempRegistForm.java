package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 当初登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3TempRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3TempRegistForm.class);

    /** 当初ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tempId;

    /**
     * @return 当初ID
     */
    public String getTempId() {
        return tempId;
    }

    /**
     * @param p 当初ID
     */
    public void setTempId(final String p) {
        this.tempId = p;
    }

    /** 当初情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tempInfo;

    /**
     * @return 当初情報
     */
    public String getTempInfo() {
        return tempInfo;
    }

    /**
     * @param p 当初情報
     */
    public void setTempInfo(final String p) {
        this.tempInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
