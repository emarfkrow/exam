package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 区分値マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MsyKbnValRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MsyKbnValRegistForm.class);

    /** 区分名称 */
    @jakarta.validation.constraints.Size(max = 20)
    private String kbnNm;

    /**
     * @return 区分名称
     */
    public String getKbnNm() {
        return kbnNm;
    }

    /**
     * @param p 区分名称
     */
    public void setKbnNm(final String p) {
        this.kbnNm = p;
    }

    /** 区分値 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String kbnVal;

    /**
     * @return 区分値
     */
    public String getKbnVal() {
        return kbnVal;
    }

    /**
     * @param p 区分値
     */
    public void setKbnVal(final String p) {
        this.kbnVal = p;
    }

    /** 区分値名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String kbnValMei;

    /**
     * @return 区分値名
     */
    public String getKbnValMei() {
        return kbnValMei;
    }

    /**
     * @param p 区分値名
     */
    public void setKbnValMei(final String p) {
        this.kbnValMei = p;
    }

    /** 表示順 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String hyojiOn;

    /**
     * @return 表示順
     */
    public String getHyojiOn() {
        return hyojiOn;
    }

    /**
     * @param p 表示順
     */
    public void setHyojiOn(final String p) {
        this.hyojiOn = p;
    }

    /** 取得条件 */
    @jakarta.validation.constraints.Size(max = 300)
    private String criteria;

    /**
     * @return 取得条件
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * @param p 取得条件
     */
    public void setCriteria(final String p) {
        this.criteria = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
