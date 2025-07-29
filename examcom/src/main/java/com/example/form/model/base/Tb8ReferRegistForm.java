package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Tb8ReferRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8ReferRegistForm.class);

    /** 参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String referId;

    /**
     * @return 参照ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getReferId() {
        return referId;
    }

    /**
     * @param p 参照ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setReferId(final String p) {
        this.referId = p;
    }

    /** 参照名 */
    @jakarta.validation.constraints.NotBlank(groups = jp.co.golorp.emarf.validation.Regist.class)
    @jakarta.validation.constraints.Size(max = 60)
    private String referMei;

    /**
     * @return 参照名
     */
    public String getReferMei() {
        return referMei;
    }

    /**
     * @param p 参照名
     */
    public void setReferMei(final String p) {
        this.referMei = p;
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
