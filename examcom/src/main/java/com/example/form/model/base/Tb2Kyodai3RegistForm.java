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
public class Tb2Kyodai3RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Kyodai3RegistForm.class);

    /** 兄弟ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String kyodaiId;

    /**
     * @return 兄弟ID
     */
    public String getKyodaiId() {
        return kyodaiId;
    }

    /**
     * @param p 兄弟ID
     */
    public void setKyodaiId(final String p) {
        this.kyodaiId = p;
    }

    /** 兄弟３情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String kyodai3Info;

    /**
     * @return 兄弟３情報
     */
    public String getKyodai3Info() {
        return kyodai3Info;
    }

    /**
     * @param p 兄弟３情報
     */
    public void setKyodai3Info(final String p) {
        this.kyodai3Info = p;
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
    private Tb2KyodaiRegistForm tb2KyodaiRegistForm;

    /**
     * @return Tb2KyodaiRegistForm
     */
    public Tb2KyodaiRegistForm getTb2KyodaiRegistForm() {
        return tb2KyodaiRegistForm;
    }

    /**
     * @param p
     */
    public void setTb2KyodaiRegistForm(final Tb2KyodaiRegistForm p) {
        this.tb2KyodaiRegistForm = p;
    }

    /** 兄弟２ */
    @jakarta.validation.Valid
    private Tb2Kyodai2RegistForm tb2Kyodai2RegistForm;

    /**
     * @return Tb2Kyodai2RegistForm
     */
    public Tb2Kyodai2RegistForm getTb2Kyodai2RegistForm() {
        return tb2Kyodai2RegistForm;
    }

    /**
     * @param p
     */
    public void setTb2Kyodai2RegistForm(final Tb2Kyodai2RegistForm p) {
        this.tb2Kyodai2RegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
