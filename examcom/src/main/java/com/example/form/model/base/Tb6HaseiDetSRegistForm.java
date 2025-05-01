package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiDetRegistForm.class);

    /** 派生明細登録フォームのリスト */
    @Valid
    private List<Tb6HaseiDetRegistForm> tb6HaseiDetGrid;

    /**
     * @return 派生明細登録フォームのリスト
     */
    public List<Tb6HaseiDetRegistForm> getTb6HaseiDetGrid() {
        return tb6HaseiDetGrid;
    }

    /**
     * @param p 派生明細登録フォームのリスト
     */
    public void setTb6HaseiDetGrid(final List<Tb6HaseiDetRegistForm> p) {
        this.tb6HaseiDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
