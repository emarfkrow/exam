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
public class Tb8ComboRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8ComboRegistForm.class);

    /** 参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String referId;

    /**
     * @return 参照ID
     */
    public String getReferId() {
        return referId;
    }

    /**
     * @param p 参照ID
     */
    public void setReferId(final String p) {
        this.referId = p;
    }

    /** 制約ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String stintId;

    /**
     * @return 制約ID
     */
    public String getStintId() {
        return stintId;
    }

    /**
     * @param p 制約ID
     */
    public void setStintId(final String p) {
        this.stintId = p;
    }

    /** 適用日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
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
    private String comboInfo;

    /**
     * @return 複合情報
     */
    public String getComboInfo() {
        return comboInfo;
    }

    /**
     * @param p 複合情報
     */
    public void setComboInfo(final String p) {
        this.comboInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");

        // 参照ID のマスタチェック
        baseProcess.masterCheck(errors, "Tb8ReferSearch", "referId", this.getReferId(), jp.co.golorp.emarf.util.Messages.get("Tb8Combo.referId"));

        // 制約ID のマスタチェック
        baseProcess.masterCheck(errors, "Tb8StintSearch", "stintId", this.getStintId(), jp.co.golorp.emarf.util.Messages.get("Tb8Combo.stintId"));
    }

}
