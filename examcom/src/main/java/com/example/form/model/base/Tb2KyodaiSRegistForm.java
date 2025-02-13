package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2KyodaiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2KyodaiRegistForm.class);

    /** 兄弟登録フォームのリスト */
    @Valid
    private List<Tb2KyodaiRegistForm> tb2KyodaiGrid;

    /**
     * @return 兄弟登録フォームのリスト
     */
    public List<Tb2KyodaiRegistForm> getTb2KyodaiGrid() {
        return tb2KyodaiGrid;
    }

    /**
     * @param p 兄弟登録フォームのリスト
     */
    public void setTb2KyodaiGrid(final List<Tb2KyodaiRegistForm> p) {
        this.tb2KyodaiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
