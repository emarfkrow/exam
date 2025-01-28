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
public class Tb5TenseisakiDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseisakiDetRegistForm.class);

    /** 転生先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseisakiId;

    /**
     * @return 転生先ID
     */
    public String getTenseisakiId() {
        return tenseisakiId;
    }

    /**
     * @param p 転生先ID
     */
    public void setTenseisakiId(final String p) {
        this.tenseisakiId = p;
    }

    /** 転生先枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseisakiBn;

    /**
     * @return 転生先枝番
     */
    public String getTenseisakiBn() {
        return tenseisakiBn;
    }

    /**
     * @param p 転生先枝番
     */
    public void setTenseisakiBn(final String p) {
        this.tenseisakiBn = p;
    }

    /** 転生先明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseisakiDetInfo;

    /**
     * @return 転生先明細情報
     */
    public String getTenseisakiDetInfo() {
        return tenseisakiDetInfo;
    }

    /**
     * @param p 転生先明細情報
     */
    public void setTenseisakiDetInfo(final String p) {
        this.tenseisakiDetInfo = p;
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
