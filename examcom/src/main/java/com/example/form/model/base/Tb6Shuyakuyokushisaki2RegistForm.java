package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止先２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6Shuyakuyokushisaki2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6Shuyakuyokushisaki2RegistForm.class);

    /** 集約抑止先２ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakuyokushisaki2Id;

    /**
     * @return 集約抑止先２ID
     */
    public String getShuyakuyokushisaki2Id() {
        return shuyakuyokushisaki2Id;
    }

    /**
     * @param p 集約抑止先２ID
     */
    public void setShuyakuyokushisaki2Id(final String p) {
        this.shuyakuyokushisaki2Id = p;
    }

    /** 転生抑止ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiyokushiId;

    /**
     * @return 転生抑止ID
     */
    public String getTenseiyokushiId() {
        return tenseiyokushiId;
    }

    /**
     * @param p 転生抑止ID
     */
    public void setTenseiyokushiId(final String p) {
        this.tenseiyokushiId = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /** ステータス区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String statusKb;

    /**
     * @return ステータス区分
     */
    public String getStatusKb() {
        return statusKb;
    }

    /**
     * @param p ステータス区分
     */
    public void setStatusKb(final String p) {
        this.statusKb = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
