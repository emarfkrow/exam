package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ID-BNマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4IdbnRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4IdbnRegistForm.class);

    /** 参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String idrefId;

    /**
     * @return 参照ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getIdrefId() {
        return idrefId;
    }

    /**
     * @param p 参照ID
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setIdrefId(final String p) {
        this.idrefId = p;
    }

    /** ID連番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String idbnBn;

    /**
     * @return ID連番
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getIdbnBn() {
        return idbnBn;
    }

    /**
     * @param p ID連番
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setIdbnBn(final String p) {
        this.idbnBn = p;
    }

    /** IDBNNO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,10})?")
    private String idbnNo;

    /**
     * @return IDBNNO
     */
    public String getIdbnNo() {
        return idbnNo;
    }

    /**
     * @param p IDBNNO
     */
    public void setIdbnNo(final String p) {
        this.idbnNo = p;
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

        // 参照ID のマスタチェック
        baseProcess.masterCheck(errors, "Tb4IdSearch", "idrefId", this.getIdrefId(), jp.co.golorp.emarf.util.Messages.get("Tb4Idbn.idrefId"));
    }

}
