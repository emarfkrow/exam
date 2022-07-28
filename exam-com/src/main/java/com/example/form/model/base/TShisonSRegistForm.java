package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子孫一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TShisonSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TShisonRegistForm.class);

    /** 子孫登録フォームのリスト */
    @Valid
    private List<TShisonRegistForm> tShisonGrid;

    /**
     * @return 子孫登録フォームのリスト
     */
    public List<TShisonRegistForm> getTShisonGrid() {
        return tShisonGrid;
    }

    /**
     * @param p 子孫登録フォームのリスト
     */
    public void setTShisonGrid(final List<TShisonRegistForm> p) {
        this.tShisonGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
