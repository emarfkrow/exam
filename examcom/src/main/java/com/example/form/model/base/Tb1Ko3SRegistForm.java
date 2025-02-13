package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子３一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Ko3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Ko3RegistForm.class);

    /** 子３登録フォームのリスト */
    @Valid
    private List<Tb1Ko3RegistForm> tb1Ko3Grid;

    /**
     * @return 子３登録フォームのリスト
     */
    public List<Tb1Ko3RegistForm> getTb1Ko3Grid() {
        return tb1Ko3Grid;
    }

    /**
     * @param p 子３登録フォームのリスト
     */
    public void setTb1Ko3Grid(final List<Tb1Ko3RegistForm> p) {
        this.tb1Ko3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
