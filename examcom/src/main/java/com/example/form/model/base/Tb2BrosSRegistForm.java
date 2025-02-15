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
public class Tb2BrosSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2BrosRegistForm.class);

    /** 兄弟登録フォームのリスト */
    @Valid
    private List<Tb2BrosRegistForm> tb2BrosGrid;

    /**
     * @return 兄弟登録フォームのリスト
     */
    public List<Tb2BrosRegistForm> getTb2BrosGrid() {
        return tb2BrosGrid;
    }

    /**
     * @param p 兄弟登録フォームのリスト
     */
    public void setTb2BrosGrid(final List<Tb2BrosRegistForm> p) {
        this.tb2BrosGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
