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
public class Tb1Entity1HisSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Entity1HisRegistForm.class);

    /** エンティティ１履歴登録フォームのリスト */
    @Valid
    private List<Tb1Entity1HisRegistForm> tb1Entity1HisGrid;

    /**
     * @return エンティティ１履歴登録フォームのリスト
     */
    public List<Tb1Entity1HisRegistForm> getTb1Entity1HisGrid() {
        return tb1Entity1HisGrid;
    }

    /**
     * @param p エンティティ１履歴登録フォームのリスト
     */
    public void setTb1Entity1HisGrid(final List<Tb1Entity1HisRegistForm> p) {
        this.tb1Entity1HisGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
