package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 択一一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb7ChoiceSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb7ChoiceRegistForm.class);

    /** 択一登録フォームのリスト */
    @Valid
    private List<Tb7ChoiceRegistForm> tb7ChoiceGrid;

    /**
     * @return 択一登録フォームのリスト
     */
    public List<Tb7ChoiceRegistForm> getTb7ChoiceGrid() {
        return tb7ChoiceGrid;
    }

    /**
     * @param p 択一登録フォームのリスト
     */
    public void setTb7ChoiceGrid(final List<Tb7ChoiceRegistForm> p) {
        this.tb7ChoiceGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
