package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 長男一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2ChonanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2ChonanRegistForm.class);

    /** 長男登録フォームのリスト */
    @Valid
    private List<Tb2ChonanRegistForm> tb2ChonanGrid;

    /**
     * @return 長男登録フォームのリスト
     */
    public List<Tb2ChonanRegistForm> getTb2ChonanGrid() {
        return tb2ChonanGrid;
    }

    /**
     * @param p 長男登録フォームのリスト
     */
    public void setTb2ChonanGrid(final List<Tb2ChonanRegistForm> p) {
        this.tb2ChonanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
