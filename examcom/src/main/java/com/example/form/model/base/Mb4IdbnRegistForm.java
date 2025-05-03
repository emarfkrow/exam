package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * IDBN参照マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4IdbnRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4IdbnRegistForm.class);

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

    /** IDBN連番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String idbnBn;

    /**
     * @return IDBN連番
     */
    public String getIdbnBn() {
        return idbnBn;
    }

    /**
     * @param p IDBN連番
     */
    public void setIdbnBn(final String p) {
        this.idbnBn = p;
    }

    /** IDBNNO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String idbnNo;

    /**
     * @return IDBNNO
     */
    public String getIdbnNo() {
        return idbnNo;
    }

    /**
     * @param p IDBNNO
     */
    public void setIdbnNo(final String p) {
        this.idbnNo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
