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
public class Tb7ShuyakuMotoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7ShuyakuMotoRegistForm.class);

    /** 集約元登録フォームのリスト */
    @Valid
    private List<Tb7ShuyakuMotoRegistForm> tb7ShuyakuMotoGrid;

    /**
     * @return 集約元登録フォームのリスト
     */
    public List<Tb7ShuyakuMotoRegistForm> getTb7ShuyakuMotoGrid() {
        return tb7ShuyakuMotoGrid;
    }

    /**
     * @param p 集約元登録フォームのリスト
     */
    public void setTb7ShuyakuMotoGrid(final List<Tb7ShuyakuMotoRegistForm> p) {
        this.tb7ShuyakuMotoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
