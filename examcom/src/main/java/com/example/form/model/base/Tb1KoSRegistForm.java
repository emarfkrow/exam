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
public class Tb1KoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1KoRegistForm.class);

    /** 子登録フォームのリスト */
    @Valid
    private List<Tb1KoRegistForm> tb1KoGrid;

    /**
     * @return 子登録フォームのリスト
     */
    public List<Tb1KoRegistForm> getTb1KoGrid() {
        return tb1KoGrid;
    }

    /**
     * @param p 子登録フォームのリスト
     */
    public void setTb1KoGrid(final List<Tb1KoRegistForm> p) {
        this.tb1KoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
