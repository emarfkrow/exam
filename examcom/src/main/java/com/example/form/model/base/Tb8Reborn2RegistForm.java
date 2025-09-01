package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb8Reborn2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8Reborn2RegistForm.class);

    /** 転生２ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String reborn2Id;

    /**
     * @return 転生２ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getReborn2Id() {
        return reborn2Id;
    }

    /**
     * @param p 転生２ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setReborn2Id(final String p) {
        this.reborn2Id = p;
    }

    /** 単位４ID */
    @jakarta.validation.constraints.NotBlank(groups = jp.co.golorp.emarf.validation.Regist.class)
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String unit4Id;

    /**
     * @return 単位４ID
     */
    public String getUnit4Id() {
        return unit4Id;
    }

    /**
     * @param p 単位４ID
     */
    public void setUnit4Id(final String p) {
        this.unit4Id = p;
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

        // 単位４ID のマスタチェック
        // TODO できればAssertTrueにしたい
        baseProcess.masterCheck(errors, "Tb8Unit4Search", "unit4Id", this.getUnit4Id(), jp.co.golorp.emarf.util.Messages.get("Tb8Reborn2.unit4Id"));
    }

}
