package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * VIEW一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Vb1ShisonSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Vb1ShisonRegistForm.class);

    /** VIEW登録フォームのリスト */
    @Valid
    private List<Vb1ShisonRegistForm> vb1ShisonGrid;

    /**
     * @return VIEW登録フォームのリスト
     */
    public List<Vb1ShisonRegistForm> getVb1ShisonGrid() {
        return vb1ShisonGrid;
    }

    /**
     * @param p VIEW登録フォームのリスト
     */
    public void setVb1ShisonGrid(final List<Vb1ShisonRegistForm> p) {
        this.vb1ShisonGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
