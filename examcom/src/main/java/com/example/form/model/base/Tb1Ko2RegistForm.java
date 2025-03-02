package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Ko2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Ko2RegistForm.class);

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

    /** 子２情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String ko2Info;

    /**
     * @return 子２情報
     */
    public String getKo2Info() {
        return ko2Info;
    }

    /**
     * @param p 子２情報
     */
    public void setKo2Info(final String p) {
        this.ko2Info = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
