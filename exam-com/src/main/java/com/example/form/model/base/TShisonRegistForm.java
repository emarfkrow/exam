package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子孫登録フォーム
 *
 * @author emarfkrow
 */
public class TShisonRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TShisonRegistForm.class);

    /** 祖先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
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

    /** 親連番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaSn;

    /**
     * @return 親連番
     */
    public String getOyaSn() {
        return oyaSn;
    }

    /**
     * @param p 親連番
     */
    public void setOyaSn(final String p) {
        this.oyaSn = p;
    }

    /** エンティティ連番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String entitySn;

    /**
     * @return エンティティ連番
     */
    public String getEntitySn() {
        return entitySn;
    }

    /**
     * @param p エンティティ連番
     */
    public void setEntitySn(final String p) {
        this.entitySn = p;
    }

    /** 子連番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String koSn;

    /**
     * @return 子連番
     */
    public String getKoSn() {
        return koSn;
    }

    /**
     * @param p 子連番
     */
    public void setKoSn(final String p) {
        this.koSn = p;
    }

    /** 子孫連番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shisonSn;

    /**
     * @return 子孫連番
     */
    public String getShisonSn() {
        return shisonSn;
    }

    /**
     * @param p 子孫連番
     */
    public void setShisonSn(final String p) {
        this.shisonSn = p;
    }

    /** 子孫名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
    private String shisonMei;

    /**
     * @return 子孫名
     */
    public String getShisonMei() {
        return shisonMei;
    }

    /**
     * @param p 子孫名
     */
    public void setShisonMei(final String p) {
        this.shisonMei = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
