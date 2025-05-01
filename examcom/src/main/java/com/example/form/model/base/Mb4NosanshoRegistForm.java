package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * NO参照マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4NosanshoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4NosanshoRegistForm.class);

    /** NO参照NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String norefNo;

    /**
     * @return NO参照NO
     */
    public String getNorefNo() {
        return norefNo;
    }

    /**
     * @param p NO参照NO
     */
    public void setNorefNo(final String p) {
        this.norefNo = p;
    }

    /** NO参照名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String norefMei;

    /**
     * @return NO参照名
     */
    public String getNorefMei() {
        return norefMei;
    }

    /**
     * @param p NO参照名
     */
    public void setNorefMei(final String p) {
        this.norefMei = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
