package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生元明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseimotoDetRegistForm.class);

    /** 転生元ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseimotoId;

    /**
     * @return 転生元ID
     */
    public String getTenseimotoId() {
        return tenseimotoId;
    }

    /**
     * @param p 転生元ID
     */
    public void setTenseimotoId(final String p) {
        this.tenseimotoId = p;
    }

    /** 転生元枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseimotoBn;

    /**
     * @return 転生元枝番
     */
    public String getTenseimotoBn() {
        return tenseimotoBn;
    }

    /**
     * @param p 転生元枝番
     */
    public void setTenseimotoBn(final String p) {
        this.tenseimotoBn = p;
    }

    /** 転生元明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseimotoDetInfo;

    /**
     * @return 転生元明細情報
     */
    public String getTenseimotoDetInfo() {
        return tenseimotoDetInfo;
    }

    /**
     * @param p 転生元明細情報
     */
    public void setTenseimotoDetInfo(final String p) {
        this.tenseimotoDetInfo = p;
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
