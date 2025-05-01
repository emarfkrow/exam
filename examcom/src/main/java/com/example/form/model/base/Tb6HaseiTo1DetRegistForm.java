package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生先１明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiTo1DetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiTo1DetRegistForm.class);

    /** 派生先１ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiTo1Id;

    /**
     * @return 派生先１ID
     */
    public String getHaseiTo1Id() {
        return haseiTo1Id;
    }

    /**
     * @param p 派生先１ID
     */
    public void setHaseiTo1Id(final String p) {
        this.haseiTo1Id = p;
    }

    /** 派生先１枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiTo1Bn;

    /**
     * @return 派生先１枝番
     */
    public String getHaseiTo1Bn() {
        return haseiTo1Bn;
    }

    /**
     * @param p 派生先１枝番
     */
    public void setHaseiTo1Bn(final String p) {
        this.haseiTo1Bn = p;
    }

    /** 派生先１明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String haseiDetInfo;

    /**
     * @return 派生先１明細情報
     */
    public String getHaseiDetInfo() {
        return haseiDetInfo;
    }

    /**
     * @param p 派生先１明細情報
     */
    public void setHaseiDetInfo(final String p) {
        this.haseiDetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
