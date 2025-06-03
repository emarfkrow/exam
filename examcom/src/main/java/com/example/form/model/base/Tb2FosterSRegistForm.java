package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 里子一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2FosterSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2FosterRegistForm.class);

    /** 里子登録フォームのリスト */
    @Valid
    private List<Tb2FosterRegistForm> tb2FosterGrid;

    /**
     * @return 里子登録フォームのリスト
     */
    public List<Tb2FosterRegistForm> getTb2FosterGrid() {
        return tb2FosterGrid;
    }

    /**
     * @param p 里子登録フォームのリスト
     */
    public void setTb2FosterGrid(final List<Tb2FosterRegistForm> p) {
        this.tb2FosterGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
