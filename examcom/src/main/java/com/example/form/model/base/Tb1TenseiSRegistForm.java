package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1TenseiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1TenseiRegistForm.class);

    /** 転生登録フォームのリスト */
    @Valid
    private List<Tb1TenseiRegistForm> tb1TenseiGrid;

    /**
     * @return 転生登録フォームのリスト
     */
    public List<Tb1TenseiRegistForm> getTb1TenseiGrid() {
        return tb1TenseiGrid;
    }

    /**
     * @param p 転生登録フォームのリスト
     */
    public void setTb1TenseiGrid(final List<Tb1TenseiRegistForm> p) {
        this.tb1TenseiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
