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
    private String nosanshoNo;

    /**
     * @return NO参照NO
     */
    public String getNosanshoNo() {
        return nosanshoNo;
    }

    /**
     * @param p NO参照NO
     */
    public void setNosanshoNo(final String p) {
        this.nosanshoNo = p;
    }

    /** NO参照名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String nosanshoMei;

    /**
     * @return NO参照名
     */
    public String getNosanshoMei() {
        return nosanshoMei;
    }

    /**
     * @param p NO参照名
     */
    public void setNosanshoMei(final String p) {
        this.nosanshoMei = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
