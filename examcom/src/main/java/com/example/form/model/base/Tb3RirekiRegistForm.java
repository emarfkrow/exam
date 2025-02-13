package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 履歴登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3RirekiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3RirekiRegistForm.class);

    /** 履歴元ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String rirekiMotoId;

    /**
     * @return 履歴元ID
     */
    public String getRirekiMotoId() {
        return rirekiMotoId;
    }

    /**
     * @param p 履歴元ID
     */
    public void setRirekiMotoId(final String p) {
        this.rirekiMotoId = p;
    }

    /** 履歴枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String rirekiBn;

    /**
     * @return 履歴枝番
     */
    public String getRirekiBn() {
        return rirekiBn;
    }

    /**
     * @param p 履歴枝番
     */
    public void setRirekiBn(final String p) {
        this.rirekiBn = p;
    }

    /** 履歴元情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String rirekiMotoInfo;

    /**
     * @return 履歴元情報
     */
    public String getRirekiMotoInfo() {
        return rirekiMotoInfo;
    }

    /**
     * @param p 履歴元情報
     */
    public void setRirekiMotoInfo(final String p) {
        this.rirekiMotoInfo = p;
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
