package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * CD参照マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4CdsanshoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4CdsanshoRegistForm.class);

    /** CD参照マスタ登録フォームのリスト */
    @Valid
    private List<Mb4CdsanshoRegistForm> mb4CdsanshoGrid;

    /**
     * @return CD参照マスタ登録フォームのリスト
     */
    public List<Mb4CdsanshoRegistForm> getMb4CdsanshoGrid() {
        return mb4CdsanshoGrid;
    }

    /**
     * @param p CD参照マスタ登録フォームのリスト
     */
    public void setMb4CdsanshoGrid(final List<Mb4CdsanshoRegistForm> p) {
        this.mb4CdsanshoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
