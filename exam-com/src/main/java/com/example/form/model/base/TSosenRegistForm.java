package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 祖先登録フォーム
 *
 * @author emarfkrow
 */
public class TSosenRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TSosenRegistForm.class);

    /** 祖先ID */
    @jakarta.validation.constraints.Size(max = 10)
    private String sosenId;

    /**
     * @return 祖先ID
     */
    public String getSosenId() {
        return sosenId;
    }

    /**
     * @param p 祖先ID
     */
    public void setSosenId(final String p) {
        this.sosenId = p;
    }

    /** 祖先名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
    private String sosenMei;

    /**
     * @return 祖先名
     */
    public String getSosenMei() {
        return sosenMei;
    }

    /**
     * @param p 祖先名
     */
    public void setSosenMei(final String p) {
        this.sosenMei = p;
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

    /** 親 */
    @jakarta.validation.Valid
    private List<TOyaRegistForm> tOyaGrid;

    /**
     * @return 親
     */
    public List<TOyaRegistForm> getTOyaGrid() {
        return tOyaGrid;
    }

    /**
     * @param p
     */
    public void setTOyaGrid(final List<TOyaRegistForm> p) {
        this.tOyaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
