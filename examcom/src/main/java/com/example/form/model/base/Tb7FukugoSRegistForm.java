package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 複合一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7FukugoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7FukugoRegistForm.class);

    /** 複合登録フォームのリスト */
    @Valid
    private List<Tb7FukugoRegistForm> tb7FukugoGrid;

    /**
     * @return 複合登録フォームのリスト
     */
    public List<Tb7FukugoRegistForm> getTb7FukugoGrid() {
        return tb7FukugoGrid;
    }

    /**
     * @param p 複合登録フォームのリスト
     */
    public void setTb7FukugoGrid(final List<Tb7FukugoRegistForm> p) {
        this.tb7FukugoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
