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
public class Tb5TenseiSakiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiSakiRegistForm.class);

    /** 転生先ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiSakiId;

    /**
     * @return 転生先ID
     */
    public String getTenseiSakiId() {
        return tenseiSakiId;
    }

    /**
     * @param p 転生先ID
     */
    public void setTenseiSakiId(final String p) {
        this.tenseiSakiId = p;
    }

    /** 転生先情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseiSakiInfo;

    /**
     * @return 転生先情報
     */
    public String getTenseiSakiInfo() {
        return tenseiSakiInfo;
    }

    /**
     * @param p 転生先情報
     */
    public void setTenseiSakiInfo(final String p) {
        this.tenseiSakiInfo = p;
    }

    /** 転生元ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiMotoId;

    /**
     * @return 転生元ID
     */
    public String getTenseiMotoId() {
        return tenseiMotoId;
    }

    /**
     * @param p 転生元ID
     */
    public void setTenseiMotoId(final String p) {
        this.tenseiMotoId = p;
    }

    /** 転生先明細 */
    @jakarta.validation.Valid
    private List<Tb5TenseiSakiDetRegistForm> tb5TenseiSakiDetGrid;

    /**
     * @return 転生先明細
     */
    public List<Tb5TenseiSakiDetRegistForm> getTb5TenseiSakiDetGrid() {
        return tb5TenseiSakiDetGrid;
    }

    /**
     * @param p
     */
    public void setTb5TenseiSakiDetGrid(final List<Tb5TenseiSakiDetRegistForm> p) {
        this.tb5TenseiSakiDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
