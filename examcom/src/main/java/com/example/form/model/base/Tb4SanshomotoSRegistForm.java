package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照元一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4SanshomotoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4SanshomotoRegistForm.class);

    /** 参照元登録フォームのリスト */
    @Valid
    private List<Tb4SanshomotoRegistForm> tb4SanshomotoGrid;

    /**
     * @return 参照元登録フォームのリスト
     */
    public List<Tb4SanshomotoRegistForm> getTb4SanshomotoGrid() {
        return tb4SanshomotoGrid;
    }

    /**
     * @param p 参照元登録フォームのリスト
     */
    public void setTb4SanshomotoGrid(final List<Tb4SanshomotoRegistForm> p) {
        this.tb4SanshomotoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
