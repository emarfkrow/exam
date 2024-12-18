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
public class Tb1ShisonSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1ShisonRegistForm.class);

    /** 子孫登録フォームのリスト */
    @Valid
    private List<Tb1ShisonRegistForm> tb1ShisonGrid;

    /**
     * @return 子孫登録フォームのリスト
     */
    public List<Tb1ShisonRegistForm> getTb1ShisonGrid() {
        return tb1ShisonGrid;
    }

    /**
     * @param p 子孫登録フォームのリスト
     */
    public void setTb1ShisonGrid(final List<Tb1ShisonRegistForm> p) {
        this.tb1ShisonGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
