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
public class Tb1OyaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1OyaRegistForm.class);

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
    private List<Tb1Entity1RegistForm> tb1Entity1Grid;

    /**
     * @return エンティティ１
     */
    public List<Tb1Entity1RegistForm> getTb1Entity1Grid() {
        return tb1Entity1Grid;
    }

    /**
     * @param p
     */
    public void setTb1Entity1Grid(final List<Tb1Entity1RegistForm> p) {
        this.tb1Entity1Grid = p;
    }

    /** エンティティ２ */
    @jakarta.validation.Valid
    private List<Tb1Entity2RegistForm> tb1Entity2Grid;

    /**
     * @return エンティティ２
     */
    public List<Tb1Entity2RegistForm> getTb1Entity2Grid() {
        return tb1Entity2Grid;
    }

    /**
     * @param p
     */
    public void setTb1Entity2Grid(final List<Tb1Entity2RegistForm> p) {
        this.tb1Entity2Grid = p;
    }

    /** エンティティ３ */
    @jakarta.validation.Valid
    private List<Tb1Entity3RegistForm> tb1Entity3Grid;

    /**
     * @return エンティティ３
     */
    public List<Tb1Entity3RegistForm> getTb1Entity3Grid() {
        return tb1Entity3Grid;
    }

    /**
     * @param p
     */
    public void setTb1Entity3Grid(final List<Tb1Entity3RegistForm> p) {
        this.tb1Entity3Grid = p;
    }

    /** エンティティ４ */
    @jakarta.validation.Valid
    private List<Tb1Entity4RegistForm> tb1Entity4Grid;

    /**
     * @return エンティティ４
     */
    public List<Tb1Entity4RegistForm> getTb1Entity4Grid() {
        return tb1Entity4Grid;
    }

    /**
     * @param p
     */
    public void setTb1Entity4Grid(final List<Tb1Entity4RegistForm> p) {
        this.tb1Entity4Grid = p;
    }

    /** エンティティ５ */
    @jakarta.validation.Valid
    private List<Tb1Entity5RegistForm> tb1Entity5Grid;

    /**
     * @return エンティティ５
     */
    public List<Tb1Entity5RegistForm> getTb1Entity5Grid() {
        return tb1Entity5Grid;
    }

    /**
     * @param p
     */
    public void setTb1Entity5Grid(final List<Tb1Entity5RegistForm> p) {
        this.tb1Entity5Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
