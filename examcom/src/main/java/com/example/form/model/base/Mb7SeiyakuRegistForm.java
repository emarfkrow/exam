package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 制約マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb7SeiyakuRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb7SeiyakuRegistForm.class);

    /** 制約ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String seiyakuId;

    /**
     * @return 制約ID
     */
    public String getSeiyakuId() {
        return seiyakuId;
    }

    /**
     * @param p 制約ID
     */
    public void setSeiyakuId(final String p) {
        this.seiyakuId = p;
    }

    /** 制約名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String seiyakuMei;

    /**
     * @return 制約名
     */
    public String getSeiyakuMei() {
        return seiyakuMei;
    }

    /**
     * @param p 制約名
     */
    public void setSeiyakuMei(final String p) {
        this.seiyakuMei = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
