package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiDetRegistForm.class);

    /** 派生ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiId;

    /**
     * @return 派生ID
     */
    public String getHaseiId() {
        return haseiId;
    }

    /**
     * @param p 派生ID
     */
    public void setHaseiId(final String p) {
        this.haseiId = p;
    }

    /** 派生枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiBn;

    /**
     * @return 派生枝番
     */
    public String getHaseiBn() {
        return haseiBn;
    }

    /**
     * @param p 派生枝番
     */
    public void setHaseiBn(final String p) {
        this.haseiBn = p;
    }

    /** 派生明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String haseiDetInfo;

    /**
     * @return 派生明細情報
     */
    public String getHaseiDetInfo() {
        return haseiDetInfo;
    }

    /**
     * @param p 派生明細情報
     */
    public void setHaseiDetInfo(final String p) {
        this.haseiDetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
