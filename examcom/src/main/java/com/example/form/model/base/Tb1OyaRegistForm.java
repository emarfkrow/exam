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

    /** 親ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaId;

    /**
     * @return 親ID
     */
    public String getOyaId() {
        return oyaId;
    }

    /**
     * @param p 親ID
     */
    public void setOyaId(final String p) {
        this.oyaId = p;
    }

    /** 親情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String oyaInfo;

    /**
     * @return 親情報
     */
    public String getOyaInfo() {
        return oyaInfo;
    }

    /**
     * @param p 親情報
     */
    public void setOyaInfo(final String p) {
        this.oyaInfo = p;
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

    /** ステータス区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String statusKb;

    /**
     * @return ステータス区分
     */
    public String getStatusKb() {
        return statusKb;
    }

    /**
     * @param p ステータス区分
     */
    public void setStatusKb(final String p) {
        this.statusKb = p;
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

    /** 兄弟２ */
    @jakarta.validation.Valid
    private List<Tb3Kyodai2RegistForm> tb3Kyodai2Grid;

    /**
     * @return 兄弟２
     */
    public List<Tb3Kyodai2RegistForm> getTb3Kyodai2Grid() {
        return tb3Kyodai2Grid;
    }

    /**
     * @param p
     */
    public void setTb3Kyodai2Grid(final List<Tb3Kyodai2RegistForm> p) {
        this.tb3Kyodai2Grid = p;
    }

    /** 兄弟３ */
    @jakarta.validation.Valid
    private List<Tb3Kyodai3RegistForm> tb3Kyodai3Grid;

    /**
     * @return 兄弟３
     */
    public List<Tb3Kyodai3RegistForm> getTb3Kyodai3Grid() {
        return tb3Kyodai3Grid;
    }

    /**
     * @param p
     */
    public void setTb3Kyodai3Grid(final List<Tb3Kyodai3RegistForm> p) {
        this.tb3Kyodai3Grid = p;
    }

    /** 兄弟４ */
    @jakarta.validation.Valid
    private List<Tb3Kyodai4RegistForm> tb3Kyodai4Grid;

    /**
     * @return 兄弟４
     */
    public List<Tb3Kyodai4RegistForm> getTb3Kyodai4Grid() {
        return tb3Kyodai4Grid;
    }

    /**
     * @param p
     */
    public void setTb3Kyodai4Grid(final List<Tb3Kyodai4RegistForm> p) {
        this.tb3Kyodai4Grid = p;
    }

    /** 兄弟５ */
    @jakarta.validation.Valid
    private List<Tb3Kyodai5RegistForm> tb3Kyodai5Grid;

    /**
     * @return 兄弟５
     */
    public List<Tb3Kyodai5RegistForm> getTb3Kyodai5Grid() {
        return tb3Kyodai5Grid;
    }

    /**
     * @param p
     */
    public void setTb3Kyodai5Grid(final List<Tb3Kyodai5RegistForm> p) {
        this.tb3Kyodai5Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
