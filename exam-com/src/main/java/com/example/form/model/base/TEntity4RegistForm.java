package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ４登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity4RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity4RegistForm.class);

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

    /** エンティティ４名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String entity4Mei;

    /**
     * @return エンティティ４名
     */
    public String getEntity4Mei() {
        return entity4Mei;
    }

    /**
     * @param p エンティティ４名
     */
    public void setEntity4Mei(final String p) {
        this.entity4Mei = p;
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

    /** エンティティ１ */
    @jakarta.validation.Valid
    private TEntity1RegistForm tEntity1RegistForm;

    /**
     * @return TEntity1RegistForm
     */
    public TEntity1RegistForm getTEntity1RegistForm() {
        return tEntity1RegistForm;
    }

    /**
     * @param p
     */
    public void setTEntity1RegistForm(final TEntity1RegistForm p) {
        this.tEntity1RegistForm = p;
    }

    /** エンティティ３ */
    @jakarta.validation.Valid
    private TEntity3RegistForm tEntity3RegistForm;

    /**
     * @return TEntity3RegistForm
     */
    public TEntity3RegistForm getTEntity3RegistForm() {
        return tEntity3RegistForm;
    }

    /**
     * @param p
     */
    public void setTEntity3RegistForm(final TEntity3RegistForm p) {
        this.tEntity3RegistForm = p;
    }

    /** エンティティ５ */
    @jakarta.validation.Valid
    private TEntity5RegistForm tEntity5RegistForm;

    /**
     * @return TEntity5RegistForm
     */
    public TEntity5RegistForm getTEntity5RegistForm() {
        return tEntity5RegistForm;
    }

    /**
     * @param p
     */
    public void setTEntity5RegistForm(final TEntity5RegistForm p) {
        this.tEntity5RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
