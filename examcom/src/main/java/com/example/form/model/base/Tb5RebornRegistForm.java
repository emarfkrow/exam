package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5RebornRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5RebornRegistForm.class);

    /** 転生ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String rebornId;

    /**
     * @return 転生ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getRebornId() {
        return rebornId;
    }

    /**
     * @param p 転生ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setRebornId(final String p) {
        this.rebornId = p;
    }

    /** 前世ID */
    @jakarta.validation.constraints.NotBlank(groups = jp.co.golorp.emarf.validation.Regist.class)
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String prevId;

    /**
     * @return 前世ID
     */
    public String getPrevId() {
        return prevId;
    }

    /**
     * @param p 前世ID
     */
    public void setPrevId(final String p) {
        this.prevId = p;
    }

    /** 前世情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String prevInfo;

    /**
     * @return 前世情報
     */
    public String getPrevInfo() {
        return prevInfo;
    }

    /**
     * @param p 前世情報
     */
    public void setPrevInfo(final String p) {
        this.prevInfo = p;
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

    /** 転生明細 */
    @jakarta.validation.Valid
    private java.util.List<Tb5RebornDetRegistForm> tb5RebornDetGrid;

    /**
     * @return 転生明細
     */
    public java.util.List<Tb5RebornDetRegistForm> getTb5RebornDetGrid() {
        return tb5RebornDetGrid;
    }

    /**
     * @param p
     */
    public void setTb5RebornDetGrid(final java.util.List<Tb5RebornDetRegistForm> p) {
        this.tb5RebornDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");

        // 前世ID のマスタチェック
        // TODO できればAssertTrueにしたい
        baseProcess.masterCheck(errors, "Tb5PrevSearch", "prevId", this.getPrevId(), jp.co.golorp.emarf.util.Messages.get("Tb5Reborn.prevId"));
    }

}
