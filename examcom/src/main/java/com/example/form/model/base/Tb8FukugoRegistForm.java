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
public class Tb8FukugoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8FukugoRegistForm.class);

    /** 参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sanshoId;

    /**
     * @return 参照ID
     */
    public String getSanshoId() {
        return sanshoId;
    }

    /**
     * @param p 参照ID
     */
    public void setSanshoId(final String p) {
        this.sanshoId = p;
    }

    /** 制約ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String seiyakuId;

    /**
     * @return 制約ID
     */
    public String getSeiyakuId() {
        return seiyakuId;
    }

    /**
     * @param p 制約ID
     */
    public void setSeiyakuId(final String p) {
        this.seiyakuId = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
