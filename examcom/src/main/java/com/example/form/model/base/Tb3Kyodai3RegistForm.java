package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟３登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3Kyodai3RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3Kyodai3RegistForm.class);

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

    /** 子枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String koBn;

    /**
     * @return 子枝番
     */
    public String getKoBn() {
        return koBn;
    }

    /**
     * @param p 子枝番
     */
    public void setKoBn(final String p) {
        this.koBn = p;
    }

    /** 兄弟３情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String kyodai3Info;

    /**
     * @return 兄弟３情報
     */
    public String getKyodai3Info() {
        return kyodai3Info;
    }

    /**
     * @param p 兄弟３情報
     */
    public void setKyodai3Info(final String p) {
        this.kyodai3Info = p;
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
    private Tb1KoRegistForm tb1KoRegistForm;

    /**
     * @return Tb1KoRegistForm
     */
    public Tb1KoRegistForm getTb1KoRegistForm() {
        return tb1KoRegistForm;
    }

    /**
     * @param p
     */
    public void setTb1KoRegistForm(final Tb1KoRegistForm p) {
        this.tb1KoRegistForm = p;
    }

    /** 兄弟２ */
    @jakarta.validation.Valid
    private Tb3Kyodai2RegistForm tb3Kyodai2RegistForm;

    /**
     * @return Tb3Kyodai2RegistForm
     */
    public Tb3Kyodai2RegistForm getTb3Kyodai2RegistForm() {
        return tb3Kyodai2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb3Kyodai2RegistForm(final Tb3Kyodai2RegistForm p) {
        this.tb3Kyodai2RegistForm = p;
    }

    /** 兄弟４ */
    @jakarta.validation.Valid
    private Tb3Kyodai4RegistForm tb3Kyodai4RegistForm;

    /**
     * @return Tb3Kyodai4RegistForm
     */
    public Tb3Kyodai4RegistForm getTb3Kyodai4RegistForm() {
        return tb3Kyodai4RegistForm;
    }

    /**
     * @param p
     */
    public void setTb3Kyodai4RegistForm(final Tb3Kyodai4RegistForm p) {
        this.tb3Kyodai4RegistForm = p;
    }

    /** 兄弟５ */
    @jakarta.validation.Valid
    private Tb3Kyodai5RegistForm tb3Kyodai5RegistForm;

    /**
     * @return Tb3Kyodai5RegistForm
     */
    public Tb3Kyodai5RegistForm getTb3Kyodai5RegistForm() {
        return tb3Kyodai5RegistForm;
    }

    /**
     * @param p
     */
    public void setTb3Kyodai5RegistForm(final Tb3Kyodai5RegistForm p) {
        this.tb3Kyodai5RegistForm = p;
    }

    /** 孫 */
    @jakarta.validation.Valid
    private List<Tb1MagoRegistForm> tb1MagoGrid;

    /**
     * @return 孫
     */
    public List<Tb1MagoRegistForm> getTb1MagoGrid() {
        return tb1MagoGrid;
    }

    /**
     * @param p
     */
    public void setTb1MagoGrid(final List<Tb1MagoRegistForm> p) {
        this.tb1MagoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
