package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 主キーなし一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TNoPkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TNoPkRegistForm.class);

    /** 主キーなし登録フォームのリスト */
    @Valid
    private List<TNoPkRegistForm> tNoPkGrid;

    /**
     * @return 主キーなし登録フォームのリスト
     */
    public List<TNoPkRegistForm> getTNoPkGrid() {
        return tNoPkGrid;
    }

    /**
     * @param p 主キーなし登録フォームのリスト
     */
    public void setTNoPkGrid(final List<TNoPkRegistForm> p) {
        this.tNoPkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
