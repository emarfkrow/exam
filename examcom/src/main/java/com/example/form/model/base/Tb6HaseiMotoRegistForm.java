package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生元登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiMotoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiMotoRegistForm.class);

    /** 派生元ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiMotoId;

    /**
     * @return 派生元ID
     */
    public String getHaseiMotoId() {
        return haseiMotoId;
    }

    /**
     * @param p 派生元ID
     */
    public void setHaseiMotoId(final String p) {
        this.haseiMotoId = p;
    }

    /** 派生元情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String haseiMotoInfo;

    /**
     * @return 派生元情報
     */
    public String getHaseiMotoInfo() {
        return haseiMotoInfo;
    }

    /**
     * @param p 派生元情報
     */
    public void setHaseiMotoInfo(final String p) {
        this.haseiMotoInfo = p;
    }

    /** 派生元明細 */
    @jakarta.validation.Valid
    private List<Tb6HaseiMotoDetRegistForm> tb6HaseiMotoDetGrid;

    /**
     * @return 派生元明細
     */
    public List<Tb6HaseiMotoDetRegistForm> getTb6HaseiMotoDetGrid() {
        return tb6HaseiMotoDetGrid;
    }

    /**
     * @param p
     */
    public void setTb6HaseiMotoDetGrid(final List<Tb6HaseiMotoDetRegistForm> p) {
        this.tb6HaseiMotoDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
