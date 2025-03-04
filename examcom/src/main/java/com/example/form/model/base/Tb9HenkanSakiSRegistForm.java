package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 変換先一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb9HenkanSakiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb9HenkanSakiRegistForm.class);

    /** 変換先登録フォームのリスト */
    @Valid
    private List<Tb9HenkanSakiRegistForm> tb9HenkanSakiGrid;

    /**
     * @return 変換先登録フォームのリスト
     */
    public List<Tb9HenkanSakiRegistForm> getTb9HenkanSakiGrid() {
        return tb9HenkanSakiGrid;
    }

    /**
     * @param p 変換先登録フォームのリスト
     */
    public void setTb9HenkanSakiGrid(final List<Tb9HenkanSakiRegistForm> p) {
        this.tb9HenkanSakiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
