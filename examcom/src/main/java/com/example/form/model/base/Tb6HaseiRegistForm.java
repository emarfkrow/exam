package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiRegistForm.class);

    /** 派生ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiId;

    /**
     * @return 派生ID
     */
    public String getHaseiId() {
        return haseiId;
    }

    /**
     * @param p 派生ID
     */
    public void setHaseiId(final String p) {
        this.haseiId = p;
    }

    /** 派生情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String haseiInfo;

    /**
     * @return 派生情報
     */
    public String getHaseiInfo() {
        return haseiInfo;
    }

    /**
     * @param p 派生情報
     */
    public void setHaseiInfo(final String p) {
        this.haseiInfo = p;
    }

    /** 派生明細 */
    @jakarta.validation.Valid
    private List<Tb6HaseiDetRegistForm> tb6HaseiDetGrid;

    /**
     * @return 派生明細
     */
    public List<Tb6HaseiDetRegistForm> getTb6HaseiDetGrid() {
        return tb6HaseiDetGrid;
    }

    /**
     * @param p
     */
    public void setTb6HaseiDetGrid(final List<Tb6HaseiDetRegistForm> p) {
        this.tb6HaseiDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
