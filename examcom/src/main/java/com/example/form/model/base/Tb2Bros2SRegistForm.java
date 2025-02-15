package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Bros2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Bros2RegistForm.class);

    /** 兄弟２登録フォームのリスト */
    @Valid
    private List<Tb2Bros2RegistForm> tb2Bros2Grid;

    /**
     * @return 兄弟２登録フォームのリスト
     */
    public List<Tb2Bros2RegistForm> getTb2Bros2Grid() {
        return tb2Bros2Grid;
    }

    /**
     * @param p 兄弟２登録フォームのリスト
     */
    public void setTb2Bros2Grid(final List<Tb2Bros2RegistForm> p) {
        this.tb2Bros2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
