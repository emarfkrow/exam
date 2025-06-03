package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 起源明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6OrgDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6OrgDetRegistForm.class);

    /** 起源ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String orgId;

    /**
     * @return 起源ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param p 起源ID
     */
    public void setOrgId(final String p) {
        this.orgId = p;
    }

    /** 起源明細枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String orgBn;

    /**
     * @return 起源明細枝番
     */
    public String getOrgBn() {
        return orgBn;
    }

    /**
     * @param p 起源明細枝番
     */
    public void setOrgBn(final String p) {
        this.orgBn = p;
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
