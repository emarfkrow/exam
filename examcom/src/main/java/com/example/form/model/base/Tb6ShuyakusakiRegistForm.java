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
public class Tb6ShuyakusakiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6ShuyakusakiRegistForm.class);

    /** 集約先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakusakiId;

    /**
     * @return 集約先ID
     */
    public String getShuyakusakiId() {
        return shuyakusakiId;
    }

    /**
     * @param p 集約先ID
     */
    public void setShuyakusakiId(final String p) {
        this.shuyakusakiId = p;
    }

    /** 集約先情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String shuyakusakiInfo;

    /**
     * @return 集約先情報
     */
    public String getShuyakusakiInfo() {
        return shuyakusakiInfo;
    }

    /**
     * @param p 集約先情報
     */
    public void setShuyakusakiInfo(final String p) {
        this.shuyakusakiInfo = p;
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
