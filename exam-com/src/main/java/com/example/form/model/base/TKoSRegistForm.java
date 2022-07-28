package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TKoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TKoRegistForm.class);

    /** 子登録フォームのリスト */
    @Valid
    private List<TKoRegistForm> tKoGrid;

    /**
     * @return 子登録フォームのリスト
     */
    public List<TKoRegistForm> getTKoGrid() {
        return tKoGrid;
    }

    /**
     * @param p 子登録フォームのリスト
     */
    public void setTKoGrid(final List<TKoRegistForm> p) {
        this.tKoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
