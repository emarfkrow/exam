package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 親一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TOyaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TOyaRegistForm.class);

    /** 親登録フォームのリスト */
    @Valid
    private List<TOyaRegistForm> tOyaGrid;

    /**
     * @return 親登録フォームのリスト
     */
    public List<TOyaRegistForm> getTOyaGrid() {
        return tOyaGrid;
    }

    /**
     * @param p 親登録フォームのリスト
     */
    public void setTOyaGrid(final List<TOyaRegistForm> p) {
        this.tOyaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
