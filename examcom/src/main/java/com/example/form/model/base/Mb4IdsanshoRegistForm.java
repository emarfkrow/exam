package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ID参照マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4IdsanshoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4IdsanshoRegistForm.class);

    /** ID参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String idrefId;

    /**
     * @return ID参照ID
     */
    public String getIdrefId() {
        return idrefId;
    }

    /**
     * @param p ID参照ID
     */
    public void setIdrefId(final String p) {
        this.idrefId = p;
    }

    /** ID参照名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String idrefMei;

    /**
     * @return ID参照名
     */
    public String getIdrefMei() {
        return idrefMei;
    }

    /**
     * @param p ID参照名
     */
    public void setIdrefMei(final String p) {
        this.idrefMei = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
