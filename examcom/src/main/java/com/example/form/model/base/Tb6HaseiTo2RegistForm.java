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
public class Tb6HaseiTo2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiTo2RegistForm.class);

    /** 派生先２ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiTo2Id;

    /**
     * @return 派生先２ID
     */
    public String getHaseiTo2Id() {
        return haseiTo2Id;
    }

    /**
     * @param p 派生先２ID
     */
    public void setHaseiTo2Id(final String p) {
        this.haseiTo2Id = p;
    }

    /** 派生元ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiId;

    /**
     * @return 派生元ID
     */
    public String getHaseiId() {
        return haseiId;
    }

    /**
     * @param p 派生元ID
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
