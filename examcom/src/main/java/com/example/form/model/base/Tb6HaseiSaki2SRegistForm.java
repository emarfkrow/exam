package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生先２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiSaki2RegistForm.class);

    /** 派生先２登録フォームのリスト */
    @Valid
    private List<Tb6HaseiSaki2RegistForm> tb6HaseiSaki2Grid;

    /**
     * @return 派生先２登録フォームのリスト
     */
    public List<Tb6HaseiSaki2RegistForm> getTb6HaseiSaki2Grid() {
        return tb6HaseiSaki2Grid;
    }

    /**
     * @param p 派生先２登録フォームのリスト
     */
    public void setTb6HaseiSaki2Grid(final List<Tb6HaseiSaki2RegistForm> p) {
        this.tb6HaseiSaki2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
