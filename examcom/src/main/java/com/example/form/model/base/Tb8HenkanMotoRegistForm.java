package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 変換元登録フォーム
 *
 * @author emarfkrow
 */
public class Tb8HenkanMotoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8HenkanMotoRegistForm.class);

    /** 変換元ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String henkanMotoId;

    /**
     * @return 変換元ID
     */
    public String getHenkanMotoId() {
        return henkanMotoId;
    }

    /**
     * @param p 変換元ID
     */
    public void setHenkanMotoId(final String p) {
        this.henkanMotoId = p;
    }

    /** 変換元情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String henkanMotoInfo;

    /**
     * @return 変換元情報
     */
    public String getHenkanMotoInfo() {
        return henkanMotoInfo;
    }

    /**
     * @param p 変換元情報
     */
    public void setHenkanMotoInfo(final String p) {
        this.henkanMotoInfo = p;
    }

    /** 引継ぐ情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String hikitsuguInfo;

    /**
     * @return 引継ぐ情報
     */
    public String getHikitsuguInfo() {
        return hikitsuguInfo;
    }

    /**
     * @param p 引継ぐ情報
     */
    public void setHikitsuguInfo(final String p) {
        this.hikitsuguInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
