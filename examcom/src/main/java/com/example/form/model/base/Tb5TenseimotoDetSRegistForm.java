package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生元明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiMotoDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiMotoDetRegistForm.class);

    /** 転生元明細登録フォームのリスト */
    @Valid
    private List<Tb5TenseiMotoDetRegistForm> tb5TenseiMotoDetGrid;

    /**
     * @return 転生元明細登録フォームのリスト
     */
    public List<Tb5TenseiMotoDetRegistForm> getTb5TenseiMotoDetGrid() {
        return tb5TenseiMotoDetGrid;
    }

    /**
     * @param p 転生元明細登録フォームのリスト
     */
    public void setTb5TenseiMotoDetGrid(final List<Tb5TenseiMotoDetRegistForm> p) {
        this.tb5TenseiMotoDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
