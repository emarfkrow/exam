package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 部署マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MhrBushoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MhrBushoRegistForm.class);

    /** 部署ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String bushoId;

    /**
     * @return 部署ID
     */
    public String getBushoId() {
        return bushoId;
    }

    /**
     * @param p 部署ID
     */
    public void setBushoId(final String p) {
        this.bushoId = p;
    }

    /** 部署名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String bushoMei;

    /**
     * @return 部署名
     */
    public String getBushoMei() {
        return bushoMei;
    }

    /**
     * @param p 部署名
     */
    public void setBushoMei(final String p) {
        this.bushoMei = p;
    }

    /** 親部署ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaBushoId;

    /**
     * @return 親部署ID
     */
    public String getOyaBushoId() {
        return oyaBushoId;
    }

    /**
     * @param p 親部署ID
     */
    public void setOyaBushoId(final String p) {
        this.oyaBushoId = p;
    }

    /** 開始日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String kaishiBi;

    /**
     * @return 開始日
     */
    public String getKaishiBi() {
        return kaishiBi;
    }

    /**
     * @param p 開始日
     */
    public void setKaishiBi(final String p) {
        this.kaishiBi = p;
    }

    /** 終了日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String shuryoBi;

    /**
     * @return 終了日
     */
    public String getShuryoBi() {
        return shuryoBi;
    }

    /**
     * @param p 終了日
     */
    public void setShuryoBi(final String p) {
        this.shuryoBi = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
