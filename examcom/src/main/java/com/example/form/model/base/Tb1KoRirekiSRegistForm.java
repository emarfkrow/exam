package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 履歴一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1KoRirekiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1KoRirekiRegistForm.class);

    /** 履歴登録フォームのリスト */
    @Valid
    private List<Tb1KoRirekiRegistForm> tb1KoRirekiGrid;

    /**
     * @return 履歴登録フォームのリスト
     */
    public List<Tb1KoRirekiRegistForm> getTb1KoRirekiGrid() {
        return tb1KoRirekiGrid;
    }

    /**
     * @param p 履歴登録フォームのリスト
     */
    public void setTb1KoRirekiGrid(final List<Tb1KoRirekiRegistForm> p) {
        this.tb1KoRirekiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
