package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 税マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MsyTaxRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MsyTaxRegistForm.class);

    /** 税区分 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String taxKb;

    /**
     * @return 税区分
     */
    public String getTaxKb() {
        return taxKb;
    }

    /**
     * @param p 税区分
     */
    public void setTaxKb(final String p) {
        this.taxKb = p;
    }

    /** 適用日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String tekiyoBi;

    /**
     * @return 適用日
     */
    public String getTekiyoBi() {
        return tekiyoBi;
    }

    /**
     * @param p 適用日
     */
    public void setTekiyoBi(final String p) {
        this.tekiyoBi = p;
    }

    /** 終了日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String shuryoBi;

    /**
     * @return 終了日
     */
    public String getShuryoBi() {
        return shuryoBi;
    }

    /**
     * @param p 終了日
     */
    public void setShuryoBi(final String p) {
        this.shuryoBi = p;
    }

    /** 税率 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,3}\\.?[0-9]{0,2}?)?")
    private String taxRt;

    /**
     * @return 税率
     */
    public String getTaxRt() {
        return taxRt;
    }

    /**
     * @param p 税率
     */
    public void setTaxRt(final String p) {
        this.taxRt = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
