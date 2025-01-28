package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 稼働日マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MsyKadobiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MsyKadobiRegistForm.class);

    /** 稼働日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String kadoBi;

    /**
     * @return 稼働日
     */
    public String getKadoBi() {
        return kadoBi;
    }

    /**
     * @param p 稼働日
     */
    public void setKadoBi(final String p) {
        this.kadoBi = p;
    }

    /** 部署区分 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String bushoKb;

    /**
     * @return 部署区分
     */
    public String getBushoKb() {
        return bushoKb;
    }

    /**
     * @param p 部署区分
     */
    public void setBushoKb(final String p) {
        this.bushoKb = p;
    }

    /** 稼働日フラグ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String kadobiF;

    /**
     * @return 稼働日フラグ
     */
    public String getKadobiF() {
        return kadobiF;
    }

    /**
     * @param p 稼働日フラグ
     */
    public void setKadobiF(final String p) {
        this.kadobiF = p;
    }

    /** メモ */
    @jakarta.validation.constraints.Size(max = 300)
    private String memo;

    /**
     * @return メモ
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param p メモ
     */
    public void setMemo(final String p) {
        this.memo = p;
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
