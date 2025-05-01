package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 里子２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Satogo2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Satogo2RegistForm.class);

    /** 里子２登録フォームのリスト */
    @Valid
    private List<Tb2Satogo2RegistForm> tb2Satogo2Grid;

    /**
     * @return 里子２登録フォームのリスト
     */
    public List<Tb2Satogo2RegistForm> getTb2Satogo2Grid() {
        return tb2Satogo2Grid;
    }

    /**
     * @param p 里子２登録フォームのリスト
     */
    public void setTb2Satogo2Grid(final List<Tb2Satogo2RegistForm> p) {
        this.tb2Satogo2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
