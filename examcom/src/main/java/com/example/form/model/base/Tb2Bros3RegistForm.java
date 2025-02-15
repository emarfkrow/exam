package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟３登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Bros3RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Bros3RegistForm.class);

    /** 兄弟ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String brosId;

    /**
     * @return 兄弟ID
     */
    public String getBrosId() {
        return brosId;
    }

    /**
     * @param p 兄弟ID
     */
    public void setBrosId(final String p) {
        this.brosId = p;
    }

    /** 兄弟３情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String bros3Info;

    /**
     * @return 兄弟３情報
     */
    public String getBros3Info() {
        return bros3Info;
    }

    /**
     * @param p 兄弟３情報
     */
    public void setBros3Info(final String p) {
        this.bros3Info = p;
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

    /** 兄弟 */
    @jakarta.validation.Valid
    private Tb2BrosRegistForm tb2BrosRegistForm;

    /**
     * @return Tb2BrosRegistForm
     */
    public Tb2BrosRegistForm getTb2BrosRegistForm() {
        return tb2BrosRegistForm;
    }

    /**
     * @param p
     */
    public void setTb2BrosRegistForm(final Tb2BrosRegistForm p) {
        this.tb2BrosRegistForm = p;
    }

    /** 兄弟２ */
    @jakarta.validation.Valid
    private Tb2Bros2RegistForm tb2Bros2RegistForm;

    /**
     * @return Tb2Bros2RegistForm
     */
    public Tb2Bros2RegistForm getTb2Bros2RegistForm() {
        return tb2Bros2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Bros2RegistForm(final Tb2Bros2RegistForm p) {
        this.tb2Bros2RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
