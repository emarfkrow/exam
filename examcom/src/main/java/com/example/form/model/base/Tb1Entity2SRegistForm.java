package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Entity2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Entity2RegistForm.class);

    /** エンティティ２登録フォームのリスト */
    @Valid
    private List<Tb1Entity2RegistForm> tb1Entity2Grid;

    /**
     * @return エンティティ２登録フォームのリスト
     */
    public List<Tb1Entity2RegistForm> getTb1Entity2Grid() {
        return tb1Entity2Grid;
    }

    /**
     * @param p エンティティ２登録フォームのリスト
     */
    public void setTb1Entity2Grid(final List<Tb1Entity2RegistForm> p) {
        this.tb1Entity2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
