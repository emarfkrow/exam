package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiRegistForm.class);

    /** 派生登録フォームのリスト */
    @Valid
    private List<Tb6HaseiRegistForm> tb6HaseiGrid;

    /**
     * @return 派生登録フォームのリスト
     */
    public List<Tb6HaseiRegistForm> getTb6HaseiGrid() {
        return tb6HaseiGrid;
    }

    /**
     * @param p 派生登録フォームのリスト
     */
    public void setTb6HaseiGrid(final List<Tb6HaseiRegistForm> p) {
        this.tb6HaseiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
