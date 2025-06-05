package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 制約マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb8StintSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8StintRegistForm.class);

    /** 制約マスタ登録フォームのリスト */
    @Valid
    private List<Tb8StintRegistForm> tb8StintGrid;

    /**
     * @return 制約マスタ登録フォームのリスト
     */
    public List<Tb8StintRegistForm> getTb8StintGrid() {
        return tb8StintGrid;
    }

    /**
     * @param p 制約マスタ登録フォームのリスト
     */
    public void setTb8StintGrid(final List<Tb8StintRegistForm> p) {
        this.tb8StintGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
