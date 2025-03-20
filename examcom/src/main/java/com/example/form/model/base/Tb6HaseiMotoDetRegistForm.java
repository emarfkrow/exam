package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生元明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiMotoDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiMotoDetRegistForm.class);

    /** 派生元ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiMotoId;

    /**
     * @return 派生元ID
     */
    public String getHaseiMotoId() {
        return haseiMotoId;
    }

    /**
     * @param p 派生元ID
     */
    public void setHaseiMotoId(final String p) {
        this.haseiMotoId = p;
    }

    /** 派生元枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiMotoBn;

    /**
     * @return 派生元枝番
     */
    public String getHaseiMotoBn() {
        return haseiMotoBn;
    }

    /**
     * @param p 派生元枝番
     */
    public void setHaseiMotoBn(final String p) {
        this.haseiMotoBn = p;
    }

    /** 派生元明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String haseiMotoDetInfo;

    /**
     * @return 派生元明細情報
     */
    public String getHaseiMotoDetInfo() {
        return haseiMotoDetInfo;
    }

    /**
     * @param p 派生元明細情報
     */
    public void setHaseiMotoDetInfo(final String p) {
        this.haseiMotoDetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
