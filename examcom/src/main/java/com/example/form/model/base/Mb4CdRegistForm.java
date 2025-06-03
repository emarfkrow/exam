package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * CDマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4CdRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4CdRegistForm.class);

    /** 参照CD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([\\-0-9A-Za-z]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String cdrefCd;

    /**
     * @return 参照CD
     */
    public String getCdrefCd() {
        return cdrefCd;
    }

    /**
     * @param p 参照CD
     */
    public void setCdrefCd(final String p) {
        this.cdrefCd = p;
    }

    /** 参照CD名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String cdrefMei;

    /**
     * @return 参照CD名
     */
    public String getCdrefMei() {
        return cdrefMei;
    }

    /**
     * @param p 参照CD名
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
