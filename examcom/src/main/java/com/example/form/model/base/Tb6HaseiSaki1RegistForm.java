package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生先１登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiSaki1RegistForm.class);

    /** 派生先１ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiSaki1Id;

    /**
     * @return 派生先１ID
     */
    public String getHaseiSaki1Id() {
        return haseiSaki1Id;
    }

    /**
     * @param p 派生先１ID
     */
    public void setHaseiSaki1Id(final String p) {
        this.haseiSaki1Id = p;
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

    /** 派生先１明細 */
    @jakarta.validation.Valid
    private List<Tb6HaseiSaki1DetRegistForm> tb6HaseiSaki1DetGrid;

    /**
     * @return 派生先１明細
     */
    public List<Tb6HaseiSaki1DetRegistForm> getTb6HaseiSaki1DetGrid() {
        return tb6HaseiSaki1DetGrid;
    }

    /**
     * @param p
     */
    public void setTb6HaseiSaki1DetGrid(final List<Tb6HaseiSaki1DetRegistForm> p) {
        this.tb6HaseiSaki1DetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
