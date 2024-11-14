package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ１履歴一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity1HisSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity1HisRegistForm.class);

    /** エンティティ１履歴登録フォームのリスト */
    @Valid
    private List<TEntity1HisRegistForm> tEntity1HisGrid;

    /**
     * @return エンティティ１履歴登録フォームのリスト
     */
    public List<TEntity1HisRegistForm> getTEntity1HisGrid() {
        return tEntity1HisGrid;
    }

    /**
     * @param p エンティティ１履歴登録フォームのリスト
     */
    public void setTEntity1HisGrid(final List<TEntity1HisRegistForm> p) {
        this.tEntity1HisGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
