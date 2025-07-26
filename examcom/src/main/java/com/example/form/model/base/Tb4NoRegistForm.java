package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * NOマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4NoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4NoRegistForm.class);

    /** 参照NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,10})?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String norefNo;

    /**
     * @return 参照NO
     */
    public String getNorefNo() {
        return norefNo;
    }

    /**
     * @param p 参照NO
     */
    public void setNorefNo(final String p) {
        this.norefNo = p;
    }

    /** 参照NO名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String norefMei;

    /**
     * @return 参照NO名
     */
    public String getNorefMei() {
        return norefMei;
    }

    /**
     * @param p 参照NO名
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
