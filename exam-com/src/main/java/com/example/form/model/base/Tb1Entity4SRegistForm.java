package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ４一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Entity4SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Entity4RegistForm.class);

    /** エンティティ４登録フォームのリスト */
    @Valid
    private List<Tb1Entity4RegistForm> tb1Entity4Grid;

    /**
     * @return エンティティ４登録フォームのリスト
     */
    public List<Tb1Entity4RegistForm> getTb1Entity4Grid() {
        return tb1Entity4Grid;
    }

    /**
     * @param p エンティティ４登録フォームのリスト
     */
    public void setTb1Entity4Grid(final List<Tb1Entity4RegistForm> p) {
        this.tb1Entity4Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
