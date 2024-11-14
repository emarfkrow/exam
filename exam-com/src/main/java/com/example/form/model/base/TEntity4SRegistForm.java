package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ４一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity4SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity4RegistForm.class);

    /** エンティティ４登録フォームのリスト */
    @Valid
    private List<TEntity4RegistForm> tEntity4Grid;

    /**
     * @return エンティティ４登録フォームのリスト
     */
    public List<TEntity4RegistForm> getTEntity4Grid() {
        return tEntity4Grid;
    }

    /**
     * @param p エンティティ４登録フォームのリスト
     */
    public void setTEntity4Grid(final List<TEntity4RegistForm> p) {
        this.tEntity4Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
