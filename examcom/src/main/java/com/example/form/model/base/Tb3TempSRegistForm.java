package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 当初一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3TempSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3TempRegistForm.class);

    /** 当初登録フォームのリスト */
    @Valid
    private List<Tb3TempRegistForm> tb3TempGrid;

    /**
     * @return 当初登録フォームのリスト
     */
    public List<Tb3TempRegistForm> getTb3TempGrid() {
        return tb3TempGrid;
    }

    /**
     * @param p 当初登録フォームのリスト
     */
    public void setTb3TempGrid(final List<Tb3TempRegistForm> p) {
        this.tb3TempGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
