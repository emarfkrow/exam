package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * IDマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4IdRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4IdRegistForm.class);

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

    /** 参照ID名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String idrefMei;

    /**
     * @return 参照ID名
     */
    public String getIdrefMei() {
        return idrefMei;
    }

    /**
     * @param p 参照ID名
     */
    public void setIdrefMei(final String p) {
        this.idrefMei = p;
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

    /** ID-BNマスタ */
    @jakarta.validation.Valid
    private List<Tb4IdbnRegistForm> tb4IdbnGrid;

    /**
     * @return ID-BNマスタ
     */
    public List<Tb4IdbnRegistForm> getTb4IdbnGrid() {
        return tb4IdbnGrid;
    }

    /**
     * @param p
     */
    public void setTb4IdbnGrid(final List<Tb4IdbnRegistForm> p) {
        this.tb4IdbnGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
