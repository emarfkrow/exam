package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生１明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6Derive1DetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6Derive1DetRegistForm.class);

    /** 派生１ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String derive1Id;

    /**
     * @return 派生１ID
     */
    public String getDerive1Id() {
        return derive1Id;
    }

    /**
     * @param p 派生１ID
     */
    public void setDerive1Id(final String p) {
        this.derive1Id = p;
    }

    /** 派生１枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String derive1Bn;

    /**
     * @return 派生１枝番
     */
    public String getDerive1Bn() {
        return derive1Bn;
    }

    /**
     * @param p 派生１枝番
     */
    public void setDerive1Bn(final String p) {
        this.derive1Bn = p;
    }

    /** 起源明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String orgDetInfo;

    /**
     * @return 起源明細情報
     */
    public String getOrgDetInfo() {
        return orgDetInfo;
    }

    /**
     * @param p 起源明細情報
     */
    public void setOrgDetInfo(final String p) {
        this.orgDetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
