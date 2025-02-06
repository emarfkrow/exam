package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 変換先登録フォーム
 *
 * @author emarfkrow
 */
public class Tb8HenkanSakiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8HenkanSakiRegistForm.class);

    /** 変換先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String henkanSakiId;

    /**
     * @return 変換先ID
     */
    public String getHenkanSakiId() {
        return henkanSakiId;
    }

    /**
     * @param p 変換先ID
     */
    public void setHenkanSakiId(final String p) {
        this.henkanSakiId = p;
    }

    /** 変換先情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String henkanSakiInfo;

    /**
     * @return 変換先情報
     */
    public String getHenkanSakiInfo() {
        return henkanSakiInfo;
    }

    /**
     * @param p 変換先情報
     */
    public void setHenkanSakiInfo(final String p) {
        this.henkanSakiInfo = p;
    }

    /** 引継いだ情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String hikitsuidaInfo;

    /**
     * @return 引継いだ情報
     */
    public String getHikitsuidaInfo() {
        return hikitsuidaInfo;
    }

    /**
     * @param p 引継いだ情報
     */
    public void setHikitsuidaInfo(final String p) {
        this.hikitsuidaInfo = p;
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
