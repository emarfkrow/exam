package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ５一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Entity5SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Entity5RegistForm.class);

    /** エンティティ５登録フォームのリスト */
    @Valid
    private List<Tb1Entity5RegistForm> tb1Entity5Grid;

    /**
     * @return エンティティ５登録フォームのリスト
     */
    public List<Tb1Entity5RegistForm> getTb1Entity5Grid() {
        return tb1Entity5Grid;
    }

    /**
     * @param p エンティティ５登録フォームのリスト
     */
    public void setTb1Entity5Grid(final List<Tb1Entity5RegistForm> p) {
        this.tb1Entity5Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}