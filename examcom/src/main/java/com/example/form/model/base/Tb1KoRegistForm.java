package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1KoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1KoRegistForm.class);

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

    /** 子情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String koInfo;

    /**
     * @return 子情報
     */
    public String getKoInfo() {
        return koInfo;
    }

    /**
     * @param p 子情報
     */
    public void setKoInfo(final String p) {
        this.koInfo = p;
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

    /** 子２ */
    @jakarta.validation.Valid
    private Tb1Ko2RegistForm tb1Ko2RegistForm;

    /**
     * @return Tb1Ko2RegistForm
     */
    public Tb1Ko2RegistForm getTb1Ko2RegistForm() {
        return tb1Ko2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb1Ko2RegistForm(final Tb1Ko2RegistForm p) {
        this.tb1Ko2RegistForm = p;
    }

    /** 子３ */
    @jakarta.validation.Valid
    private Tb1Ko3RegistForm tb1Ko3RegistForm;

    /**
     * @return Tb1Ko3RegistForm
     */
    public Tb1Ko3RegistForm getTb1Ko3RegistForm() {
        return tb1Ko3RegistForm;
    }

    /**
     * @param p
     */
    public void setTb1Ko3RegistForm(final Tb1Ko3RegistForm p) {
        this.tb1Ko3RegistForm = p;
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
