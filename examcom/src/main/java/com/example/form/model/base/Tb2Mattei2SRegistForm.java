package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 末弟２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Mattei2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Mattei2RegistForm.class);

    /** 末弟２登録フォームのリスト */
    @Valid
    private List<Tb2Mattei2RegistForm> tb2Mattei2Grid;

    /**
     * @return 末弟２登録フォームのリスト
     */
    public List<Tb2Mattei2RegistForm> getTb2Mattei2Grid() {
        return tb2Mattei2Grid;
    }

    /**
     * @param p 末弟２登録フォームのリスト
     */
    public void setTb2Mattei2Grid(final List<Tb2Mattei2RegistForm> p) {
        this.tb2Mattei2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
