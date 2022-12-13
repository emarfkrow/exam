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

    /** 親連番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaSn;

    /**
     * @return 親連番
     */
    public String getOyaSn() {
        return oyaSn;
    }

    /**
     * @param p 親連番
     */
    public void setOyaSn(final String p) {
        this.oyaSn = p;
    }

    /** 親名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
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

    /** エンティティ */
    @jakarta.validation.Valid
    private List<TEntityRegistForm> tEntityGrid;

    /**
     * @return エンティティ
     */
    public List<TEntityRegistForm> getTEntityGrid() {
        return tEntityGrid;
    }

    /**
     * @param p
     */
    public void setTEntityGrid(final List<TEntityRegistForm> p) {
        this.tEntityGrid = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
