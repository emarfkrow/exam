package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity2RegistForm.class);

    /** エンティティ２登録フォームのリスト */
    @Valid
    private List<TEntity2RegistForm> tEntity2Grid;

    /**
     * @return エンティティ２登録フォームのリスト
     */
    public List<TEntity2RegistForm> getTEntity2Grid() {
        return tEntity2Grid;
    }

    /**
     * @param p エンティティ２登録フォームのリスト
     */
    public void setTEntity2Grid(final List<TEntity2RegistForm> p) {
        this.tEntity2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
