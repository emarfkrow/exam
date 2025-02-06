package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約元一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuMotoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6ShuyakuMotoRegistForm.class);

    /** 集約元登録フォームのリスト */
    @Valid
    private List<Tb6ShuyakuMotoRegistForm> tb6ShuyakuMotoGrid;

    /**
     * @return 集約元登録フォームのリスト
     */
    public List<Tb6ShuyakuMotoRegistForm> getTb6ShuyakuMotoGrid() {
        return tb6ShuyakuMotoGrid;
    }

    /**
     * @param p 集約元登録フォームのリスト
     */
    public void setTb6ShuyakuMotoGrid(final List<Tb6ShuyakuMotoRegistForm> p) {
        this.tb6ShuyakuMotoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
