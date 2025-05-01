package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生先登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiToRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiToRegistForm.class);

    /** 転生先ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiToId;

    /**
     * @return 転生先ID
     */
    public String getTenseiToId() {
        return tenseiToId;
    }

    /**
     * @param p 転生先ID
     */
    public void setTenseiToId(final String p) {
        this.tenseiToId = p;
    }

    /** 転生ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenseiId;

    /**
     * @return 転生ID
     */
    public String getTenseiId() {
        return tenseiId;
    }

    /**
     * @param p 転生ID
     */
    public void setTenseiId(final String p) {
        this.tenseiId = p;
    }

    /** 転生情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String tenseiInfo;

    /**
     * @return 転生情報
     */
    public String getTenseiInfo() {
        return tenseiInfo;
    }

    /**
     * @param p 転生情報
     */
    public void setTenseiInfo(final String p) {
        this.tenseiInfo = p;
    }

    /** 転生先明細 */
    @jakarta.validation.Valid
    private List<Tb5TenseiToDetRegistForm> tb5TenseiToDetGrid;

    /**
     * @return 転生先明細
     */
    public List<Tb5TenseiToDetRegistForm> getTb5TenseiToDetGrid() {
        return tb5TenseiToDetGrid;
    }

    /**
     * @param p
     */
    public void setTb5TenseiToDetGrid(final List<Tb5TenseiToDetRegistForm> p) {
        this.tb5TenseiToDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
