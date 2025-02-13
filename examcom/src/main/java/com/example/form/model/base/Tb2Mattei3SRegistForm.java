package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 末弟３一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Mattei3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Mattei3RegistForm.class);

    /** 末弟３登録フォームのリスト */
    @Valid
    private List<Tb2Mattei3RegistForm> tb2Mattei3Grid;

    /**
     * @return 末弟３登録フォームのリスト
     */
    public List<Tb2Mattei3RegistForm> getTb2Mattei3Grid() {
        return tb2Mattei3Grid;
    }

    /**
     * @param p 末弟３登録フォームのリスト
     */
    public void setTb2Mattei3Grid(final List<Tb2Mattei3RegistForm> p) {
        this.tb2Mattei3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
