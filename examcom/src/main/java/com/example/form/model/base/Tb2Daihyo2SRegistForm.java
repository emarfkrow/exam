package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 代表２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Daihyo2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Daihyo2RegistForm.class);

    /** 代表２登録フォームのリスト */
    @Valid
    private List<Tb2Daihyo2RegistForm> tb2Daihyo2Grid;

    /**
     * @return 代表２登録フォームのリスト
     */
    public List<Tb2Daihyo2RegistForm> getTb2Daihyo2Grid() {
        return tb2Daihyo2Grid;
    }

    /**
     * @param p 代表２登録フォームのリスト
     */
    public void setTb2Daihyo2Grid(final List<Tb2Daihyo2RegistForm> p) {
        this.tb2Daihyo2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
