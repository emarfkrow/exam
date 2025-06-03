package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子なし一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1KoDinksSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1KoDinksRegistForm.class);

    /** 子なし登録フォームのリスト */
    @Valid
    private List<Tb1KoDinksRegistForm> tb1KoDinksGrid;

    /**
     * @return 子なし登録フォームのリスト
     */
    public List<Tb1KoDinksRegistForm> getTb1KoDinksGrid() {
        return tb1KoDinksGrid;
    }

    /**
     * @param p 子なし登録フォームのリスト
     */
    public void setTb1KoDinksGrid(final List<Tb1KoDinksRegistForm> p) {
        this.tb1KoDinksGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
