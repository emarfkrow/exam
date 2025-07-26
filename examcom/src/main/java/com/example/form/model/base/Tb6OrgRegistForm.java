package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 起源登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6OrgRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6OrgRegistForm.class);

    /** 起源ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
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

    /** 起源情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String orgInfo;

    /**
     * @return 起源情報
     */
    public String getOrgInfo() {
        return orgInfo;
    }

    /**
     * @param p 起源情報
     */
    public void setOrgInfo(final String p) {
        this.orgInfo = p;
    }

    /** 起源明細 */
    @jakarta.validation.Valid
    private List<Tb6OrgDetRegistForm> tb6OrgDetGrid;

    /**
     * @return 起源明細
     */
    public List<Tb6OrgDetRegistForm> getTb6OrgDetGrid() {
        return tb6OrgDetGrid;
    }

    /**
     * @param p
     */
    public void setTb6OrgDetGrid(final List<Tb6OrgDetRegistForm> p) {
        this.tb6OrgDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
