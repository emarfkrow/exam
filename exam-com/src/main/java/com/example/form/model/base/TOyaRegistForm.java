package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 親登録フォーム
 *
 * @author emarfkrow
 */
public class TOyaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TOyaRegistForm.class);

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

    /** 親名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String oyaMei;

    /**
     * @return 親名
     */
    public String getOyaMei() {
        return oyaMei;
    }

    /**
     * @param p 親名
     */
    public void setOyaMei(final String p) {
        this.oyaMei = p;
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
    private List<TEntity1RegistForm> tEntity1Grid;

    /**
     * @return エンティティ１
     */
    public List<TEntity1RegistForm> getTEntity1Grid() {
        return tEntity1Grid;
    }

    /**
     * @param p
     */
    public void setTEntity1Grid(final List<TEntity1RegistForm> p) {
        this.tEntity1Grid = p;
    }

    /** エンティティ２ */
    @jakarta.validation.Valid
    private List<TEntity2RegistForm> tEntity2Grid;

    /**
     * @return エンティティ２
     */
    public List<TEntity2RegistForm> getTEntity2Grid() {
        return tEntity2Grid;
    }

    /**
     * @param p
     */
    public void setTEntity2Grid(final List<TEntity2RegistForm> p) {
        this.tEntity2Grid = p;
    }

    /** エンティティ３ */
    @jakarta.validation.Valid
    private List<TEntity3RegistForm> tEntity3Grid;

    /**
     * @return エンティティ３
     */
    public List<TEntity3RegistForm> getTEntity3Grid() {
        return tEntity3Grid;
    }

    /**
     * @param p
     */
    public void setTEntity3Grid(final List<TEntity3RegistForm> p) {
        this.tEntity3Grid = p;
    }

    /** エンティティ４ */
    @jakarta.validation.Valid
    private List<TEntity4RegistForm> tEntity4Grid;

    /**
     * @return エンティティ４
     */
    public List<TEntity4RegistForm> getTEntity4Grid() {
        return tEntity4Grid;
    }

    /**
     * @param p
     */
    public void setTEntity4Grid(final List<TEntity4RegistForm> p) {
        this.tEntity4Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
