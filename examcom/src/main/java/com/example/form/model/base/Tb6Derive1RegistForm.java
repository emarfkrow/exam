package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生１登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6Derive1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6Derive1RegistForm.class);

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

    /** 起源ID */
    @jakarta.validation.constraints.NotBlank
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

    /** 派生１明細 */
    @jakarta.validation.Valid
    private List<Tb6Derive1DetRegistForm> tb6Derive1DetGrid;

    /**
     * @return 派生１明細
     */
    public List<Tb6Derive1DetRegistForm> getTb6Derive1DetGrid() {
        return tb6Derive1DetGrid;
    }

    /**
     * @param p
     */
    public void setTb6Derive1DetGrid(final List<Tb6Derive1DetRegistForm> p) {
        this.tb6Derive1DetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
