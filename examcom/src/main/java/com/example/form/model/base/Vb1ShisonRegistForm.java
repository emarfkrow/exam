package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * VIEW登録フォーム
 *
 * @author emarfkrow
 */
public class Vb1ShisonRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Vb1ShisonRegistForm.class);

    /** entity_name */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 9)
    private String entityName;

    /**
     * @return entity_name
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * @param p entity_name
     */
    public void setEntityName(final String p) {
        this.entityName = p;
    }

    /** 祖先ID */
    @jakarta.validation.constraints.NotBlank
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

    /** 祖先名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
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

    /** 親名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String oyaMei;

    /**
     * @return 親名
     */
    public String getOyaMei() {
        return oyaMei;
    }

    /**
     * @param p 親名
     */
    public void setOyaMei(final String p) {
        this.oyaMei = p;
    }

    /** エンティティ名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String entity1Mei;

    /**
     * @return エンティティ名
     */
    public String getEntity1Mei() {
        return entity1Mei;
    }

    /**
     * @param p エンティティ名
     */
    public void setEntity1Mei(final String p) {
        this.entity1Mei = p;
    }

    /** 子名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String koMei;

    /**
     * @return 子名
     */
    public String getKoMei() {
        return koMei;
    }

    /**
     * @param p 子名
     */
    public void setKoMei(final String p) {
        this.koMei = p;
    }

    /** 子孫名 */
    @jakarta.validation.constraints.Size(max = 60)
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

    /** 祖先ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchSosenId;

    /**
     * @return 祖先ID
     */
    public String getSearchSosenId() {
        return searchSosenId;
    }

    /**
     * @param p 祖先ID
     */
    public void setSearchSosenId(final String p) {
        this.searchSosenId = p;
    }

    /** 親枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchOyaBn;

    /**
     * @return 親枝番
     */
    public String getSearchOyaBn() {
        return searchOyaBn;
    }

    /**
     * @param p 親枝番
     */
    public void setSearchOyaBn(final String p) {
        this.searchOyaBn = p;
    }

    /** エンティティ枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchEntityBn;

    /**
     * @return エンティティ枝番
     */
    public String getSearchEntityBn() {
        return searchEntityBn;
    }

    /**
     * @param p エンティティ枝番
     */
    public void setSearchEntityBn(final String p) {
        this.searchEntityBn = p;
    }

    /** 子枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchKoBn;

    /**
     * @return 子枝番
     */
    public String getSearchKoBn() {
        return searchKoBn;
    }

    /**
     * @param p 子枝番
     */
    public void setSearchKoBn(final String p) {
        this.searchKoBn = p;
    }

    /** 子孫枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchShisonBn;

    /**
     * @return 子孫枝番
     */
    public String getSearchShisonBn() {
        return searchShisonBn;
    }

    /**
     * @param p 子孫枝番
     */
    public void setSearchShisonBn(final String p) {
        this.searchShisonBn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
