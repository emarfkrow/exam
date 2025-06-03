package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 末っ子登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2YoungestRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2YoungestRegistForm.class);

    /** 兄弟ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String kyodaiId;

    /**
     * @return 兄弟ID
     */
    public String getKyodaiId() {
        return kyodaiId;
    }

    /**
     * @param p 兄弟ID
     */
    public void setKyodaiId(final String p) {
        this.kyodaiId = p;
    }

    /** 末っ子情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String youngestInfo;

    /**
     * @return 末っ子情報
     */
    public String getYoungestInfo() {
        return youngestInfo;
    }

    /**
     * @param p 末っ子情報
     */
    public void setYoungestInfo(final String p) {
        this.youngestInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
