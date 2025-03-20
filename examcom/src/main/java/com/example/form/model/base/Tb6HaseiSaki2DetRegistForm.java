package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生先２明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki2DetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiSaki2DetRegistForm.class);

    /** 派生先２ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiSaki2Id;

    /**
     * @return 派生先２ID
     */
    public String getHaseiSaki2Id() {
        return haseiSaki2Id;
    }

    /**
     * @param p 派生先２ID
     */
    public void setHaseiSaki2Id(final String p) {
        this.haseiSaki2Id = p;
    }

    /** 派生先２枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiSaki2Bn;

    /**
     * @return 派生先２枝番
     */
    public String getHaseiSaki2Bn() {
        return haseiSaki2Bn;
    }

    /**
     * @param p 派生先２枝番
     */
    public void setHaseiSaki2Bn(final String p) {
        this.haseiSaki2Bn = p;
    }

    /** 派生先２明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String haseiSaki2DetInfo;

    /**
     * @return 派生先２明細情報
     */
    public String getHaseiSaki2DetInfo() {
        return haseiSaki2DetInfo;
    }

    /**
     * @param p 派生先２明細情報
     */
    public void setHaseiSaki2DetInfo(final String p) {
        this.haseiSaki2DetInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
