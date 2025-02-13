package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孤児３一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Koji3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Koji3RegistForm.class);

    /** 孤児３登録フォームのリスト */
    @Valid
    private List<Tb2Koji3RegistForm> tb2Koji3Grid;

    /**
     * @return 孤児３登録フォームのリスト
     */
    public List<Tb2Koji3RegistForm> getTb2Koji3Grid() {
        return tb2Koji3Grid;
    }

    /**
     * @param p 孤児３登録フォームのリスト
     */
    public void setTb2Koji3Grid(final List<Tb2Koji3RegistForm> p) {
        this.tb2Koji3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
