package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 単位登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7UnitRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7UnitRegistForm.class);

    /** 単位ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String unitId;

    /**
     * @return 単位ID
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * @param p 単位ID
     */
    public void setUnitId(final String p) {
        this.unitId = p;
    }

    /** 単位情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String unitInfo;

    /**
     * @return 単位情報
     */
    public String getUnitInfo() {
        return unitInfo;
    }

    /**
     * @param p 単位情報
     */
    public void setUnitInfo(final String p) {
        this.unitInfo = p;
    }

    /** 集約ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sumId;

    /**
     * @return 集約ID
     */
    public String getSumId() {
        return sumId;
    }

    /**
     * @param p 集約ID
     */
    public void setSumId(final String p) {
        this.sumId = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
