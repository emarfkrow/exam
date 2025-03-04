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
public class Tb7ShuyakuSakiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7ShuyakuSakiRegistForm.class);

    /** 集約先登録フォームのリスト */
    @Valid
    private List<Tb7ShuyakuSakiRegistForm> tb7ShuyakuSakiGrid;

    /**
     * @return 集約先登録フォームのリスト
     */
    public List<Tb7ShuyakuSakiRegistForm> getTb7ShuyakuSakiGrid() {
        return tb7ShuyakuSakiGrid;
    }

    /**
     * @param p 集約先登録フォームのリスト
     */
    public void setTb7ShuyakuSakiGrid(final List<Tb7ShuyakuSakiRegistForm> p) {
        this.tb7ShuyakuSakiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
