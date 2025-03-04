package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb8SanshoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb8SanshoRegistForm.class);

    /** 参照ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sanshoId;

    /**
     * @return 参照ID
     */
    public String getSanshoId() {
        return sanshoId;
    }

    /**
     * @param p 参照ID
     */
    public void setSanshoId(final String p) {
        this.sanshoId = p;
    }

    /** 参照名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String sanshoMei;

    /**
     * @return 参照名
     */
    public String getSanshoMei() {
        return sanshoMei;
    }

    /**
     * @param p 参照名
     */
    public void setSanshoMei(final String p) {
        this.sanshoMei = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
