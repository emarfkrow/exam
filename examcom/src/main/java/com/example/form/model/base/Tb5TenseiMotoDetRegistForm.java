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
public class Tb5TenseiMotoDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiMotoDetRegistForm.class);

    /** 転生元ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiMotoId;

    /**
     * @return 転生元ID
     */
    public String getTenseiMotoId() {
        return tenseiMotoId;
    }

    /**
     * @param p 転生元ID
     */
    public void setTenseiMotoId(final String p) {
        this.tenseiMotoId = p;
    }

    /** 転生元枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiMotoBn;

    /**
     * @return 転生元枝番
     */
    public String getTenseiMotoBn() {
        return tenseiMotoBn;
    }

    /**
     * @param p 転生元枝番
     */
    public void setTenseiMotoBn(final String p) {
        this.tenseiMotoBn = p;
    }

    /** 転生元明細情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseiMotoDetInfo;

    /**
     * @return 転生元明細情報
     */
    public String getTenseiMotoDetInfo() {
        return tenseiMotoDetInfo;
    }

    /**
     * @param p 転生元明細情報
     */
    public void setTenseiMotoDetInfo(final String p) {
        this.tenseiMotoDetInfo = p;
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
