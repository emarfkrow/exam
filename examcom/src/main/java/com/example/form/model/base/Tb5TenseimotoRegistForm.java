package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生元登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseimotoRegistForm.class);

    /** 転生元ID */
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

    /** 転生元情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseimotoInfo;

    /**
     * @return 転生元情報
     */
    public String getTenseimotoInfo() {
        return tenseimotoInfo;
    }

    /**
     * @param p 転生元情報
     */
    public void setTenseimotoInfo(final String p) {
        this.tenseimotoInfo = p;
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

    /** 転生元明細 */
    @jakarta.validation.Valid
    private List<Tb5TenseimotoDetRegistForm> tb5TenseimotoDetGrid;

    /**
     * @return 転生元明細
     */
    public List<Tb5TenseimotoDetRegistForm> getTb5TenseimotoDetGrid() {
        return tb5TenseimotoDetGrid;
    }

    /**
     * @param p
     */
    public void setTb5TenseimotoDetGrid(final List<Tb5TenseimotoDetRegistForm> p) {
        this.tb5TenseimotoDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
