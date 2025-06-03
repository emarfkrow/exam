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
public class Tb7Sum2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7Sum2RegistForm.class);

    /** 集約抑止登録フォームのリスト */
    @Valid
    private List<Tb7Sum2RegistForm> tb7Sum2Grid;

    /**
     * @return 集約抑止登録フォームのリスト
     */
    public List<Tb7Sum2RegistForm> getTb7Sum2Grid() {
        return tb7Sum2Grid;
    }

    /**
     * @param p 集約抑止登録フォームのリスト
     */
    public void setTb7Sum2Grid(final List<Tb7Sum2RegistForm> p) {
        this.tb7Sum2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
