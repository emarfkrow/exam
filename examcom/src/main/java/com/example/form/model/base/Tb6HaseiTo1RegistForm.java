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
public class Tb6HaseiTo1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiTo1RegistForm.class);

    /** 派生先１ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String haseiTo1Id;

    /**
     * @return 派生先１ID
     */
    public String getHaseiTo1Id() {
        return haseiTo1Id;
    }

    /**
     * @param p 派生先１ID
     */
    public void setHaseiTo1Id(final String p) {
        this.haseiTo1Id = p;
    }

    /** 派生ID */
    @jakarta.validation.constraints.NotBlank
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

    /** 派生先１明細 */
    @jakarta.validation.Valid
    private List<Tb6HaseiTo1DetRegistForm> tb6HaseiTo1DetGrid;

    /**
     * @return 派生先１明細
     */
    public List<Tb6HaseiTo1DetRegistForm> getTb6HaseiTo1DetGrid() {
        return tb6HaseiTo1DetGrid;
    }

    /**
     * @param p
     */
    public void setTb6HaseiTo1DetGrid(final List<Tb6HaseiTo1DetRegistForm> p) {
        this.tb6HaseiTo1DetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
