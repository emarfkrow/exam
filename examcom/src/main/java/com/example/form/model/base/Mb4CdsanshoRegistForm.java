package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * CD参照マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4CdsanshoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4CdsanshoRegistForm.class);

    /** CD参照CD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([\\-0-9A-Za-z]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String cdrefCd;

    /**
     * @return CD参照CD
     */
    public String getCdrefCd() {
        return cdrefCd;
    }

    /**
     * @param p CD参照CD
     */
    public void setCdrefCd(final String p) {
        this.cdrefCd = p;
    }

    /** CD参照名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String cdrefMei;

    /**
     * @return CD参照名
     */
    public String getCdrefMei() {
        return cdrefMei;
    }

    /**
     * @param p CD参照名
     */
    public void setCdrefMei(final String p) {
        this.cdrefMei = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
