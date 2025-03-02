package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 認可マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MhrNinkaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MhrNinkaRegistForm.class);

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

    /** 職位ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shokuiId;

    /**
     * @return 職位ID
     */
    public String getShokuiId() {
        return shokuiId;
    }

    /**
     * @param p 職位ID
     */
    public void setShokuiId(final String p) {
        this.shokuiId = p;
    }

    /** 機能名称 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String kinoNm;

    /**
     * @return 機能名称
     */
    public String getKinoNm() {
        return kinoNm;
    }

    /**
     * @param p 機能名称
     */
    public void setKinoNm(final String p) {
        this.kinoNm = p;
    }

    /** 権限区分 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String kengenKb;

    /**
     * @return 権限区分
     */
    public String getKengenKb() {
        return kengenKb;
    }

    /**
     * @param p 権限区分
     */
    public void setKengenKb(final String p) {
        this.kengenKb = p;
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
