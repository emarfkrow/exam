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
public class Vb1ShisonRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Vb1ShisonRegistForm.class);

    /** entity_name */
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

    /** SOSEN_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sosenId;

    /**
     * @return SOSEN_ID
     */
    public String getSosenId() {
        return sosenId;
    }

    /**
     * @param p SOSEN_ID
     */
    public void setSosenId(final String p) {
        this.sosenId = p;
    }

    /** OYA_MEI */
    @jakarta.validation.constraints.Size(max = 60)
    private String oyaMei;

    /**
     * @return OYA_MEI
     */
    public String getOyaMei() {
        return oyaMei;
    }

    /**
     * @param p OYA_MEI
     */
    public void setOyaMei(final String p) {
        this.oyaMei = p;
    }

    /** ENTITY1_MEI */
    @jakarta.validation.constraints.Size(max = 60)
    private String entity1Mei;

    /**
     * @return ENTITY1_MEI
     */
    public String getEntity1Mei() {
        return entity1Mei;
    }

    /**
     * @param p ENTITY1_MEI
     */
    public void setEntity1Mei(final String p) {
        this.entity1Mei = p;
    }

    /** KO_MEI */
    @jakarta.validation.constraints.Size(max = 60)
    private String koMei;

    /**
     * @return KO_MEI
     */
    public String getKoMei() {
        return koMei;
    }

    /**
     * @param p KO_MEI
     */
    public void setKoMei(final String p) {
        this.koMei = p;
    }

    /** SHISON_MEI */
    @jakarta.validation.constraints.Size(max = 60)
    private String shisonMei;

    /**
     * @return SHISON_MEI
     */
    public String getShisonMei() {
        return shisonMei;
    }

    /**
     * @param p SHISON_MEI
     */
    public void setShisonMei(final String p) {
        this.shisonMei = p;
    }

    /** SEARCH_SOSEN_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchSosenId;

    /**
     * @return SEARCH_SOSEN_ID
     */
    public String getSearchSosenId() {
        return searchSosenId;
    }

    /**
     * @param p SEARCH_SOSEN_ID
     */
    public void setSearchSosenId(final String p) {
        this.searchSosenId = p;
    }

    /** SEARCH_OYA_BN */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchOyaBn;

    /**
     * @return SEARCH_OYA_BN
     */
    public String getSearchOyaBn() {
        return searchOyaBn;
    }

    /**
     * @param p SEARCH_OYA_BN
     */
    public void setSearchOyaBn(final String p) {
        this.searchOyaBn = p;
    }

    /** SEARCH_ENTITY_BN */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchEntityBn;

    /**
     * @return SEARCH_ENTITY_BN
     */
    public String getSearchEntityBn() {
        return searchEntityBn;
    }

    /**
     * @param p SEARCH_ENTITY_BN
     */
    public void setSearchEntityBn(final String p) {
        this.searchEntityBn = p;
    }

    /** SEARCH_KO_BN */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchKoBn;

    /**
     * @return SEARCH_KO_BN
     */
    public String getSearchKoBn() {
        return searchKoBn;
    }

    /**
     * @param p SEARCH_KO_BN
     */
    public void setSearchKoBn(final String p) {
        this.searchKoBn = p;
    }

    /** SEARCH_SHISON_BN */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String searchShisonBn;

    /**
     * @return SEARCH_SHISON_BN
     */
    public String getSearchShisonBn() {
        return searchShisonBn;
    }

    /**
     * @param p SEARCH_SHISON_BN
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
