package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 里子３一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Satogo3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Satogo3RegistForm.class);

    /** 里子３登録フォームのリスト */
    @Valid
    private List<Tb2Satogo3RegistForm> tb2Satogo3Grid;

    /**
     * @return 里子３登録フォームのリスト
     */
    public List<Tb2Satogo3RegistForm> getTb2Satogo3Grid() {
        return tb2Satogo3Grid;
    }

    /**
     * @param p 里子３登録フォームのリスト
     */
    public void setTb2Satogo3Grid(final List<Tb2Satogo3RegistForm> p) {
        this.tb2Satogo3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
