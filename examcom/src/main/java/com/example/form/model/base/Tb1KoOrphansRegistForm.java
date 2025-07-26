package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孤児登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1KoOrphansRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1KoOrphansRegistForm.class);

    /** 親ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String oyaId;

    /**
     * @return 親ID
     */
    public String getOyaId() {
        return oyaId;
    }

    /**
     * @param p 親ID
     */
    public void setOyaId(final String p) {
        this.oyaId = p;
    }

    /** 子枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String koBn;

    /**
     * @return 子枝番
     */
    public String getKoBn() {
        return koBn;
    }

    /**
     * @param p 子枝番
     */
    public void setKoBn(final String p) {
        this.koBn = p;
    }

    /** 子３情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String ko3Info;

    /**
     * @return 子３情報
     */
    public String getKo3Info() {
        return ko3Info;
    }

    /**
     * @param p 子３情報
     */
    public void setKo3Info(final String p) {
        this.ko3Info = p;
    }

    /** 子 */
    @jakarta.validation.Valid
    private Tb1KoRegistForm tb1KoRegistForm;

    /**
     * @return Tb1KoRegistForm
     */
    public Tb1KoRegistForm getTb1KoRegistForm() {
        return tb1KoRegistForm;
    }

    /**
     * @param p
     */
    public void setTb1KoRegistForm(final Tb1KoRegistForm p) {
        this.tb1KoRegistForm = p;
    }

    /** 子なし */
    @jakarta.validation.Valid
    private Tb1KoDinksRegistForm tb1KoDinksRegistForm;

    /**
     * @return Tb1KoDinksRegistForm
     */
    public Tb1KoDinksRegistForm getTb1KoDinksRegistForm() {
        return tb1KoDinksRegistForm;
    }

    /**
     * @param p
     */
    public void setTb1KoDinksRegistForm(final Tb1KoDinksRegistForm p) {
        this.tb1KoDinksRegistForm = p;
    }

    /** 孫 */
    @jakarta.validation.Valid
    private List<Tb1MagoRegistForm> tb1MagoGrid;

    /**
     * @return 孫
     */
    public List<Tb1MagoRegistForm> getTb1MagoGrid() {
        return tb1MagoGrid;
    }

    /**
     * @param p
     */
    public void setTb1MagoGrid(final List<Tb1MagoRegistForm> p) {
        this.tb1MagoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
