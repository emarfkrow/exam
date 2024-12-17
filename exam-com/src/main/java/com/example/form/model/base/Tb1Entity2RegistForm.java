package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Entity2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Entity2RegistForm.class);

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

    /** エンティティ２名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String entity2Mei;

    /**
     * @return エンティティ２名
     */
    public String getEntity2Mei() {
        return entity2Mei;
    }

    /**
     * @param p エンティティ２名
     */
    public void setEntity2Mei(final String p) {
        this.entity2Mei = p;
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
    private Tb1Entity1RegistForm tb1Entity1RegistForm;

    /**
     * @return Tb1Entity1RegistForm
     */
    public Tb1Entity1RegistForm getTb1Entity1RegistForm() {
        return tb1Entity1RegistForm;
    }

    /**
     * @param p
     */
    public void setTb1Entity1RegistForm(final Tb1Entity1RegistForm p) {
        this.tb1Entity1RegistForm = p;
    }

    /** エンティティ３ */
    @jakarta.validation.Valid
    private Tb1Entity3RegistForm tb1Entity3RegistForm;

    /**
     * @return Tb1Entity3RegistForm
     */
    public Tb1Entity3RegistForm getTb1Entity3RegistForm() {
        return tb1Entity3RegistForm;
    }

    /**
     * @param p
     */
    public void setTb1Entity3RegistForm(final Tb1Entity3RegistForm p) {
        this.tb1Entity3RegistForm = p;
    }

    /** エンティティ４ */
    @jakarta.validation.Valid
    private Tb1Entity4RegistForm tb1Entity4RegistForm;

    /**
     * @return Tb1Entity4RegistForm
     */
    public Tb1Entity4RegistForm getTb1Entity4RegistForm() {
        return tb1Entity4RegistForm;
    }

    /**
     * @param p
     */
    public void setTb1Entity4RegistForm(final Tb1Entity4RegistForm p) {
        this.tb1Entity4RegistForm = p;
    }

    /** エンティティ５ */
    @jakarta.validation.Valid
    private Tb1Entity5RegistForm tb1Entity5RegistForm;

    /**
     * @return Tb1Entity5RegistForm
     */
    public Tb1Entity5RegistForm getTb1Entity5RegistForm() {
        return tb1Entity5RegistForm;
    }

    /**
     * @param p
     */
    public void setTb1Entity5RegistForm(final Tb1Entity5RegistForm p) {
        this.tb1Entity5RegistForm = p;
    }

    /** 子 */
    @jakarta.validation.Valid
    private List<Tb1KoRegistForm> tb1KoGrid;

    /**
     * @return 子
     */
    public List<Tb1KoRegistForm> getTb1KoGrid() {
        return tb1KoGrid;
    }

    /**
     * @param p
     */
    public void setTb1KoGrid(final List<Tb1KoRegistForm> p) {
        this.tb1KoGrid = p;
    }

    /** 添付ファイル */
    @jakarta.validation.Valid
    private List<Tb1TenpuFileRegistForm> tb1TenpuFileGrid;

    /**
     * @return 添付ファイル
     */
    public List<Tb1TenpuFileRegistForm> getTb1TenpuFileGrid() {
        return tb1TenpuFileGrid;
    }

    /**
     * @param p
     */
    public void setTb1TenpuFileGrid(final List<Tb1TenpuFileRegistForm> p) {
        this.tb1TenpuFileGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
