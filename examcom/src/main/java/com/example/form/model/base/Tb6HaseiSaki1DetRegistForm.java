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
public class Tb6HaseiSaki1DetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiSaki1DetRegistForm.class);

    /** 派生先１ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiSaki1Id;

    /**
     * @return 派生先１ID
     */
    public String getHaseiSaki1Id() {
        return haseiSaki1Id;
    }

    /**
     * @param p 派生先１ID
     */
    public void setHaseiSaki1Id(final String p) {
        this.haseiSaki1Id = p;
    }

    /** 派生先１枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiSaki1Bn;

    /**
     * @return 派生先１枝番
     */
    public String getHaseiSaki1Bn() {
        return haseiSaki1Bn;
    }

    /**
     * @param p 派生先１枝番
     */
    public void setHaseiSaki1Bn(final String p) {
        this.haseiSaki1Bn = p;
    }

    /** 派生先１明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String haseiSaki1DetInfo;

    /**
     * @return 派生先１明細情報
     */
    public String getHaseiSaki1DetInfo() {
        return haseiSaki1DetInfo;
    }

    /**
     * @param p 派生先１明細情報
     */
    public void setHaseiSaki1DetInfo(final String p) {
        this.haseiSaki1DetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
