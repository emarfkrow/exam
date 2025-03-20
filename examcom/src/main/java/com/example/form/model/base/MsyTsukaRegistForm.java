package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 通貨マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MsyTsukaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MsyTsukaRegistForm.class);

    /** 通貨区分 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String tsukaKb;

    /**
     * @return 通貨区分
     */
    public String getTsukaKb() {
        return tsukaKb;
    }

    /**
     * @param p 通貨区分
     */
    public void setTsukaKb(final String p) {
        this.tsukaKb = p;
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

    /** 通貨レート */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,3}\\.?[0-9]{0,2}?)?")
    private String tsukaRt;

    /**
     * @return 通貨レート
     */
    public String getTsukaRt() {
        return tsukaRt;
    }

    /**
     * @param p 通貨レート
     */
    public void setTsukaRt(final String p) {
        this.tsukaRt = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
