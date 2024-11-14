package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ３一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity3RegistForm.class);

    /** エンティティ３登録フォームのリスト */
    @Valid
    private List<TEntity3RegistForm> tEntity3Grid;

    /**
     * @return エンティティ３登録フォームのリスト
     */
    public List<TEntity3RegistForm> getTEntity3Grid() {
        return tEntity3Grid;
    }

    /**
     * @param p エンティティ３登録フォームのリスト
     */
    public void setTEntity3Grid(final List<TEntity3RegistForm> p) {
        this.tEntity3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
