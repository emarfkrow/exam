package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * CD参照マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4CdsanshoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4CdsanshoRegistForm.class);

    /** CD参照CD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([\\-0-9A-Za-z]*)?")
    @jakarta.validation.constraints.Size(max = 10)
    private String cdsanshoCd;

    /**
     * @return CD参照CD
     */
    public String getCdsanshoCd() {
        return cdsanshoCd;
    }

    /**
     * @param p CD参照CD
     */
    public void setCdsanshoCd(final String p) {
        this.cdsanshoCd = p;
    }

    /** CD参照名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String cdsanshoMei;

    /**
     * @return CD参照名
     */
    public String getCdsanshoMei() {
        return cdsanshoMei;
    }

    /**
     * @param p CD参照名
     */
    public void setCdsanshoMei(final String p) {
        this.cdsanshoMei = p;
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
