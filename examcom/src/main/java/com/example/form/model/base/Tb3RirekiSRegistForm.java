package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 履歴元一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3RirekiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3RirekiRegistForm.class);

    /** 履歴元登録フォームのリスト */
    @Valid
    private List<Tb3RirekiRegistForm> tb3RirekiGrid;

    /**
     * @return 履歴元登録フォームのリスト
     */
    public List<Tb3RirekiRegistForm> getTb3RirekiGrid() {
        return tb3RirekiGrid;
    }

    /**
     * @param p 履歴元登録フォームのリスト
     */
    public void setTb3RirekiGrid(final List<Tb3RirekiRegistForm> p) {
        this.tb3RirekiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
