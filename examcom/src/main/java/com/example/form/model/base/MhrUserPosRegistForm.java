package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 所属マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MhrUserPosRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MhrUserPosRegistForm.class);

    /** 部署ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String bushoId;

    /**
     * @return 部署ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getBushoId() {
        return bushoId;
    }

    /**
     * @param p 部署ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setBushoId(final String p) {
        this.bushoId = p;
    }

    /** 職位ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String shokuiId;

    /**
     * @return 職位ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getShokuiId() {
        return shokuiId;
    }

    /**
     * @param p 職位ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setShokuiId(final String p) {
        this.shokuiId = p;
    }

    /** ユーザID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String userId;

    /**
     * @return ユーザID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getUserId() {
        return userId;
    }

    /**
     * @param p ユーザID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setUserId(final String p) {
        this.userId = p;
    }

    /** 適用日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String tekiyoBi;

    /**
     * @return 適用日
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getTekiyoBi() {
        return tekiyoBi;
    }

    /**
     * @param p 適用日
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
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

        // 部署ID のマスタチェック
        // TODO できればAssertTrueにしたい
        baseProcess.masterCheck(errors, "MhrBushoSearch", "bushoId", this.getBushoId(), jp.co.golorp.emarf.util.Messages.get("MhrUserPos.bushoId"));

        // 職位ID のマスタチェック
        // TODO できればAssertTrueにしたい
        baseProcess.masterCheck(errors, "MhrShokuiSearch", "shokuiId", this.getShokuiId(), jp.co.golorp.emarf.util.Messages.get("MhrUserPos.shokuiId"));

        // ユーザID のマスタチェック
        // TODO できればAssertTrueにしたい
        baseProcess.masterCheck(errors, "MhrUserSearch", "userId", this.getUserId(), jp.co.golorp.emarf.util.Messages.get("MhrUserPos.userId"));
    }

}
