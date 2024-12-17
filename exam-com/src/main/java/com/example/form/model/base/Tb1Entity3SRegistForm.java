package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ３一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Entity3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Entity3RegistForm.class);

    /** エンティティ３登録フォームのリスト */
    @Valid
    private List<Tb1Entity3RegistForm> tb1Entity3Grid;

    /**
     * @return エンティティ３登録フォームのリスト
     */
    public List<Tb1Entity3RegistForm> getTb1Entity3Grid() {
        return tb1Entity3Grid;
    }

    /**
     * @param p エンティティ３登録フォームのリスト
     */
    public void setTb1Entity3Grid(final List<Tb1Entity3RegistForm> p) {
        this.tb1Entity3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
