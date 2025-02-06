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
public class Tb8HenkanSakiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8HenkanSakiRegistForm.class);

    /** 変換先登録フォームのリスト */
    @Valid
    private List<Tb8HenkanSakiRegistForm> tb8HenkanSakiGrid;

    /**
     * @return 変換先登録フォームのリスト
     */
    public List<Tb8HenkanSakiRegistForm> getTb8HenkanSakiGrid() {
        return tb8HenkanSakiGrid;
    }

    /**
     * @param p 変換先登録フォームのリスト
     */
    public void setTb8HenkanSakiGrid(final List<Tb8HenkanSakiRegistForm> p) {
        this.tb8HenkanSakiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
