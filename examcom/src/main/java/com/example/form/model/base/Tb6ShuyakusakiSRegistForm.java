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
public class Tb6ShuyakuSakiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6ShuyakuSakiRegistForm.class);

    /** 集約先登録フォームのリスト */
    @Valid
    private List<Tb6ShuyakuSakiRegistForm> tb6ShuyakuSakiGrid;

    /**
     * @return 集約先登録フォームのリスト
     */
    public List<Tb6ShuyakuSakiRegistForm> getTb6ShuyakuSakiGrid() {
        return tb6ShuyakuSakiGrid;
    }

    /**
     * @param p 集約先登録フォームのリスト
     */
    public void setTb6ShuyakuSakiGrid(final List<Tb6ShuyakuSakiRegistForm> p) {
        this.tb6ShuyakuSakiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
