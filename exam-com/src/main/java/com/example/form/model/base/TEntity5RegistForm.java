package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ５登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity5RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity5RegistForm.class);

    /** 祖先ID */
    @jakarta.validation.constraints.NotBlank
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
    @jakarta.validation.constraints.NotBlank
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

    /** エンティティ５名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String entity5Mei;

    /**
     * @return エンティティ５名
     */
    public String getEntity5Mei() {
        return entity5Mei;
    }

    /**
     * @param p エンティティ５名
     */
    public void setEntity5Mei(final String p) {
        this.entity5Mei = p;
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

    /** 子 */
    @jakarta.validation.Valid
    private List<TKoRegistForm> tKoGrid;

    /**
     * @return 子
     */
    public List<TKoRegistForm> getTKoGrid() {
        return tKoGrid;
    }

    /**
     * @param p
     */
    public void setTKoGrid(final List<TKoRegistForm> p) {
        this.tKoGrid = p;
    }

    /** 添付ファイル */
    @jakarta.validation.Valid
    private List<TTenpuFileRegistForm> tTenpuFileGrid;

    /**
     * @return 添付ファイル
     */
    public List<TTenpuFileRegistForm> getTTenpuFileGrid() {
        return tTenpuFileGrid;
    }

    /**
     * @param p
     */
    public void setTTenpuFileGrid(final List<TTenpuFileRegistForm> p) {
        this.tTenpuFileGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
