package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 従妹登録フォーム
 *
 * @author emarfkrow
 */
public class TItokoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TItokoRegistForm.class);

    /** 従妹ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String itokoId;

    /**
     * @return 従妹ID
     */
    public String getItokoId() {
        return itokoId;
    }

    /**
     * @param p 従妹ID
     */
    public void setItokoId(final String p) {
        this.itokoId = p;
    }

    /** 従妹名 */
    @jakarta.validation.constraints.Size(max = 120)
    private String itokoMei;

    /**
     * @return 従妹名
     */
    public String getItokoMei() {
        return itokoMei;
    }

    /**
     * @param p 従妹名
     */
    public void setItokoMei(final String p) {
        this.itokoMei = p;
    }

    /** 祖先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sosenId;

    /**
     * @return 祖先ID
     */
    public String getSosenId() {
        return sosenId;
    }

    /**
     * @param p 祖先ID
     */
    public void setSosenId(final String p) {
        this.sosenId = p;
    }

    /** 親枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaBn;

    /**
     * @return 親枝番
     */
    public String getOyaBn() {
        return oyaBn;
    }

    /**
     * @param p 親枝番
     */
    public void setOyaBn(final String p) {
        this.oyaBn = p;
    }

    /** エンティティ枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String entityBn;

    /**
     * @return エンティティ枝番
     */
    public String getEntityBn() {
        return entityBn;
    }

    /**
     * @param p エンティティ枝番
     */
    public void setEntityBn(final String p) {
        this.entityBn = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
