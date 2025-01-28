package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生先一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseisakiRegistForm.class);

    /** 転生先登録フォームのリスト */
    @Valid
    private List<Tb5TenseisakiRegistForm> tb5TenseisakiGrid;

    /**
     * @return 転生先登録フォームのリスト
     */
    public List<Tb5TenseisakiRegistForm> getTb5TenseisakiGrid() {
        return tb5TenseisakiGrid;
    }

    /**
     * @param p 転生先登録フォームのリスト
     */
    public void setTb5TenseisakiGrid(final List<Tb5TenseisakiRegistForm> p) {
        this.tb5TenseisakiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
