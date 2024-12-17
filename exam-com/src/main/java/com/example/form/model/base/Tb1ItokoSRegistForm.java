package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 従妹一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1ItokoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1ItokoRegistForm.class);

    /** 従妹登録フォームのリスト */
    @Valid
    private List<Tb1ItokoRegistForm> tb1ItokoGrid;

    /**
     * @return 従妹登録フォームのリスト
     */
    public List<Tb1ItokoRegistForm> getTb1ItokoGrid() {
        return tb1ItokoGrid;
    }

    /**
     * @param p 従妹登録フォームのリスト
     */
    public void setTb1ItokoGrid(final List<Tb1ItokoRegistForm> p) {
        this.tb1ItokoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
