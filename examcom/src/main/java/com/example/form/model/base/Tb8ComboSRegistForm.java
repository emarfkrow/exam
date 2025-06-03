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
public class Tb8ComboSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8ComboRegistForm.class);

    /** 複合登録フォームのリスト */
    @Valid
    private List<Tb8ComboRegistForm> tb8ComboGrid;

    /**
     * @return 複合登録フォームのリスト
     */
    public List<Tb8ComboRegistForm> getTb8ComboGrid() {
        return tb8ComboGrid;
    }

    /**
     * @param p 複合登録フォームのリスト
     */
    public void setTb8ComboGrid(final List<Tb8ComboRegistForm> p) {
        this.tb8ComboGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
