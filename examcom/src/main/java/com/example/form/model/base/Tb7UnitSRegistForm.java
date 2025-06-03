package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 単位一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7UnitSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7UnitRegistForm.class);

    /** 単位登録フォームのリスト */
    @Valid
    private List<Tb7UnitRegistForm> tb7UnitGrid;

    /**
     * @return 単位登録フォームのリスト
     */
    public List<Tb7UnitRegistForm> getTb7UnitGrid() {
        return tb7UnitGrid;
    }

    /**
     * @param p 単位登録フォームのリスト
     */
    public void setTb7UnitGrid(final List<Tb7UnitRegistForm> p) {
        this.tb7UnitGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
