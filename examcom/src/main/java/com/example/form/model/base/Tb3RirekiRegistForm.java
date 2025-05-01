package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 履歴元登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3RirekiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3RirekiRegistForm.class);

    /** 履歴ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String rirekiId;

    /**
     * @return 履歴ID
     */
    public String getRirekiId() {
        return rirekiId;
    }

    /**
     * @param p 履歴ID
     */
    public void setRirekiId(final String p) {
        this.rirekiId = p;
    }

    /** 履歴情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String rirekiInfo;

    /**
     * @return 履歴情報
     */
    public String getRirekiInfo() {
        return rirekiInfo;
    }

    /**
     * @param p 履歴情報
     */
    public void setRirekiInfo(final String p) {
        this.rirekiInfo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
