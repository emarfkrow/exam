package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiDetRegistForm.class);

    /** 転生ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiId;

    /**
     * @return 転生ID
     */
    public String getTenseiId() {
        return tenseiId;
    }

    /**
     * @param p 転生ID
     */
    public void setTenseiId(final String p) {
        this.tenseiId = p;
    }

    /** 転生枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiBn;

    /**
     * @return 転生枝番
     */
    public String getTenseiBn() {
        return tenseiBn;
    }

    /**
     * @param p 転生枝番
     */
    public void setTenseiBn(final String p) {
        this.tenseiBn = p;
    }

    /** 転生明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseiDetInfo;

    /**
     * @return 転生明細情報
     */
    public String getTenseiDetInfo() {
        return tenseiDetInfo;
    }

    /**
     * @param p 転生明細情報
     */
    public void setTenseiDetInfo(final String p) {
        this.tenseiDetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
