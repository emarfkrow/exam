package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ１一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity1RegistForm.class);

    /** エンティティ１登録フォームのリスト */
    @Valid
    private List<TEntity1RegistForm> tEntity1Grid;

    /**
     * @return エンティティ１登録フォームのリスト
     */
    public List<TEntity1RegistForm> getTEntity1Grid() {
        return tEntity1Grid;
    }

    /**
     * @param p エンティティ１登録フォームのリスト
     */
    public void setTEntity1Grid(final List<TEntity1RegistForm> p) {
        this.tEntity1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
