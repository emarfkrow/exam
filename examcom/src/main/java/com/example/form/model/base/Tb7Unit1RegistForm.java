package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 単位１登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7Unit1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7Unit1RegistForm.class);

    /** 単位１ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String unit1Id;

    /**
     * @return 単位１ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getUnit1Id() {
        return unit1Id;
    }

    /**
     * @param p 単位１ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setUnit1Id(final String p) {
        this.unit1Id = p;
    }

    /** 集約抑止ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sum2Id;

    /**
     * @return 集約抑止ID
     */
    public String getSum2Id() {
        return sum2Id;
    }

    /**
     * @param p 集約抑止ID
     */
    public void setSum2Id(final String p) {
        this.sum2Id = p;
    }

    /** 更新タイムスタンプ */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    private String updateTs;

    /**
     * @return 更新タイムスタンプ
     */
    public String getUpdateTs() {
        return updateTs;
    }

    /**
     * @param p 更新タイムスタンプ
     */
    public void setUpdateTs(final String p) {
        this.updateTs = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
