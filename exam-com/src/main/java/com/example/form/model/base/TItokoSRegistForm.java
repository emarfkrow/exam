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
public class TItokoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TItokoRegistForm.class);

    /** 従妹登録フォームのリスト */
    @Valid
    private List<TItokoRegistForm> tItokoGrid;

    /**
     * @return 従妹登録フォームのリスト
     */
    public List<TItokoRegistForm> getTItokoGrid() {
        return tItokoGrid;
    }

    /**
     * @param p 従妹登録フォームのリスト
     */
    public void setTItokoGrid(final List<TItokoRegistForm> p) {
        this.tItokoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
