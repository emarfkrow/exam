package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb8Sum2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8Sum2RegistForm.class);

    /** 集約２ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String sum2Id;

    /**
     * @return 集約２ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getSum2Id() {
        return sum2Id;
    }

    /**
     * @param p 集約２ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setSum2Id(final String p) {
        this.sum2Id = p;
    }

    /** 集約２情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String sum2Info;

    /**
     * @return 集約２情報
     */
    public String getSum2Info() {
        return sum2Info;
    }

    /**
     * @param p 集約２情報
     */
    public void setSum2Info(final String p) {
        this.sum2Info = p;
    }

    /** 前世２ID */
    @jakarta.validation.constraints.NotBlank(groups = jp.co.golorp.emarf.validation.Regist.class)
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String prev2Id;

    /**
     * @return 前世２ID
     */
    public String getPrev2Id() {
        return prev2Id;
    }

    /**
     * @param p 前世２ID
     */
    public void setPrev2Id(final String p) {
        this.prev2Id = p;
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

        // 前世２ID のマスタチェック
        // TODO できればAssertTrueにしたい
        baseProcess.masterCheck(errors, "Tb8Prev2Search", "prev2Id", this.getPrev2Id(), jp.co.golorp.emarf.util.Messages.get("Tb8Sum2.prev2Id"));
    }

}
