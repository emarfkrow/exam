package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生元一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiMotoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiMotoRegistForm.class);

    /** 派生元登録フォームのリスト */
    @Valid
    private List<Tb6HaseiMotoRegistForm> tb6HaseiMotoGrid;

    /**
     * @return 派生元登録フォームのリスト
     */
    public List<Tb6HaseiMotoRegistForm> getTb6HaseiMotoGrid() {
        return tb6HaseiMotoGrid;
    }

    /**
     * @param p 派生元登録フォームのリスト
     */
    public void setTb6HaseiMotoGrid(final List<Tb6HaseiMotoRegistForm> p) {
        this.tb6HaseiMotoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
