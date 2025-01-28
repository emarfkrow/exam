package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孫一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1MagoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1MagoRegistForm.class);

    /** 孫登録フォームのリスト */
    @Valid
    private List<Tb1MagoRegistForm> tb1MagoGrid;

    /**
     * @return 孫登録フォームのリスト
     */
    public List<Tb1MagoRegistForm> getTb1MagoGrid() {
        return tb1MagoGrid;
    }

    /**
     * @param p 孫登録フォームのリスト
     */
    public void setTb1MagoGrid(final List<Tb1MagoRegistForm> p) {
        this.tb1MagoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
