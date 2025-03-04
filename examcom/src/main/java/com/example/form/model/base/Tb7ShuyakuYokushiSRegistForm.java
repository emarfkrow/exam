package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuYokushiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7ShuyakuYokushiRegistForm.class);

    /** 集約抑止登録フォームのリスト */
    @Valid
    private List<Tb7ShuyakuYokushiRegistForm> tb7ShuyakuYokushiGrid;

    /**
     * @return 集約抑止登録フォームのリスト
     */
    public List<Tb7ShuyakuYokushiRegistForm> getTb7ShuyakuYokushiGrid() {
        return tb7ShuyakuYokushiGrid;
    }

    /**
     * @param p 集約抑止登録フォームのリスト
     */
    public void setTb7ShuyakuYokushiGrid(final List<Tb7ShuyakuYokushiRegistForm> p) {
        this.tb7ShuyakuYokushiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
