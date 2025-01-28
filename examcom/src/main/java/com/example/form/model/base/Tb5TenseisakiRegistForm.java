package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生先登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseisakiRegistForm.class);

    /** 転生先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseisakiId;

    /**
     * @return 転生先ID
     */
    public String getTenseisakiId() {
        return tenseisakiId;
    }

    /**
     * @param p 転生先ID
     */
    public void setTenseisakiId(final String p) {
        this.tenseisakiId = p;
    }

    /** 転生元ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseimotoId;

    /**
     * @return 転生元ID
     */
    public String getTenseimotoId() {
        return tenseimotoId;
    }

    /**
     * @param p 転生元ID
     */
    public void setTenseimotoId(final String p) {
        this.tenseimotoId = p;
    }

    /** 転生先情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseisakiInfo;

    /**
     * @return 転生先情報
     */
    public String getTenseisakiInfo() {
        return tenseisakiInfo;
    }

    /**
     * @param p 転生先情報
     */
    public void setTenseisakiInfo(final String p) {
        this.tenseisakiInfo = p;
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

    /** ステータス区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String statusKb;

    /**
     * @return ステータス区分
     */
    public String getStatusKb() {
        return statusKb;
    }

    /**
     * @param p ステータス区分
     */
    public void setStatusKb(final String p) {
        this.statusKb = p;
    }

    /** 転生先明細 */
    @jakarta.validation.Valid
    private List<Tb5TenseisakiDetRegistForm> tb5TenseisakiDetGrid;

    /**
     * @return 転生先明細
     */
    public List<Tb5TenseisakiDetRegistForm> getTb5TenseisakiDetGrid() {
        return tb5TenseisakiDetGrid;
    }

    /**
     * @param p
     */
    public void setTb5TenseisakiDetGrid(final List<Tb5TenseisakiDetRegistForm> p) {
        this.tb5TenseisakiDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
