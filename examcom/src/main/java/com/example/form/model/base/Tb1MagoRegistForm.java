package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孫登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1MagoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1MagoRegistForm.class);

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

    /** 孫枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String magoBn;

    /**
     * @return 孫枝番
     */
    public String getMagoBn() {
        return magoBn;
    }

    /**
     * @param p 孫枝番
     */
    public void setMagoBn(final String p) {
        this.magoBn = p;
    }

    /** 孫情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String magoInfo;

    /**
     * @return 孫情報
     */
    public String getMagoInfo() {
        return magoInfo;
    }

    /**
     * @param p 孫情報
     */
    public void setMagoInfo(final String p) {
        this.magoInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
