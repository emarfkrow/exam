package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 里子登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2SatogoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2SatogoRegistForm.class);

    /** 里子ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String satogoId;

    /**
     * @return 里子ID
     */
    public String getSatogoId() {
        return satogoId;
    }

    /**
     * @param p 里子ID
     */
    public void setSatogoId(final String p) {
        this.satogoId = p;
    }

    /** 里子情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String satogoInfo;

    /**
     * @return 里子情報
     */
    public String getSatogoInfo() {
        return satogoInfo;
    }

    /**
     * @param p 里子情報
     */
    public void setSatogoInfo(final String p) {
        this.satogoInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
