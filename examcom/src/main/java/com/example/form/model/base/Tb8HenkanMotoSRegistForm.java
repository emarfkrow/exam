package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 変換元一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb8HenkanMotoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb8HenkanMotoRegistForm.class);

    /** 変換元登録フォームのリスト */
    @Valid
    private List<Tb8HenkanMotoRegistForm> tb8HenkanMotoGrid;

    /**
     * @return 変換元登録フォームのリスト
     */
    public List<Tb8HenkanMotoRegistForm> getTb8HenkanMotoGrid() {
        return tb8HenkanMotoGrid;
    }

    /**
     * @param p 変換元登録フォームのリスト
     */
    public void setTb8HenkanMotoGrid(final List<Tb8HenkanMotoRegistForm> p) {
        this.tb8HenkanMotoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
