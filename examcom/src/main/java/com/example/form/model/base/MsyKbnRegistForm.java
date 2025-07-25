package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 区分マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MsyKbnRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MsyKbnRegistForm.class);

    /** 区分名称 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String kbnNm;

    /**
     * @return 区分名称
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public String getKbnNm() {
        return kbnNm;
    }

    /**
     * @param p 区分名称
     */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    public void setKbnNm(final String p) {
        this.kbnNm = p;
    }

    /** 区分名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String kbnMei;

    /**
     * @return 区分名
     */
    public String getKbnMei() {
        return kbnMei;
    }

    /**
     * @param p 区分名
     */
    public void setKbnMei(final String p) {
        this.kbnMei = p;
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

    /** 区分値マスタ */
    @jakarta.validation.Valid
    private List<MsyKbnValRegistForm> msyKbnValGrid;

    /**
     * @return 区分値マスタ
     */
    public List<MsyKbnValRegistForm> getMsyKbnValGrid() {
        return msyKbnValGrid;
    }

    /**
     * @param p
     */
    public void setMsyKbnValGrid(final List<MsyKbnValRegistForm> p) {
        this.msyKbnValGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
