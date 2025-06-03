package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 変換先登録フォーム
 *
 * @author emarfkrow
 */
public class Tb9DestRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb9DestRegistForm.class);

    /** 変換先ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String destId;

    /**
     * @return 変換先ID
     */
    public String getDestId() {
        return destId;
    }

    /**
     * @param p 変換先ID
     */
    public void setDestId(final String p) {
        this.destId = p;
    }

    /** 変換先情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String destInfo;

    /**
     * @return 変換先情報
     */
    public String getDestInfo() {
        return destInfo;
    }

    /**
     * @param p 変換先情報
     */
    public void setDestInfo(final String p) {
        this.destInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
