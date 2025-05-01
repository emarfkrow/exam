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
public class Tb5TenseiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiRegistForm.class);

    /** 転生登録フォームのリスト */
    @Valid
    private List<Tb5TenseiRegistForm> tb5TenseiGrid;

    /**
     * @return 転生登録フォームのリスト
     */
    public List<Tb5TenseiRegistForm> getTb5TenseiGrid() {
        return tb5TenseiGrid;
    }

    /**
     * @param p 転生登録フォームのリスト
     */
    public void setTb5TenseiGrid(final List<Tb5TenseiRegistForm> p) {
        this.tb5TenseiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
