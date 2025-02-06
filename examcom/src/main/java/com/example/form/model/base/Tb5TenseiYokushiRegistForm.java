package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生抑止登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiYokushiRegistForm.class);

    /** 転生抑止ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiYokushiId;

    /**
     * @return 転生抑止ID
     */
    public String getTenseiYokushiId() {
        return tenseiYokushiId;
    }

    /**
     * @param p 転生抑止ID
     */
    public void setTenseiYokushiId(final String p) {
        this.tenseiYokushiId = p;
    }

    /** 転生抑止情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseiYokushiInfo;

    /**
     * @return 転生抑止情報
     */
    public String getTenseiYokushiInfo() {
        return tenseiYokushiInfo;
    }

    /**
     * @param p 転生抑止情報
     */
    public void setTenseiYokushiInfo(final String p) {
        this.tenseiYokushiInfo = p;
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
