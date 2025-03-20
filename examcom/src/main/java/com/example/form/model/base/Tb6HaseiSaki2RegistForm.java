package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生先２登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiSaki2RegistForm.class);

    /** 派生先２ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiSaki2Id;

    /**
     * @return 派生先２ID
     */
    public String getHaseiSaki2Id() {
        return haseiSaki2Id;
    }

    /**
     * @param p 派生先２ID
     */
    public void setHaseiSaki2Id(final String p) {
        this.haseiSaki2Id = p;
    }

    /** 派生元ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
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

    /** 派生先２明細 */
    @jakarta.validation.Valid
    private List<Tb6HaseiSaki2DetRegistForm> tb6HaseiSaki2DetGrid;

    /**
     * @return 派生先２明細
     */
    public List<Tb6HaseiSaki2DetRegistForm> getTb6HaseiSaki2DetGrid() {
        return tb6HaseiSaki2DetGrid;
    }

    /**
     * @param p
     */
    public void setTb6HaseiSaki2DetGrid(final List<Tb6HaseiSaki2DetRegistForm> p) {
        this.tb6HaseiSaki2DetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
