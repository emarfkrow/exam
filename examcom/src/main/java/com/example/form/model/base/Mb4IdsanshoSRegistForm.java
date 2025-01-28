package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ID参照マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4IdsanshoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4IdsanshoRegistForm.class);

    /** ID参照マスタ登録フォームのリスト */
    @Valid
    private List<Mb4IdsanshoRegistForm> mb4IdsanshoGrid;

    /**
     * @return ID参照マスタ登録フォームのリスト
     */
    public List<Mb4IdsanshoRegistForm> getMb4IdsanshoGrid() {
        return mb4IdsanshoGrid;
    }

    /**
     * @param p ID参照マスタ登録フォームのリスト
     */
    public void setMb4IdsanshoGrid(final List<Mb4IdsanshoRegistForm> p) {
        this.mb4IdsanshoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
