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
public class Vb8HenkanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Vb8HenkanRegistForm.class);

    /** VIEW登録フォームのリスト */
    @Valid
    private List<Vb8HenkanRegistForm> vb8HenkanGrid;

    /**
     * @return VIEW登録フォームのリスト
     */
    public List<Vb8HenkanRegistForm> getVb8HenkanGrid() {
        return vb8HenkanGrid;
    }

    /**
     * @param p VIEW登録フォームのリスト
     */
    public void setVb8HenkanGrid(final List<Vb8HenkanRegistForm> p) {
        this.vb8HenkanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
