package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7Sum2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7Sum2RegistForm.class);

    /** 集約抑止ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String sum2Id;

    /**
     * @return 集約抑止ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getSum2Id() {
        return sum2Id;
    }

    /**
     * @param p 集約抑止ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setSum2Id(final String p) {
        this.sum2Id = p;
    }

    /** 集約抑止情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String sum2Info;

    /**
     * @return 集約抑止情報
     */
    public String getSum2Info() {
        return sum2Info;
    }

    /**
     * @param p 集約抑止情報
     */
    public void setSum2Info(final String p) {
        this.sum2Info = p;
    }

    /** 更新タイムスタンプ */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    @jp.co.golorp.emarf.validation.OptLock
    private String updateTs;

    /**
     * @return 更新タイムスタンプ
     */
    @jp.co.golorp.emarf.validation.OptLock
    public String getUpdateTs() {
        return updateTs;
    }

    /**
     * @param p 更新タイムスタンプ
     */
    @jp.co.golorp.emarf.validation.OptLock
    public void setUpdateTs(final String p) {
        this.updateTs = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
