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
    @jakarta.validation.constraints.Size(max = 60)
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

    /** 適用日 */
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
