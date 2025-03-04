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
public class Tb8FukugoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8FukugoRegistForm.class);

    /** 複合登録フォームのリスト */
    @Valid
    private List<Tb8FukugoRegistForm> tb8FukugoGrid;

    /**
     * @return 複合登録フォームのリスト
     */
    public List<Tb8FukugoRegistForm> getTb8FukugoGrid() {
        return tb8FukugoGrid;
    }

    /**
     * @param p 複合登録フォームのリスト
     */
    public void setTb8FukugoGrid(final List<Tb8FukugoRegistForm> p) {
        this.tb8FukugoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
