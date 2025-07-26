package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5RebornDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5RebornDetRegistForm.class);

    /** 転生ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String rebornId;

    /**
     * @return 転生ID
     */
    public String getRebornId() {
        return rebornId;
    }

    /**
     * @param p 転生ID
     */
    public void setRebornId(final String p) {
        this.rebornId = p;
    }

    /** 転生明細枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String rebornBn;

    /**
     * @return 転生明細枝番
     */
    public String getRebornBn() {
        return rebornBn;
    }

    /**
     * @param p 転生明細枝番
     */
    public void setRebornBn(final String p) {
        this.rebornBn = p;
    }

    /** 前世明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String prevDetInfo;

    /**
     * @return 前世明細情報
     */
    public String getPrevDetInfo() {
        return prevDetInfo;
    }

    /**
     * @param p 前世明細情報
     */
    public void setPrevDetInfo(final String p) {
        this.prevDetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
