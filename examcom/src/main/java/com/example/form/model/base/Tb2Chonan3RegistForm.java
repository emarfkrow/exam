package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 長男３登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Chonan3RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Chonan3RegistForm.class);

    /** 長男ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String chonanId;

    /**
     * @return 長男ID
     */
    public String getChonanId() {
        return chonanId;
    }

    /**
     * @param p 長男ID
     */
    public void setChonanId(final String p) {
        this.chonanId = p;
    }

    /** 長男３情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String chonan3Info;

    /**
     * @return 長男３情報
     */
    public String getChonan3Info() {
        return chonan3Info;
    }

    /**
     * @param p 長男３情報
     */
    public void setChonan3Info(final String p) {
        this.chonan3Info = p;
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
