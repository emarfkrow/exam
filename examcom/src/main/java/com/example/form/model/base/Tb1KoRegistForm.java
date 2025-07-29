package com.example.form.model.base;

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
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String oyaId;

    /**
     * @return 親ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getOyaId() {
        return oyaId;
    }

    /**
     * @param p 親ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setOyaId(final String p) {
        this.oyaId = p;
    }

    /** 子枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String koBn;

    /**
     * @return 子枝番
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getKoBn() {
        return koBn;
    }

    /**
     * @param p 子枝番
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
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

    /** 更新タイムスタンプ */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    @jp.co.golorp.emarf.validation.OptLock
    private String updateTs;

    /**
     * @return 更新タイムスタンプ
     */
    @jp.co.golorp.emarf.validation.OptLock
    public String getUpdateTs() {
        return updateTs;
    }

    /**
     * @param p 更新タイムスタンプ
     */
    @jp.co.golorp.emarf.validation.OptLock
    public void setUpdateTs(final String p) {
        this.updateTs = p;
    }

    /** 子なし */
    @jakarta.validation.Valid
    private Tb1KoDinksRegistForm tb1KoDinksRegistForm;

    /**
     * @return Tb1KoDinksRegistForm
     */
    public Tb1KoDinksRegistForm getTb1KoDinksRegistForm() {
        return tb1KoDinksRegistForm;
    }

    /**
     * @param p
     */
    public void setTb1KoDinksRegistForm(final Tb1KoDinksRegistForm p) {
        this.tb1KoDinksRegistForm = p;
    }

    /** 孤児 */
    @jakarta.validation.Valid
    private Tb1KoOrphansRegistForm tb1KoOrphansRegistForm;

    /**
     * @return Tb1KoOrphansRegistForm
     */
    public Tb1KoOrphansRegistForm getTb1KoOrphansRegistForm() {
        return tb1KoOrphansRegistForm;
    }

    /**
     * @param p
     */
    public void setTb1KoOrphansRegistForm(final Tb1KoOrphansRegistForm p) {
        this.tb1KoOrphansRegistForm = p;
    }

    /** 孫 */
    @jakarta.validation.Valid
    private java.util.List<Tb1MagoRegistForm> tb1MagoGrid;

    /**
     * @return 孫
     */
    public java.util.List<Tb1MagoRegistForm> getTb1MagoGrid() {
        return tb1MagoGrid;
    }

    /**
     * @param p
     */
    public void setTb1MagoGrid(final java.util.List<Tb1MagoRegistForm> p) {
        this.tb1MagoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
