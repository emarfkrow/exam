package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 主キーなし登録フォーム
 *
 * @author emarfkrow
 */
public class Tb0NokeyRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb0NokeyRegistForm.class);

    /** 列Ａ */
    @jakarta.validation.constraints.Size(max = 60)
    private String colA;

    /**
     * @return 列Ａ
     */
    public String getColA() {
        return colA;
    }

    /**
     * @param p 列Ａ
     */
    public void setColA(final String p) {
        this.colA = p;
    }

    /** 列Ｂ */
    @jakarta.validation.constraints.Size(max = 60)
    private String colB;

    /**
     * @return 列Ｂ
     */
    public String getColB() {
        return colB;
    }

    /**
     * @param p 列Ｂ
     */
    public void setColB(final String p) {
        this.colB = p;
    }

    /** 列Ｃ */
    @jakarta.validation.constraints.Size(max = 60)
    private String colC;

    /**
     * @return 列Ｃ
     */
    public String getColC() {
        return colC;
    }

    /**
     * @param p 列Ｃ
     */
    public void setColC(final String p) {
        this.colC = p;
    }

    /** 列Ｄ */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    @jakarta.validation.constraints.Size(max = 60)
    private String colD;

    /**
     * @return 列Ｄ
     */
    public String getColD() {
        return colD;
    }

    /**
     * @param p 列Ｄ
     */
    public void setColD(final String p) {
        this.colD = p;
    }

    /** 列Ｅ */
    @jakarta.validation.constraints.Size(max = 60)
    private String colE;

    /**
     * @return 列Ｅ
     */
    public String getColE() {
        return colE;
    }

    /**
     * @param p 列Ｅ
     */
    public void setColE(final String p) {
        this.colE = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
