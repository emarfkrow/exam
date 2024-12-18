package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2EntitySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2EntityRegistForm.class);

    /** エンティティ登録フォームのリスト */
    @Valid
    private List<Tb2EntityRegistForm> tb2EntityGrid;

    /**
     * @return エンティティ登録フォームのリスト
     */
    public List<Tb2EntityRegistForm> getTb2EntityGrid() {
        return tb2EntityGrid;
    }

    /**
     * @param p エンティティ登録フォームのリスト
     */
    public void setTb2EntityGrid(final List<Tb2EntityRegistForm> p) {
        this.tb2EntityGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
