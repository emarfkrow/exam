package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 代表３一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Daihyo3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Daihyo3RegistForm.class);

    /** 代表３登録フォームのリスト */
    @Valid
    private List<Tb2Daihyo3RegistForm> tb2Daihyo3Grid;

    /**
     * @return 代表３登録フォームのリスト
     */
    public List<Tb2Daihyo3RegistForm> getTb2Daihyo3Grid() {
        return tb2Daihyo3Grid;
    }

    /**
     * @param p 代表３登録フォームのリスト
     */
    public void setTb2Daihyo3Grid(final List<Tb2Daihyo3RegistForm> p) {
        this.tb2Daihyo3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
