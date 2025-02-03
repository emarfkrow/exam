package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止先１一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5Shuyakuyokushisaki1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5Shuyakuyokushisaki1RegistForm.class);

    /** 集約抑止先１登録フォームのリスト */
    @Valid
    private List<Tb5Shuyakuyokushisaki1RegistForm> tb5Shuyakuyokushisaki1Grid;

    /**
     * @return 集約抑止先１登録フォームのリスト
     */
    public List<Tb5Shuyakuyokushisaki1RegistForm> getTb5Shuyakuyokushisaki1Grid() {
        return tb5Shuyakuyokushisaki1Grid;
    }

    /**
     * @param p 集約抑止先１登録フォームのリスト
     */
    public void setTb5Shuyakuyokushisaki1Grid(final List<Tb5Shuyakuyokushisaki1RegistForm> p) {
        this.tb5Shuyakuyokushisaki1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
