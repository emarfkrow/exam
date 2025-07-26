package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子なし登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1KoDinksRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1KoDinksRegistForm.class);

    /** 親ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
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
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
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

    /** 子なし情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String dinksInfo;

    /**
     * @return 子なし情報
     */
    public String getDinksInfo() {
        return dinksInfo;
    }

    /**
     * @param p 子なし情報
     */
    public void setDinksInfo(final String p) {
        this.dinksInfo = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
