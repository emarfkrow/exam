package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生先明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseisakiDetRegistForm.class);

    /** 転生先明細登録フォームのリスト */
    @Valid
    private List<Tb5TenseisakiDetRegistForm> tb5TenseisakiDetGrid;

    /**
     * @return 転生先明細登録フォームのリスト
     */
    public List<Tb5TenseisakiDetRegistForm> getTb5TenseisakiDetGrid() {
        return tb5TenseisakiDetGrid;
    }

    /**
     * @param p 転生先明細登録フォームのリスト
     */
    public void setTb5TenseisakiDetGrid(final List<Tb5TenseisakiDetRegistForm> p) {
        this.tb5TenseisakiDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
