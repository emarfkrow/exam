package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約先一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6ShuyakusakiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6ShuyakusakiRegistForm.class);

    /** 集約先登録フォームのリスト */
    @Valid
    private List<Tb6ShuyakusakiRegistForm> tb6ShuyakusakiGrid;

    /**
     * @return 集約先登録フォームのリスト
     */
    public List<Tb6ShuyakusakiRegistForm> getTb6ShuyakusakiGrid() {
        return tb6ShuyakusakiGrid;
    }

    /**
     * @param p 集約先登録フォームのリスト
     */
    public void setTb6ShuyakusakiGrid(final List<Tb6ShuyakusakiRegistForm> p) {
        this.tb6ShuyakusakiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
