package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照１マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Refer1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Refer1RegistForm.class);

    /** 参照１ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String refer1Id;

    /**
     * @return 参照１ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getRefer1Id() {
        return refer1Id;
    }

    /**
     * @param p 参照１ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setRefer1Id(final String p) {
        this.refer1Id = p;
    }

    /** 参照１名 */
    @jakarta.validation.constraints.NotBlank(groups = jp.co.golorp.emarf.validation.Regist.class)
    @jakarta.validation.constraints.Size(max = 60)
    private String refer1Mei;

    /**
     * @return 参照１名
     */
    public String getRefer1Mei() {
        return refer1Mei;
    }

    /**
     * @param p 参照１名
     */
    public void setRefer1Mei(final String p) {
        this.refer1Mei = p;
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

    /** 廃止日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String haishiBi;

    /**
     * @return 廃止日
     */
    public String getHaishiBi() {
        return haishiBi;
    }

    /**
     * @param p 廃止日
     */
    public void setHaishiBi(final String p) {
        this.haishiBi = p;
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
