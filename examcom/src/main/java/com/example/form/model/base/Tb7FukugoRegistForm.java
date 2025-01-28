package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 複合登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7FukugoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7FukugoRegistForm.class);

    /** 参照１ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sansho1Id;

    /**
     * @return 参照１ID
     */
    public String getSansho1Id() {
        return sansho1Id;
    }

    /**
     * @param p 参照１ID
     */
    public void setSansho1Id(final String p) {
        this.sansho1Id = p;
    }

    /** 参照２ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sansho2Id;

    /**
     * @return 参照２ID
     */
    public String getSansho2Id() {
        return sansho2Id;
    }

    /**
     * @param p 参照２ID
     */
    public void setSansho2Id(final String p) {
        this.sansho2Id = p;
    }

    /** 適用日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String tekiyoBi;

    /**
     * @return 適用日
     */
    public String getTekiyoBi() {
        return tekiyoBi;
    }

    /**
     * @param p 適用日
     */
    public void setTekiyoBi(final String p) {
        this.tekiyoBi = p;
    }

    /** 複合情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String fukugoInfo;

    /**
     * @return 複合情報
     */
    public String getFukugoInfo() {
        return fukugoInfo;
    }

    /**
     * @param p 複合情報
     */
    public void setFukugoInfo(final String p) {
        this.fukugoInfo = p;
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
