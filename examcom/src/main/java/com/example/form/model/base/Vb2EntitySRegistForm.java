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
public class Vb2EntitySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Vb2EntityRegistForm.class);

    /** VIEW登録フォームのリスト */
    @Valid
    private List<Vb2EntityRegistForm> vb2EntityGrid;

    /**
     * @return VIEW登録フォームのリスト
     */
    public List<Vb2EntityRegistForm> getVb2EntityGrid() {
        return vb2EntityGrid;
    }

    /**
     * @param p VIEW登録フォームのリスト
     */
    public void setVb2EntityGrid(final List<Vb2EntityRegistForm> p) {
        this.vb2EntityGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
