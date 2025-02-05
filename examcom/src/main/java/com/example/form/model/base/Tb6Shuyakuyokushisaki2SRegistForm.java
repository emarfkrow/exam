package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止先２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6Shuyakuyokushisaki2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6Shuyakuyokushisaki2RegistForm.class);

    /** 集約抑止先２登録フォームのリスト */
    @Valid
    private List<Tb6Shuyakuyokushisaki2RegistForm> tb6Shuyakuyokushisaki2Grid;

    /**
     * @return 集約抑止先２登録フォームのリスト
     */
    public List<Tb6Shuyakuyokushisaki2RegistForm> getTb6Shuyakuyokushisaki2Grid() {
        return tb6Shuyakuyokushisaki2Grid;
    }

    /**
     * @param p 集約抑止先２登録フォームのリスト
     */
    public void setTb6Shuyakuyokushisaki2Grid(final List<Tb6Shuyakuyokushisaki2RegistForm> p) {
        this.tb6Shuyakuyokushisaki2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
