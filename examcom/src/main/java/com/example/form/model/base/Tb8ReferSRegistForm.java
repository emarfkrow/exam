package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb8ReferSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8ReferRegistForm.class);

    /** 参照マスタ登録フォームのリスト */
    @Valid
    private List<Tb8ReferRegistForm> tb8ReferGrid;

    /**
     * @return 参照マスタ登録フォームのリスト
     */
    public List<Tb8ReferRegistForm> getTb8ReferGrid() {
        return tb8ReferGrid;
    }

    /**
     * @param p 参照マスタ登録フォームのリスト
     */
    public void setTb8ReferGrid(final List<Tb8ReferRegistForm> p) {
        this.tb8ReferGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
