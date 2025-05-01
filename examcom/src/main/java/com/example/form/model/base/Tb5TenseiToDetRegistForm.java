package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生先明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiToDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiToDetRegistForm.class);

    /** 転生先ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiToId;

    /**
     * @return 転生先ID
     */
    public String getTenseiToId() {
        return tenseiToId;
    }

    /**
     * @param p 転生先ID
     */
    public void setTenseiToId(final String p) {
        this.tenseiToId = p;
    }

    /** 転生先枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiToBn;

    /**
     * @return 転生先枝番
     */
    public String getTenseiToBn() {
        return tenseiToBn;
    }

    /**
     * @param p 転生先枝番
     */
    public void setTenseiToBn(final String p) {
        this.tenseiToBn = p;
    }

    /** 転生明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseiDetInfo;

    /**
     * @return 転生明細情報
     */
    public String getTenseiDetInfo() {
        return tenseiDetInfo;
    }

    /**
     * @param p 転生明細情報
     */
    public void setTenseiDetInfo(final String p) {
        this.tenseiDetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
