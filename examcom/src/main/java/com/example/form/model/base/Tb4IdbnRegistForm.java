package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ID-BNマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4IdbnRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4IdbnRegistForm.class);

    /** 参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String refId;

    /**
     * @return 参照ID
     */
    public String getRefId() {
        return refId;
    }

    /**
     * @param p 参照ID
     */
    public void setRefId(final String p) {
        this.refId = p;
    }

    /** ID連番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String refBn;

    /**
     * @return ID連番
     */
    public String getRefBn() {
        return refBn;
    }

    /**
     * @param p ID連番
     */
    public void setRefBn(final String p) {
        this.refBn = p;
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
