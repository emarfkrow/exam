package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生元明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiMotoDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiMotoDetRegistForm.class);

    /** 派生元明細登録フォームのリスト */
    @Valid
    private List<Tb6HaseiMotoDetRegistForm> tb6HaseiMotoDetGrid;

    /**
     * @return 派生元明細登録フォームのリスト
     */
    public List<Tb6HaseiMotoDetRegistForm> getTb6HaseiMotoDetGrid() {
        return tb6HaseiMotoDetGrid;
    }

    /**
     * @param p 派生元明細登録フォームのリスト
     */
    public void setTb6HaseiMotoDetGrid(final List<Tb6HaseiMotoDetRegistForm> p) {
        this.tb6HaseiMotoDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
