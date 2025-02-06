package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生先明細登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiSakiDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiSakiDetRegistForm.class);

    /** 転生先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiSakiId;

    /**
     * @return 転生先ID
     */
    public String getTenseiSakiId() {
        return tenseiSakiId;
    }

    /**
     * @param p 転生先ID
     */
    public void setTenseiSakiId(final String p) {
        this.tenseiSakiId = p;
    }

    /** 転生先枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiSakiBn;

    /**
     * @return 転生先枝番
     */
    public String getTenseiSakiBn() {
        return tenseiSakiBn;
    }

    /**
     * @param p 転生先枝番
     */
    public void setTenseiSakiBn(final String p) {
        this.tenseiSakiBn = p;
    }

    /** 転生先明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseiSakiDetInfo;

    /**
     * @return 転生先明細情報
     */
    public String getTenseiSakiDetInfo() {
        return tenseiSakiDetInfo;
    }

    /**
     * @param p 転生先明細情報
     */
    public void setTenseiSakiDetInfo(final String p) {
        this.tenseiSakiDetInfo = p;
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
