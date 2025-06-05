package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ID-BNマスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4IdbnSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4IdbnRegistForm.class);

    /** ID-BNマスタ登録フォームのリスト */
    @Valid
    private List<Tb4IdbnRegistForm> tb4IdbnGrid;

    /**
     * @return ID-BNマスタ登録フォームのリスト
     */
    public List<Tb4IdbnRegistForm> getTb4IdbnGrid() {
        return tb4IdbnGrid;
    }

    /**
     * @param p ID-BNマスタ登録フォームのリスト
     */
    public void setTb4IdbnGrid(final List<Tb4IdbnRegistForm> p) {
        this.tb4IdbnGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
