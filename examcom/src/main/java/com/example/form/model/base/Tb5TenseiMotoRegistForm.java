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
public class Tb5TenseiMotoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiMotoRegistForm.class);

    /** 転生元ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
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

    /** 転生元情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseiMotoInfo;

    /**
     * @return 転生元情報
     */
    public String getTenseiMotoInfo() {
        return tenseiMotoInfo;
    }

    /**
     * @param p 転生元情報
     */
    public void setTenseiMotoInfo(final String p) {
        this.tenseiMotoInfo = p;
    }

    /** 転生元明細 */
    @jakarta.validation.Valid
    private List<Tb5TenseiMotoDetRegistForm> tb5TenseiMotoDetGrid;

    /**
     * @return 転生元明細
     */
    public List<Tb5TenseiMotoDetRegistForm> getTb5TenseiMotoDetGrid() {
        return tb5TenseiMotoDetGrid;
    }

    /**
     * @param p
     */
    public void setTb5TenseiMotoDetGrid(final List<Tb5TenseiMotoDetRegistForm> p) {
        this.tb5TenseiMotoDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
