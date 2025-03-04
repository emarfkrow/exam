package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約先登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuSakiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7ShuyakuSakiRegistForm.class);

    /** 集約先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakuSakiId;

    /**
     * @return 集約先ID
     */
    public String getShuyakuSakiId() {
        return shuyakuSakiId;
    }

    /**
     * @param p 集約先ID
     */
    public void setShuyakuSakiId(final String p) {
        this.shuyakuSakiId = p;
    }

    /** 集約先情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String shuyakuSakiInfo;

    /**
     * @return 集約先情報
     */
    public String getShuyakuSakiInfo() {
        return shuyakuSakiInfo;
    }

    /**
     * @param p 集約先情報
     */
    public void setShuyakuSakiInfo(final String p) {
        this.shuyakuSakiInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
